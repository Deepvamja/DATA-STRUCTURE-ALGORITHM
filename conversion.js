function kmphTOmph(kmph) 
{   
    return (0.6214 * kmph); 
} 
    
// Function to convert mph to kmph 
function mphTOkmph(mph) 
{  
    return (1.60934 * mph) ; 
} 
  
// Driver Code 
var kmph = 150 
var mph = 100 
 document.write("speed in miles/hr is " + kmphTOmph(kmph) + "<br>"); 
 document.write("speed in km/hr is " + mphTOkmph(mph)); 
    