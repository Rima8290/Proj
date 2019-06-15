import { Injectable } from '@angular/core';
import { Product } from 'src/app/product';
/*
service class for AJAX code
*/
@Injectable()

export class ProductService{

      // AJAX call for dummy code
    fetchListOfProduct() : Product[] {
       return [
            new Product(1, 'Nokia 6600', 5000, 99, "pic-1.jpg"),
            new Product(2, 'sony Experia', 2500, 15, 'pic-2.jpg'),
            new Product(3, 'Samsung Note5', 45400, 12, 'pic-1.jpg'),
            new Product(4, 'Iphone 6X', 45000, 54, 'pic-1.jpg'),
            new Product(5, 'Mi 7pro', 14500, 99, 'pic-1.jpg')
        ];
    }
}