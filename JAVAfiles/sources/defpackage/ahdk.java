package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ahdk implements ahdh {
    final /* synthetic */ ahdl a;
    private int b = -1;

    public ahdk(ahdl ahdlVar) {
        this.a = ahdlVar;
    }

    @Override // defpackage.ahdh
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void b(ahcq ahcqVar) {
        boolean z;
        albo.T(ahcqVar.b());
        apaa apaaVar = ahcqVar.f;
        anas anasVar = ((ahcw) apaaVar.b).d;
        if (anasVar == null) {
            anasVar = anas.a;
        }
        if ((anasVar.b & 2048) != 0) {
            z = true;
        } else {
            z = false;
        }
        albo.T(z);
        int U = a.U(((ahcw) apaaVar.b).e);
        if (U != 0 && U != 1) {
            return;
        }
        ahdl ahdlVar = this.a;
        int size = ahdlVar.e.size();
        ahdlVar.e.add(ahcqVar.a());
        this.a.f.put(size, this.b);
        int i = this.b;
        this.b = size;
        ahcqVar.e.f(this);
        this.b = i;
    }
}
