package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ancc extends ancd {
    public ancc(ListenableFuture listenableFuture, Class cls, algk algkVar) {
        super(listenableFuture, cls, algkVar);
    }

    @Override // defpackage.ancd
    public final /* bridge */ /* synthetic */ Object d(Object obj, Throwable th) {
        return ((algk) obj).apply(th);
    }

    @Override // defpackage.ancd
    public final void e(Object obj) {
        set(obj);
    }
}
