var student = /** @class */ (function () {
    function student(name1, grade) {
        this.name1 = name1;
        this.grade = grade;
    }
    student.prototype.display = function () {
        console.log("Name:", this.name1);
        console.log("Grade:", this.grade);
    };
    return student;
}());
var obj2 = new Array(new student("Sandra", 10), new student("Amrutha", 10), new student("Namitha", 10), new student("Swetha", 10));
for (var i = 0; i < obj2.length; i++) {
    console.log("Details of student No:", i + 1);
    obj2[i].display();
}
