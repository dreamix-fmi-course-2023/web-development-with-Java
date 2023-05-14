import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-reactive-form',
  template: `
    <form [formGroup]="form" (ngSubmit)="onSubmit()">
      <label>
        Name:
        <input formControlName="name" />
      </label>
      <label>
        Email:
        <input formControlName="email" />
      </label>
      <button type="submit" [disabled]="form.invalid">Submit</button>
    </form>
  `,
})
export class ReactiveFormComponent {

  form: FormGroup = this.formBuilder.group({
    name: ['', Validators.required],
    email: ['', [Validators.required, Validators.email]],
  });
  constructor(private formBuilder: FormBuilder) { }

  onSubmit() {
    console.log(this.form.value);
  }
}
