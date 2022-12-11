package com.study.board.repository;

import com.study.board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // 레포지터리라면 레포지터리라고 지정을 해놔야 한다.
public interface BoardRepository extends JpaRepository<Board,Integer> { // Entity 객체랑(테이블), 기본키 타입 입력




}
