public class GitHubEvent {
    String id;
    String type;
    Actor actor;
    Repo repo;
    Payload payload;
    boolean isPublic;
    String created_at;
}