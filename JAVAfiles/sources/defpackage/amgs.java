package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amgs implements apak {
    UNKNOWN_SATELLITE_TYPE(0),
    QUESTIONNAIRE(1),
    SOS_MESSAGE(2),
    END_OF_EMERGENCY(3);

    public final int e;

    amgs(int i) {
        this.e = i;
    }

    public static amgs b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return END_OF_EMERGENCY;
                }
                return SOS_MESSAGE;
            }
            return QUESTIONNAIRE;
        }
        return UNKNOWN_SATELLITE_TYPE;
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
