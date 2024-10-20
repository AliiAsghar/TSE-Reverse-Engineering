package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xhl {
    public static final xze a = xze.g("Bugle", "WorkQueueReverseTelephonySyncScheduler");
    public final xnv b;
    public final armf c;
    public final uof d;
    private final armf e;

    public xhl(uof uofVar, znj znjVar, xnv xnvVar, armf armfVar) {
        this.d = uofVar;
        this.e = new wkb(znjVar, 8);
        this.b = xnvVar;
        this.c = armfVar;
    }

    public final void a() {
        a.o("Scheduling reverse sync immediately");
        this.d.a(upk.a("ReverseTelephonySync", xhb.a));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, wul] */
    public final boolean b() {
        try {
            xgx xgxVar = ((xgy) this.e.b().l()).c;
            if (xgxVar == null) {
                xgxVar = xgx.a;
            }
            return xgxVar.b;
        } catch (apba e) {
            a.r("Incorrect protobuf in settings store", e);
            return false;
        }
    }
}
