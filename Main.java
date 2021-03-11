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

        //System.out.println(firstOfficer);
        //System.out.println(first);

        first.addNewOfficer(firstOfficer);
        first.addNewOfficer(secondOfficer);
        first.addNewOfficer(thirdOfficer);

        second.addNewOfficer(fourthOfficer);
        second.addNewOfficer(fifthOfficer);
        second.addNewOfficer(sixthOfficer);
        second.addNewOfficer(seventhOfficer);

        System.out.println("Information about first district: " + first
                + "\nInformation about second district " + second);

        //System.out.println(first.toString());
        //System.out.println(second.toString());
        ArrayList<District> allDistricts = new ArrayList<>();
        allDistricts.add(first);
        allDistricts.add(second);

        System.out.println(allDistricts);
        




    }


}
