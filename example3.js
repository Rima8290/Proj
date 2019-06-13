//understanding how to expose functions
function add(x,y) {
     return x+y;

}
function sub(x,y) {
    return x-y;

}
module.exports = { //----------------similar to "public"
    add,
    sub

}