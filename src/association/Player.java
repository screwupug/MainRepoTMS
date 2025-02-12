package association;

public class Player {

    private String nickname;
    public Inventory inventory;

    public Player(String nickname) {
        this.nickname = nickname;
        inventory = new Inventory();
    }

    public String getNickname() {
        return nickname;
    }
}
