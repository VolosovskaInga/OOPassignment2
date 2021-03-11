import java.util.ArrayList;

public class District {

    public String title;
    public String city;
    public int districtID;
    private ArrayList<Officer> officersInTheDistrict = new ArrayList<>();

    public District(String title, String city, int districtID) {
        this.title = title;
        this.city = city;
        this.districtID = districtID;
        //officersInTheDistrict = new ArrayList<>(officers);//, ArrayList<Officer> officers
    }
    public boolean addNewOfficer(Officer officer)
    {
        if(officer!=null) {
            officersInTheDistrict.add(officer);
            return true;
        }
        return false;
    }
    public boolean removeOfficer(Officer officer) {
        officersInTheDistrict.remove(officer);
        return true;
    }
    public float calculateAvgLevelInDistrict() {
        float total = 0;
        for (Officer officer : officersInTheDistrict) {
            total += officer.calculatedLevel();
        }
        return total/officersInTheDistrict.size();
    }

    public District(String investigation, String los_angeles, int i, Officer[] officers) {

    }
    public String toString () {
        return "Division- " + title + "; City- " + city + "; District ID- " + districtID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getDistrictID() {
        return districtID;
    }

    public void setDistrictID(int districtID) {
        this.districtID = districtID;
    }

   


    


}
