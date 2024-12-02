package eu.boxhunt.todoapp.object;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@Getter
@Setter
public class Todo implements Serializable {
    @Id
    private String id;

    private String text;
    private boolean completed;
    private Date createdAt;
    private Date updatedAt;

    @Override
    public String toString() {
        return "Todo{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", completed=" + completed +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
