import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';
import { ReactiveFormsModule } from '@angular/forms';
import { MaterialFormComponent } from './material-form/material-form.component';
import { MaterialUiModule } from '../material/material-ui.module';



@NgModule({
  declarations: [
    ReactiveFormComponent,
    MaterialFormComponent
  ],
  exports: [
    ReactiveFormComponent,
    MaterialFormComponent
  ],
  imports: [
    CommonModule,
    ReactiveFormsModule,
    MaterialUiModule
  ]
})
export class FormsDemoModule { }
