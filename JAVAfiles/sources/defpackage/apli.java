package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum apli implements apak {
    RCS_TRANSPORT_TYPE_UNKNOWN(0),
    RCS_TRANSPORT_TYPE_DUAL_REGISTRATION(1),
    RCS_TRANSPORT_TYPE_SINGLE_REGISTRATION(2);

    public final int d;

    apli(int i) {
        this.d = i;
    }

    public static apli b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return RCS_TRANSPORT_TYPE_SINGLE_REGISTRATION;
            }
            return RCS_TRANSPORT_TYPE_DUAL_REGISTRATION;
        }
        return RCS_TRANSPORT_TYPE_UNKNOWN;
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
