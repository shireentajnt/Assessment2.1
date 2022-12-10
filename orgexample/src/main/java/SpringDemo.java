import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {
    public static void main(String[] args){
        String config="applicationContext.xml";
        ApplicationContext context=new ClassPathXmlApplicationContext(config);
        Student st=(Student) context.getBean("Student");
        System.out.println("Student Id is "+st.getStudentId());
        System.out.println("Student name is "+st.getStudentName());
        System.out.println("Student Training Id is with constructor "+st.getTraining().getTrainingId());
        System.out.println("Student Course Name is "+st.getTraining().getCourseName());
        System.out.println("Student Training Duration is "+st.getTraining().getDuration());
        System.out.println("Student grade is "+st.getGrade());
    }
}
