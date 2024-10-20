package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zfz extends arrp implements arqv {
    final /* synthetic */ ascv a;
    final /* synthetic */ arqv b;
    final /* synthetic */ boolean c;
    final /* synthetic */ arqr d;
    final /* synthetic */ boolean e;
    final /* synthetic */ arqv f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zfz(ascv ascvVar, arqv arqvVar, boolean z, arqr arqrVar, boolean z2, arqv arqvVar2) {
        super(2);
        this.a = ascvVar;
        this.b = arqvVar;
        this.c = z;
        this.d = arqrVar;
        this.e = z2;
        this.f = arqvVar2;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && bwjVar.L()) {
            bwjVar.v();
        } else {
            yzc.u(this.a, this.b, this.c, this.d, this.e, this.f, bwjVar, 8);
        }
        return arnb.a;
    }
}
