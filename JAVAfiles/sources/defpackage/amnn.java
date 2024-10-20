package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amnn implements apak {
    CARRIER_SERVICES_EVENT_SOURCE_UNKNOWN(0),
    CARRIER_SERVICES_EVENT_SOURCE_VOICE(1),
    CARRIER_SERVICES_EVENT_SOURCE_RCS(2),
    CARRIER_SERVICES_EVENT_SOURCE_COMMON(3);

    public final int e;

    amnn(int i) {
        this.e = i;
    }

    public static amnn b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return CARRIER_SERVICES_EVENT_SOURCE_COMMON;
                }
                return CARRIER_SERVICES_EVENT_SOURCE_RCS;
            }
            return CARRIER_SERVICES_EVENT_SOURCE_VOICE;
        }
        return CARRIER_SERVICES_EVENT_SOURCE_UNKNOWN;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
