package be.italent.web.resource;

import lombok.Data;
import lombok.EqualsAndHashCode;

import org.springframework.hateoas.ResourceSupport;

@Data
@EqualsAndHashCode(callSuper = false)
public class MovieResource extends ResourceSupport {
	private int movieId;
	private String youTubeCode;
	private String description;
}