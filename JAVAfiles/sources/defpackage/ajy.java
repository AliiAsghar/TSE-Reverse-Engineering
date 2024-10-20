package defpackage;

import defpackage.cfq;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajy extends arrp implements arqv<Integer, drk, Integer> {
    final /* synthetic */ cfq.c a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajy(cfq.c cVar) {
        super(2);
        this.a = cVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return Integer.valueOf(this.a.a(0, ((Number) obj).intValue()));
    }
}
