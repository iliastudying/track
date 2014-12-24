function resetPassword(){
alert($('#textfield').val()); //нужно это значение постить кудато
/*
$.ajax({
   type: "POST",
   url: "some.php", //сокет
   temp: {email: textfield
		  },
	dataType: "json";
   success: function(msg){ //в случае успешной передачи данных
     alert( "Data Saved: " + msg );
   }
 });
*/
}

function login()
{
var login =  ""; 
login = $('#textfield').val(); //так возвращает значение
var password =  ""; 
password = $('#textfield2').val(); //так возвращает значение
alert(login+' '+password);
$.ajax({
   type: "POST",
   url: "/messages", //сокет
   data: {	login: name,
			password: password
		  },
	dataType: "json";
   success: function(msg){ //в случае успешной передачи данных дописать
     alert( "Data Saved: " + msg );
   }
 });
 
}

function newQuest()
{
var name =  ""; 
name = $('#textfield').val(); //так возвращает значение

var date = "";
date = $('#date').val();
var time = "";
time = $('#time').val();
var importancy="";

if ($('#RadioGroup2_0').is(':checked')){ importancy="0";} //проверить
else if ($('#RadioGroup2_1').is(':checked')) {importancy="1";}
else if ($('#RadioGroup2_2').is(':checked')) {importancy="2";}
var percent  = "";
percent = $('#percent').val();
var privacy = "";
if ($('#RadioGroup1_0').is(':checked')){ privacy="0";}
else if ($('#RadioGroup1_1').is(':checked')) {privacy="1";}
var textarea = "";
textarea=$('#textarea').val();
alert(textarea);
//задизейблдить кнопку before sent

$.ajax({
   type: "POST",
   url: "some.php", //сокет
   data: {	name: name,
			date: date,
			time: time,
			importancy: importancy,
			percent: percent,
			privacy: privacy
		  },
	dataType: "json";
   success: function(msg){ //в случае успешной передачи данных дописать
     alert( "Data Saved: " + msg );
   }
 });
}

function useredit(){
var name ="";
//потом как нибудь запилим
var textarea = "";
textarea = $('#textarea').val();
$.ajax({
   type: "POST",
   url: "some.php", //сокет
   data: {	textarea: textarea
		  },
	dataType: "json";
   success: function(msg){ //в случае успешной передачи данных дописать
     alert( "Data Saved: " + msg );
   }
 });
}

function ADMINuseredit(){
var login = "";
var password = "";
var email= "";
login = $('#login').val();
password = $('#password').val();
email = $('#email').val();
var status ="";

if ($('#RadioGroup2_0').is(':checked')){ status="0";} //проверить
else if ($('#RadioGroup2_1').is(':checked')) {status="1";}
else if ($('#RadioGroup2_2').is(':checked')) {status="2";}
$.ajax({
   type: "POST",
   url: "some.php", //сокет
   data: {	login: login,
   password: password,
   email: email,
   status: status
		  },
	dataType: "json";
   success: function(msg){ //в случае успешной передачи данных дописать
     alert( "Data Saved: " + msg );
   }
 });
}


