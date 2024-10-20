package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dex extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
    int a;
    final /* synthetic */ bzj b;
    final /* synthetic */ View c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dex(bzj bzjVar, View view, arpe arpeVar) {
        super(2, arpeVar);
        this.b = bzjVar;
        this.c = view;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dex) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        Object obj2 = arpl.a;
        try {
            if (this.a != 0) {
                aqil.P(obj);
            } else {
                aqil.P(obj);
                bzj bzjVar = this.b;
                this.a = 1;
                Object V = arrn.V(bzjVar.n, new bzl(null), this);
                if (V != arpl.a) {
                    V = arnb.a;
                }
                if (V == obj2) {
                    return obj2;
                }
            }
            View view = this.c;
            if (dfd.a(view) == this.b) {
                dfd.b(this.c, null);
            }
            return arnb.a;
        } catch (Throwable th) {
            View view2 = this.c;
            if (dfd.a(view2) == this.b) {
                dfd.b(this.c, null);
            }
            throw th;
        }
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new dex(this.b, this.c, arpeVar);
    }
}
