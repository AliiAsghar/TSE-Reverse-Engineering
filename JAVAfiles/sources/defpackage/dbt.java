package defpackage;

import android.view.Choreographer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dbt extends arpw implements arqv<arwe, arpe<? super Choreographer>, Object> {
    public dbt(arpe arpeVar) {
        super(2, arpeVar);
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return new dbt((arpe) obj2).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aqil.P(obj);
        return Choreographer.getInstance();
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new dbt(arpeVar);
    }
}
