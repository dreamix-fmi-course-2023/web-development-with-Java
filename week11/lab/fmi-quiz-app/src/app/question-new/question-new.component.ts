import { Component, OnInit } from '@angular/core';
import { Question } from '../model/question';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-question-new',
  templateUrl: './question-new.component.html',
  styleUrls: ['./question-new.component.css']
})
export class QuestionNewComponent implements OnInit {
  title!: string;
  option1: string = 'Option1';
  option2: string = 'Option2';
  option3: string = 'Option3';
  option4: string = 'Option4';



  questions: Question[] = [];
  isFormValid: boolean = true;
  questionForm: FormGroup = new FormGroup({
    title: new FormControl('', Validators.required),
    option1: new FormGroup({
      value: new FormControl(''),
      isCorrect: new FormControl(false)
    }),
    option2:  new FormGroup({
      value: new FormControl(''),
      isCorrect: new FormControl(false)
    }),
    option3:  new FormGroup({
      value: new FormControl(''),
      isCorrect: new FormControl(false)
    }),
    option4:  new FormGroup({
      value: new FormControl(''),
      isCorrect: new FormControl(false)
    }),
  });


  constructor() { }

  ngOnInit(): void {
    this.questionForm.valueChanges.subscribe(value => {
      console.log(value)
    })
  }

  public addQuestion() {
    this.isFormValid = true;
    const newQuestion: Question = this.questionForm.getRawValue();

    // if(this.validate()) {
      this.questions.push(newQuestion)
      // this.clearForm();
    // }
    console.log(this.questions)
  }

  private validate(): boolean {
    if(!this.title) {
      this.isFormValid = false;
    }
    return this.isFormValid;
  }
  private clearForm(){
    this.title = '';
    this.option1 = '';
    this.option2 = '';
    this.option3 = '';
    this.option4 = '';
  }
}
