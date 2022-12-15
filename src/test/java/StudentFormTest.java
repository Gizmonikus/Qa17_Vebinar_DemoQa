import models.Student;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StudentFormTest extends TestBase{

@BeforeMethod
    public void preCondition(){
    //select form
    app.studentForm().selectItemForms();
    app.studentForm().selectPracticeForm();
}
@Test
    public void studentFormTest(){
    Student student = Student.builder()
            .firstName("John")
            .lastName("Dow")
            .email("john@mail.com")
            .gender("Male")
            .phone("1234567654")
            .birthday("36 June 2000")
            .subject("Math")
            .hobbies("Sport")
            .address("Tel Aviv")
            .state("NCR")
            .city("Gurgaon").build();

app.studentForm().fillStudentForm(student);
}
}