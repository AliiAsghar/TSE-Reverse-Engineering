package org.chromium.net;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ApiVersion {
    private static final int API_LEVEL = 34;
    private static final String CRONET_VERSION = "131.0.6724.0";
    private static final String LAST_CHANGE = "4ffd1fe58d0f7d18ed3bdd697f0d3b35b02d0ac1-refs/branch-heads/6724@{#1}";
    private static final int MIN_COMPATIBLE_API_LEVEL = 3;

    private ApiVersion() {
    }

    public static int getApiLevel() {
        return 3;
    }

    public static String getCronetVersion() {
        return CRONET_VERSION;
    }

    public static String getCronetVersionWithLastChange() {
        return "131.0.6724.0@".concat("4ffd1fe5");
    }

    public static String getLastChange() {
        return LAST_CHANGE;
    }

    public static int getMaximumAvailableApiLevel() {
        return 34;
    }
}
