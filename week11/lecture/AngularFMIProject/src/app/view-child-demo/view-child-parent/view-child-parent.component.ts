import { Component, OnInit, ViewChild } from '@angular/core';
import { ViewChildChildComponent } from '../view-child-child/view-child-child.component';

@Component({
  selector: 'app-view-child-parent',
  template: `
    <app-view-child-child #childComponent></app-view-child-child>
    <button (click)="onButtonClick()">Click me!</button>
    <app-rx-js-demo></app-rx-js-demo>
  `,
})
export class ViewChildParentComponent {
  @ViewChild(ViewChildChildComponent, { static: false }) child: ViewChildChildComponent | undefined;

  onButtonClick() {
    this.child?.doSomething("new message");
  }
}
