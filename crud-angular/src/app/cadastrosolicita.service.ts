import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CadastrosolicitaService {




  url="http://localhost:8080/cadastrarsolicitacao";
  constructor(private http:HttpClient) { }

public criar(cadastro:any):Observable<any>{
  return this.http.post(this.url,cadastro)

}
}
