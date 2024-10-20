package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ariw implements ardt {
    final /* synthetic */ aqsr a;
    private final /* synthetic */ int b;

    public ariw(aqsr aqsrVar, int i) {
        this.b = i;
        this.a = aqsrVar;
    }

    @Override // defpackage.ardt
    public final arao a() {
        boolean z;
        if (this.b != 0) {
            aqyv aqyvVar = (aqyv) this.a;
            return new aqyt(new aqyu(aqyvVar.b, aqyvVar.d, aqyvVar.e, aqyvVar.f, aqyvVar.g), andi.a, aqyvVar.a, aqyvVar.c, aqyvVar.h.b());
        }
        ariy ariyVar = (ariy) this.a;
        if (ariyVar.g != Long.MAX_VALUE) {
            z = true;
        } else {
            z = false;
        }
        return new arix(ariyVar.c, ariyVar.d, ariyVar.j(), ariyVar.f, ariyVar.j, z, ariyVar.g, ariyVar.h, ariyVar.i, ariyVar.k, ariyVar.m);
    }
}
