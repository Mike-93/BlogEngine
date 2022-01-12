package BlogEngine.models;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class GlobalSettings {

    private int id;


    private String code;


    private String name;


    private String value;
}
