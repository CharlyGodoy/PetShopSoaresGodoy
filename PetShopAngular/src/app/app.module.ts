import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { HttpUsuarioComponent } from './usuario/http_usuario.component';
import { HttpPetComponent } from './pet/http_pet.component';
import { HttpProdutoComponent } from './produto/http_produto.component';
import { HttpServicoComponent } from './servico/http_servico.component';

@NgModule({
  declarations: [
    AppComponent,
    HttpUsuarioComponent,
    HttpPetComponent,
    HttpProdutoComponent,
    HttpServicoComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    RouterModule.forRoot([
  {
    path: 'cadastrarUsuario',
    component: HttpUsuarioComponent
  },
  {
    path: 'cadastroPets',
    component: HttpPetComponent
  },
  {
    path: 'cadastroProduto',
    component: HttpProdutoComponent
  },
  {
    path: 'cadastroServico',
    component: HttpServicoComponent
  }
])
  ],
  providers: [HttpUsuarioComponent, HttpPetComponent, HttpProdutoComponent, HttpServicoComponent],
  bootstrap: [AppComponent]
})
export class AppModule { }
