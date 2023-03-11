package model;

import java.util.Date;



public class Note {
    int id;
    String heading;
    String text;
    String createDate = new Date().toString();

    
    

    

    public Note(String heading, String text) {
        this.heading = heading;
        this.text = text;
    }

    public Note(String id, String heading, String text, String createDate) {
        this.id = Integer.parseInt(id);
        this.heading = heading;
        this.text = text;
        this.createDate = createDate;
    }

    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getHeading() {
        return heading;
    }
    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    
    public String getCreateDate() {
        return createDate;
    }
    public void setCreateDate() {
        this.createDate = new Date().toString();
    }

    
    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s", getId(), getHeading(), getText(), getCreateDate());
    }
}