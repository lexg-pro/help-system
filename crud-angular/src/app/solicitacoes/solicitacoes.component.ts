import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { MatTableDataSource } from '@angular/material/table';
import { PopUpComponent } from '../pop-up/pop-up.component';
import { SolicitacoesService } from '../solicitacoes.service';
import { Solicitacoes } from './model/solicitacoes';



export interface PeriodicElement {
  name: string;
  position: number;
  weight: number;
  symbol: string;
}



@Component({
  selector: 'app-solicitacoes',
  templateUrl: './solicitacoes.component.html',
  styleUrls: ['./solicitacoes.component.css']
})
export class SolicitacoesComponent implements OnInit {
  ELEMENT_DATA: Solicitacoes[] = [];



  displayColumns: String[]=['descricao','unidade','area','regional','marca','elogio','reclamacao','sugestao','solicita','fato'];
  dataSource= new MatTableDataSource<Solicitacoes>(this.ELEMENT_DATA);

  constructor(private service:SolicitacoesService, private dialogRef:MatDialog){

  }
  
  openDialog(){
    this.dialogRef.open(PopUpComponent);   
   }
   
  ngOnInit(): void {
   this.getAllSolicitacoes();
  }

  public getAllSolicitacoes(){
   let resp=this.service.getData2();
   resp.subscribe(solicita=>{
    this.dataSource.data=solicita as Solicitacoes[]
   })
 
  }
  applyFilter(event: Event) {
    const filterValue = (event.target as HTMLInputElement).value;
    this.dataSource.filter = filterValue.trim().toLowerCase();
  }
}


