import { Component } from '@angular/core';
import {NgIf} from '@angular/common';
    
@Component({
    /*selector: 'hello',
    template: ` 
        <h1>{{message}}</h1>*/


    selector: 'hello',
    template: ` 
           
            

                 <h2 *ngIf="return">Your no. is{{return}}</h2>
                 <button (click)="generate()">Click Me</button>

    `,

})

export class HelloComponent {
    // message : string ="Hello All!!!!!!!!!.. Your lucky no is  :";
    return: number;
    generate() {
        this.return = Math.ceil(Math.random() * 10) ;
    }
}

