package kimjoohe.springproject.repository;

import kimjoohe.springproject.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository {

    public List<Member> memberList() throws Exception;
}
