import { Component } from '@angular/core';
import { HttpServicoService } from './http_servico.service'
import { Servico } from './servico.component'

@Component({
  selector: 'app-root',
  templateUrl: './http_servico.component.html',
  providers: [HttpServicoService]
})
export class HttpServicoComponent {
  servicos: Servico[];
  servico: Servico;

  constructor(private httpServicoS: HttpServicoService) {
    this.servico = new Servico();
    this.getServico();
  }

  getServico() {
    this.httpServicoS.getServico().subscribe(
      clientes => this.servicos = clientes,
      error => alert(error),
      () => console.log('terminou')
    );
  }

  addServico() {
    this.httpServicoS.addServico(this.servico).subscribe(
      data => data,
      error => alert(error),
      () => this.getServico()
    );


  }


}
