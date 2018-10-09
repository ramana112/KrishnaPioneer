var fs = require("fs");

console.log('FS module baic functions examples...');

// writeFile function with filename, content and callback function
fs.writeFile('./test.txt', 'welcome to learning Node FS module by venkat...!', function (err) {
    if (err) throw err;
    console.log('File is created successfully.');
}); 

// open function with filename, file opening mode and callback function
fs.open('./test.txt', 'w', function (err, file) {
    if (err) throw err;
    console.log('File is opened in write mode.');
}); 

var data = "Hii hari welcome to Node.. !";

// // write data to file sample.html // utf8 base64
fs.writeFile('./test.txt',data, 'ascii',
    // callback function that is called after writing file is done
    function(err) { 
        if (err) throw err;
        // if no error
        console.log("Data is written to file successfully.")
});

var data = fs.readFile('./test.txt', function(err, data) {
    if (err){
        console.log(err);
    }
    console.log(data.toString());
  });

  var data = "\nLearn Node.js with the help ***** of well built Node.js Tutorial.";
 
// append data to file
fs.appendFile('./test.txt',data, 'utf8',
    // callback function
    function(err) { 
        if (err) throw err;
        // if no error
        console.log("Data is appended to file successfully.")
});

fs.rename('./test.txt', './sample.txt', function (err) {
    if (err) throw err;
    console.log('File Renamed from test to sample.');
});

// delete file named 'sample.txt'
fs.unlink('./sample.txt', function (err) {
    if (err) throw err;
    // if no error, file has been deleted successfully
    console.log('File deleted!');
}); 
