import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Officer firstOfficer = new Officer("Eriks", "White", 22, 132);
        Officer secondOfficer = new Officer("David", "Black", 66, 32);
        Officer thirdOfficer = new Officer("Jack", "Red", 23, 5);
        Officer fourthOfficer = new Officer("Joe", "Reed", 90, 99);
        Officer fifthOfficer = new Officer("Nick", "Blue", 38, 41);
        Officer sixthOfficer = new Officer("Karl", "Logger", 19, 15);
        Officer seventhOfficer = new Officer("Rick", "Rock", 65, 65);

        District first = new District("Crime", "New York", 3, new Officer[0]);
        District second = new District("Investigation", "Los Angeles", 55, new Officer[0]);


        first.addNewOfficer(firstOfficer);
        first.addNewOfficer(secondOfficer);
        first.addNewOfficer(thirdOfficer);

        second.addNewOfficer(fourthOfficer);
        second.addNewOfficer(fifthOfficer);
        second.addNewOfficer(sixthOfficer);
        second.addNewOfficer(seventhOfficer);

        System.out.println("Information about first district: " + first
                + "\nInformation about second district " + second);
        second.removeOfficer(fourthOfficer);
        System.out.println();
        System.out.println("Updated second district: " + second);
        System.out.println();
        System.out.println("Average level of first district is: " + first.calculateAvgLevelInDistrict());
        System.out.println("Average level of second district is: " + second.calculateAvgLevelInDistrict());


        System.out.println();
        ArrayList<District> allDistricts = new ArrayList<>();
        allDistricts.add(first);
        allDistricts.add(second);

        System.out.println("Information about both districts: ");
        System.out.println(allDistricts);

        System.out.println("Average level of both district is: " + (first.calculateAvgLevelInDistrict()
                + second.calculateAvgLevelInDistrict() / 2));

        int officersTogether = 0;
        for (District district : allDistricts) {
            officersTogether = district.getOfficersInTheDistrict().size() + officersTogether;
        }
        System.out.println("Count of officers in both districts are: " + officersTogether);

        for (District district : allDistricts) {
            if (first.calculateAvgLevelInDistrict() > second.calculateAvgLevelInDistrict()) {
                System.out.println("The best district is the First district!");
                break;
            } else if (first.calculateAvgLevelInDistrict() < second.calculateAvgLevelInDistrict()) {
                System.out.println("The best district is the Second district!");
                break;
            } else if (first.calculateAvgLevelInDistrict() == second.calculateAvgLevelInDistrict()) {
                System.out.println("Both districts are equal!");
                break;
            }
        }
        allDistricts.remove(0);
        System.out.println(allDistricts);
        //After removing first district all officers are removed as well.
    }
}
