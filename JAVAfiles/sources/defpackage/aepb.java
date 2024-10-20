package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aepb extends arrp implements arqv {
    final /* synthetic */ aenr a;
    final /* synthetic */ aeoa b;
    final /* synthetic */ aeom c;
    final /* synthetic */ cit d;
    final /* synthetic */ boolean e;
    final /* synthetic */ aeoo f;
    final /* synthetic */ float g;
    final /* synthetic */ boolean h;
    final /* synthetic */ boolean i;
    final /* synthetic */ aeop j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aepb(aenr aenrVar, aeoa aeoaVar, aeom aeomVar, cit citVar, boolean z, aeoo aeooVar, float f, boolean z2, boolean z3, aeop aeopVar) {
        super(2);
        this.a = aenrVar;
        this.b = aeoaVar;
        this.c = aeomVar;
        this.d = citVar;
        this.e = z;
        this.f = aeooVar;
        this.g = f;
        this.h = z2;
        this.i = z3;
        this.j = aeopVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && bwjVar.L()) {
            bwjVar.v();
        } else {
            adom.V(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, bwjVar, 0);
        }
        return arnb.a;
    }
}
