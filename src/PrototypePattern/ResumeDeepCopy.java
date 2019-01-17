package PrototypePattern;

public class ResumeDeepCopy{
    private String name;
    private int age;
    private ExperienceDeepCopy experience;
    public ResumeDeepCopy(String name, int age)
    {
        this.name=name;
        this.age=age;
        this.experience=new ExperienceDeepCopy();
    }
    private ResumeDeepCopy(String name, int age, ExperienceDeepCopy experience)
    {
        this.name=name;
        this.age=age;
        this.experience=experience;
    }
    public void setExperience(String educationBackground,String skills) {
        this.experience.setExperience(educationBackground,skills);
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name:"+name+"  age:"+age+"  experience:"+experience;
    }

    public ResumeDeepCopy clone() {
        ExperienceDeepCopy experience=this.experience.Clone();
        return new ResumeDeepCopy(this.name,this.age,experience);
    }
}
