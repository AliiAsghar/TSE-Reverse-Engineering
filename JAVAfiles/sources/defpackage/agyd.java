package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agyd {
    public static final alvi a = alvi.m("com/google/android/libraries/inputmethod/flag/FlagFactory");
    public static final a b;

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    class a extends agzr {
    }

    static {
        a aVar = new a();
        b = aVar;
        agzt.c("FlagFactory_UserUnlocked", aVar);
    }

    public static agyb a(String str, long j) {
        return agyf.a.a(Long.class, str, Long.valueOf(j));
    }

    public static agyb b(String str, String str2) {
        return agyf.a.a(String.class, str, str2);
    }

    public static void c(agyc agycVar, agyb... agybVarArr) {
        agyf agyfVar = agyf.a;
        synchronized (agyfVar.c) {
            alpt alptVar = (alpt) agyfVar.c.get(agycVar);
            if (alptVar == null) {
                agyfVar.c.put(agycVar, alpt.p(agybVarArr));
            } else {
                alpr alprVar = new alpr();
                alprVar.j(alptVar);
                alprVar.i(agybVarArr);
                agyfVar.c.put(agycVar, alprVar.g());
            }
        }
    }

    public static agyb d(String str) {
        return agyf.a.a(Boolean.class, str, false);
    }
}
