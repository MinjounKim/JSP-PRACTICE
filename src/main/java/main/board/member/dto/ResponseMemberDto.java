package main.board.member.dto;

import jakarta.annotation.Nullable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseMemberDto {

    private Long memberId;

    private String memberName;

    private String memberPassWard;


}
