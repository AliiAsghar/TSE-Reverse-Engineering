package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayw {

    /* compiled from: PG */
    /* renamed from: ayw$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<List<? extends dnd>, arnb> {
        final /* synthetic */ dng a;
        final /* synthetic */ arqr b;
        final /* synthetic */ arsb c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(dng dngVar, arqr arqrVar, arsb arsbVar) {
            super(1);
            this.a = dngVar;
            this.b = arqrVar;
            this.c = arsbVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            ayw.b((List) obj, this.a, this.b, (dov) this.c.a);
            return arnb.a;
        }
    }

    public static final void a(ckr ckrVar, long j, dob dobVar, diy diyVar, clp clpVar) {
        int a = dobVar.a(djc.d(j));
        int a2 = dobVar.a(djc.c(j));
        if (a != a2) {
            ckrVar.f(diyVar.n(a, a2), clpVar);
        }
    }

    public static final void b(List list, dng dngVar, arqr arqrVar, dov dovVar) {
        doj a = dngVar.a(list);
        if (dovVar != null) {
            dovVar.b(null, a);
        }
        arqrVar.a(a);
    }

    public static final dov c(dol dolVar, doj dojVar, dng dngVar, dno dnoVar, arqr arqrVar, arqr arqrVar2) {
        arsb arsbVar = new arsb();
        dolVar.a.d(dojVar, dnoVar, new AnonymousClass1(dngVar, arqrVar, arsbVar), arqrVar2);
        dov dovVar = new dov(dolVar, dolVar.a);
        dolVar.b.set(dovVar);
        arsbVar.a = dovVar;
        return (dov) arsbVar.a;
    }
}
