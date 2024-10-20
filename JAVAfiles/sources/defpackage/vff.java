package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vff implements vfh {
    private final armf a;
    private final int b;

    public vff(armf armfVar, int i) {
        this.a = armfVar;
        this.b = i;
    }

    @Override // defpackage.vfh
    public final void a(boolean z, int i) {
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.BUGLE_INTERNET_CONNECTIVITY_CHECK_EVENT;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        aozy createBuilder = apln.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        apln aplnVar = (apln) apagVar;
        aplnVar.b |= 1;
        aplnVar.c = z;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        apln aplnVar2 = (apln) apagVar2;
        aplnVar2.b |= 2;
        aplnVar2.d = i;
        int i2 = this.b;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apln aplnVar3 = (apln) createBuilder.b;
        aplnVar3.e = arwi.J(i2);
        aplnVar3.b |= 4;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        apln aplnVar4 = (apln) createBuilder.s();
        aplnVar4.getClass();
        amfrVar2.aO = aplnVar4;
        amfrVar2.e |= Integer.MIN_VALUE;
        ((maq) this.a.b()).j(amfqVar);
    }
}
