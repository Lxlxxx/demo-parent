app.controller("userController",function ($scope,userService) {

    //查询所有用户
    $scope.findList=function () {
        userService.findList().success(function (response) {
            $scope.list=response;
        })
    }

    //根据用户名查询用户信息
    $scope.findUser=function (username) {
        userService.findUser(username).success(function (response) {
            $scope.entity=response;
        })
    }

    //根据年龄段查询用户
    $scope.findUsersByAge=function (start,end) {
        userService.findUsersByAge(start,end).success(function (response) {
            $scope.users=response;
        })
    }
})
