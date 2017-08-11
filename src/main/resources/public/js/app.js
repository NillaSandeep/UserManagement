(function() {
  var app = angular.module('userManagement',['user-directives']);
 
  
  app.controller('UserAdditionController',function($scope,$http){
	    $scope.statusSuccess=false;
	    $scope.statusFailure=false;
	  $scope.submit = function (){
		  var data =$scope.user;
		  $http.post('rest',data).then(function success(response){
		  $scope.statusSuccess=true;
		  $scope.user={};
	  }, function failure(response){
		  $scope.statusFailure=true;
		  $scope.user={};
	  })};
  });
  
  app.controller('UserSearchController',function($scope,$http){
	  $scope.statusSuccess=false;
	  $scope.statusFailure=false;
	  $scope.submit = function (){
		  var data =$scope.search;
		  $http.get('rest/'+$scope.search.userName 
				  +'/'+$scope.search.lastName).then(function success(response){
		  $scope.statusSuccess=true;
		  $scope.user=response.data;
		  $scope.search={};
	  }, function failure(response){
		  $scope.statusFailure=true;
		  $scope.search={};
	  })};
  });

  
  app.controller('TabController', function (){
	  this.tab=1;
	  
	  this.isSet = function (checkTab){
		  return this.tab===checkTab;
	  };
	  this.setTab = function (activeTab){
		  this.tab=activeTab;
	  };
	  
  });
  
})();