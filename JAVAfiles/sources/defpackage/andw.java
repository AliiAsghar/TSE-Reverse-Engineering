package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class andw<V> extends andv {
    public final ListenableFuture b;

    /* JADX INFO: Access modifiers changed from: protected */
    public andw(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        this.b = listenableFuture;
    }

    @Override // defpackage.andv
    protected final ListenableFuture b() {
        return this.b;
    }

    @Override // defpackage.andv
    protected final /* synthetic */ Future d() {
        return this.b;
    }

    @Override // defpackage.alna
    protected final /* synthetic */ Object gV() {
        return this.b;
    }
}
