import { Component, Inject, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { MAT_DIALOG_DATA } from '@angular/material/dialog';
import { CadastrosolicitaService } from '../cadastrosolicita.service';
import {FormControl} from '@angular/forms';

@Component({
  selector: 'app-pop-up',
  templateUrl: './pop-up.component.html',
  styleUrls: ['./pop-up.component.css']
})
export class PopUpComponent implements OnInit {
  range = new FormGroup({
    start: new FormControl<Date | null>(null),
    end: new FormControl<Date | null>(null),
  });
  public soForm: FormGroup;

  constructor(private formBuilder:FormBuilder, private cadastroServices:CadastrosolicitaService){
    
    
    this.soForm = this.formBuilder.group({
      descricao:[],
      unidade:[],
      area:[],
      regional:[],
      marca:[],
      elogio:[],
      reclamacao:[],
      sugestao:[],
      solicita:[],
      lastUpdate:[],
      fato:[],
      mensagem:[],
      id:[],
      username:[],
      role:[]
      
      
    })

    

   
  }
  ngOnInit(): void {
  }

  public saveForm():void{
    this.cadastroServices.criar(this.soForm.value).subscribe(result=>{
      alert('Nova solicitação cadastrada!');
  
    })

}
}