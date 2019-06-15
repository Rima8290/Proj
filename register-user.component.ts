import { Component} from '@angular/core'; 

    @Component({
        selector : 'register',
        template: `
        <form (ngSubmit)="register()">
        Name : <input name="name" [(ngModel)]=user.name/> <br/>
        Email : <input name="email" [(ngModel)]=user.email/> <br/>
        Username : <input name="username" [(ngModel)]=user.username/> <br/>
        Password : <input name="password" [(ngModel)]=user.password/> <br/>
        <button type="submit">Register</button>
        </form>
        `,
        })
    

export class RegisterUserComponent{

    user: User = new User();
            register() {
                console.log(this.user);

            }
        }

export class User{

    name : string;
    email : string;
    username : string;
    password : string;
    
    }

