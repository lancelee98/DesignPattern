package PrototypePattern;

public class Client {
    public static void main(String[] args) {
        //Copy
        Resume resume=new Resume("test",20);
        resume.setExperience("本科","C++");
        Resume resume2= resume.clone();
        System.out.println("resume and resume2");
        System.out.println(resume);
        System.out.println(resume2);
        System.out.println();
        System.out.println("resume and modified resume2");
        resume2.setAge(18);
        resume2.setName("copy");
        resume2.setExperience("专科","C#");
        System.out.println(resume);
        System.out.println(resume2);

        //DeepCopy
        System.out.println();
        ResumeDeepCopy resumeDeepCopy=new ResumeDeepCopy("test",20);
        resumeDeepCopy.setExperience("本科","C++");
        ResumeDeepCopy resumeDeepCopy2=resumeDeepCopy.clone();
        System.out.println("resumeDeepCopy and resumeDeepCopy2");
        System.out.println(resumeDeepCopy);
        System.out.println(resumeDeepCopy2);
        System.out.println();
        System.out.println("resumeDeepCopy and modified resumeDeepCopy2");
        resumeDeepCopy2.setAge(18);
        resumeDeepCopy2.setName("copy");
        resumeDeepCopy2.setExperience("专科","C#");
        System.out.println(resumeDeepCopy);
        System.out.println(resumeDeepCopy2);

//        Experience experience=new Experience();
//        experience.setExperience("专科","C#");
//        Experience experience1=(Experience) experience.Clone();
//        System.out.println(experience);
//        System.out.println(experience1);

    }
}
