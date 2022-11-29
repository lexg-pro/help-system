import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { CadastrosolicitaService } from '../cadastrosolicita.service';


@Component({
  selector: 'app-cadastrosolicita',
  templateUrl: './cadastrosolicita.component.html',
  styleUrls: ['./cadastrosolicita.component.css']
})
export class CadastrosolicitaComponent implements OnInit {

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
      mensagem:[]
      
      
    })

    

   
  }
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }

  public saveForm():void{
    this.cadastroServices.criar(this.soForm.value).subscribe(result=>{
      alert('Nova solicitação cadastrada!');
  
    })

}
}