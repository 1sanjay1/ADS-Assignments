var express = require('express');
var router = express.Router();
var bodyParser = require('body-parser');
var urlencodeParser = bodyParser.urlencoded({extended: false});
var fs = require('fs');

router.use(function(req, res) {
    
        var lines = require('fs').readFileSync('/home/sanjay/ADSLAB/Assignment 2/cpp/input/schedule.txt', 'utf-8')
        .split('\n')
        .filter(Boolean);

        var graph = [ [],[],[],[],[],[],[],[],[],[] ];

        var totalTransaction = 0;

        for(var i = 0; i < lines.length; i++) {
            var line = lines[i].split(/\s+/g);

            var obj = {
                transactionNum  : line[0],
                statementNum    : line[1],
                operation       : line[2],
                dataItem        : line[3]  
            };

            graph[obj.transactionNum].push(obj);   

            if( totalTransaction < obj.transactionNum )
                totalTransaction = obj.transactionNum;         

        }

        var totalStatements = lines.length;

        graph[0].push({totalStatements, totalTransaction});

        console.log( graph[0][0].totalStatements);
        console.log( graph[0][0].totalTransaction);
          


        var outputLines = require('fs').readFileSync('/home/sanjay/ADSLAB/Assignment 2/cpp/output/output.txt', 'utf-8')
        .split('\n')
        .filter(Boolean);

        console.log(outputLines);

        var conflictGraph = [];

        for(var i = 0; i < outputLines.length; i++) {
            var outputLine = outputLines[i].split(/\s+/g);
            conflictGraph.push(outputLine);
        }

        console.log(conflictGraph);


        // read the result from file 
        var result = require('fs').readFileSync('/home/sanjay/ADSLAB/Assignment 2/cpp/output/result.txt', 'utf-8')
        .split('\n')
        .filter(Boolean);

        console.log("result is " + result);

        res.render('index',{graph : graph, conflictGraph : conflictGraph, resultFlag : result});

});


module.exports = router;