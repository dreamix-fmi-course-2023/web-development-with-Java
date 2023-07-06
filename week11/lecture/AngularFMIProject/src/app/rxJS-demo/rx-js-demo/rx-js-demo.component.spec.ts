import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RxJsDemoComponent } from './rx-js-demo.component';

describe('RxJsDemoComponent', () => {
  let component: RxJsDemoComponent;
  let fixture: ComponentFixture<RxJsDemoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RxJsDemoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RxJsDemoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
