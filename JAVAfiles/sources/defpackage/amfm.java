package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amfm implements apak {
    UNKNOWN_BUGLE_DEVICE_TYPE(0),
    PHONE(1),
    WEARABLE(2),
    WEB(3),
    TABLET(4);

    public final int f;

    amfm(int i) {
        this.f = i;
    }

    public static amfm b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return TABLET;
                    }
                    return WEB;
                }
                return WEARABLE;
            }
            return PHONE;
        }
        return UNKNOWN_BUGLE_DEVICE_TYPE;
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
