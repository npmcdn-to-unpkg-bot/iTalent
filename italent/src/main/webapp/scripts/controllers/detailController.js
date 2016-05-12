/**
 * Created by arjen on 05/04/16.
 */
angular.module('iTalentApp')
    .controller('detailController', ['$scope', '$routeParams', 'projectService', 'likeService', function ($scope, $routeParams, projectService, likeService) {

        var projectId = $routeParams.id;

        projectService.get(projectId).then(function (project) {
            $scope.project = project;
        }, function (err) {
            console.log('Error getting project: ' + err)
        });

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
               likeService.saveOrUpdate(project.id);
        };
    }]);
