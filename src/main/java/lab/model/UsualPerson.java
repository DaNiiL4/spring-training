package lab.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true, fluent = true)
@Entity
@Component
public class UsualPerson implements Person {
    @Id
    @Column
    private long id;

    @Column
    @Value("John Smith")
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "country_id")
    @Autowired
    private Country country;

    @Value("35")
    private int age;

    @Value("1.78")
    private float height;

    @Value("true")
    private boolean isProgrammer;

    @Resource
    private List<String> contacts;
}