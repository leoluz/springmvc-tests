package springapp.service;

import java.util.ArrayList;
import java.util.List;

import springapp.domain.Training;
import springapp.domain.User;

public class SimpleTrainingService implements TrainingService {
	
	private List<Training> trainings;
	
	public SimpleTrainingService() {

		trainings = new ArrayList<Training>();
		
		User user = new User();
		user.setName("Leonardo Luz Almeida");
		user.setEmail("leonardo@fake.com");

		Training training1 = new Training();
		training1.setTrainingName("My first training");
		training1.setUser(user);
		
		this.trainings.add(training1);
		
		Training training2 = new Training();
		training2.setTrainingName("My second training");
		training2.setUser(user);
		
		this.trainings.add(training2);
	}

	@Override
	public List<Training> getTrainings(User user) {
		List<Training> myTrainings = new ArrayList<Training>();
		
		for (Training training : trainings) {
			if (training.getUser().getEmail().equals(user.getEmail())) {
				myTrainings.add(training);
			}
		}
		return myTrainings;
	}
}
