'use strict';

/* Controllers */


function AppCtrl($scope, $http) {
    $scope.user = null;
}
AppCtrl.$inject = ['$scope', '$http'];


function NavBarController($scope) {
}
NavBarController.$inject = ['$scope'];


// List of talks
function EntriesListCtrl($scope, $http) {
    $scope.entries = null;

    $http({method: 'GET', url: '/api/talks/' })
        .success(function(data, status, headers, config) {
            $scope.entries = new Array();
            $scope.entries = data;
        })
        .error(function(data, status, headers, config) {
            $scope.name = 'Error!'
        });

}
EntriesListCtrl.$inject = ['$scope', '$http'];


function TalkCtrl($rootScope, $scope, $routeParams, $http, $location) {
    $scope.talk = null;

    $http({method: 'GET', url: '/api/talks/'+ $routeParams.id })
        .success(function(data, status, headers, config) {
            $scope.talk = new Array();
            $scope.talk = data;
        })
        .error(function(data, status, headers, config) {
            $scope.name = 'Error!'
        });
}
TalkCtrl.$inject = [$rootScope, $scope, $routeParams, $http, $location];


// List of talks
function SpeakersListCtrl($scope, $http) {
    $scope.speakers = null;
    $scope.query = null;


    $scope.search = function() {
        var query;
        var uri = '/api/speakers/';
        if ($scope.query) {
            uri = '/api/speakers/byname/'+ $scope.query;
        }
        $http({method: 'GET', url: uri})
            .success(function(data, status, headers, config) {
                $scope.speakers = new Array();
                $scope.speakers = data;
            })
            .error(function(data, status, headers, config) {
                $scope.name = 'Error!'
            });
    }

    $scope.search();
}
SpeakersListCtrl.$inject = ['$scope', '$http'];


function SpeakerCtrl($rootScope, $scope, $routeParams, $http, $location) {
    $scope.speaker = null;

    $http({method: 'GET', url: '/api/speakers/'+ $routeParams.id })
        .success(function(data, status, headers, config) {
            $scope.speaker = new Array();
            $scope.speaker = data;
        })
        .error(function(data, status, headers, config) {
            $scope.name = 'Error!'
        });
}
SpeakerCtrl.$inject = [$rootScope, $scope, $routeParams, $http, $location];