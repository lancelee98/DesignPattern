package PrototypePattern;
public class ExperienceDeepCopy implements Cloneable{
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
    public ExperienceDeepCopy Clone()
    {
        try {
            return (ExperienceDeepCopy) super.clone();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
