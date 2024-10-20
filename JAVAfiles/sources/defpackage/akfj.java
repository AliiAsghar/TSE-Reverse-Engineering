package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akfj implements akfb {
    final /* synthetic */ akfb a;
    final /* synthetic */ akfb b;
    final /* synthetic */ akax c;
    final /* synthetic */ Executor d;
    private final Object e;

    public akfj(akfb akfbVar, akfb akfbVar2, akax akaxVar, Executor executor) {
        this.a = akfbVar;
        this.b = akfbVar2;
        this.c = akaxVar;
        this.d = executor;
        Object obj = ((akfk) akfbVar).c;
        obj.getClass();
        Object obj2 = ((akfk) akfbVar2).c;
        obj2.getClass();
        d.t(true, "Cannot create a parent key without child keys");
        this.e = new akeq(alpt.p(new Object[]{obj, obj2}));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.lang.Iterable] */
    @Override // defpackage.akfb
    public final andc a() {
        andc a = this.a.a();
        andc a2 = this.b.a();
        atii atiiVar = new atii(a, a2);
        akfi akfiVar = new akfi(this.c, a, a2);
        long j = akto.a;
        aktk aktkVar = new aktk(atiiVar, (ancz) new akth(akqj.e(), akfiVar), 3);
        almw b = almw.b(atiiVar.a);
        andc andcVar = new andc(albo.bX(alog.j(almw.b(alzz.aL(b.c(), new akdg(17))).c())).b(aktkVar, this.d));
        andcVar.b.a(atiiVar.c, andi.a);
        return andcVar;
    }

    @Override // defpackage.akfb
    public final ListenableFuture b() {
        ListenableFuture listenableFuture = aneh.a;
        return albo.bF(listenableFuture, listenableFuture);
    }

    @Override // defpackage.akfb
    public final Object c() {
        return this.e;
    }

    public final String toString() {
        akfb akfbVar = this.b;
        return "DataSources.combine(" + this.a.toString() + ", " + akfbVar.toString() + ")";
    }
}
