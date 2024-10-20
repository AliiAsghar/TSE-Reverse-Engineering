package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afjy {
    public static final alvi a = alvi.m("com/google/android/libraries/compose/core/data/usage/SQLiteUsageService");
    public final armf b;
    public final arwe c;
    public final afke d;
    public final afji e;
    public final String f;
    public final ascc g;
    public final arml h;
    public final ascc i;

    public afjy(armf armfVar, arwe arweVar, afke afkeVar, afji afjiVar) {
        this.b = armfVar;
        this.c = arweVar;
        this.d = afkeVar;
        this.e = afjiVar;
        String str = afjiVar.a;
        Locale locale = Locale.ROOT;
        locale.getClass();
        String upperCase = str.toUpperCase(locale);
        upperCase.getClass();
        this.f = upperCase;
        this.g = asck.e(1, 0, 2, 2);
        this.h = armd.a(aezo.l);
        this.i = asck.e(0, 0, 0, 7);
    }

    public final Object a(int i, arpe arpeVar) {
        return this.d.c("SQLiteUsageService#listEntities", new afjx(this, i, null), arpeVar);
    }

    public final ascc b() {
        return (ascc) this.h.a();
    }
}
