package pzn.java.oop.data;

public enum Level {
    STANDAR("STANDAR Level"),
    PREMIUM("PREMIUM Level"),
    VIP("VIP Level");

    private String description;

    Level(String description){
        this.description = description;
    }

    public String getDescription(){
        return "Level "+this.description;
    }
}
