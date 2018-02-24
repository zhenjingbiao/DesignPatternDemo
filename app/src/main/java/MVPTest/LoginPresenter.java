package MVPTest;
/*
 * Created by jingbiaozhen on 2017/10/9.
 **/

public interface LoginPresenter {
    void validateCredentials(String username,String password);//验证身份
    void destory();
}
