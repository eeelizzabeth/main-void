package net.guides.springboot2.springboot2jpacrudvoid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import net.guides.springboot2.springboot2jpacrudvoid.model.User;
import net.guides.springboot2.springboot2jpacrudvoid.repository.UserRepository;
import net.guides.springboot2.springboot2jpacrudvoid.service.UserService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")

public class UserController {
    //This is autowiring(Telling spring to just connect to the dang service automatically) for us.
    @Autowired
    UserService userService; //my service is connected to my repository = which is my DB

    //NETWORKING QUICK REFERENCE
    //IF @RequestMapping(method = RequestMethod.GET, value = "/example/{var}")
    //Then you should use @RequestParam to get the variable, like so
    // public returnType getVar(@RequestParam DataType var)

    @RequestMapping(method = RequestMethod.GET, value = "/users/getAll")
    @ApiOperation(value = "Get all users from the database." )
    public Iterable<User> getAll()
    {
        //ALL LOGIC SHOULD BE IN THE SERVICE. EVEN IF IT'S JUST ONE LINE!
        //IF YOU HAVE ANY LOGIC IN THE CONTROLLER IT IS BAD!
        //So we are calling the service function we want.
        return userService.getAllUsers();
    }

    //IF  @RequestMapping(method = RequestMethod.POST, value = "/example")
    //Then you should use @RequestBody to get the variable, like so.
    //public returnType foo(@RequestBody dataType var)

    //Put and Delete will use either. They can also be compiled.
    // So IF @RequestMapping(value = "/{pathVar}", method = RequestMethod.PUT)
    //public void foo(@RequestParam dataType pathVar, @RequestBody dataType postVar)

    @RequestMapping(method = RequestMethod.POST, value = "/users/add")
    @ApiOperation(value = "Add a new user to the database.")
    public void add(@RequestBody User u)
    {
        userService.addUser(u);
    }
}
