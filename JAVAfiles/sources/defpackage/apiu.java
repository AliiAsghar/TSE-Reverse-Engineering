package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum apiu implements apak {
    NETWORK_INTERFACE_TYPE_UNKNOWN(0),
    NETWORK_INTERFACE_TYPE_MOBILE_DATA(1),
    NETWORK_INTERFACE_TYPE_WIFI(2),
    NETWORK_INTERFACE_TYPE_VPN(3);

    public final int e;

    apiu(int i) {
        this.e = i;
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
