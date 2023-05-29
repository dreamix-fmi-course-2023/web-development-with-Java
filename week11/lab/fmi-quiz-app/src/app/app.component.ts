import { Component } from '@angular/core';
import { Question } from './model/question';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'fmi-quiz-app';

  questions: Question[] = [
    {
      title: 'Which programming language is primarily used for developing Android applications?',
      option1: {
        value: 'Java',
        isCorrect: true
      },
      option2: {
          value: 'Python',
          isCorrect: true
        },
      option3: {
        value: 'C++',
        isCorrect: false
      },
      option4: {
        value: 'Ruby',
        isCorrect: false
      },
    },
    {
      title: 'What does HTML stand for?',
      option1: {
        value: 'HyperText Markup Language',
        isCorrect: true
      },
      option2: {
        value: 'High-Level Programming Language',
        isCorrect: true
      },
      option3: {
        value: 'Hypertext Transfer Protocol',
        isCorrect: false
      },
      option4: {
        value: 'Home Tool Markup Language',
        isCorrect: false
      },
    },
    {
      title: 'Which data structure follows the "Last-In-First-Out" (LIFO) principle?',
      option1: {
        value: 'Queue',
        isCorrect: true
      },
      option2: {
        value: 'Stack',
        isCorrect: true
      },
      option3: {
        value: 'Linked List',
        isCorrect: false
      },
      option4: {
        value: 'Array',
        isCorrect: false
      },
    },
    {
      title: 'Which programming language is commonly used for data analysis and machine learning?',
      option1: {
        value: 'Java',
        isCorrect: true
      },
      option2: {
        value: 'Python',
        isCorrect: true
      },
      option3: {
        value: 'JavaScript',
        isCorrect: false
      },
      option4: {
        value: 'C#',
        isCorrect: false
      },
    },
  ]
}
