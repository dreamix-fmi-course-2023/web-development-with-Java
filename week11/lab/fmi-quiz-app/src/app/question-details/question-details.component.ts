import { Component, Input, OnInit } from '@angular/core';
import { Question } from '../model/question';

@Component({
  selector: 'app-question-details',
  templateUrl: './question-details.component.html',
  styleUrls: ['./question-details.component.css']
})
export class QuestionDetailsComponent implements OnInit {

  @Input()
  question: Question | undefined;
  constructor() { }

  ngOnInit(): void {
  }

}
