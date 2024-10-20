package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ave extends arpw implements arqv<ahv, arpe<? super arnb>, Object> {
    int a;
    final /* synthetic */ avc b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ave(avc avcVar, int i, arpe arpeVar) {
        super(2, arpeVar);
        this.b = avcVar;
        this.c = i;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ave) c((ahv) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            avc avcVar = this.b;
            this.a = 1;
            if (avcVar.r(this) == arplVar) {
                return arplVar;
            }
        }
        avc avcVar2 = this.b;
        avcVar2.v(avcVar2.f(this.c), brg.a, true);
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new ave(this.b, this.c, arpeVar);
    }
}
