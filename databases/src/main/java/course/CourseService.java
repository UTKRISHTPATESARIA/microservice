package course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Creating a business service.
@Service
public class CourseService {

	@Autowired
	private CoursecRepository courserepo;
	
		List<Course> w= new ArrayList<>(Arrays.asList(
				
				new Course("A1","BB","CC"),
				new Course("B2","BB","CC"),
				new Course("A3","BB","CC"),
				new Course("A4","BB","CC"),
				new Course("A5","BB","CC"),
				new Course("A6","BB","CC"),
				new Course("A7","BB","CC")
				));
		public void addcourse(Course w1)
		{
			//w.add(w1);
			courserepo.save(w1);
		}
				
		public List<Course> getallcourse(String topicid)
		{
			//return w;
			//Creating a list to iterate over all available entities in the table using findAll().
			List<Course> course=new ArrayList<>();
			
			courserepo.findByTopicId(topicid).forEach(course::add);
			
			return course;
			
		}
		
		public Optional<Course> getcourse(String id)
		{
			//return w.stream().filter(t -> t.getId().equals(id)).findFirst().get();
			
			return  courserepo.findById(id);
		}

		//Loop through the topics available and then after finding the id update the parameters.
		
		public void updatecourse(Course wel) {
			
			/*for(int i=0;i<w.size();i++)
			{
				Welcomes w1=w.get(i);
				if(w1.getId().equals(id)) {
					w.set(i, wel);
					return;
				}
			}*/
			
			courserepo.save(wel);
		}
		
		public void deletecourse(String id)
		{
			//w.removeIf(t -> t.getId().equals(id));
			courserepo.deleteById(id);
		}

		
}
