var fs = require('fs');
fs.unlink('filename',function(err){
    if(err) throw err;
    console.log("File deleted!");
})
