package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum wxn implements apak {
    UNKNOWN_CAUSE(0),
    TRANSPORT_INTERNAL_ERROR(1),
    TRANSPORT_UNIMPLEMENTED(2),
    TRANSPORT_PERMISSION_DENIED(3),
    TRANSPORT_UNAVAILABLE(4),
    TRANSPORT_INVALID_ARGUMENT(5),
    TRANSPORT_DEADLINE_EXCEEDED(6);

    public final int h;

    wxn(int i2) {
        this.h = i2;
    }

    public static wxn b(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN_CAUSE;
            case 1:
                return TRANSPORT_INTERNAL_ERROR;
            case 2:
                return TRANSPORT_UNIMPLEMENTED;
            case 3:
                return TRANSPORT_PERMISSION_DENIED;
            case 4:
                return TRANSPORT_UNAVAILABLE;
            case 5:
                return TRANSPORT_INVALID_ARGUMENT;
            case 6:
                return TRANSPORT_DEADLINE_EXCEEDED;
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
