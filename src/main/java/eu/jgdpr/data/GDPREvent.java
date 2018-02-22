package eu.jgdpr.data;

import eu.jgdpr.assets.GDPRAsset;

import java.util.List;
import java.util.UUID;

/**
 * an Event applied on a {@link eu.jgdpr.assets.GDPRAsset}
 */
public interface GDPREvent {

    default UUID getId() {
        return UUID.randomUUID();
    }

    GDPRAsset getAltered(List<GDPRAsset> assets);

}
