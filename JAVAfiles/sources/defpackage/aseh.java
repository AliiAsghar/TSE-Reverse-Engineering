package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aseh implements ListenableFuture {
    private final arxm a;
    private final SettableFuture b = SettableFuture.create();
    private boolean c;

    public aseh(arxm arxmVar) {
        this.a = arxmVar;
    }

    private static final void d(Object obj) {
        if (!(obj instanceof aseg)) {
        } else {
            throw new CancellationException().initCause(((aseg) obj).a);
        }
    }

    public final void a(Object obj) {
        this.b.set(obj);
    }

    public final void b(Throwable th) {
        if (th instanceof CancellationException) {
            this.b.set(new aseg((CancellationException) th));
        } else if (this.b.setException(th)) {
            this.c = true;
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void c(Runnable runnable, Executor executor) {
        this.b.c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (this.b.cancel(z)) {
            this.a.v(null);
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj = this.b.get();
        d(obj);
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        if (this.b.isCancelled()) {
            return true;
        }
        if (isDone() && !this.c) {
            try {
            } catch (CancellationException unused) {
                return true;
            } catch (ExecutionException unused2) {
                this.c = true;
            }
            if (d.p(this.b) instanceof aseg) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isDone()) {
            try {
                Object p = d.p(this.b);
                if (p instanceof aseg) {
                    sb.append("CANCELLED, cause=[" + ((aseg) p).a + "]");
                } else {
                    sb.append(a.cc(p, "SUCCESS, result=[", "]"));
                }
            } catch (CancellationException unused) {
                sb.append("CANCELLED");
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[" + e.getCause() + "]");
            } catch (Throwable th) {
                sb.append("UNKNOWN, cause=[" + th.getClass() + " thrown from get()]");
            }
        } else {
            sb.append("PENDING, delegate=[" + this.b + "]");
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        Object obj = this.b.get(j, timeUnit);
        d(obj);
        return obj;
    }
}
