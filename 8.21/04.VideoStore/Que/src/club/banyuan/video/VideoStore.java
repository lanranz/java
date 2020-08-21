package club.banyuan.video;

import com.alibaba.fastjson.JSONObject;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class VideoStore {

  List<Video> videos = new ArrayList<>();




  // 从文件加载内容
  public static VideoStore load() {
    String filePath = PropUtil.getProp("store.file.path");
    try (InputStream inputStream = new FileInputStream(filePath)) {
      return JSONObject
          .parseObject(inputStream, StandardCharsets.UTF_8, VideoStore.class);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return new VideoStore();
  }

  public void save() {
    String filePath = PropUtil.getProp("store.file.path");
    File file = new File(filePath);
    if(!file.exists()){
      File parentFile = file.getParentFile();
      if (!parentFile.exists()) {
        parentFile.mkdirs();
      }
    }
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
      writer.write(JSONObject.toJSONString(this));
      writer.flush();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  /**
   * 添加一个新的电影
   * 通过电影的名称创建一个video对象，将对象保存在数组中
   *
   * @param name 电影的名称
   */
  public void addVideo(String name) {
    Video video = new Video(name);
    videos.add(video);
    save();
  }

  /**
   * 根据片名借出电影
   *
   * @return 成功借出电影，返回true,如果片名不存在，则返回false
   */
  public boolean checkOut(String videoName) {
    Video video = findVideoByName(videoName);
    if (video != null) {
      return video.setRent(true);
    }
    return false;
  }

  /**
   * 归还电影
   *
   * @return 成功归还电影，返回true,如果片名不存在，则返回false
   */
  public boolean returnVideo(String videoName) {
    Video video = findVideoByName(videoName);
    if (video != null) {
      return video.setRent(false);
    }
    return false;
  }

  /**
   * 根据 电影名称查询电影
   *
   * @param videoName
   * @return 匹配到的电影，如果找不到对应名称的电影，返回null
   */
  private Video findVideoByName(String videoName) {
    for (Video video : videos) {
      if (video.getName().equals(videoName)) {
        return video;
      }
    }
    return null;
  }

  /**
   * 设置用户对电影的评分(1~5)，收到评分之后，计算该电影的平均评分，
   */
  public void receiveRating(String videoName, int mark) {
    Video videoByName = findVideoByName(videoName);
    if (videoByName != null) {
      videoByName.setMark(mark);
    }
  }

  /**
   * 列出整个库存的电影。
   * 电影名称  是否被借出   平均评分
   */
  public void listInventory() {
    for (int i = 0; i < videos.size(); i++) {
      Video video = videos.get(i);
      System.out.printf("片名：%s\t\t评分：%.1f\t是否借出:%s\n", video.getName(), video.getMark(),
              video.isRent() ? "是" : "否");
    }
  }

  // public static void main(String[] args) {
  //   VideoStore videoStore = new VideoStore();
  //   videoStore.addVideo("黑客帝国");
  //   videoStore.addVideo("教父");
  //   videoStore.addVideo("沉默的羔羊");
  //   videoStore.listInventory();
  //   videoStore.checkOut("教父");
  //   videoStore.listInventory();
  //   videoStore.returnVideo("教父");
  //   videoStore.receiveRating("教父", 4);
  //   videoStore.listInventory();
  //
  // }

  public void addVideo() {
    System.out.println("要添加的电影名称：");
    Scanner scanner = new Scanner(System.in);
    String videoName = scanner.nextLine();
    addVideo(videoName);
    save();
    System.out.println("操作成功");
  }

  // TODO 借出电影
  public void checkOut() {
    System.out.println("要借出的电影名称：");
    Scanner scanner = new Scanner(System.in);
    String videoName = scanner.nextLine();
    if (checkOut(videoName)) {
      System.out.println("操作成功");
    } else {
      System.out.println("操作失败");
    }

    save();
  }

  // TODO 归还电影
  public void returnVideo() {
    System.out.println("要归还的电影名称：");
    Scanner scanner = new Scanner(System.in);
    String videoName = scanner.nextLine();
    if (returnVideo(videoName)) {
      System.out.println("请给电影评分（0～5）：");
    } else {
      System.out.println("操作失败");
    }
    int mark = Integer.parseInt(scanner.nextLine());
    receiveRating(videoName, mark);
    save();
  }



  public static void main(String[] args) throws IOException {
    File file = new File("~/Desktop/123.txt");

    System.out.println(file.getAbsolutePath());
    // FileOutputStream fileOutputStream = new FileOutputStream("~/Desktop/123.txt");
    // fileOutputStream.write(1);
    // fileOutputStream.close();
    // try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("~/Desktop/123.txt")))) {
    //   writer.write(JSONObject.toJSONString(new Object()));
    //   writer.flush();
    // } catch (IOException e) {
    //   e.printStackTrace();
    // }
  }
}
