package techcable.minecraft.npclib.util.versioning;

import lombok.*;

@Getter
public class CraftbukkitVersion extends Version {
    private final String minecraftVersion;
    private final String packageVersion;
    public CraftbukkitVersion(String id, String minecraftVersion, String packageVersion) {
	    super(id);
	    this.minecraftVersion = minecraftVersion;
	    this.packageVersion = packageVersion;
    }

    @Override
    public boolean isVersion() {
	    try {
		    Class.forName("net.minecraft.server.v" + getPackageVersion());
	    } catch (Exception ex) {
		    return false;
	    }
	    return true;
    }
}