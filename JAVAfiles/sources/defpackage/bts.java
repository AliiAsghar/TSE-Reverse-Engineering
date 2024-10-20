package defpackage;

import defpackage.btq;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bts extends arrp implements arqv<bwj, Integer, arnb> {
    final /* synthetic */ arqw a;
    final /* synthetic */ btq.AnonymousClass8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bts(arqw arqwVar, btq.AnonymousClass8 anonymousClass8) {
        super(2);
        this.a = arqwVar;
        this.b = anonymousClass8;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
            bwjVar.v();
        } else {
            this.a.a(this.b, bwjVar, 6);
        }
        return arnb.a;
    }
}
