"use strict";
exports.__esModule = true;
var Person = /** @class */ (function () {
    function Person(name, age) {
        this.name = name;
        this.age = age;
    }
    Person.prototype.info = function () {
        return "Hello" + this.name + "your age is" + this.age;
    };
    return Person;
}());
exports.Person = Person;
