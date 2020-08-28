package club.banyuan.mbm;

import club.banyuan.mbm.util.Constant;
import club.banyuan.mbm.util.PropUtil;
import com.alibaba.fastjson.JSONObject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class ProviderService {
    private int idCount = 1;
    private List<Provider> providerList = new ArrayList<>();
    private static final ProviderService INSTANCE = load();

    private ProviderService(){

    }

    public static ProviderService getInstance(){
        return INSTANCE;
    }

    public void addProvider(Provider provider){
        provider.setId(idCount++);
        providerList.add(provider);
        save();
    }

    public void deleteProvider(int id){
        providerList.removeIf(provider -> provider.getId()==id);
        save();
    }

    public Provider getProvider(int id){
        for (Provider provider : providerList){
            if(provider.getId()==id){
                return provider;
            }
        }
        throw new BadRequestException("供货商不存在 id:"+id);
    }

    public void updateProvider(Provider provider){
        Provider old = getProvider(provider.getId());
        old.setContactPerson(provider.getContactPerson());
        old.setDesc(provider.getDesc());
        old.setName(provider.getName());
        old.setPhone(provider.getPhone());
    }

    public List<Provider> getProviderList() {
        return providerList;
    }

    public void setProviderList(List<Provider> providerList) {
        this.providerList = providerList;
    }

    // 保存到指定路径下
    private void save() {
        String rlt = JSONObject.toJSONString(this);
        try (FileOutputStream fileOutputStream = new FileOutputStream(
                PropUtil.getProp(Constant.Prop.PROVIDER_STORE))) {
            fileOutputStream.write(rlt.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 反序列化回来
    private static ProviderService load() {
        try (FileInputStream inputStream = new FileInputStream(PropUtil.getProp(Constant.Prop.PROVIDER_STORE))) {

            return JSONObject.parseObject(inputStream, StandardCharsets.UTF_8, ProviderService.class);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ProviderService();
    }

    public List<Provider> getProviderList(Provider provider){
        if (provider)
    }
}
