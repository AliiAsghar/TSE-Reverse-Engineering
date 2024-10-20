package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anht implements anhn {
    final ConcurrentHashMap a = new ConcurrentHashMap();
    private final anhn b;

    public anht(anhn anhnVar) {
        this.b = anhnVar;
    }

    @Override // defpackage.anhm
    public final int a(String str) {
        return this.b.a(str);
    }

    @Override // defpackage.anhm
    public final String b(int i) {
        return this.b.b(i);
    }

    @Override // defpackage.anhm
    public final boolean c(String str, String str2) {
        return this.b.c(str, str2);
    }

    @Override // defpackage.anhm
    public final int d(String str, String str2) {
        return this.b.d(str, str2);
    }

    @Override // defpackage.anhm
    public final String e(aodz aodzVar, anhl anhlVar) {
        return this.b.e(aodzVar, anhlVar);
    }

    @Override // defpackage.anhm
    public final String f(aodz aodzVar, String str) {
        return this.b.f(aodzVar, str);
    }

    @Override // defpackage.anhm
    public final String g(aodz aodzVar) {
        return this.b.g(aodzVar);
    }

    @Override // defpackage.anhm
    public final String h(aodz aodzVar) {
        return this.b.h(aodzVar);
    }

    @Override // defpackage.anhm
    public final boolean i(aodz aodzVar) {
        return this.b.i(aodzVar);
    }

    @Override // defpackage.anhm
    public final boolean j(aodz aodzVar) {
        return this.b.j(aodzVar);
    }

    @Override // defpackage.anhm
    public final boolean k(aodz aodzVar) {
        return this.b.k(aodzVar);
    }

    @Override // defpackage.anhm
    public final int l(aodz aodzVar, aodz aodzVar2) {
        return this.b.l(aodzVar, aodzVar2);
    }

    @Override // defpackage.anhm
    public final int m(aodz aodzVar) {
        return this.b.m(aodzVar);
    }

    @Override // defpackage.anhn
    public final void n() {
        this.a.clear();
    }

    @Override // defpackage.anhn
    public final aodz o(CharSequence charSequence, String str) {
        anhs anhsVar = new anhs(charSequence, str);
        ansy ansyVar = (ansy) this.a.get(anhsVar);
        if (ansyVar != null) {
            Object obj = ansyVar.a;
            if (obj == null) {
                return (aodz) ansyVar.b;
            }
            throw new anhq(((anhk) obj).a());
        }
        try {
            aodz o = this.b.o(charSequence, str);
            this.a.put(anhsVar, new ansy(o));
            return o;
        } catch (anhk e) {
            this.a.put(anhsVar, new ansy(e));
            throw e;
        }
    }

    @Override // defpackage.anhn
    public final String p(aodz aodzVar, anhl anhlVar) {
        return this.b.p(aodzVar, anhlVar);
    }
}
