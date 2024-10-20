package defpackage;

import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agju extends agjw {
    final /* synthetic */ aneo a;
    final /* synthetic */ armf b;

    public agju(aneo aneoVar, armf armfVar) {
        this.a = aneoVar;
        this.b = armfVar;
    }

    @Override // defpackage.agjw, defpackage.andx
    public final /* synthetic */ anen d() {
        return this.a;
    }

    @Override // defpackage.agjw
    public final aneo e() {
        return this.a;
    }

    @Override // defpackage.andt, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(new agjv(runnable, this.b));
    }

    @Override // defpackage.andx, defpackage.andt
    public final /* synthetic */ ExecutorService f() {
        return this.a;
    }

    @Override // defpackage.alna
    public final /* synthetic */ Object gV() {
        return this.a;
    }

    @Override // defpackage.andt, java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.andt, java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.alna
    public final String toString() {
        return "ExceptionHandling[" + super.toString() + "]";
    }
}
