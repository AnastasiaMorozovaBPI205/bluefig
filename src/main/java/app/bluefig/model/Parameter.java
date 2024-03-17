package app.bluefig.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Parameter {
    private String id;
    private String dataType;
    private String name;
    private String description;
    private String moduleId;
    private String value;
}
