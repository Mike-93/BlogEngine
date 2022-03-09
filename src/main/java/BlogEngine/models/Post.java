package BlogEngine.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "is_active")
    private boolean isActive;

    @Column(name = "moderation_status")
    private ModerationStatus moderationStatus;

    @Column(name = "moderator_id")
    private int moderatorId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private long time;

    private String title;

    private String text;

    private int viewCount;

//    @OneToMany
//    private List<PostVotes> postVotes;
//
//    @ManyToMany
//    private List<Tag> tags;
}
