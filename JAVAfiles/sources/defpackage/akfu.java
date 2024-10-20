package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akfu implements akfb {
    final /* synthetic */ akfb a;
    final /* synthetic */ ansy b;

    public akfu(ansy ansyVar, akfb akfbVar) {
        this.a = akfbVar;
        this.b = ansyVar;
    }

    @Override // defpackage.akfb
    public final andc a() {
        return this.a.a().d(akto.g(new lpx(this.b, 14)), andi.a);
    }

    @Override // defpackage.akfb
    public final ListenableFuture b() {
        return aneh.a;
    }

    @Override // defpackage.akfb
    public final Object c() {
        return ((akfk) this.a).c;
    }
}
