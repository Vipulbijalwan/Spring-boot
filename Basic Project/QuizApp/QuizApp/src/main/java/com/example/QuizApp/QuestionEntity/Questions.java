package com.example.QuizApp.QuestionEntity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "quizquestions")
public class QuizQuestions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String question_titles;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String right_ans;
    private String difficultylevel;
    private String topic;


}
