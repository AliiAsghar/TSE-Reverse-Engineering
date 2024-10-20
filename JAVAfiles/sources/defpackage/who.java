package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum who implements apak {
    RCS_SUCCESS_NOTIFICATION_STATE_UNSPECIFIED(0),
    RCS_SUCCESS_NOTIFICATION_STATE_SUCCESS_AWAITING_NOTIFY(1),
    RCS_SUCCESS_NOTIFICATION_STATE_NOTIFIED(2),
    UNRECOGNIZED(-1);

    public static final apal e = new whn(0);
    private final int g;

    who(int i) {
        this.g = i;
    }

    @Override // defpackage.apak
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
