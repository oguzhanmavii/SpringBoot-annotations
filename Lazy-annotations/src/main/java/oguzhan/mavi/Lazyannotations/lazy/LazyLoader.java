package oguzhan.mavi.Lazyannotations.lazy;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class LazyLoader {
    public LazyLoader()
    {
        System.out.println("Lazy loader...");
    }
}
