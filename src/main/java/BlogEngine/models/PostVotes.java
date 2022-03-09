package BlogEngine.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class PostVotes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "post_id")
    private int postId;

    private long time;

    private byte value;

}
