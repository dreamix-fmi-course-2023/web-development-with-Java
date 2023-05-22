import {Component, Input, OnInit} from '@angular/core';
import {Todo} from "../model/todo.model";

@Component({
  selector: 'app-todo-item',
  templateUrl: './todo-item.component.html',
  styleUrls: ['./todo-item.component.css']
})
export class TodoItemComponent implements OnInit {
  title: string = 'Text12312312312';
  @Input() task!:Todo;
  public ngOnInit():void {
    console.log('Pesho!!!!!');
  }

  public done(): void {
    console.log('DONE!!!!!');
  }

  public edit(): void {
    console.log('EDIT!!!!!');
  }

  public delete(): void {
    console.log('DELETE!!!!!');
  }
}
