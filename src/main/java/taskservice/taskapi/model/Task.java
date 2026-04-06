package taskservice.taskapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.UUID;

@Entity
@Table(name = "tasks")
public class Task extends Auditable {
    @Id
    private UUID id;
    private String title;
    private String description;
    private TaskStatus status;
}
