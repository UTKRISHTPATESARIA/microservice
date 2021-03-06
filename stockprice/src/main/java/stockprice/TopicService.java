package stockprice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

//Creating a business service.
@Service
public class TopicService {

		List<Welcomes> w= new ArrayList<>(Arrays.asList(
				
				new Welcomes("A1","BB","CC"),
				new Welcomes("B2","BB","CC"),
				new Welcomes("A3","BB","CC"),
				new Welcomes("A4","BB","CC"),
				new Welcomes("A5","BB","CC"),
				new Welcomes("A6","BB","CC"),
				new Welcomes("A7","BB","CC")
				));
		public void addtopic(Welcomes w1)
		{
			w.add(w1);
		}
				
		public List<Welcomes> gettopic()
		{
			return w;
		}
		
		public Welcomes gettopic1(String id)
		{
			return w.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		}

		//Loop through the topics available and then after finding the id update the parameters.
		
		public void updatetopic(String id, Welcomes wel) {
			
			for(int i=0;i<w.size();i++)
			{
				Welcomes w1=w.get(i);
				if(w1.getId().equals(id)) {
					w.set(i, wel);
					return;
				}
			}
		}
		
		public void deleteTopic(String id)
		{
			w.removeIf(t -> t.getId().equals(id));
		}
}
