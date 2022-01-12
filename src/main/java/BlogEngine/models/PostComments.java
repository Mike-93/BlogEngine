package BlogEngine.models;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
public class PostComments {

    private int id;


    private PostComments postComments;


    private Post post;


    private User user;


    private LocalDateTime time;


    private String text;

}
