public class Main {
    public static void main(String[] args) throws WrongPasswordException, WrongLoginException {
        Data vend = new Data("1234_ajA12", "1234_ajA_", "1234_ajA_");
        Data.checkCorrectData(vend);
    }
}