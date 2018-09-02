package Utils;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LombokTest {
    @JsonProperty("name")
    private String name;
    @JsonProperty("isAlive")
    private boolean isAlive;
    @JsonProperty("age")
    private double age;



    public String toString () {
        return "Name : " + this.name + " Age : " + this.age + " Is alive : " + this.isAlive;
    }

}
