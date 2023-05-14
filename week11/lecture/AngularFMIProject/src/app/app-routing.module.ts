import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ViewChildDemoModule } from './view-child-demo/view-child-demo.module';

const routes: Routes = [];

@NgModule({
  imports: [RouterModule.forRoot(routes),
  ViewChildDemoModule],
  exports: [RouterModule]
})
export class AppRoutingModule { }
