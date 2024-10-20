package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahcn {
    public Object a;
    public Object b;
    public final Object c;
    public final Object d;

    public ahcn(arqg arqgVar, arqr arqrVar) {
        this.d = arqgVar;
        this.c = arqrVar;
    }

    private final void d(int i) {
        Object obj = this.c;
        apaa apaaVar = (apaa) obj;
        long j = ((ahcw) apaaVar.b).g + i;
        aozy aozyVar = (aozy) obj;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        ahcw ahcwVar = (ahcw) apaaVar.b;
        ahcwVar.b |= 8;
        ahcwVar.g = j;
    }

    public final void a(int i) {
        Object obj = this.c;
        apaa apaaVar = (apaa) obj;
        long j = ((ahcw) apaaVar.b).h + i;
        aozy aozyVar = (aozy) obj;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        ahcw ahcwVar = (ahcw) apaaVar.b;
        ahcwVar.b |= 16;
        ahcwVar.h = j;
    }

    public final void b(ahco ahcoVar) {
        boolean z;
        Object obj = this.b;
        boolean z2 = false;
        if (obj == null) {
            z = true;
        } else {
            z = false;
        }
        albo.X(z, "CVE %s has already been built.", obj);
        anas anasVar = ((ahcw) ((apaa) this.c).b).d;
        if (anasVar == null) {
            anasVar = anas.a;
        }
        if ((anasVar.b & 2048) != 0) {
            z2 = true;
        }
        albo.T(!z2);
        if (!((apaa) this.c).cs(ahcoVar.a)) {
            Object obj2 = this.c;
            int a = ahcoVar.a.a();
            aozy aozyVar = (aozy) obj2;
            if (!aozyVar.b.isMutable()) {
                aozyVar.u();
            }
            ahcw ahcwVar = (ahcw) ((apaa) obj2).b;
            apao apaoVar = ahcwVar.c;
            if (!apaoVar.c()) {
                ahcwVar.c = apag.mutableCopy(apaoVar);
            }
            ahcwVar.c.g(a);
        }
        ((apaa) this.c).ct(ahcoVar.a, ahcoVar.b);
        d(ahcoVar.a.a());
        d(ahcoVar.a.hashCode());
        d(ahcoVar.b.hashCode());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, arqr] */
    public final Object c() {
        Object a = this.d.a();
        if (!d.F(this.b, a)) {
            this.b = a;
            this.a = null;
        }
        Object obj = this.a;
        if (obj == null) {
            Object a2 = this.c.a(a);
            this.a = a2;
            return a2;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ahcn(agxw agxwVar) {
        this.a = ahcq.a;
        this.b = null;
        this.c = (apaa) ahcw.a.createBuilder();
        this.d = agxwVar.b;
        d(((anas) ((aozy) agxwVar.b).b).d);
    }
}
