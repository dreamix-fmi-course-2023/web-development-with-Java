import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { MaterialUIModule } from './material-ui/material-ui.module';
import { QuestionDetailsComponent } from './question-details/question-details.component';
import { QuestionNewComponent } from './question-new/question-new.component';
import { MatCheckboxModule } from '@angular/material/checkbox';
import { QuizComponent } from './quiz/quiz.component';
import { QuizQuestionComponent } from './quiz-question/quiz-question.component';
import { MatProgressBarModule } from '@angular/material/progress-bar';

@NgModule({
  declarations: [
    AppComponent,
    QuestionNewComponent,
    QuestionDetailsComponent,
    QuizComponent,
    QuizQuestionComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MaterialUIModule,
    FormsModule,
    ReactiveFormsModule,
    MatCheckboxModule,
    MatProgressBarModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
