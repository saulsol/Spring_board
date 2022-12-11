package com.study.board.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// @Entity DB에 있는 테이블이다~ 이런 의미 테이블 이름과 클래스 이름울 같게 하는 것이 좋다.
@Entity
@Data
public class Board {

    @Id // primary Key를 의미
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 생성 전약을 사용하기 위해  // mysql, mariaDB는 Identity

    private Integer id; // 게시글 번호

    private String title; // 제목

    private String content; // 내용

    private String filename;

    private String filepath;


}
