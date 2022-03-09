package BlogEngine.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class PostComments {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "parent_id")
    private int parentId;

    @Column(name = "post_id")
    private int postId;

    @Column(name = "user_id")
    private int userId;

    private long time;

    private String text;
}
