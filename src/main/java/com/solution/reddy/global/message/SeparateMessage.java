package com.solution.reddy.global.message;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum SeparateMessage implements ResponseMessage {
    POST_CREATE_SUCCESS("게시물 등록에 성공했습니다.", HttpStatus.CREATED),
    POST_NOT_FOUND("게시물을 찾을 수 없습니다.", HttpStatus.NOT_FOUND),
    POST_GET_SUCCESS("게시물 조회에 성공했습니다.", HttpStatus.OK),
    POST_SEARCH_SUCCESS("게시물 검색에 성공했습니다.", HttpStatus.OK),
    POST_NO_CONTENTS("게시물이 없습니다.", HttpStatus.NO_CONTENT);

    private final String message;
    private final HttpStatus status;
}
