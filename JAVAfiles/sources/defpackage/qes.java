package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum qes implements apak {
    UNKNOWN_TYPE(0),
    SUBJECT_UPDATE(1),
    REMOVE_PARTICIPANT_BY_ALL(2),
    REMOVE_PARTICIPANT_BY_ADMIN(3),
    ICON_UPDATE(4);

    public final int f;

    qes(int i) {
        this.f = i;
    }

    public static qes b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return ICON_UPDATE;
                    }
                    return REMOVE_PARTICIPANT_BY_ADMIN;
                }
                return REMOVE_PARTICIPANT_BY_ALL;
            }
            return SUBJECT_UPDATE;
        }
        return UNKNOWN_TYPE;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
