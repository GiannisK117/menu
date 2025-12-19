public class main {

    public static void main(String[] args) {

        MarineOrganism Cod = new MarineOrganism("Cod", 60.0, false);
        MarineOrganism Betta = new MarineOrganism("Betta", 50.0, false);
        MarineOrganism Tuna = new MarineOrganism("Tuna", 550.0, false);
        MarineOrganism GreatWhiteShark = new MarineOrganism("Great White Shark", 1.200, true);
        MarineOrganism Hammershark = new MarineOrganism("Hammershark", 80.0, true);
        MarineOrganism TigerShark = new MarineOrganism("Tiger Shark", 900.0, true);

        MarineOrganism[] organisms = { Hammershark, Cod, Betta, GreatWhiteShark, Tuna, TigerShark };
        System.out.println("The number of dangerous organisms is: " + countDangerousOrganisms(organisms));

        System.out.printf("The average depth of the organisms is: %,.2f", calculateAverageDepth(organisms));

    }

    public static int countDangerousOrganisms(MarineOrganism[] organisms) {
        int count = 0;

        for (int i = 0; i < organisms.length; i++) {
            if (organisms[i].isDangerous == true) {
                count++;
            }
        }

        return count;
    }

    public static double calculateAverageDepth(MarineOrganism[] organisms) {
        // 23.4, 19.3, 7.45 -> (23.4 + 19.3 + 7.45)/3
        double depthavrg = 0;

        for (int i = 0; i < organisms.length; i++) {

            depthavrg += organisms[i].averageDepth;
        }

        return depthavrg / organisms.length;
    }
}
