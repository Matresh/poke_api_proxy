package poke_api.poke_api_proxy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class PokeObject {

    // TODO READ HOW CAN I MAP NAMES FROM JSON USING ANNOTATION OR SMTH LIKE THAT
    private int id;
    private int name;

    @Override
    public String toString() {
        return "PokeObject{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}
