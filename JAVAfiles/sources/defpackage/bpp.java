package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpp extends arrp implements arqr<bps, bpq> {
    final /* synthetic */ boolean a;
    final /* synthetic */ dqv b;
    final /* synthetic */ arqr c;
    final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpp(boolean z, dqv dqvVar, arqr arqrVar, boolean z2) {
        super(1);
        this.a = z;
        this.b = dqvVar;
        this.c = arqrVar;
        this.d = z2;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        arqr arqrVar = this.c;
        boolean z = this.d;
        return new bpq(this.a, this.b, (bps) obj, arqrVar, z);
    }
}
