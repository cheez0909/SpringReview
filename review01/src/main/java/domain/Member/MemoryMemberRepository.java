package domain.Member;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository{

    private Map<Long, Member> members = new HashMap<>();
    @Override
    public void save(Member member) {
        members.put(member.getId(), member);
    }
    @Override
    public Member findById(Long id) {
        return members.get(id);
    }
    @Override
    public List<Member> findAll() {
        return members.values().stream().toList();
    }
}
