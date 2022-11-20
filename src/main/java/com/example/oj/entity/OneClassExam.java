package com.example.oj.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class OneClassExam {
    private String username;
    private String examId;
    private String radio;
    private String judge;
    private String fill;
    private String programme;
    private Integer score;
    private String note;
    private String nickname;
}
