package com.solution.reddy.domain.result.controller;

import com.solution.reddy.domain.result.controller.springdocs.CreateResultPostSpringDocs;
import com.solution.reddy.domain.result.dto.SaveCheckResultRequest;
import com.solution.reddy.domain.result.service.ResultService;
import com.solution.reddy.global.controller.FirstVersionRestController;
import com.solution.reddy.global.dto.ReddyApiResponse;
import com.solution.reddy.global.jwt.dto.UserInfo;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Tag(name = "카메라 결과 관련 컨트롤러(ai 모델 사용하는 곳)")
@FirstVersionRestController
@RequiredArgsConstructor
public class ResultController {
    private final ResultService resultService;
    @PostMapping("/check")
    public ReddyApiResponse<?> checkImageWithAI(@RequestBody String imageUrl) {

        return null;
    }

    @PostMapping("/check/save")
    @CreateResultPostSpringDocs
    public ReddyApiResponse<?> saveResultPost(@RequestBody SaveCheckResultRequest request,
                                              @AuthenticationPrincipal UserInfo user) {
        resultService.saveCheckResult(request, user.getEmail());
        return null;
    }
}