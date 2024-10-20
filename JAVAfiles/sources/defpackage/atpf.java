package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class atpf extends atqr {
    private final atoq d;

    public atpf(atqn atqnVar, aslf aslfVar, atox atoxVar, atoq atoqVar) {
        super(atqnVar, aslfVar, atoxVar);
        this.d = atoqVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.atqr
    public final Object a(atoo atooVar, Object[] objArr) {
        atoo atooVar2 = (atoo) this.d.a(atooVar);
        arpe arpeVar = (arpe) objArr[objArr.length - 1];
        try {
            arvp arvpVar = new arvp(arhi.i(arpeVar), 1);
            arvpVar.A();
            arvpVar.d(new arnd(atooVar2, 17));
            atooVar2.d(new atph(arvpVar, 0));
            Object l = arvpVar.l();
            if (l == arpl.a) {
                arpeVar.getClass();
            }
            return l;
        } catch (Exception e) {
            return atpj.a(e, arpeVar);
        }
    }
}
