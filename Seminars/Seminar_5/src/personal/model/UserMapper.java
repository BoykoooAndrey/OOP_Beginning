package personal.model;

import personal.views.ViewUser;

public class UserMapper {
    public String map(User user) {
        if (ViewUser.saveFormat == 1){
            return String.format("%s,%s,%s,%s", user.getId(), user.getFirstName(), user.getLastName(), user.getPhone());
        }
        else{
            return String.format("%s;%s;%s;%s", user.getId(), user.getFirstName(), user.getLastName(), user.getPhone());
        }
        
    }

    public User map(String line) {
        String[] lines = line.split(",");
        return new User(lines[0], lines[1], lines[2], lines[3]);
        
    }
}
