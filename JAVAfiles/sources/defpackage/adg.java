package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adg extends arrp implements arqg<arnb> {
    final /* synthetic */ adh a;
    final /* synthetic */ cnt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adg(adh adhVar, cnt cntVar) {
        super(0);
        this.a = adhVar;
        this.b = cntVar;
    }

    @Override // defpackage.arqg
    public final /* bridge */ /* synthetic */ Object a() {
        adh adhVar = this.a;
        cmb cmbVar = adhVar.d;
        cnt cntVar = this.b;
        adhVar.e = cmbVar.a(cntVar.o(), cntVar.r(), cntVar);
        return arnb.a;
    }
}
