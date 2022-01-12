package BlogEngine.models;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;


@Data
@Entity
public class Tag2Post {


    private int id;


    private Post post;


    private Tag tag;
}
