package oguzhan.mavi.Lazyannotations.repository;
import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {
    public void callRepository()
    {
        System.out.println("Hello Spring Repository !");
    }
}
