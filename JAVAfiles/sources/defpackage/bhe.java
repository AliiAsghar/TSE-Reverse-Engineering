package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bhe extends arrp implements arqv<bwj, Integer, arnb> {
    final /* synthetic */ and a;
    final /* synthetic */ cvn b;
    final /* synthetic */ List c;
    final /* synthetic */ List d;
    final /* synthetic */ Integer e;
    final /* synthetic */ arqw f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhe(and andVar, cvn cvnVar, List list, List list2, Integer num, arqw arqwVar) {
        super(2);
        this.a = andVar;
        this.b = cvnVar;
        this.c = list;
        this.d = list2;
        this.e = num;
        this.f = arqwVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        float f;
        float a;
        Integer num;
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
            bwjVar.v();
        } else {
            alt altVar = new alt(this.a, this.b);
            if (this.c.isEmpty()) {
                f = altVar.d();
            } else {
                f = brg.a;
            }
            if (!this.d.isEmpty() && (num = this.e) != null) {
                a = this.b.eh(num.intValue());
            } else {
                a = altVar.a();
            }
            this.f.a(new amk(amh.b(altVar, this.b.q()), f, amh.a(altVar, this.b.q()), a), bwjVar, 0);
        }
        return arnb.a;
    }
}
