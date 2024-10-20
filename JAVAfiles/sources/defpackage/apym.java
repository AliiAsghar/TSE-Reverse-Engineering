package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class apym implements apyo {
    private final AtomicBoolean b = new AtomicBoolean();
    public final apyl a = new apyl();

    @Override // defpackage.apyi
    public final ListenableFuture d() {
        if (this.b.compareAndSet(false, true)) {
            this.a.m(e());
        }
        return this.a;
    }

    protected abstract ListenableFuture e();

    @Override // defpackage.apyo
    public final apyi f() {
        return new apyk(this);
    }

    @Override // defpackage.apyo
    public final apyi g(apyp apypVar) {
        apyk apykVar = new apyk(this);
        apykVar.a.c(new aqym(apykVar, apypVar, 1, (byte[]) null), andi.a);
        return apykVar;
    }

    @Override // defpackage.apyo
    public final void h(boolean z) {
        this.b.set(true);
        this.a.d(z);
    }
}
