package defpackage;

import defpackage.cga;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cft implements cga {
    public final cga a;
    public final cga b;

    /* compiled from: PG */
    /* renamed from: cft$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqv<String, cga.b, String> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            String str = (String) obj;
            cga.b bVar = (cga.b) obj2;
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public cft(cga cgaVar, cga cgaVar2) {
        this.a = cgaVar;
        this.b = cgaVar2;
    }

    @Override // defpackage.cga
    public final /* synthetic */ cga a(cga cgaVar) {
        return cfz.a(this, cgaVar);
    }

    @Override // defpackage.cga
    public final Object b(Object obj, arqv arqvVar) {
        return this.b.b(this.a.b(obj, arqvVar), arqvVar);
    }

    @Override // defpackage.cga
    public final boolean c(arqr arqrVar) {
        if (this.a.c(arqrVar) && this.b.c(arqrVar)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cft) {
            cft cftVar = (cft) obj;
            if (d.F(this.a, cftVar.a) && d.F(this.b, cftVar.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "[" + ((String) b("", AnonymousClass1.a)) + ']';
    }
}
