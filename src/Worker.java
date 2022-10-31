public class Worker{
	private int experience;
	private float efficiency;
	private float stress;
	private float suspicion;
	private float morale;
	
	public void setExperience(int newExperience){
		this.experience = newExperience;
	}
	public void setEfficiency(float newEfficiency){
		this.efficiency = newEfficiency;
	}
	public void setStress(float newStress){
		this.stress = newStress;
	}
	public void setSuspicion(float newSuspicion){
		this.suspicion = newSuspicion;
	}
	public void setMorale(float newMorale){
		this.morale = newMorale;
	}

	public int getExperience(){
		return this.experience;
	}
	public float getEfficiency(){
		return this.efficiency;
	}
	public float getStress(){
		return this.stress;
	}
	public float getSuspicion(){
		return this.suspicion;
	}
	public float getMorale(){
		return this.morale;
	}
	
	public void work(){
	}
}