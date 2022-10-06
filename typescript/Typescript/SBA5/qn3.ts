class student{
    name1:string;
    grade:number;
    constructor(name1:string,grade:number){
    this.name1=name1;
    this.grade=grade;
}
display(){
    console.log("Name:",this.name1);
    console.log("Grade:",this.grade);
}
}
var obj2=new Array(new student("Sandra",10),new student("Amrutha",10),new student("Namitha",10),new student("Swetha",10));


for(var i=0;i<obj2.length;i++){
console.log("Details of student No:",i+1);
obj2[i].display();
}

