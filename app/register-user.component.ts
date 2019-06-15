import { Component} from '@angular/core'; 

    @Component({
        selector : 'register',
        template: `
        <form>
        Name : <input/> <br/>
        Email : <input/> <br/>
        Username : <input/> <br/>
        Password : <input/> <br/>
        <button type="submit">Register</button>
        </form>
        `,
        })
    

export class RegisterUserComponent{
   /* Name : string;
    Email : string;
    Username : string;
    Password : string;
    message : string;
    authenticate(){
       if(this.username=='Hardy' && this.password=='12345')
       this.message='Valid User';
       
       else
       this.message='Invalid Username/Passowrd';  
    }*/

}