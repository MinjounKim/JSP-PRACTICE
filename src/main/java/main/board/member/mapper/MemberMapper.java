package main.board.member.mapper;

import main.board.member.dto.MemberDto;
import main.board.member.dto.ResponseMemberDto;
import main.board.member.entity.Member;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MemberMapper {
    Member memberDtoToMember(MemberDto memberDto);
    MemberDto memberToMemberDto(Member member);
    ResponseMemberDto memberToResponseMemberDto(Member member);

}
