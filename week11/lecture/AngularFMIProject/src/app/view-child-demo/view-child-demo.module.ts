import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ViewChildParentComponent } from './view-child-parent/view-child-parent.component';
import { ViewChildChildComponent } from './view-child-child/view-child-child.component';
import { RxjsDemoModule } from '../rxJS-demo/rxjs-demo.module';


@NgModule({
  declarations: [
    ViewChildParentComponent,
    ViewChildChildComponent
  ],
  exports: [
    ViewChildParentComponent,
    ViewChildChildComponent
  ],
  imports: [
    CommonModule,
    RxjsDemoModule
  ]
})
export class ViewChildDemoModule {
}
