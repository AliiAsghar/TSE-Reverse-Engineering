package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ancb extends ancd {
    public ancb(ListenableFuture listenableFuture, Class cls, ancs ancsVar) {
        super(listenableFuture, cls, ancsVar);
    }

    @Override // defpackage.ancd
    public final /* bridge */ /* synthetic */ Object d(Object obj, Throwable th) {
        ListenableFuture a = ((ancs) obj).a(th);
        a.getClass();
        return a;
    }

    @Override // defpackage.ancd
    public final /* synthetic */ void e(Object obj) {
        m((ListenableFuture) obj);
    }
}
