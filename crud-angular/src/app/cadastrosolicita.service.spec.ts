import { TestBed } from '@angular/core/testing';

import { CadastrosolicitaService } from './cadastrosolicita.service';

describe('CadastrosolicitaService', () => {
  let service: CadastrosolicitaService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CadastrosolicitaService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
