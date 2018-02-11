public enum MentionNote {
	RATE ("aucune mention"),
	PASSABLE ("mention passable"),
	BIEN ("mention bien"),
	TRESBIEN ("mention très bien"),
	EXCELLENT ("mention excellent");
	
	private String name = null;
	
	MentionNote(String name){
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
