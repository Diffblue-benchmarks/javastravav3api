package javastrava.api.v3.model.reference;

/**
 * <p>
 * Athlete gender
 * </p>
 * 
 * @author Dan Shannon
 *
 */
public enum StravaGender {
	MALE("M", "Male"), FEMALE("F", "Female"), UNKNOWN("UNKNOWN", "Unknown");

	private String	id;
	private String	description;

	private StravaGender(final String id, final String description) {
		this.id = id;
		this.description = description;
	}

	// @JsonValue
	public String getValue() {
		return this.id;
	}

	// @JsonCreator
	public static StravaGender create(final String id) {
		StravaGender[] genders = StravaGender.values();
		for (StravaGender gender : genders) {
			if (gender.getId().equals(id)) {
				return gender;
			}
		}
		return StravaGender.UNKNOWN;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * @see java.lang.Enum#toString()
	 */
	@Override
	public String toString() {
		return this.id;
	}

}