package com.gildedgames.aether.core.api;

public enum AetherRank {
	NONE(false, false),
	CONTRIBUTOR(true, false),
	TESTER(true, false),
	CELEBRITY(true, false),
	PATRON(true, false),
	MOJANG(true, true),
	RETIRED_GILDED_GAMES(true, false),
	RETIRED_DEVELOPER(true, false),
	GILDED_GAMES(true, true),
	DEVELOPER(true, true);
	
	public final boolean hasHalo, hasDevGlow;
	
	private AetherRank(boolean hasHalo, boolean hasDevGlow) {
		this.hasHalo = hasHalo;
		this.hasDevGlow = hasDevGlow;
	}
	
	public boolean hasHalo() {
		return this.hasHalo;
	}
	
	public boolean hasDevGlow() {
		return this.hasDevGlow;
	}
	
}
