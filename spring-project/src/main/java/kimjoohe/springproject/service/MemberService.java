package kimjoohe.springproject.service;

import kimjoohe.springproject.domain.Member;
import kimjoohe.springproject.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    private final MemberRepository memberRepository;

    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public List<Member> memberList() throws Exception{
        return memberRepository.memberList();

    }
}
