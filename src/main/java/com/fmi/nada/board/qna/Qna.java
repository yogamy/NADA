package com.fmi.nada.board.qna;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EntityListeners(AuditingEntityListener.class)
public class Qna {

    @Id
    private Long qna_idx;
    private Long member_idx;
    private String qna_subject;
    private String qna_writer;
    @CreatedDate
    private LocalDate qna_date;
    private String qna_content;
    private String qna_file;
    private Long qna_views;
    private String qna_answer;
    private boolean qna_isanswered;



}
