package club.banyuan.mbm;

public class User {

  private int id;
  private String name;
  private String pwd;
  private String pwdConfirm;
  private int userType;
  private String userTypeStr;


  public String getPwdConfirm() {
    return pwdConfirm;
  }

  public void setPwdConfirm(String pwdConfirm) {
    this.pwdConfirm = pwdConfirm;
  }

  public int getUserType() {
    return userType;
  }

  public void setUserType(int userType) {
    this.userType = userType;
  }

  public String getUserTypeStr() {
    if (userType == 1) {
      return "经理";
    } else {
      return "普通用户";
    }
  }

  public void setUserTypeStr(String userTypeStr) {
    this.userTypeStr = userTypeStr;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPwd() {
    return pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }
}
