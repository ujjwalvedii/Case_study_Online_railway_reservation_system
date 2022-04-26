package main.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Trains {
	private List<Train> list;

	public List<Train> getList() {
		
		return list;
	}

	public void setList(List<Train> list) {
		
		this.list = list;
	}

	public Trains(List<Train> list) {
		
		super();
		
		this.list = list;
	}

	public Trains() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
