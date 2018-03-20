var AppComponent = ng.core.Component({
        templateUrl: 'app.html',
        selector: 'app'
    }).Class({
        constructor : [ng.http.Http, function(http){
            var self = this;
            this.credentials = {username:'', password:''};
            this.authenticated = false;
            var authenticate = function(credentials) {
                var headers = credentials ? {
                    authorization : "Basic " + btoa(credentials.username + ":" + credentials.password)
                } : {};
                http.get('user', {headers: headers}).subscribe(function(response) {
                    var data =response.json();
                    self.authenticated = data && data.name;
                    self.user = self.authenticated ? data.name : '';
                });
            }
            this.login = function() {
                authenticate(self.credentials);
                return false;
            };
            this.logout = function() {
                http.post('logout', {}).subscribe(function() {
                    self.authenticated = false;
                });
            }
            authenticate();
        }]
    });