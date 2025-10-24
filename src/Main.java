public class Main {
    public static void main(String[] args) {
        if(args == null || args.length == 0){
            System.out.println("Usage: java -jar GitHubUserActivity.jar <username>");
            return;
        } else if(args.length > 1){
            System.out.println("You can only enter one username");
            return;
        }
        String username = args[0];
    }

}
