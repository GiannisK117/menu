public class Fish{

    String name;
    double averageDepth;
    boolean isDangerous;
    String waterType;   

public Fish(){}

public Fish(String name, double averageDepth, boolean isDangerous, String waterType){

        this.name = name;
        this.averageDepth = averageDepth;
        this.isDangerous = isDangerous;
        this.waterType = waterType;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageDepth() {
        return averageDepth;
    }

    public void setAverageDepth(double averageDepth) {
        this.averageDepth = averageDepth;
    }

    public boolean getIsDangerous() {
        return isDangerous;
    }

    public void setIsDangerous(boolean isDangerous) {
        this.isDangerous = isDangerous;
    }

    public String getWaterType() {
    return waterType;
}

public void setWaterType(String waterType) {
    this.waterType = waterType;
}


public void displayInfo() {
        System.out.println("Name: " + name + " Water Type: " + waterType + " Average Depth to find: " + averageDepth + " Dangerous: " + isDangerous);
    }
 }

