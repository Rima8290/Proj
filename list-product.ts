import { Component } from '@angular/core';

@Component({

    selector: 'list-product',
    templateUrl: './list-product.component.html'
})


export class ListProductComponent {

    products: Product[];
    display() {
        this.products = [
            new Product(1, "Nokia 6680", 4500, 89),
            new Product(2, "Sony Xperia", 5500, 9),
            new Product(3, "Nokia 7655", 4300, 888),
            new Product(4, "Iphone XS", 45000, 34),
            new Product(5, "Samsung", 4000, 89)
        ]
    }

}

export class Product {                   //dependency class
    id: number;
    name: string;
    price: number;
    quantity: number;
  //  message : string;

    constructor(id: number, name: string, price: number, quantity: number) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}