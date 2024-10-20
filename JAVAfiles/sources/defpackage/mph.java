package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum mph implements apak {
    UNKNOWN(0),
    BUGLE(1),
    SATELLITE(2),
    WEAR_PHONE_RELAY(3),
    PENPAL_BOT(4),
    WEAR_RETAIL(5),
    RBM(6),
    UNRECOGNIZED(-1);

    private final int j;

    mph(int i2) {
        this.j = i2;
    }

    public static mph b(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN;
            case 1:
                return BUGLE;
            case 2:
                return SATELLITE;
            case 3:
                return WEAR_PHONE_RELAY;
            case 4:
                return PENPAL_BOT;
            case 5:
                return WEAR_RETAIL;
            case 6:
                return RBM;
            default:
                return null;
        }
    }

    @Override // defpackage.apak
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.j;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
