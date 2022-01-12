package BlogEngine.models;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
public class Post {


    private int id;


    private boolean is_active;


    private ModerationStatus moderation_status;

    private int moderator_id;


    private int user_id;


    private LocalDateTime time;


    private String title;


    private String text;


    private int view_count;


    private List<PostVotes> postVotes;


    private List<Tag> tags;
}
