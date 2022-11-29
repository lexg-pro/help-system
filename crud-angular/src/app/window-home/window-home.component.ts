import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { PopUpComponent } from '../pop-up/pop-up.component';
import { Popup2Component } from '../popup2/popup2.component';
import { UsuariosService } from '../usuarios.service';


@Component({
  selector: 'app-window-home',
  templateUrl: './window-home.component.html',
  styleUrls: ['./window-home.component.css']
})



export class WindowHomeComponent implements OnInit{
  ngOnInit(): void {
    throw new Error('Method not implemented.');
    
  }

  constructor(private dialogRef:MatDialog){
  }
  openDialog(){
   this.dialogRef.open(PopUpComponent);   
  }
  openDialog2(){
    this.dialogRef.open(Popup2Component);   
   }
}
