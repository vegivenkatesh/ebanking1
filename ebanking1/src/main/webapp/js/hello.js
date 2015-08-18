$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8080/ebanking1/customers" ,
        dataType:"html",
        	   contentType: 'application/json',
        	    data: JSON.stringify(data),
    }).then(function(data, status, jqxhr) {
       $('.customers-customerId').append(data.id);
       $('.customers-address').append(data.address);
       $('.customers-city').append(data.city);
       console.log(jqxhr);
    });
});