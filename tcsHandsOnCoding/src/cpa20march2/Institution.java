package cpa20march2;

public class Institution {
	
	private int institutionId;
	private String institutionName;
	private String institutionLocation;
	private double rating;
	private boolean researchCentre;
	public Institution(int institutionId, String institutionName, String institutionLocation, double rating,
			boolean researchCentre) {
		super();
		this.institutionId = institutionId;
		this.institutionName = institutionName;
		this.institutionLocation = institutionLocation;
		this.rating = rating;
		this.researchCentre = researchCentre;
	}
	public int getInstitutionId() {
		return institutionId;
	}
	public void setInstitutionId(int institutionId) {
		this.institutionId = institutionId;
	}
	public String getInstitutionName() {
		return institutionName;
	}
	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}
	public String getInstitutionLocation() {
		return institutionLocation;
	}
	public void setInstitutionLocation(String institutionLocation) {
		this.institutionLocation = institutionLocation;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public boolean isResearchCentre() {
		return researchCentre;
	}
	public void setResearchCentre(boolean researchCentre) {
		this.researchCentre = researchCentre;
	}
	
}
