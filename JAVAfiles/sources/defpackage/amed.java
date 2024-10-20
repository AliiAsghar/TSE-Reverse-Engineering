package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amed implements apak {
    TRANSPORT_OTHER(0),
    TRANSPORT_BLUETOOTH(1),
    TRANSPORT_CELLULAR(2),
    TRANSPORT_ETHERNET(3),
    TRANSPORT_VPN(4),
    TRANSPORT_WIFI(5);

    public final int g;

    amed(int i) {
        this.g = i;
    }

    public static amed b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return TRANSPORT_WIFI;
                        }
                        return TRANSPORT_VPN;
                    }
                    return TRANSPORT_ETHERNET;
                }
                return TRANSPORT_CELLULAR;
            }
            return TRANSPORT_BLUETOOTH;
        }
        return TRANSPORT_OTHER;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
