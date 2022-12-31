# owoify ^w^
*because enough is never enough*  

This is a Java port of the owoify library based off of [mohan-cao's owoify-js](https://github.com/mohan-cao/owoify-js) and [deadshot465's owoify-py](https://raw.githubusercontent.com/deadshot465/owoify-py), because I decided the current options I saw on Java weren't enough.  

## API Usage
`Owoify` is the main class and really the only class you'd want to use.  
It contains the functions to owoify words in 3 distinct levels.
```java
Owoify.owoify("You look like a cute femboy.");
// outputs "U wook like a cute fembwoy."
// equivalent to Owoify.owoify("You look like a cute femboy.", OwoLevel.OWO);

Owoify.owoify("You look like a cute femboy.", OwoLevel.UWU);
// outputs "U wook wike a cute fembwoy ;;w;;" (kaomoji are randomly selected)

Owoify.owoify("You look like a cute femboy.", OwoLevel.UVU);
// outputs "U wowoowok wike a cute fembwowoy ;;w;;"
```

## That sounds absolutely awesome, now how do I get it?
Coming soon:tm: