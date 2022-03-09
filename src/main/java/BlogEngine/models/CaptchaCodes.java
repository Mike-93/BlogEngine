package BlogEngine.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class CaptchaCodes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private long time;

    private String code;

    @Column(name = "secret_code")
    private String secretCode;

}
