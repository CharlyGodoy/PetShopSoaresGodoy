import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import { Headers, RequestOptions } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/Rx';
import { Usuario } from './usuario.component'

@Injectable()
export class HttpUsuarioService {
  constructor(private _http: Http) { }

  getUsuario(): Observable<Usuario[]> {
    return this._http.get('http://petshop.jelasticlw.com.br/rest/usuariorest').
      map(this.extractData);
  }

  private extractData(res: Response) {
    return res.json()['usuario'];
  }

  addUsuario(usuario: Usuario): Observable<string> {
    const json = JSON.stringify(usuario);
    const headers = new Headers({ 'Content-Type': 'application/json' });
    const options = new RequestOptions({ headers: headers });
    return this._http.post('http://petshop.jelasticlw.com.br/rest/usuariorest',
      json, options).map(res => res.json());
  }
}
