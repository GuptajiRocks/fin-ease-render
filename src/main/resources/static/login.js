var attempt = 3;
function validate(event){
    event.preventDefault();
    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;
    if ( username == "arihant" && password == "arihant123"){
        alert ("Login successfully");
        window.location.replace("/dashboard/main");
        return false;
    }
    else if(username == "teacher" && password == "teacher@123") {
        alert ("Login successfully");
        window.location.replace("/dashboard/main");
        return false;
    }
    else if(username == "vishnu" && password == "vrcgangcoc") {
        alert ("Login Successfully");
        window.location.replace("/dashboard/main");
        return false
    }
    else{
        attempt --;// Decrementing by one.
        alert("You have left "+attempt+" attempt;");
// Disabling fields after 3 attempts.
        if( attempt == 0){
            document.getElementById("username").disabled = true;
            document.getElementById("password").disabled = true;
            document.getElementById("submit").disabled = true;
            return false;
        }
    }
}