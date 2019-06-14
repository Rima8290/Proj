import { Component } from '@angular/core';
import {NgIf} from '@angular/common';

    
@Component({
   
    selector: 'login',
    templateUrl: './login.component.html' 
    
   

})

export class LoginComponent {
    username: string;                //get the value of username from ngmodel dynamically
    password: string;
    message: string;

    authenticate(){
        if(this.username == 'rima' && this.password == '123')
          this.message = 'valid user';
        else
          this.message = 'invalid username/password';

    }
   
}


