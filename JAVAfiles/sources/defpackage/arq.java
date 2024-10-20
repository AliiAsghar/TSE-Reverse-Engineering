package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class arq {
    public final cea a;
    public final arqg b;
    private final ve c = new ve((byte[]) null);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        public final Object a;
        public final Object b;
        public int c;
        public arqv d;

        public a(int i, Object obj, Object obj2) {
            this.a = obj;
            this.b = obj2;
            this.c = i;
        }

        public final arqv a() {
            arqv arqvVar = this.d;
            if (arqvVar == null) {
                cdj cdjVar = new cdj(1403994769, true, new arp(arq.this, this));
                this.d = cdjVar;
                return cdjVar;
            }
            return arqvVar;
        }
    }

    public arq(cea ceaVar, arqg arqgVar) {
        this.a = ceaVar;
        this.b = arqgVar;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [ars, java.lang.Object] */
    public final Object a(Object obj) {
        if (obj == null) {
            return null;
        }
        a aVar = (a) this.c.a(obj);
        if (aVar != null) {
            return aVar.b;
        }
        ?? a2 = this.b.a();
        int d = a2.d(obj);
        if (d == -1) {
            return null;
        }
        return a2.f(d);
    }

    public final arqv b(int i, Object obj, Object obj2) {
        a aVar = (a) this.c.a(obj);
        if (aVar != null && aVar.c == i && d.F(aVar.b, obj2)) {
            return aVar.a();
        }
        a aVar2 = new a(i, obj, obj2);
        this.c.j(obj, aVar2);
        return aVar2.a();
    }
}
