package com.hyungjin.board.member;

public interface MemberRepository {
    void save(Member member);
    Member findById(Long memberId);
}
