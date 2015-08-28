function ActionFunction(urls, customerId, work){

    if (work == "edit") {

   var divcontainer=$('#mforminsert');
   divcontainer.empty();

   divcontainer.html('<div style="float:left; margin-left:5px; width:400px; height:250px;"><img src="loading.gif" /></div>');

      

      divcontainer.slideDown('slow', function(){

          divcontainer.load(urls+'?empid='+empids+'&sid='+Math.random());

      });
 }

         if (work == "delete") {
var result = confirm("Are you sure you want to delete?");
if (result == true) {
   $.ajax({

        url: urls,

        async: true,

        cache: false,

        data: {customerId: customerId,

        type: 'get',           

        success: function (data) {

           data=data.replace(/\\s+/g,"");

           var spancontainer=$('span#record'+empids);

           if(data != 0){

 

             spancontainer.slideUp('slow', function(){

                         spancontainer.fadeOut("slow");

                     spancontainer.remove();

             });

                 

             

            }

            else {

                spancontainer.slideUp('slow', function(){      

                spancontainer.html("Error While this deleting a record");

                });

            }

        },

        error : function(XMLHttpRequest, textStatus, errorThrown) {

            alert(textStatus);

        }
        }
    });

     

      

      }

      

    }

     

}
