package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yro extends arpw implements arqv {
    final /* synthetic */ List a;
    final /* synthetic */ List b;
    final /* synthetic */ yrp c;
    final /* synthetic */ you d;
    final /* synthetic */ int e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yro(List list, List list2, yrp yrpVar, you youVar, int i, arpe arpeVar) {
        super(2, arpeVar);
        this.a = list;
        this.b = list2;
        this.c = yrpVar;
        this.d = youVar;
        this.e = i;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yro) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aqil.P(obj);
        arwe arweVar = (arwe) this.f;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            this.b.add(arrn.I(arweVar, null, null, new mgq(this.c, (String) it.next(), this.d, this.e, (arpe) null, 3), 3));
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        yro yroVar = new yro(this.a, this.b, this.c, this.d, this.e, arpeVar);
        yroVar.f = obj;
        return yroVar;
    }
}
