package domain.Member;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
public class Member {
    private Long id;
    private String name;
    private Grade grade;
}
