package main.board.member.service;

import main.board.member.dto.MemberDto;
import main.board.member.dto.ResponseMemberDto;
import main.board.member.entity.Member;
import main.board.member.mapper.MemberMapper;
import main.board.member.repository.MemberRepository;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    final private MemberRepository memberRepository;
    final private MemberMapper memberMapper;

    public MemberService(MemberRepository memberRepository,
                         MemberMapper memberMapper) {
        this.memberRepository = memberRepository;
        this.memberMapper = memberMapper;
    }

    public ResponseMemberDto saveMember(MemberDto memberDto) {
        Member member = memberRepository.save(memberMapper.memberDtoToMember(memberDto));
        return memberMapper.memberToResponseMemberDto(member);
    }


}
