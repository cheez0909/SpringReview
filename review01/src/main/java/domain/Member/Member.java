package domain.Member;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Data
@AllArgsConstructor
@EqualsAndHashCode
public class Member {
    private Long id;
    private String name;
    private Grade grade;
}
