import java.util.Scanner;

public class Shark {

    Scanner sc = new Scanner(System.in);
    String name;
    double averageDepth;
    boolean isDangerous;
    int numberOfTeeth;

    public Shark() {

    }

    public Shark(String name, double averageDepth, boolean isDangerous, String waterType, int numberOfTeeth) {

        this.name = name;
        this.averageDepth = averageDepth;
        this.isDangerous = isDangerous;
        this.numberOfTeeth = numberOfTeeth;

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

    public int getNumberOfTeeth() {
        return numberOfTeeth;
    }

    public void setNumberOfTeeth(int numberOfTeeth) {
        this.numberOfTeeth = numberOfTeeth;
    }

    public void displayInfo(boolean showDangerLevel) {
        System.out.println("Shark Data: ");
        System.out.println(
                "Name: " + name + " Average Depth to find: " + averageDepth + " Number of teeth: " + numberOfTeeth);
        System.out.println("Want to see if it is Dangerous? Y/N");
        String c = sc.nextLine();

        if (c.equalsIgnoreCase("N")) {
            System.exit(0);
        } else if (c.equalsIgnoreCase("Y")) {
            System.out.println("Dangerous: " + isDangerous);
        }
    }
}
