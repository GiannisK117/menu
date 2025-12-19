public class MarineOrganism {
    String name;
    double averageDepth;
    boolean isDangerous;
    
    
    public MarineOrganism() {
    }

    public MarineOrganism(String name, double averageDepth, boolean isDangerous) {

        this.name = name;
        this.averageDepth = averageDepth;
        this.isDangerous = isDangerous;

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

    public void displayInfo() {
        System.out.println("Name: " + name + " Average Depth to find: " + averageDepth + " Dangerous: " + isDangerous);
    }

}
