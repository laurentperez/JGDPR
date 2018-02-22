package eu.jgdpr.assets;

import eu.jgdpr.util.GDPRConstants;

/**
 * An asset eligible for GDPR regulation
 */
public interface GDPRAsset {

    default boolean isDPOIdentified() {
        return false;
    }

    default int riskAssessed() {
        return GDPRConstants.RISK_UNASSESSED;
    }
}
