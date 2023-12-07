package domain.Member;

import java.util.List;

public interface MemberSerivice {
    // 가입
    void join(Member member);

    // 한명 조회
    Member findMember(Long id);

    // 전체 조회
    List<Member> findMemberList();
}
