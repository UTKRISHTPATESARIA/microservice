package course;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//import com.jpadatabase.databases.stockprice.Welcomes;

import stockprice.Welcomes;

@RestController
public class CourseController {
	
	@Autowired  //DEPENDECY INJECTION.
	 private CourseService courses;
	
	
	
	
@RequestMapping("/topics/{id}/course")

public List<Course> getallcourse(@PathVariable String id)
{
	return courses.getallcourse(id);
	//Automatically gets converted to JSON format.
}





 //Mapping id by putting into {...} and using the annotation path variable it passes the id to the function parameter.
@RequestMapping("/course/{topicid}/course/{id}")
public Optional<Course> getcourse(@PathVariable String id)
{
	
	return courses.getcourse(id);
}

//Implementing a post method.



@RequestMapping(method=RequestMethod.POST,value="/topics/{topicid}/course")

public void addcourse(@RequestBody Course wel,@PathVariable String topicid) //JSON FORMAT.
{
	wel.setW(new Welcomes(topicid,"",""));
	courses.addcourse(wel);
}





@RequestMapping(method=RequestMethod.PUT,value="/topics/{topicid}/course/{id}")

public void updatecourse(@RequestBody Course wel, @PathVariable String id, @PathVariable String topicid) //JSON FORMAT.
{
	wel.setW(new Welcomes(topicid,"",""));

	courses.updatecourse(wel);
}






@RequestMapping(method=RequestMethod.DELETE,value="/topics/{topicid}/course/{id}")

public void deletecourse(@PathVariable String id) //JSON FORMAT.
{
	courses.deletecourse(id);
}
}

//Spring to manage this bean and create an instance.
//@Component
