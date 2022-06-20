package jdbc.db.connection.repository;

import jdbc.db.domain.Member;
import jdbc.db.repository.MemberRepositoryV0;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

@Slf4j
class MemberRepositoryV0Test {

    MemberRepositoryV0 repository =new MemberRepositoryV0();
    @Test

    void crud() throws SQLException {
        //save
        Member member = new Member("memberV0XX", 10000);
        repository.save(member);

        //findById
        Member findMember = repository.findById(member.getMemberId());
        log.info("findMember={}", findMember);
    }
}