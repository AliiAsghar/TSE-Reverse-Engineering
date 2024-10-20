package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anci extends ancj {
    public anci(ListenableFuture listenableFuture, algk algkVar) {
        super(listenableFuture, algkVar);
    }

    @Override // defpackage.ancj
    public final /* bridge */ /* synthetic */ Object d(Object obj, Object obj2) {
        return ((algk) obj).apply(obj2);
    }

    @Override // defpackage.ancj
    public final void e(Object obj) {
        set(obj);
    }
}
