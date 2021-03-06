/**
 * Created by arjen on 05/04/16.
 */
angular.module('iTalentApp')
     .controller('myProjectsController', ['$scope', '$rootScope', '$location', 'projectService', 'likeService',
         function ($scope, $rootScope, $location, projectService, likeService) {
    	 $projects = new Array();
    	 $scope.active = "myProjects";
    	 $scope.loadingDone = false;
    	 
         $scope.showMyProjects = function(){
        	$scope.active = "myProjects";
        	$scope.loadingDone = false;
        	projectService.listUser().then(function (projects) {
        		$scope.projects = projects;
        		$scope.loadingDone = true;
            }, function (err) {
                console.log('Error getting projects:');
                console.log(err);
            });	
        };
        
        $scope.showMySubscribedProjects = function(){
        	$scope.active = "mySubscribedProjects";
        	$scope.loadingDone = false;
        	projectService.listMySubscribed().then(function (projects) {
                $scope.projects = projects;
                $scope.loadingDone = true;
            }, function (err) {
                console.log('Error getting mySubscribed projects:');
                console.log(err);
            });
        };
        
        $scope.showMyLikedProjects = function(){
        	$scope.active = "myLikedProjects";
        	$scope.loadingDone = false;
        	projectService.listMyLiked().then(function (projects) {
        		$scope.projects = projects;
        		$scope.loadingDone = true;
            }, function (err) {
                console.log('Error getting myliked projects:');
                console.log(err);
            });
        };
               $scope.editProject = function(id) {
            $location.path('/editProject/' + id);
        };

        $scope.showDetails = function(id) {
            $location.path('/projects/' + id);
        };
        
        $scope.likeClicked = function (project) {
            if (!project.numberOfLikes) {
                project.numberOfLikes = 0;
            }
            if (project.liked) {
                project.numberOfLikes--;
            } else {
                project.numberOfLikes++;
            }
            project.liked = !project.liked;
            
            likeService.saveOrUpdate(project.projectId).then(function () {
                $scope.message = "Likes updated";
            }, function (err) {
                console.log('Error updating likes: ');
                console.log(err);
            })
        };
        $scope.showMyProjects();
    }]);
