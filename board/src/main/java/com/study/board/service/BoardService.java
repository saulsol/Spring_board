package com.study.board.service;

import com.study.board.entity.Board;
import com.study.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;


import java.io.File;
import java.util.List;
import java.util.UUID;

@Service
public class BoardService { //

    @Autowired // 스프링이 알아서 인젝션 해준다.
    private BoardRepository boardRepository;


    // 글 작성
    public void write(Board board) {
        boardRepository.save(board);
    }


    // 게시물 리스트 처리
    public Page<Board> boardList(Pageable pageable){
       return boardRepository.findAll(pageable);
    }

    // 특정 게시글 불러오기
    public Board view(Integer id){

        return boardRepository.findById(id).get();
    }

    // 특정 게시글 삭제
    public void boardDelete(Integer id){
        boardRepository.deleteById(id);
    }



}
