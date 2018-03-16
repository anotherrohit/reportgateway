
openDJ.controller('loginController', [ '$scope', 'mainService', '$stateParams', '$state', '$rootScope', 'Notification', '$filter', 'Idle', '_localStorage', function($scope, mainService, $stateParams, $state, $rootScope, Notification, $filter, Idle, _localStorage) {
    $rootScope.isSuperAdmin = false;
    if (_localStorage.getItem("token")) {
        $state.go('dashboard.main');
    }
    $scope.checkAuthentication = function(authenticationData) {
        mainService.checkAuthentication(authenticationData).then(function(response) {
            if (response.data.access_token != undefined) {
                $rootScope.token = response.data.accessToken;
                Idle.watch();
                _localStorage.setItem("token", response.data.access_token);
                $state.go('dashboard.main');
            } else {
                Notification.error($rootScope.getFaultMessage(response.data));
            }
        }, function(response) {
            Notification.error('Something went wrong... Try after some time...');
        });
    };
} ]);
