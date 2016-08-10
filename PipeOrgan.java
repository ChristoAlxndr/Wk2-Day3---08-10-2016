package com.assignment;

public class PipeOrgan {

	private int organ = 0;
	private int wood = 0;
	private int manuals = 0;
	private int pedals = 0;
	private int pipes = 0;
	private int stops = 0;
	private int lights = 0;
	private int shutters = 0;
	private int racks = 0;
	private int benches = 0;
	
	public PipeOrgan(int organ, int wood, int manuals, int pedals, int pipes, int stops, int lights, int shutters,
			int racks, int benches) {
		this.organ = organ;
		this.wood = wood;
		this.manuals = manuals;
		this.pedals = pedals;
		this.pipes = pipes;
		this.stops = stops;
		this.lights = lights;
		this.shutters = shutters;
		this.racks = racks;
		this.benches = benches;
	}

	public PipeOrgan() {
	}
	
	public int getOrgan() {
		return organ;
	}

	public void setOrgan(int organ) {
		this.organ = organ;
	}

	public int getWood() {
		return wood;
	}

	public void setWood(int wood) {
		this.wood = wood;
	}

	public int getManuals() {
		return manuals;
	}

	public void setManuals(int manuals) {
		this.manuals = manuals;
	}

	public int getPedals() {
		return pedals;
	}

	public void setPedals(int pedals) {
		this.pedals = pedals;
	}

	public int getPipes() {
		return pipes;
	}

	public void setPipes(int pipes) {
		this.pipes = pipes;
	}

	public int getStops() {
		return stops;
	}

	public void setStops(int stops) {
		this.stops = stops;
	}

	public int getLights() {
		return lights;
	}

	public void setLights(int lights) {
		this.lights = lights;
	}

	public int getShutters() {
		return shutters;
	}

	public void setShutters(int shutters) {
		this.shutters = shutters;
	}

	public int getRacks() {
		return racks;
	}

	public void setRacks(int racks) {
		this.racks = racks;
	}

	public int getBenches() {
		return benches;
	}

	public void setBenches(int benches) {
		this.benches = benches;
	}

	@Override
	public String toString() {
		return "Order Review: 1 #" + organ + " organ with " + wood + " wood panels, " + manuals + "manuals, " + pedals
				+ " pedals, \n " + pipes + " pipes, " + stops + " pull stops, " + lights + " music stand lamps, " + shutters + " cabinet shutters, \n"
				+ racks + " pipe racks, and " + benches + " benches.";
	}
	
}
	
	
	
