package PrototypePattern;

public class Experience{
    private String educationBackground;
    private String skills;

    public void setExperience(String educationBackground,String skills) {
        this.educationBackground=educationBackground;
        this.skills=skills;
    }

    @Override
    public String toString() {
        return educationBackground+skills;
    }

//    public Experience Clone()
//    {
//        Experience experience=new Experience();
//        experience.setExperience(this.educationBackground,this.skills);
//        return experience;
//    }
}
