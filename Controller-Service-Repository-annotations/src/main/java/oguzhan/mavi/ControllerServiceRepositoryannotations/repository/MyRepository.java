package oguzhan.mavi.ControllerServiceRepositoryannotations.repository;
import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {

    public String helloRepository()
    {
        return "Hello SpringBoot Repository !";
    }
}
