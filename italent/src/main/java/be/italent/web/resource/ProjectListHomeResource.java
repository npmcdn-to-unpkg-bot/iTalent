package be.italent.web.resource;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.ResourceSupport;

import java.util.Date;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
public class ProjectListHomeResource extends ResourceSupport {
    private Integer projectId;
    private String title;
	private String description;
	private String shortDescription;
	private Date creationDate;
	private UserResource user;
	private Date startDate;
	private Date endDate;
	private Integer duration;
    private List<CategoryResource> categories;
	private DomainResource domain;
	private boolean isPublic;
    private List<PictureResource> pictures;
    private List<MovieResource> movies;
	private List<MilestoneResource> milestones;
	private List<WantedSubscriberResource> wantedSubscribers;
	private List<SubscriberDocentResource> subscribersDocent;
	private List<SubscriberStudentResource> subscribersStudent;
	private List<PreziResource> prezis;
	private List<OnlineFileResource> onlineFiles;
    private int numberOfLikes;
    private boolean liked;
	private int backingPct;
	private int wantedSeats;
	private int takenSeats;
	private boolean canSubscribe;
	private boolean canBack;
    private int mySubscribedHours;
    private int myBackingPct;
    private boolean running;
}

