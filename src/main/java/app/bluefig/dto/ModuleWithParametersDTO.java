package app.bluefig.dto;

import app.bluefig.model.Parameter;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ModuleWithParametersDTO {
    private String id;
    private String name;
    private int frequency;
    private LocalDateTime dateTime;
    List<Parameter> parameterList;

    public ModuleWithParametersDTO() {
        id = "";
        name = "";
        frequency = 0;
        dateTime = LocalDateTime.now();
        parameterList = new ArrayList<>();
    }
}
