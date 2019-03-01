import org.springframework.stereotype.Component;

@Component
public interface Customer {
    String getName();
    String getID();

    void setName(String name);
}
