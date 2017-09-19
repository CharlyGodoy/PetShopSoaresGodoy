import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template: `<a routerLink="/usuario" routerLinkActive="active">Usuario</a><router-outlet></router-outlet>,
             <a routerLink="/pet" routerLinkActive="active">Pet</a><router-outlet></router-outlet>`

})
export class AppComponent {
}
