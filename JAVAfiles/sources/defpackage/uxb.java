package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uxb extends arrp implements arqr {
    final /* synthetic */ Instant a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uxb(int i, Instant instant, int i2) {
        super(1);
        this.b = i;
        this.a = instant;
        this.c = i2;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        aozy aozyVar = (aozy) obj;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        int i = this.b;
        uwz uwzVar = (uwz) aozyVar.b;
        uwz uwzVar2 = uwz.a;
        if (i != 0) {
            uwzVar.c = i - 1;
            uwzVar.b |= 1;
            apct k = aoue.k(this.a);
            if (!aozyVar.b.isMutable()) {
                aozyVar.u();
            }
            apag apagVar = aozyVar.b;
            uwz uwzVar3 = (uwz) apagVar;
            uwzVar3.d = k;
            uwzVar3.b |= 2;
            int i2 = this.c;
            if (!apagVar.isMutable()) {
                aozyVar.u();
            }
            uwz uwzVar4 = (uwz) aozyVar.b;
            int i3 = i2 - 1;
            if (i2 != 0) {
                uwzVar4.e = i3;
                uwzVar4.b |= 4;
                return arnb.a;
            }
            throw null;
        }
        throw null;
    }
}
