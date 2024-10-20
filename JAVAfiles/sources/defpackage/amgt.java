package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amgt implements apak {
    UNSPECIFIED(0),
    TELEPHONY(1),
    SLM(2),
    TELEPHONY_UNSPECIFIED(3),
    TELEPHONY_IMS(4),
    TELEPHONY_CARRIER_APP(5),
    TRANSPORT_NOT_SELECTED(6);

    public final int h;

    amgt(int i2) {
        this.h = i2;
    }

    public static amgt b(int i2) {
        switch (i2) {
            case 0:
                return UNSPECIFIED;
            case 1:
                return TELEPHONY;
            case 2:
                return SLM;
            case 3:
                return TELEPHONY_UNSPECIFIED;
            case 4:
                return TELEPHONY_IMS;
            case 5:
                return TELEPHONY_CARRIER_APP;
            case 6:
                return TRANSPORT_NOT_SELECTED;
            default:
                return null;
        }
    }

    @Override // defpackage.apak
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
