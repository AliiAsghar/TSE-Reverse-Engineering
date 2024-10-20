package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.ExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amds implements Runnable {
    final /* synthetic */ SettableFuture a;
    final /* synthetic */ amdw b;

    public amds(amdw amdwVar, SettableFuture settableFuture) {
        this.a = settableFuture;
        this.b = amdwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!this.a.isCancelled()) {
                if (albo.bQ(this.a) == amdw.b) {
                    return;
                }
            }
        } catch (ExecutionException unused) {
        }
        this.b.m(this.a);
    }
}
