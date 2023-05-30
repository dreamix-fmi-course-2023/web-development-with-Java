import { Question } from './question';

export interface QuizQuestion {
  isCorrect: boolean;
  question: Question;
  isAnswered: boolean;
}
