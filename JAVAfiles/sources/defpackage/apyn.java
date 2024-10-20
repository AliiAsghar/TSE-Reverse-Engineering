package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class apyn extends apym implements Executor, ancs {
    private final apya b;
    private final apyv c;
    private final apya d;
    private volatile apyu e;

    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public apyn(armf armfVar, apyv apyvVar, armf armfVar2) {
        apyc apycVar = new apyc(armfVar);
        apyc apycVar2 = new apyc(armfVar2);
        this.e = null;
        this.b = apycVar;
        this.c = apyvVar;
        this.d = apycVar2;
    }

    @Override // defpackage.ancs
    @Deprecated
    public final ListenableFuture a(Object obj) {
        this.e.d();
        try {
            return b(obj);
        } finally {
            this.e.c();
        }
    }

    protected abstract ListenableFuture b(Object obj);

    protected abstract ListenableFuture c();

    @Override // defpackage.apym
    protected final ListenableFuture e() {
        this.e = ((apyz) this.b.b()).a(this.c);
        this.e.f();
        ListenableFuture g = ancj.g(c(), this, this);
        this.e.a(g);
        return g;
    }

    @Override // java.util.concurrent.Executor
    @Deprecated
    public final void execute(Runnable runnable) {
        this.e.e();
        ((Executor) this.d.b()).execute(runnable);
    }
}
