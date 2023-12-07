package domain.Member;

import java.util.List;

public interface MemberRepository {
    // 저장
    void save(Member member);

    // 한명 조회
    Member findById(Long id);

    // 전체 조회
    List<Member> findAll();
}
