package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ibb implements ajye, ajyf {
    public final akag a;
    public akul b;
    public final ahlp c;

    public ibb(akag akagVar, ahlp ahlpVar) {
        akagVar.getClass();
        this.a = akagVar;
        this.c = ahlpVar;
    }

    @Override // defpackage.ajye, defpackage.ajyd
    public final /* bridge */ /* synthetic */ ListenableFuture a(ajyi ajyiVar) {
        akul akulVar = this.b;
        if (akulVar != null) {
            return akulVar;
        }
        akul g = akul.g(this.a.a(ajyiVar));
        g.getClass();
        return g;
    }

    @Override // defpackage.ajye
    public final ListenableFuture b(ajwt ajwtVar) {
        ajwtVar.getClass();
        return this.a.b(ajwtVar);
    }

    @Override // defpackage.ajye
    public final /* synthetic */ ListenableFuture c(ajwt ajwtVar) {
        return ajki.u(this, ajwtVar);
    }
}
