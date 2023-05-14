import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RxJsDemoComponent } from './rx-js-demo/rx-js-demo.component';



@NgModule({
  declarations: [
    RxJsDemoComponent
  ],
  imports: [
    CommonModule
  ],
  exports: [
    RxJsDemoComponent
  ]
})
export class RxjsDemoModule { }
