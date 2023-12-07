package domain.Member;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;




class MemberServiceimplTest {

    MemberSerivice memberSerivice = new MemberServiceimpl();

    @Test
    void 회원가입(){
        Member member = new Member(1L, "홍길동", Grade.BASIC);
        memberSerivice.join(member);
        int size = memberSerivice.findMemberList().size();
        Assertions.assertThat(size).isEqualTo(1);
    }

    @Test
    void 회원조회(){
        Member member1 = new Member(1L, "홍길동", Grade.BASIC);
        Member member2 = new Member(2L, "홍길동", Grade.VIP);
        memberSerivice.join(member1);
        memberSerivice.join(member2);
        Member member = memberSerivice.findMember(2L);
        Assertions.assertThat(member.getName()).isEqualTo(member2.getName());
    }

}