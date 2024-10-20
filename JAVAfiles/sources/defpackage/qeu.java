package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum qeu implements apak {
    CAUSE_UNSPECIFIED(0),
    CAUSE_ONLY_SELF_IN_GROUP(1),
    CAUSE_GROUP_NOT_FOUND(2);

    public final int d;

    qeu(int i) {
        this.d = i;
    }

    public static qeu b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return CAUSE_GROUP_NOT_FOUND;
            }
            return CAUSE_ONLY_SELF_IN_GROUP;
        }
        return CAUSE_UNSPECIFIED;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
