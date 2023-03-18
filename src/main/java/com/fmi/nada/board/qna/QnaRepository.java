package com.fmi.nada.board.qna;

import com.fmi.nada.diary.Diary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * QnA Repository
 */
public interface QnaRepository extends JpaRepository<Qna,Long> {

    Page<Qna> findAllByOrderByQnaDateDesc(Pageable pageable);
    Page<Qna> findAllByQnaWriterContaining(String keyword, Pageable pageable);
    Page<Qna> findAllByQnaSubjectContaining(String keyword, Pageable pageable);
}
