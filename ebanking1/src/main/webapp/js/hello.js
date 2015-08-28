var myApp = angular.module('myApp', []);



myApp.controller("customerController",["$scope","$http", function($scope,$http){
	
	 var loadcustomers = function(){
		    $scope.customers = [];
	$http.get("http://localhost:8080/ebanking1/customers").success(function(data){
			$scope.customers=data;
		$scope.customers;
		});
	$scope.newcustomer = function(){
	    $scope.enterNew = true;
	    $scope.editing = false;
	    $scope.cust = {};
	  };
	  
	  $scope.createcustomer = function(){
	    $http.post("http://localhost:8080/ebanking1/customers", $scope.cust)
	      .success(function(response, status, headers, config){
	          $scope.customers.push(response);
	          $scope.enterNew = false;
	          $scope.editing = false;
	        })
	      .error(function(response, status, headers, config){
	        $scope.error_message = response.error_message;
	      });
	  };
	 $scope.deletecustomers = function(cust){
		    $http.delete('http://localhost:8080/ebanking1/customers/delete/' + cust.customerId)
		      .success(function(data){
		          var index = $scope.customers.indexOf(cust);
		          $scope.customers.splice(index,1);
		      })
		      .error(function(response, status, headers, config){
		        $scope.error_message = response.error_message;
		      });
	 
		    
	 };
	 $scope.editcustomers = function(cust){
		    $scope.enterNew = false;
		    $scope.editing = true;
		    $scope.cust = cust;
		  };
		  
		  $scope.updatecustomers = function(){
		    $http.put('http://localhost:8080/ebanking1/customers/edit/' + $scope.cust.customerId, $scope.cust)
		      .success(function(response, status, headers, config){
		          $scope.cust = response.cust;
		    console.log($scope.cust);
		          $scope.enterNew = false;
		          $scope.editing = false;
		        })
		      .error(function(response, status, headers, config){
		        $scope.error_message = response.error_message;
		      });
		  };
		  $scope.cancelSave = function(){
			    $scope.enterNew = false;
			    $scope.editing = false;
			    $scope.student = {};
			  };
			  
	 }
	 loadcustomers();
}]);