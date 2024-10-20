package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum wcc implements apak {
    UNKNOWN_MESSAGE_SOURCE(0),
    USER(1),
    CONTROL(2);

    public final int d;

    wcc(int i) {
        this.d = i;
    }

    public static wcc b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return CONTROL;
            }
            return USER;
        }
        return UNKNOWN_MESSAGE_SOURCE;
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
