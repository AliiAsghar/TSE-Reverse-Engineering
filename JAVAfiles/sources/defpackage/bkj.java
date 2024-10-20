package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bkj extends arrp implements arqr<dho, arnb> {
    final /* synthetic */ bpq a;
    final /* synthetic */ boolean b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ String e;
    final /* synthetic */ arwe f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bkj(bpq bpqVar, boolean z, String str, String str2, String str3, arwe arweVar) {
        super(1);
        this.a = bpqVar;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = arweVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        dho dhoVar = (dho) obj;
        bpq bpqVar = this.a;
        if (bpqVar.d.f().d() > 1 && this.b) {
            arwe arweVar = this.f;
            if (bpqVar.c() == bps.c) {
                if (((Boolean) bpqVar.d.b.a(bps.b)).booleanValue()) {
                    String str = this.c;
                    bke bkeVar = new bke(arweVar, bpqVar);
                    artm[] artmVarArr = dhl.a;
                    dhn dhnVar = dgx.a;
                    dhoVar.c(dgx.r, new dgn(str, bkeVar));
                }
            } else if (((Boolean) bpqVar.d.b.a(bps.c)).booleanValue()) {
                String str2 = this.d;
                bkg bkgVar = new bkg(arweVar, bpqVar);
                artm[] artmVarArr2 = dhl.a;
                dhn dhnVar2 = dgx.a;
                dhoVar.c(dgx.s, new dgn(str2, bkgVar));
            }
            if (!bpqVar.b) {
                dhl.c(dhoVar, this.e, new bki(arweVar, bpqVar));
            }
        }
        return arnb.a;
    }
}
