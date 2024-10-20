package defpackage;

import android.content.pm.PackageManager;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqwo extends aqww {
    final /* synthetic */ alhr a;
    final /* synthetic */ PackageManager b;
    final /* synthetic */ alpt c;
    final /* synthetic */ Executor d;

    public aqwo() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aqww
    @Deprecated
    public final Status a(int i) {
        try {
            return (Status) b(i).get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return Status.c.d(e);
        } catch (CancellationException e2) {
            return Status.c.d(e2);
        } catch (ExecutionException e3) {
            return Status.c(e3);
        }
    }

    public final ListenableFuture b(int i) {
        return albo.bM(new mid(this.a, this.b, this.c, i, 4), this.d);
    }

    public aqwo(alhr alhrVar, PackageManager packageManager, alpt alptVar, Executor executor) {
        this.a = alhrVar;
        this.b = packageManager;
        this.c = alptVar;
        this.d = executor;
    }
}
