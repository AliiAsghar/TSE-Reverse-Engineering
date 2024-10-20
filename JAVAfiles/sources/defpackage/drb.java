package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class drb {
    public static float a(drc drcVar, long j) {
        if (!a.bB(drm.c(j), 4294967296L)) {
            drd.b("Only Sp can convert to Px");
        }
        int i = drr.a;
        if (!drr.a(drcVar.ed())) {
            return drm.a(j) * drcVar.ed();
        }
        drq b = drr.b(drcVar.ed());
        if (b == null) {
            return drm.a(j) * drcVar.ed();
        }
        return b.b(drm.a(j));
    }

    public static long b(drc drcVar, float f) {
        float ed;
        int i = drr.a;
        if (!drr.a(drcVar.ed())) {
            return drn.b(f / drcVar.ed());
        }
        drq b = drr.b(drcVar.ed());
        if (b != null) {
            ed = b.a(f);
        } else {
            ed = f / drcVar.ed();
        }
        return drn.b(ed);
    }
}
