package BlogEngine.models;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
public class Tag2Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    @Column(name = "post_id")
    private int postId;


    @Column(name = "tag_id")
    private int tagId;
}
