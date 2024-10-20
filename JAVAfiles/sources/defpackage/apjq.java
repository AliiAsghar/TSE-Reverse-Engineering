package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum apjq implements apak {
    SMS_CONNECTION_AVAILABILITY_UNKNOWN(0),
    SMS_CONNECTION_AVAILABLE(1),
    SMS_CONNECTION_UNAVAILABLE(2);

    public final int d;

    apjq(int i) {
        this.d = i;
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
