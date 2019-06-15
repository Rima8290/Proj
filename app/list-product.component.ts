import { Component } from '@angular/core';
import { Product } from 'src/app/product';
import { ProductService } from 'src/app/product-service';


@Component({
    selector: 'list-product',
    templateUrl: './list-product.component.html',
    styleUrls: ['./list-product.component.css']

})
export class ListProductComponent {

    products: Product[];
    constructor(private ps: ProductService){

    }

    generatelist() {
        //let ps: ProductService = new ProductService();
        this.products = this.ps.fetchListOfProduct();
    }
}


