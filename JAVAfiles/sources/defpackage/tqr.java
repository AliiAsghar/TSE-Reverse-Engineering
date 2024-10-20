package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum tqr {
    VERIFICATION_NA,
    VERIFICATION_VERIFIED,
    VERIFICATION_UNVERIFIED,
    VERIFICATION_IN_PROGRESS;

    private static final alpt e;

    static {
        tqr tqrVar = VERIFICATION_UNVERIFIED;
        e = alpt.r(VERIFICATION_IN_PROGRESS, tqrVar);
    }

    public final boolean a() {
        if (this != VERIFICATION_NA) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        return e.contains(this);
    }
}
