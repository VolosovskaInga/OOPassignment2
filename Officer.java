public class Officer {

        public String name;
        public String surname;
        public int officerID;
        public int crimesSolved;

        public Officer(String name, String surname, int officerID, int crimesSolved) {
            this.name = name;
            this.surname = surname;
            this.officerID = officerID;
            this.crimesSolved = crimesSolved;


        }

        public Officer() {

        }

        public String toString() {
            return "Name-" + name + "; Surname- " + surname + "; Officers ID- " + officerID +
                    "; Number of solved crimes is- " + crimesSolved;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public String getSurname() {
            return surname;
        }

        public void setOfficerID(int officerID) {
            this.officerID = officerID;
        }

        public Integer getOfficerID() {
            return officerID;
        }


        public void setCrimesSolved(int crimesSolved) {
            this.crimesSolved = crimesSolved;
        }

        public Integer getCrimesSolved() {
            return crimesSolved;
        }

        public void printDetails() {
            System.out.println("Name:" + getName() + "; Surname:" + getSurname() + "; Officer ID:" + getOfficerID() +
                    "; Working district:" + "; Number of solved crimes:" + getCrimesSolved());
        }

        public int calculatedLevel() {
            if (crimesSolved >= 0 && crimesSolved <= 20) {
                return 1;
            }
            if (crimesSolved >= 21 && crimesSolved <= 40) {
                return 2;
            }
            if (crimesSolved >= 41) {
                return 3;
            } else {
                return 0;
            }

        }


    }

