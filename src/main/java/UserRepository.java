import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;

import java.io.Serializable;
import java.util.List;

public interface  UserRepository<T,ID extends Serializable> extends JpaRepositoriesAutoConfiguration{


}
