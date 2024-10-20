package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abie implements ServiceConnection {
    final /* synthetic */ abif a;
    final /* synthetic */ AtomicReference b;
    final /* synthetic */ CountDownLatch c;
    final /* synthetic */ AtomicReference d;
    final /* synthetic */ znp e;
    private boolean f;

    public abie(znp znpVar, abif abifVar, AtomicReference atomicReference, CountDownLatch countDownLatch, AtomicReference atomicReference2) {
        this.a = abifVar;
        this.b = atomicReference;
        this.c = countDownLatch;
        this.d = atomicReference2;
        this.e = znpVar;
    }

    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, java.util.concurrent.ExecutorService] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (!this.f) {
            this.f = true;
            znp znpVar = this.e;
            znpVar.b.submit(new rgr(this.a, iBinder, this.b, this.c, this.d, 10));
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
