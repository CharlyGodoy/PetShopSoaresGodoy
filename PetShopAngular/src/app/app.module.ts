import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { HttpUsuarioComponent } from './usuario/http_usuario.component';
import { HttpPetComponent } from './pet/http_pet.component';



@NgModule({
  declarations: [
    AppComponent,
    HttpUsuarioComponent,
    HttpPetComponent
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
    path: 'cadastrarPet',
    component: HttpPetComponent
  }
])
  ],
  providers: [HttpUsuarioComponent, HttpPetComponent],
  bootstrap: [AppComponent]
})
export class AppModule { }
