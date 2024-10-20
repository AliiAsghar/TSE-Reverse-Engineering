package defpackage;

import defpackage.cfq;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aetg extends arrp implements arqv {
    final /* synthetic */ aeth a;
    final /* synthetic */ cga b;
    final /* synthetic */ dje c;
    final /* synthetic */ cku d;
    final /* synthetic */ cku e;
    final /* synthetic */ cfq.b f;
    final /* synthetic */ int g;
    final /* synthetic */ int h;
    final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aetg(aeth aethVar, cga cgaVar, dje djeVar, cku ckuVar, cku ckuVar2, cfq.b bVar, int i, int i2, int i3) {
        super(2);
        this.a = aethVar;
        this.b = cgaVar;
        this.c = djeVar;
        this.d = ckuVar;
        this.e = ckuVar2;
        this.f = bVar;
        this.g = i;
        this.h = i2;
        this.i = i3;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bwj bwjVar = (bwj) obj;
        ((Number) obj2).intValue();
        int i = this.g;
        int i2 = this.h;
        aetn.k(this.a, this.b, this.c, this.d, this.e, this.f, bwjVar, bzh.a(i | 1), bzh.a(i2), this.i);
        return arnb.a;
    }
}
