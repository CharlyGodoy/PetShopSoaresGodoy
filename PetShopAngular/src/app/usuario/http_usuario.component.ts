import { Component } from '@angular/core';
import { HttpUsuarioService } from './http_usuario.service'
import { Usuario } from './usuario.component'

@Component({
  selector: 'app-root',
  templateUrl: './http_usuario.component.html',
  providers: [HttpUsuarioService]
})
export class HttpUsuarioComponent {
  usuarios: Usuario[];
  usuario: Usuario;

  constructor(private httpUsuarioS: HttpUsuarioService) {
    this.usuario = new Usuario();
    this.getUsuario();
  }

  getUsuario() {
    this.httpUsuarioS.getUsuario().subscribe(
      clientes => this.usuarios = clientes,
      error => alert(error),
      () => console.log('terminou')
    );
  }

  addUsuario() {
    this.httpUsuarioS.addUsuario(this.usuario).subscribe(
      data => data,
      error => alert(error),
      () => this.getUsuario()
    );
  }

  editUsuario(usuario: Usuario) {
    this.usuario.usuarioId = usuario.usuarioId;
    this.usuario.nome = usuario.nome;
    this.usuario.endereco = usuario.endereco;
    this.usuario.telefone = usuario.telefone;
    this.usuario.login = usuario.login;
    this.usuario.senha = usuario.senha;
    this.usuario.cpf = usuario.cpf;
    this.usuario.tipoUsuario = usuario.tipoUsuario;
  }

  deleteUsuario(id: number) {
    this.httpUsuarioS.deleteUsuario(id).subscribe(
      data => data,
      error => alert(error),
      () => this.getUsuario()
    );
  }
}
