package net.romvoid95.coordless.mixins;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.world.World;

@Mixin(World.class)
public class MixinWorld
{
	private World world;
	
	@Overwrite
    public CrashReportCategory addWorldInfoToCrashReport(CrashReport report)
    {
		//logConsoleOnly();
		
        CrashReportCategory crashreportcategory3 = report.makeCategoryDepth("Affected level", 1);
        crashreportcategory3.addDetail("Player Detail", () -> "[REDACTED]");
        return crashreportcategory3;
    }
	
//	private void logConsoleOnly() {
//		Cordless.cLog.warn(world.playerEntities.size() + " total; " + world.playerEntities);
//		Cordless.cLog.warn(world.getChunkProvider().makeString());
//	}
}
