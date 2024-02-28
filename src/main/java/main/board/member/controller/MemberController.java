package main.board.member.controller;

import main.board.member.dto.MemberDto;
import main.board.member.dto.ResponseMemberDto;
import main.board.member.entity.Member;
import main.board.member.service.MemberService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MemberController {

    final private MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }


    @PostMapping("postMember")
    public ResponseEntity postMember(@Validated @RequestBody MemberDto memberDto) {
        ResponseMemberDto responseMemberDto = memberService.saveMember(memberDto);
        return new ResponseEntity<>(responseMemberDto, HttpStatus.CREATED);
    }
}
