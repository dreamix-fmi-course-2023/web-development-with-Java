import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Question } from '../model/question';
import { QuizQuestion } from '../model/quiz-question';

@Component({
  selector: 'app-quiz-question',
  templateUrl: './quiz-question.component.html',
  styleUrls: ['./quiz-question.component.scss']
})
export class QuizQuestionComponent {
  @Input()
  question: QuizQuestion | undefined;

  @Output()
  optionSelected: EventEmitter<QuizQuestion> = new EventEmitter<QuizQuestion>();

  constructor() {
  }

  onClick(option: any) {
    this.question!.isCorrect = option.isCorrect;
    this.question!.isAnswered = true;
    this.optionSelected.emit(this.question);
  }
}
