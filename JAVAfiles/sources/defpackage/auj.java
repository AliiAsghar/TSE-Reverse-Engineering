package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class auj extends arrp implements arqr<dho, arnb> {
    final /* synthetic */ boolean a;
    final /* synthetic */ avc b;
    final /* synthetic */ arwe c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auj(boolean z, avc avcVar, arwe arweVar) {
        super(1);
        this.a = z;
        this.b = avcVar;
        this.c = arweVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        dho dhoVar = (dho) obj;
        if (this.a) {
            auf aufVar = new auf(this.b, this.c);
            artm[] artmVarArr = dhl.a;
            dhn dhnVar = dgx.a;
            dhoVar.c(dgx.w, new dgn(null, aufVar));
            dhoVar.c(dgx.y, new dgn(null, new aug(this.b, this.c)));
        } else {
            auh auhVar = new auh(this.b, this.c);
            artm[] artmVarArr2 = dhl.a;
            dhn dhnVar2 = dgx.a;
            dhoVar.c(dgx.x, new dgn(null, auhVar));
            dhoVar.c(dgx.z, new dgn(null, new aui(this.b, this.c)));
        }
        return arnb.a;
    }
}
