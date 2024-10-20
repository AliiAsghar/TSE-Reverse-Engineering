package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ylo {
    public static final xze a = xze.g("Bugle", "GoogleTosHelper");
    public final armf b;
    public final xyt c;

    public ylo(armf armfVar, xyt xytVar) {
        this.b = armfVar;
        this.c = xytVar;
    }

    @Deprecated
    public final boolean a() {
        amwt d = ((vrn) this.c.a()).d();
        if (d == amwt.SUBJECT_TO_BATTERY_OPTIMIZATIONS) {
            return true;
        }
        if (d != amwt.CARRIER_SETUP_PENDING && d != amwt.DISABLED_FROM_PREFERENCES) {
            xyo a2 = a.a();
            a2.H("Don't show Google ToS because rcs availability is not ready for provisioning");
            a2.z("RCS availability:", d.toString());
            a2.q();
            return false;
        }
        if (actx.f()) {
            xyo a3 = a.a();
            a3.H("Show Google ToS");
            a3.q();
            return true;
        }
        xyo a4 = a.a();
        a4.H("Not showing Google ToS");
        a4.q();
        return false;
    }
}
