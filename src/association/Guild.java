package association;

import java.util.ArrayList;
import java.util.List;

class Guild {
    private String name;
    private List<Player> members = new ArrayList<>();

    public Guild(String name) {
        this.name = name;
    }

    public void addMember(Player player) {
        members.add(player);
    }

    public void showMembers() {
        System.out.println("Гильдия " + name + " включает:");
        for (Player player : members) {
            System.out.println(" - " + player.getNickname());
        }
    }
}
