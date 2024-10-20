package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpz extends arrp implements arqr<dho, arnb> {
    final /* synthetic */ boolean a;
    final /* synthetic */ bqb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpz(boolean z, bqb bqbVar) {
        super(1);
        this.a = z;
        this.b = bqbVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        dho dhoVar = (dho) obj;
        if (!this.a) {
            dhl.b(dhoVar);
        }
        bpy bpyVar = new bpy(this.b);
        artm[] artmVarArr = dhl.a;
        dhn dhnVar = dgx.a;
        dhoVar.c(dgx.g, new dgn(null, bpyVar));
        return arnb.a;
    }
}
