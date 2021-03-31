var uname = document.getElementById("name");
var email = document.getElementById("email");
var mobile = document.getElementById("mobile");
var mydiv = document.getElementById("mydiv");
var tbody = document.getElementById("tbody");
var table = document.getElementById("table");
var count = 0;
function submission(){
    if(uname.value.length==0||email.value.length==0||mobile.value.length==0)
    alert("there should be no empty field");
    else if (uname.value.length<3)
    alert("Name shoud have 3 letters ")
    else if(/^[a-zA-Z ]+$/.test(uname.value)==false)//it checks if name is a alphabet u can also use space
    alert("name should only have letters");
    else if(mobile.value.length!=10)
    alert("mobile no shoud be of 10 digits");
    else if( /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)+$/.test(email.value)==false)//it checks for valid email 
    alert("please enter  valid email address");
    else{
        console.log("danjk");
    count++;
    var row = document.createElement("tr");
    row.setAttribute("class","added");
    row.innerHTML = "<td>"+uname.value+"</td><td>" + mobile.value+"</td><td>"+email.value+"</td><td onclick ='deletetr()' style='background-color:yellow;' >delete</td>";
    tbody.appendChild(row);
    }
    
    if(count>0)
    table.style.display ="block";
    


}
//this function deletes rows in lifo order
function deletetr(){
    document.getElementsByClassName("added")[count-1].remove();
    count--;
    if(count<=0)
    table.style.display="none";
}