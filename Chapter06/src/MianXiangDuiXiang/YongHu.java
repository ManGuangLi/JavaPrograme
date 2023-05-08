package MianXiangDuiXiang;
/*
用户类：
属性：用户名，密码
方法：登录
界面类：
在界面类中添加main方法，接受用户输入，并调用用户类的登录方法进行验证。
输出：
登录失败：用户名或密码错误！
登录成功：欢迎你，用户名！

 */
public class YongHu {
    public String userName;
    public String passWorld;

    public void login(String userName, String passWorld) {
        if (userName.equals("lmglzw") && passWorld.equals("Lmg520lzw.")) {
            System.out.println("登陆成功：欢迎你：" + userName);
        }else{
            System.out.println("登录失败：用户名或密码错误！");
        }
    }
}