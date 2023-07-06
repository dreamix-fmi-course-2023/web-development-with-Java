import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-material-form',
  template: `
    <form [formGroup]="form" (ngSubmit)="onSubmit()">
      <mat-form-field appearance="fill">
        <mat-label>Input</mat-label>
        <input matInput formControlName="input">
      </mat-form-field>
      <mat-form-field appearance="fill">
        <mat-label>Select</mat-label>
        <mat-select formControlName="select">
          <mat-option value="one">First option</mat-option>
          <mat-option value="two">Second option</mat-option>
        </mat-select>
      </mat-form-field>
      <mat-form-field appearance="fill">
        <mat-label>Textarea</mat-label>
        <textarea matInput formControlName="textarea"></textarea>
      </mat-form-field>
    </form>
  `,
})
export class MaterialFormComponent{
  form: FormGroup = this.formBuilder.group({
    input: ['', Validators.required],
    textarea: [''],
    select: ['', [Validators.required]],
  });
  constructor(private formBuilder: FormBuilder) { }

  onSubmit() {
    console.log(this.form.value);
  }

}
