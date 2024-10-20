package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class brn extends arrp implements arqv<bwj, Integer, arnb> {
    final /* synthetic */ arqw a;
    final /* synthetic */ List b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public brn(arqw arqwVar, List list) {
        super(2);
        this.a = arqwVar;
        this.b = list;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
            bwjVar.v();
        } else {
            this.a.a(this.b, bwjVar, 0);
        }
        return arnb.a;
    }
}
