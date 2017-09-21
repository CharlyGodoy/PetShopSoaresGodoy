import { Component } from '@angular/core';

export class Usuario {
  public usuarioId: number;
  public nome: string;
  public endereco: string;
  public telefone: string;
  public login: string;
  public senha: string;
  public cpf: string;
  public tipoUsuario: number;

  constructor() {
  }
}
