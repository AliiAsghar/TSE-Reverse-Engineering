package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anhr implements anhm {
    public final aosf a;
    public final aosg b;

    public anhr(aosf aosfVar, aosg aosgVar) {
        this.a = aosfVar;
        this.b = aosgVar;
    }

    public static aorv n(String str) {
        if (albo.ah(str)) {
            return null;
        }
        aorv b = aorv.b(str);
        if (b != null) {
            return b;
        }
        return aorv.ZZ;
    }

    public static int o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            return 2;
        }
        if (i2 == 2) {
            return 3;
        }
        if (i2 != 3) {
            return 5;
        }
        return 4;
    }

    @Override // defpackage.anhm
    public final int a(String str) {
        throw null;
    }

    @Override // defpackage.anhm
    public final String b(int i) {
        throw null;
    }

    @Override // defpackage.anhm
    public final boolean c(String str, String str2) {
        throw null;
    }

    @Override // defpackage.anhm
    public final int d(String str, String str2) {
        throw null;
    }

    @Override // defpackage.anhm
    public final String e(aodz aodzVar, anhl anhlVar) {
        Object obj = aodzVar.a;
        int ordinal = anhlVar.ordinal();
        int i = 1;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        i = 4;
                    } else {
                        throw new IllegalArgumentException(String.format("Not a supported phone number format %s", anhlVar));
                    }
                } else {
                    i = 3;
                }
            } else {
                i = 2;
            }
        }
        return this.a.u((aosw) obj, i);
    }

    @Override // defpackage.anhm
    public final String f(aodz aodzVar, String str) {
        throw null;
    }

    @Override // defpackage.anhm
    public final String g(aodz aodzVar) {
        throw null;
    }

    @Override // defpackage.anhm
    public final String h(aodz aodzVar) {
        throw null;
    }

    @Override // defpackage.anhm
    public final boolean i(aodz aodzVar) {
        return this.a.n((aosw) aodzVar.a);
    }

    @Override // defpackage.anhm
    public final boolean j(aodz aodzVar) {
        throw null;
    }

    @Override // defpackage.anhm
    public final boolean k(aodz aodzVar) {
        aosf aosfVar = this.a;
        aosw aoswVar = (aosw) aodzVar.a;
        aorv c = aosfVar.c(aoswVar);
        int i = aoswVar.c;
        aosc f = aosfVar.f(i, c);
        if (f != null) {
            if ((aosf.i.equals(c) || i == aosfVar.a(c)) && aosfVar.s(aosfVar.i(aoswVar), f) != 12) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.anhm
    public final int l(aodz aodzVar, aodz aodzVar2) {
        throw null;
    }

    @Override // defpackage.anhm
    public final int m(aodz aodzVar) {
        throw null;
    }
}
