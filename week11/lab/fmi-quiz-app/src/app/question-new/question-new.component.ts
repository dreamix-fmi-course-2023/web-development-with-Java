import { Component, OnInit } from '@angular/core';
import { Question } from '../model/question';
import { FormControl, FormGroup, ValidationErrors, ValidatorFn, Validators } from '@angular/forms';


// @ts-ignore
export const  formValidator: ValidatorFn = (formGroup: FormGroup): ValidationErrors | null => {

  const option1IsCorrect = formGroup.get('option1.isCorrect')?.value;
  const option2IsCorrect = formGroup.get('option2.isCorrect')?.value;
  const option3IsCorrect = formGroup.get('option3.isCorrect')?.value;
  const option4IsCorrect = formGroup.get('option4.isCorrect')?.value;

  const selectedCount = [option1IsCorrect, option2IsCorrect, option3IsCorrect, option4IsCorrect]
    .filter(isCorrect => isCorrect)
    .length;

  // Perform the validation logic
  if (selectedCount !== 1) {
    return { invalidSelection: true };
  }

  return null;
}
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
  }, {
    validators: formValidator
  });


  constructor() { }

  ngOnInit(): void {
    // this.questionForm.valueChanges.subscribe(value => {
    //   console.log(value)
    // })
  }

  public addQuestion() {
    this.isFormValid = true;
    const newQuestion: Question = this.questionForm.getRawValue();

    if(this.questionForm.valid) {
      this.questions.push(newQuestion)
      // this.clearForm();
      this.questionForm.reset()

    }
    console.log(this.questions)
    console.log("Validation")
    console.log(this.questionForm.valid)
    console.log("Title")
    console.log(this.questionForm.get('title')?.value)
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
