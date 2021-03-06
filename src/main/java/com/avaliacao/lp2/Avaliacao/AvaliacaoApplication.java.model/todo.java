package AvaliacaoApplication.java.model;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "todo")
public class todo{

    @Id
    private String id;
    private String todo;
    private String description;
    
    private boolean completed;

    private Data criateAt;
    private Data updateAt;
}