package Behavioral.mediator.Practice;

import java.util.ArrayList;
import java.util.List;

import Behavioral.mediator.Practice.model.Light;

public class Mediator {

	private List<Light> lights = new ArrayList<>();
	
	public void registerLight(Light light) {
		lights.add(light);
	}

	public void turnOffAllLights() {
		for (Light light : lights) {
			if(light.isOn()) {
				light.toggle();
			}
		}
	}
}
