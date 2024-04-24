package application.model;

import jakarta.persistenco.Entity;
import jakarta.persistenco.Id;
import jakarta.persistenco.Table;

@Entity
@Table (name = "generos")
public class Genero {
    @Id
     private long id ; 
     private String nome ;
     public long getID() {
        return id;
     }
     public void setId(long id) {
        this.id = id;
     }
}
