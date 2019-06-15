export class Product {   //dependancy class
    id: number;
    name: string;
    price: number;
    quantity: number;
    imageUrl: string;

    constructor(id: number, name: string, price: number, quantity: number, imageUrl: string) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.imageUrl = imageUrl;





    }
}