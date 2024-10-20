package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aneb extends ance {
    private anec a;

    public aneb(anec anecVar) {
        this.a = anecVar;
    }

    @Override // defpackage.ance, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        anec anecVar = this.a;
        if (!super.cancel(z)) {
            return false;
        }
        anecVar.getClass();
        anecVar.a = true;
        if (!z) {
            anecVar.b = false;
        }
        anecVar.a();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ance
    public final String gs() {
        anec anecVar = this.a;
        if (anecVar != null) {
            ListenableFuture[] listenableFutureArr = anecVar.d;
            AtomicInteger atomicInteger = anecVar.c;
            return "inputCount=[" + listenableFutureArr.length + "], remaining=[" + atomicInteger.get() + "]";
        }
        return null;
    }

    @Override // defpackage.ance
    protected final void gt() {
        this.a = null;
    }
}
