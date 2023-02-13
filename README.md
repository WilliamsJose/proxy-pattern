# Proxy Design Pattern

The Proxy Design Pattern is a structural design pattern that provides an intermediate layer of abstraction between the client and the real object that it wants to access. This layer acts as a surrogate for the real object, allowing the client to access the real object through the proxy.



<p align="center" width="100%">

  <img align="center" width="65%" src="proxy%20pattern%20diagram.png">  

</p>



## Implementation

Here the Proxy Design Pattern is implemented in Java and illustrates how the pattern can be used to provide controlled access to an object. The client accesses the real object through the proxy, which adds extra functionality such as controlling access to the real object, caching results, and validating data before executing the operation on the real object.



## Example

Consider the scenario where you want to display the name of that logged in user. Normally, you would load the data directly from the database and display it after login. in this case I validate that the user is logged in again before showing any of his data, like his name and password (which should not and will never be asked or shown, right? haha, right?)



## Conclusion

The Proxy Design Pattern provides a powerful way to control access to an object, allowing you to add extra functionality such as controlling access, caching results, and validating data before use it.
