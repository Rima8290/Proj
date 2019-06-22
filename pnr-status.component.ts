import { Component } from '@angular/core';
import { PNRStatusService } from 'src/pnr-status.service';
import { PNR } from 'src/pnr';

@Component({
    selector:'pnr-status',
    templateUrl:'./pnr-status.component.html'
})
export class PNRStatusComponent {

    pnrNo: number;
    pnr: PNR;
    
    //REQUESTING ANGULAR TO INJECT OBJECT OF SERVICE CLASS
    constructor(private ps: PNRStatusService){

    }
    checkStatus(){
        this.ps.fetchPNRStatus(this.pnrNo).subscribe(data => {
        this.pnr = data;
              

    });
}
}