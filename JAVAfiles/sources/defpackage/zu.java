package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zu {
    public static final zz a(acg acgVar, Object obj) {
        zz zzVar = (zz) acgVar.b().a(obj);
        zzVar.d();
        return zzVar;
    }

    public static /* synthetic */ zt b(float f, float f2, int i) {
        if ((i & 2) != 0) {
            f2 = brg.a;
        }
        return new zt(aci.a, Float.valueOf(f), new zv(f2), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static /* synthetic */ zt c(zt ztVar, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = ((Number) ztVar.a()).floatValue();
        }
        if ((i & 2) != 0) {
            f2 = ((zv) ztVar.b).a;
        }
        return new zt(ztVar.a, Float.valueOf(f), new zv(f2), ztVar.c, ztVar.d, ztVar.e);
    }
}
