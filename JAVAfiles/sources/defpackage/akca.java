package defpackage;

import android.os.CancellationSignal;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akca extends arpw implements arqv {
    final /* synthetic */ arqr a;
    final /* synthetic */ CancellationSignal b;
    final /* synthetic */ arxo c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akca(arpe arpeVar, arqr arqrVar, CancellationSignal cancellationSignal, arxo arxoVar) {
        super(2, arpeVar);
        this.a = arqrVar;
        this.b = cancellationSignal;
        this.c = arxoVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akca) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aqil.P(obj);
        alog alogVar = (alog) this.a.a(this.b);
        this.c.v(null);
        return alogVar;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        akca akcaVar = new akca(arpeVar, this.a, this.b, this.c);
        akcaVar.d = obj;
        return akcaVar;
    }
}
