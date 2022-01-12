package BlogEngine.models;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
public class PostVotes {


    private int id;


    private User user;


    private Post post;


    private LocalDateTime time;


    private byte value;

}
