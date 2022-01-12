package BlogEngine.models;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Tag {


    private int id;


    private String name;


    private List<Post> posts;
}
