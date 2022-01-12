package BlogEngine.models;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
public class CaptchaCodes {

    private int id;

    private LocalDateTime time;

    private String code;

    @Column(name = "secret_code")
    private String secret_code;

}
