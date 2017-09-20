import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import { Headers, RequestOptions } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/Rx';
import { Servico } from './servico.component'

@Injectable()
export class HttpServicoService {
  constructor(private _http: Http) { }

  getServico(): Observable<Servico[]> {
    return this._http.get('http://petshop.jelasticlw.com.br/rest/servicorest').
      map(this.extractData);
  }

  private extractData(res: Response) {
    return res.json()['servico'];
  }

  addServico(servico: Servico): Observable<string> {
    const json = JSON.stringify(servico);
    const headers = new Headers({ 'Content-Type': 'application/json' });
    const options = new RequestOptions({ headers: headers });
    return this._http.post('http://petshop.jelasticlw.com.br/rest/servicorest',
      json, options).map(res => res.json());
  }
}
