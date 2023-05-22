import { Component } from '@angular/core';
import {Todo} from "../model/todo.model";

@Component({
  selector: 'app-todo-list',
  templateUrl: './todo-list.component.html',
  styleUrls: ['./todo-list.component.css']
})
export class TodoListComponent {
  tasks:Todo[] = [];
  nextId:number = 1;
  hide: boolean = false;
  newName!: string;
  newDesc!: string;
  newDate!: Date;

  public addTask(): void {
    const newTask: Todo = new Todo(
      this.nextId,
      this.newName,
      this.newDesc,
      this.newDate,
      false
    );
    this.newName = '';
    this.newDesc = '';
    this.newDate = new Date();
    this.tasks.push(newTask);
    this.nextId++;
  }



}
