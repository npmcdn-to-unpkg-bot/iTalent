package be.italent.web.resource;

import java.util.Date;
import java.util.List;

import org.springframework.hateoas.ResourceSupport;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class ProjectDetailResource extends ResourceSupport {
    private Integer projectId;
	private String title;
	private List<PictureResource> pictures;
	private String description;
	private String shortDescription;
	private UserResource user;
	private Date startDate;
	private boolean liked;
	private int numberOfLikes;
	private List<MovieResource> movies;
}