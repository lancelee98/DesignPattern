package PrototypePattern;

public class Resume implements Cloneable{
    private String name;
    private int age;
    private Experience experience;
    public Resume(String name, int age)
    {
        this.name=name;
        this.age=age;
        this.experience=new Experience();
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExperience(String educationBackground,String skills) {
        this.experience.setExperience(educationBackground,skills);
    }

    @Override
    public String toString() {
        return "name:"+name+"  age:"+age+"  experience:"+experience;
    }
    public Resume clone() {
        try {
            return (Resume) super.clone();
        }
        catch (Exception e)
        {
            System.out.println(e);
            return null;
        }

    }
}
