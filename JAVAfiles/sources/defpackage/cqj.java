package defpackage;

import defpackage.cga;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class cqj extends arrp implements arqg<arnb> {
    final /* synthetic */ cqk a;
    final /* synthetic */ cga.c b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqj(cqk cqkVar, cga.c cVar) {
        super(0);
        this.a = cqkVar;
        this.b = cVar;
    }

    @Override // defpackage.arqg
    public final /* bridge */ /* synthetic */ Object a() {
        cqp cqpVar = this.a.b;
        cqpVar.e.c();
        cqpVar.e.d(cqpVar);
        while (true) {
            ux uxVar = cqpVar.e;
            int i = uxVar.b;
            if (i != 0) {
                cqp cqpVar2 = (cqp) uxVar.b(i - 1);
                int i2 = 0;
                while (true) {
                    cbh cbhVar = cqpVar2.d;
                    if (i2 < cbhVar.b) {
                        cga.c cVar = this.b;
                        cqo cqoVar = (cqo) cbhVar.a[i2];
                        if (d.F(cqoVar.a, cVar)) {
                            cqpVar2.d.m(cqoVar);
                            cqoVar.a();
                        } else {
                            cqpVar.e.d(cqoVar);
                            i2++;
                        }
                    }
                }
            } else {
                return arnb.a;
            }
        }
    }
}
