package co.grandcircus.famouslab.service;

import java.util.Comparator;
import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.famouslab.entity.FamousResponse;
import co.grandcircus.famouslab.entity.Innovator;
import co.grandcircus.famouslab.entity.Inventor;

@Component
public class ApiService {

	private RestTemplate restTemplate = new RestTemplate();

	{
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
			request.getHeaders().add(HttpHeaders.USER_AGENT, "Spring");
			return execution.execute(request, body);
		};
		restTemplate = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}

	public List<Inventor> getNerds() {
		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
		FamousResponse response = restTemplate.getForObject(url, FamousResponse.class);
		System.out.println();
		return response.getInventors();
	}

	public List<Innovator> getSuperNerds() {
		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
		FamousResponse response = restTemplate.getForObject(url, FamousResponse.class);
		System.out.println();
		return response.getInnovators();
	}

//	public List<Innovator> getSort() {
//
//		List<Innovator> reorder = Innovator.get();
//
//		reorder.sort(Comparator.comparing(Innovator::getYear));
//
//		return reorder;
//	}
}
