define([ "login" ], function(login) {

    'use strict';

    function init() {

        var deferred = new $.Deferred();

        login.init();

        deferred.resolve();

        return $.when(deferred);
    }

    return({
        "init": init
    });
});
