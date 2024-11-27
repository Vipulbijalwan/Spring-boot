package com.example.QuizApp.Service;

import com.example.QuizApp.QuestionEntity.QuizQuestions;
import com.example.QuizApp.Repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {

    @Autowired
    private QuizRepository quizRepository;
    public List<QuizQuestions> getAllQuestions() {
        System.out.println("hi");
 return quizRepository.findAll();
    }


    public List<QuizQuestions> getAllAnyTopicQuestions(String topic) {

        return quizRepository.findByTopic(topic);
    }

    public List<QuizQuestions> getAllAnyDifficultyQuestions(String diff) {
   return quizRepository.findByDifficultylevel(diff);
    }

    public String addQuestion(QuizQuestions question) {
        quizRepository.save(question);
        return "success";
    }

    public String deleteQuestion(Integer id) {
        if(quizRepository.findById(id).isPresent()){
            quizRepository.deleteById(id);
            return "delete question";
        }else {
            return "id not found";
        }
    }

    public String updateQuestion(QuizQuestions questions, Integer id) {
        if(quizRepository.findById(id).isPresent()){
            QuizQuestions questions1 =new QuizQuestions();
            questions1.setId(questions.getId());
            questions1.setOption1(questions.getOption1());
            questions1.setOption2(questions.getOption2());
            questions1.setOption3(questions.getOption3());
            questions1.setOption4(questions.getOption4());
            questions1.setTopic(questions.getTopic());
            questions1.setRight_ans(questions.getRight_ans());
            questions1.setQuestion_titles(questions.getQuestion_titles());
           questions1.setDifficultylevel(questions.getDifficultylevel());
          quizRepository.save(questions1);
            return "update question";
        }else {
            return "id not found";
        }
    }
}
