import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import { Headers, RequestOptions } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/Rx';
import { Pet } from './pet.component'

@Injectable()
export class HttpPetService {
  constructor(private _http: Http) { }

  getPet(): Observable<Pet[]> {
    return this._http.get('http://petshop2.jelasticlw.com.br/rest/petrest').
      map(this.extractData);
  }

  private extractData(res: Response) {
    return res.json()['pet'];
  }

  addPet(pet: Pet): Observable<string> {
    const json = JSON.stringify(pet);
    const headers = new Headers({ 'Content-Type': 'application/json' });
    const options = new RequestOptions({ headers: headers });
    return this._http.post('http://petshop2.jelasticlw.com.br/rest/petrest',
      json, options).map(res => res.json());
  }
}
