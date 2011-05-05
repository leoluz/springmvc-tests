package springapp.service;

import java.util.List;

import springapp.domain.Training;
import springapp.domain.User;

public interface TrainingService {
	
	public List<Training> getTrainings(User user);
	
}
