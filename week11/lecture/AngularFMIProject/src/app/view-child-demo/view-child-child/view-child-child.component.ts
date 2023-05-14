import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-view-child-child',
  template: `
    <p>{{message}}</p>
  `,
})
export class ViewChildChildComponent{
  message: string = 'initial value';

  public doSomething(value: string) {
    console.log("doSomething");
    this.message = value
  }

}
