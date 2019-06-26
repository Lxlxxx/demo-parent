app.service("userService", function ($http) {//构建前端服务层

    this.findList = function () {
        return $http.get('user/findList.do');
    }

    this.findUser = function (username) {
        return $http.get('user/findUser.do?username=' + username);
    }

    this.findUsersByAge = function (start, end) {
        return $http.get('user/findUsersByAge.do?start=' + start + '&end=' + end);
    }
})