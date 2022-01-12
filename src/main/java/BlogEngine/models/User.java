package BlogEngine.models;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
public class User {


    private int id;


    private boolean isModerator;

    private LocalDateTime reg_time;


    private String name;


    private String email;


    private String password;

    private String code;

    private String photo;


    private List<Post> posts;


    private List<PostVotes> postVotes;

}
