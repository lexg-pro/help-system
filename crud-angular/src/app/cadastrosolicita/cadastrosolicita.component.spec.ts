import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CadastrosolicitaComponent } from './cadastrosolicita.component';

describe('CadastrosolicitaComponent', () => {
  let component: CadastrosolicitaComponent;
  let fixture: ComponentFixture<CadastrosolicitaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CadastrosolicitaComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CadastrosolicitaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
