import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';  
@Injectable({
  providedIn: 'root'
})
export class UsuariosService {

  constructor(private http:HttpClient) { }

  getData(){
    let url="http://localhost:8080/usuario/2";
    return this.http.get(url);
  }
  
}
