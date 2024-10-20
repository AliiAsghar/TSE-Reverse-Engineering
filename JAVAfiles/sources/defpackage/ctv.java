package defpackage;

import defpackage.ctt;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ctv extends arrp implements arqv<bwj, Integer, arnb> {
    final /* synthetic */ ctt.a a;
    final /* synthetic */ arqv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctv(ctt.a aVar, arqv arqvVar) {
        super(2);
        this.a = aVar;
        this.b = arqvVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
            bwjVar.v();
        } else {
            ctt.a aVar = this.a;
            arqv arqvVar = this.b;
            boolean a = aVar.a();
            bwjVar.M(Boolean.valueOf(a));
            boolean H = bwjVar.H(a);
            bwjVar.y(-869709043);
            if (a) {
                arqvVar.a(bwjVar, 0);
            } else {
                bwjVar.m(H);
            }
            bwjVar.q();
            bwjVar.s();
        }
        return arnb.a;
    }
}
