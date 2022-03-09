package BlogEngine.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "is_Moderator")
    private boolean isModerator;

    @Column(name = "reg_time")
    private long regTime;

    private String name;

    @Column(name = "email")
    private String eMail;

    private String password;

    private String code;

    private String photo;
}
