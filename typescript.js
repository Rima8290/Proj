var person = /** @class */ (function () {
    function person(name, age) {
        this.name = name;
        this.age = age;
    }
    person.prototype.info = function () {
        return "Hello" + this.name + "your age is" + this.age;
    };
    return person;
}());
var p1 = new person("rima", 22);
console.log(p1.info());
