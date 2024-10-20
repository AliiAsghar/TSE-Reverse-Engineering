package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum acuc {
    HTTP_FT,
    STICKERS,
    LOCATION_PUSH,
    IP_CALL,
    IP_VIDEO_CALL_ONLY,
    MESSAGE_REVOCATION,
    FILE_TRANSFER_VIA_SMS,
    LOCATION_VIA_SMS,
    UP_2_0,
    PAYMENTS_V1;

    private final int l = 1 << ordinal();

    acuc() {
    }

    public final int a(int i) {
        return i | this.l;
    }

    public final boolean b(int i) {
        if ((i & this.l) > 0) {
            return true;
        }
        return false;
    }
}
