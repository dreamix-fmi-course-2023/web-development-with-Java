import { ComponentFixture, TestBed } from '@angular/core/testing';

import { QuestionNewComponent } from './question-new.component';

describe('QuestionNewComponent', () => {
  let component: QuestionNewComponent;
  let fixture: ComponentFixture<QuestionNewComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ QuestionNewComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(QuestionNewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
