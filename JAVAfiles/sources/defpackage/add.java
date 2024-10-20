package defpackage;

import defpackage.ajt;

/* compiled from: PG */
/* loaded from: classes.dex */
final class add extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
    int a;
    final /* synthetic */ ada b;
    final /* synthetic */ ajt.b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public add(ada adaVar, ajt.b bVar, arpe arpeVar) {
        super(2, arpeVar);
        this.b = adaVar;
        this.c = bVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((add) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        ajr ajrVar;
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0 && (ajrVar = this.b.b) != null) {
            ajt.a aVar = new ajt.a(this.c);
            this.a = 1;
            if (ajrVar.b(aVar, this) == arplVar) {
                return arplVar;
            }
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new add(this.b, this.c, arpeVar);
    }
}
