package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ncs implements ncq {
    final /* synthetic */ ncq a;
    final /* synthetic */ algk b;
    final /* synthetic */ Executor c;

    public ncs(ncq ncqVar, algk algkVar, Executor executor) {
        this.a = ncqVar;
        this.b = algkVar;
        this.c = executor;
    }

    @Override // defpackage.ncq
    public final yga a(ncp ncpVar) {
        return this.a.a(ncpVar);
    }

    @Override // defpackage.ncq
    public final akul b() {
        return this.a.b().h(this.b, this.c);
    }

    @Override // defpackage.ncq
    public final Object c() {
        return this.b.apply(this.a.c());
    }
}
