package main.board.member.dto;

import jakarta.annotation.Nullable;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberDto {

    @Nullable
    private Long memberId;

    private String memberName;

    private String memberPassWard;

}
