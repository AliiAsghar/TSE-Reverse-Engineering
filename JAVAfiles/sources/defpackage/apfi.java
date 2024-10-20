package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum apfi implements apak {
    UNKNOWN_SERVICE(0),
    CONTACTS_SERVICE(1),
    EVENT_SERVICE(2),
    FILE_TRANSFER_SERVICE(3),
    IMS_CONNECTION_TRACKER_SERVICE(4),
    SIGNUP_SERVICE(5),
    TRANSPORT_CONTROL_SERVICE(6);

    public final int h;

    apfi(int i2) {
        this.h = i2;
    }

    public static apfi b(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN_SERVICE;
            case 1:
                return CONTACTS_SERVICE;
            case 2:
                return EVENT_SERVICE;
            case 3:
                return FILE_TRANSFER_SERVICE;
            case 4:
                return IMS_CONNECTION_TRACKER_SERVICE;
            case 5:
                return SIGNUP_SERVICE;
            case 6:
                return TRANSPORT_CONTROL_SERVICE;
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
