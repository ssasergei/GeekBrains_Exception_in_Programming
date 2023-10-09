public class App {
    public static void main(String[] args) throws Exception {
        Name user = new Name();
        System.out.println("\n" + user);

        File file = new File();
        file.createNewFile(user);

    }
}
