import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { ListProductComponent } from 'src/app/list-product.component';
import { ProductService } from 'src/app/product-service';
import { LoginComponent } from 'src/app/login.component';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { RegisterUserComponent} from 'src/app/register-user.component'

@NgModule({
  declarations: [
    AppComponent,
    ListProductComponent,
    LoginComponent,
    RegisterUserComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule.forRoot([
      {path: 'login', component: LoginComponent},
      {path: 'products', component: ListProductComponent},
      {path: 'register', component: RegisterUserComponent},
    ])
  ],
  providers: [ProductService],
  bootstrap: [AppComponent]
})
export class AppModule { }
