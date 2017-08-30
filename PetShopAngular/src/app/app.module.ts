import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { HttpUsuarioComponent } from './http_usuario.component';



@NgModule({
  declarations: [
    AppComponent,
    HttpUsuarioComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    RouterModule.forRoot([
  {
    path: 'cliente',
    component: HttpUsuarioComponent
  }
])
  ],
  providers: [HttpUsuarioComponent],
  bootstrap: [AppComponent]
})
export class AppModule { }
