class Star {  
    constructor(name) {
      this.name = name;
    }
    getMessage(message) {
      return this.name + message;
    }    
  }
  class Star1 {  
    constructor(name) {
      this.name = name;
    }
    getMessage(message) {
      return this.name + message;
    }    
  }

  var sun = new Star('Sun');  
  var msg = sun.getMessage('is shining') // => 'Sun is shining'
  console.log(msg);

  var moon = new Star1('moon');
  var msg = moon.getMessage(' is giving vennala')
  console.log(msg);