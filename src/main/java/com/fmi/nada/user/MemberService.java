package com.fmi.nada.user;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * 회원 서비스
 */
@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

    public Member join(
            String username,
            String password,
            String memberName,
            String memberNickname,
            String memberBirth,
            String memberAddress,
            String memberPhone
    ) {
        return memberRepository.save(new Member(username,
                passwordEncoder.encode(password),
                "ROLE_USER",
                memberName,
                memberNickname,
                memberBirth,
                memberAddress,
                memberPhone));
    }

    public Member findByUsername(String username) {
        return memberRepository.findByUsername(username);
    }

}
