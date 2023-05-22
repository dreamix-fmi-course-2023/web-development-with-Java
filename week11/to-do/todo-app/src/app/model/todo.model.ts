export class Todo {
  id: number;
  name: string;
  description: string;
  date: Date;
  done: boolean;

  constructor(id: number, name: string, description: string, date: Date, done: boolean) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.date = date;
    this.done = done;
  }
}
