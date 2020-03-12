public class Person {
    int ID, IGender, ITime;
    public Person(int iD, int iGender, int iTime)
    {
        this.ID = iD;
        this.IGender = iGender;
        this.ITime = iTime;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setIGender(int iGender) {
        this.IGender = iGender;
    }

    public void setITime(int iTime) {
        this.ITime = iTime;
    }

    public int getID() {
        return ID;
    }

    public int getIGender() {
        return IGender;
    }

    public int getITime() {
        return ITime;
    }

    public String toString() {
        return(this.getID() + ": is a " + this.getIGender() + ", who needs to go to the bathroom for "+ this.getITime());
    }


    //    public void genderAssignment(int lessThanValue, int upperBound)
//    {
//        Random genRandomizer = new Random();
//        int genderBias = genRandomizer.nextInt(upperBound);
//        if(genderBias > lessThanValue)
//        {
//            setIGender(0);
//        }
//        else
//        {
//            setIGender(1);
//        }
//    }
}
