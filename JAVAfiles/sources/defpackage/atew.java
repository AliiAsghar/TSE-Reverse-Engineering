package defpackage;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.UploadDataSink;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atew extends UploadDataSink {
    public final Executor b;
    public final atfn c;
    public ByteBuffer d;
    public long e;
    public long f;
    public int g;
    public final HttpURLConnection h;
    public WritableByteChannel i;
    public OutputStream j;
    final /* synthetic */ atfe k;
    private final Executor l;
    public final AtomicInteger a = new AtomicInteger(3);
    private final AtomicBoolean m = new AtomicBoolean(false);

    public atew(atfe atfeVar, Executor executor, Executor executor2, HttpURLConnection httpURLConnection, atfn atfnVar) {
        this.k = atfeVar;
        this.l = new ajzt((Object) this, (Object) executor, 6);
        this.b = executor2;
        this.c = new atfn(atfnVar);
        this.h = httpURLConnection;
    }

    public final void a(atff atffVar) {
        try {
            this.l.execute(new atep(this.k, atffVar, 4));
        } catch (RejectedExecutionException e) {
            g(e);
        }
    }

    public final void b() {
        a(new ateu(this, 1));
    }

    public final void c() {
        this.b.execute(d(new ateu(this, 0)));
    }

    protected final Runnable d(atff atffVar) {
        return new atep(this.k, atffVar, 3);
    }

    public final void e() {
        if (this.i != null && this.m.compareAndSet(false, true)) {
            this.i.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f() {
        e();
        this.k.f();
    }

    public final void g(Throwable th) {
        this.k.c(th);
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onReadError(Exception exc) {
        g(exc);
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onReadSucceeded(boolean z) {
        if (this.a.compareAndSet(0, 2)) {
            this.b.execute(d(new atev(this, z, 0)));
        } else {
            throw new IllegalStateException("onReadSucceeded() called when not awaiting a read result; in state: " + this.a.get());
        }
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onRewindError(Exception exc) {
        g(exc);
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onRewindSucceeded() {
        if (this.a.compareAndSet(1, 2)) {
            c();
            return;
        }
        throw new IllegalStateException("onRewindSucceeded() called when not awaiting a rewind; in state: " + this.a.get());
    }
}
