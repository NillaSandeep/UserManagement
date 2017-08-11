(function(){
	var faq=angular.module('faqManager',[]);
	
	faq.controller('FaqController',['$http',function($http){
		var faqStore=this;
		faqStore.faqObjs=[];
		
		$http.get('/ProjectV2/faqdata.json').success(function(data){
			faqStore.faqObjs=data; 
		    });
		
		
	}]);
	
	faq.controller('FaqAddition',function(){
		this.faqObj={};
		this.addFaqDetail=function(faqStore){
			faqStore.faqObjs.push(this.faqObj);
			this.faqObj={};
		};
	});
	
})();
