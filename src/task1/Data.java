package task1;

public class Data {

    private final String login;
    private final String password;
    private final String confirmPassword;

    static final String correct = "^[a-zA-Z0-9_]{1,20}$";

    public Data(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public static boolean checkCorrectData(Data data)
            throws WrongLoginException,
            WrongPasswordException {
        if (data.login.matches(correct) && data.login!= null) {
            System.out.println("Верный формат логина");
        } else {
            throw new WrongLoginException("Не верный формат логина");
        }
        if (data.password.matches(correct) && data.password != null) {
            System.out.println("Верный формат пароля");
        } else {
            throw new WrongLoginException("Не верный формат пароля");
        }
        if (!data.confirmPassword.equals(data.password)) {
            throw new WrongLoginException("Пароли не совпадают");
        }
        return false;
    }

}
