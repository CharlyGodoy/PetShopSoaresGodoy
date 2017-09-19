import { Component } from '@angular/core';
import { HttpPetService } from './http_pet.service'
import { Pet } from './pet.component'

@Component({
  selector: 'app-root',
  templateUrl: './http_pet.component.html',
  providers: [HttpPetService]
})
export class HttpPetComponent {
  pets: Pet[];
  pet: Pet;

  constructor(private httpPetS: HttpPetService) {
    this.pet = new Pet();
    this.getPet();
  }

  getPet() {
    this.httpPetS.getPet().subscribe(
      clientes => this.pets = clientes,
      error => alert(error),
      () => console.log('terminou')
    );
  }

  addPet() {
    this.httpPetS.addPet(this.pet).subscribe(
      data => data,
      error => alert(error),
      () => this.getPet()
    );


  }


}
