package com.quiz.service;

import java.util.List;

import com.quiz.entities.Quiz;

public interface QuizService {
	
	List<Quiz> get();
	Quiz get(Long id);
	Quiz add(Quiz quiz);

}
