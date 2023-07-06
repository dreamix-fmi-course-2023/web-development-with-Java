import { Component, OnInit } from '@angular/core';
import { BehaviorSubject, ReplaySubject, Subject } from 'rxjs';

@Component({
  selector: 'app-rx-js-demo',
  templateUrl: './rx-js-demo.component.html',
  styleUrls: ['./rx-js-demo.component.css']
})
export class RxJsDemoComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
    // this.subject();
    // this.behaviorSubject();
    this.replaySubject();
  }

  private subject() {
    const userInput$ = new Subject<string>();

    userInput$.subscribe(value => console.log(`Subscriber 1: ${value}`));
    userInput$.subscribe(value => console.log(`Subscriber 2: ${value}`));

    userInput$.next('Hello');
  }

  private behaviorSubject() {
    const theme$ = new BehaviorSubject<string>('light');

    theme$.subscribe(value => console.log(`Subscriber 1: ${value}`));

    theme$.next('dark');

    theme$.subscribe(value => console.log(`Subscriber 2: ${value}`));
  }

  private replaySubject() {
    const notifications$ = new ReplaySubject<string>(3);

    notifications$.next('Notification 1');
    notifications$.next('Notification 2');
    notifications$.next('Notification 3');
    notifications$.next('Notification 4');

    notifications$.subscribe(value => console.log(`Subscriber: ${value}`));
  }
}
