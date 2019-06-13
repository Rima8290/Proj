export class Person{
    name : string;
    age : number;

    constructor(name:string,age:number){
        this.name = name;
        this.age = age;
    }
    info(){
        return "Hello"+"\n"+this.name+"your age is"+"\n"+this.age;
    }
}

