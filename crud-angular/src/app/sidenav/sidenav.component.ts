import { Component, OnInit } from '@angular/core';
import { UsuariosService } from '../usuarios.service';

@Component({
  selector: 'app-sidenav',
  templateUrl: './sidenav.component.html',
  styleUrls: ['./sidenav.component.css']
})
export class SidenavComponent  implements OnInit{
  myData:any; 
 constructor(private user:UsuariosService){
  this.user.getData().subscribe((data)=>{
    console.warn();
    this.myData=data;
  })
} 

ngOnInit(): void {

}

}
