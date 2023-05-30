import { Component, OnInit } from '@angular/core';
import { QuizService } from './quiz.service';
import { Question } from '../model/question';
import { QuizQuestion } from '../model/quiz-question';

@Component({
  selector: 'app-quiz',
  templateUrl: './quiz.component.html',
  styleUrls: ['./quiz.component.scss']
})
export class QuizComponent implements OnInit {
  // questions: Question[] = [];

  questions: QuizQuestion[] = []
  points: number = 0;
  isCorrect: boolean = false;
  isAnswered: boolean = false;
  progress: number = 0;
  progressStep!: number;

  constructor(public quizService: QuizService) {
  }

  ngOnInit(): void {
    this.quizService.getQuestions().forEach(q => {
      this.questions.push({
        question: q,
        isAnswered: false,
        isCorrect: false,
      })
    });
    this.progressStep = 100 / this.questions.length;
  }

  onOptionSelected(event: QuizQuestion) {

    this.progress += this.progressStep;
      this.isAnswered = true;
    if (event.isCorrect) {
      this.isCorrect = event.isCorrect
      this.points += 1;
    }
  }
}
