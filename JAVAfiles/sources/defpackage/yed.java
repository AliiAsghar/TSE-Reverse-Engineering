package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import j$.util.Collection;
import j$.util.stream.Collectors;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yed implements andy {
    final /* synthetic */ SettableFuture a;
    final /* synthetic */ yee b;

    public yed(yee yeeVar, SettableFuture settableFuture) {
        this.a = settableFuture;
        this.b = yeeVar;
    }

    @Override // defpackage.andy
    public final void a(Throwable th) {
        if (th instanceof atpc) {
            xyo b = yee.a.b();
            b.H("Failed to query Tenor API.");
            b.x("status", ((atpc) th).a);
            b.r(th);
            this.a.set(apzy.a);
            return;
        }
        this.a.setException(th);
    }

    @Override // defpackage.andy
    public final /* synthetic */ void b(Object obj) {
        aozy createBuilder = apzy.a.createBuilder();
        Iterable iterable = (Iterable) Collection.EL.stream(((yeo) obj).a).map(new yec(this, 0)).filter(new wjl(17)).collect(Collectors.toCollection(new yaa(4)));
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apzy apzyVar = (apzy) createBuilder.b;
        apax apaxVar = apzyVar.b;
        if (!apaxVar.c()) {
            apzyVar.b = apag.mutableCopy(apaxVar);
        }
        SettableFuture settableFuture = this.a;
        aoyj.addAll(iterable, apzyVar.b);
        settableFuture.set((apzy) createBuilder.s());
    }
}
