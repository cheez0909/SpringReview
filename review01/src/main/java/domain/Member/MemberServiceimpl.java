package domain.Member;

import java.util.List;

public class MemberServiceimpl implements MemberSerivice{

    private MemberRepository memberRepository = new MemoryMemberRepository();

//    public MemberServiceimpl(MemberRepository memberRepository) {
//        this.memberRepository = memberRepository;
//    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long id) {
        return memberRepository.findById(id);
    }

    @Override
    public List<Member> findMemberList() {
        return memberRepository.findAll();
    }


}
