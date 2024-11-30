package com.example.QuizApp.Repository;


import com.example.QuizApp.QuestionEntity.QuizQuestions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuizRepository extends JpaRepository<QuizQuestions,Integer> {
  List<QuizQuestions> findByTopic(String topic);
  List<QuizQuestions> findByDifficultylevel(String difficulty);
}
