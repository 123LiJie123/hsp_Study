package gui_Swing_bookManage.object;


public class User {
    private String user;//用户
    private String passwd;//密码
    private int judge;//判断用户权限

    public User() {
    }

    public User(String user, String passwd, int judge) {
        this.user = user;
        this.passwd = passwd;
        this.judge = judge;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public int getJudge() {
        return judge;
    }

    public void setJudge(int judge) {
        this.judge = judge;
    }

    @Override
    public String toString() {
        return "User{" +
                "user='" + user + '\'' +
                ", passwd='" + passwd + '\'' +
                ", judge=" + judge +
                '}';
    }

}