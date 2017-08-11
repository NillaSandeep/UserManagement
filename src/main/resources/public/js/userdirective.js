(function(){
    var app = angular.module('user-directives', []);

	app.directive("createUser", function() {
	      return {
	        restrict: 'E',
	        templateUrl: "create-user.html"
	      };
	    });
	
	  app.directive("searchUser",function(){
		 return{
			 restrict:'E',
			 templateUrl: "search-user.html"
		 } 
	  });
  
  })();