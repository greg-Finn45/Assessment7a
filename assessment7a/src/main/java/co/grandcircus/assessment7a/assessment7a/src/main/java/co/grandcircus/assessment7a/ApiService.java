package co.grandcircus.assessment7a;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.assessment7a.entity.AnimalsResponse;
import co.grandcircus.assessment7a.entity.Species;

//<- identify this as an autowirable Spring bean
@Component
public class ApiService {

	private RestTemplate restTemplate = new RestTemplate();

	// This is an instance initialization block. It runs when a new instance of the
	// class is created--
	// right before the constructor.
	{
		// This configures the restTemplateWithUserAgent to include a User-Agent header
		// with every HTTP
		// request. Some of the APIs in this demo have a bug where User-Agent is
		// required.
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
			request.getHeaders().add(HttpHeaders.USER_AGENT, "Spring");
			return execution.execute(request, body);
		};
		restTemplate = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}

	
	//Accesses the DonutsResponse class, accesses the web link to get a list of donuts, 
		//and uses the REST API. 
		public AnimalsResponse getAnimals() {

			String url = "https://gc-zoo.surge.sh/api/animals.json";
			
			return restTemplate.getForObject(url, AnimalsResponse.class);
		}
		


		//Accesses the Details class, accesses the web link with the concatenation ("+id+")
		//to add a link to the donut choice, and uses the REST API. 
		public Species getByName(name) {
			
			String url = "https://gc-zoo.surge.sh/api/species/"+{name}+".json";
			return restTemplate.getForObject(url, Species.class);


		}
	
	
	
}

