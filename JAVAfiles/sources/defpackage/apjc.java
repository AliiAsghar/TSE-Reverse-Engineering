package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum apjc implements apak {
    SIP_TRANSPORT_EVENT_TYPE_UNKNOWN(0),
    SIP_TRANSPORT_EVENT_TYPE_ERROR(1);

    public final int c;

    apjc(int i) {
        this.c = i;
    }

    public static apjc b(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return SIP_TRANSPORT_EVENT_TYPE_ERROR;
        }
        return SIP_TRANSPORT_EVENT_TYPE_UNKNOWN;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.c);
    }
}
