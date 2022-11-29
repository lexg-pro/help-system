import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class SolicitacoesService {


  constructor(private http:HttpClient) {


   }

   public getData2(){
    return this.http.get("http://localhost:8080/listar");
   }
}
