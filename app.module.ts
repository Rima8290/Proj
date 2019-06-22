import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from  '@angular/forms';
import { AppComponent } from './app.component';
import { PNR } from 'src/pnr';
import { PNRStatusComponent } from 'src/app/pnr-status.component';
import {HttpClient, HttpClientModule} from '@angular/common/http';
import { PNRStatusService } from 'src/pnr-status.service';

@NgModule({
  declarations: [
    AppComponent,
    PNRStatusComponent
    
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [HttpClient,PNRStatusService],
  bootstrap: [AppComponent]
}) 
export class AppModule { }
