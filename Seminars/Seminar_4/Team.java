import java.util.ArrayList;
import java.util.List;

public class Team<T extends Warrior> {
    List<T> team = new ArrayList<>();
    private String name;

    public Team(String name) {
        this.name = name;
    }

    public Team<T> addWarrior(T warrior) {
        team.add(warrior);
        return this;
    }

    public int getMaxDistance() {
        int distance = 0;
        for (T t : team) {
            if (!(t instanceof DistanceAttacker)) {
                continue;
            }
            DistanceAttacker tmp = (DistanceAttacker) t;
            if (tmp.getDistance() > distance) {
                distance = tmp.getDistance();
            }
        }
        return distance;
    }

    public int getTeamDamage(){
        int sum = 0;
        for (T t : team) {
           sum += t.getMaxDamage();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder tb = new StringBuilder();
        for (T t : team) {
            tb.append(t.toString() + "\n");
        }
        return "Team name = " + name + ", size team =" + team.size() + " warriors, max distance = " + getMaxDistance() + ", team damage =" + getTeamDamage()+ "\n" + tb;
    }
}
