package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpx implements hot, hos {
    public final hou a;
    public final hos b;
    public volatile Object c;
    public volatile hor d;
    private volatile int e;
    private volatile hoq f;
    private volatile kkc g;

    public hpx(hou houVar, hos hosVar) {
        this.a = houVar;
        this.b = hosVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, hns] */
    @Override // defpackage.hot
    public final void a() {
        kkc kkcVar = this.g;
        if (kkcVar != null) {
            kkcVar.b.eX();
        }
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, hns] */
    @Override // defpackage.hos
    public final void b(hne hneVar, Exception exc, hns hnsVar, int i) {
        this.b.b(hneVar, exc, hnsVar, this.g.b.g());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, hns] */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Object, hne] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, hns] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, hns] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object, hns] */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Object, hne] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, hns] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, hns] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, hne] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, hns] */
    @Override // defpackage.hot
    public final boolean c() {
        boolean z;
        if (this.c != null) {
            Object obj = this.c;
            this.c = null;
            try {
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                try {
                    hnu p = this.a.c.b().p(obj);
                    Object a = p.a();
                    hmx g = ((hmk) this.a.c.b().a).g(a.getClass());
                    if (g != null) {
                        kkc kkcVar = new kkc(g, a, this.a.h, (byte[]) null);
                        ?? r15 = this.g.c;
                        hou houVar = this.a;
                        hor horVar = new hor(r15, houVar.m);
                        hqp c = houVar.c();
                        c.c(horVar, kkcVar);
                        if (Log.isLoggable("SourceGenerator", 2)) {
                            Log.v("SourceGenerator", "Finished encoding source to cache, key: " + horVar.toString() + ", data: " + String.valueOf(obj) + ", encoder: " + g.toString() + ", duration: " + hyq.a(elapsedRealtimeNanos));
                        }
                        if (c.a(horVar) != null) {
                            this.d = horVar;
                            this.f = new hoq(Collections.singletonList(this.g.c), this.a, this);
                            this.g.b.d();
                        } else {
                            if (Log.isLoggable("SourceGenerator", 3)) {
                                Log.d("SourceGenerator", "Attempt to write: " + String.valueOf(this.d) + ", data: " + String.valueOf(obj) + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
                            }
                            try {
                                this.b.d(this.g.c, p.a(), this.g.b, this.g.b.g(), this.g.c);
                                return true;
                            } catch (Throwable th) {
                                th = th;
                                z = true;
                                if (!z) {
                                    this.g.b.d();
                                }
                                throw th;
                            }
                        }
                    } else {
                        throw new hlm(a.getClass());
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z = false;
                }
            } catch (IOException e) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e);
                }
            }
        }
        if (this.f != null && this.f.c()) {
            return true;
        }
        this.f = null;
        this.g = null;
        boolean z2 = false;
        while (!z2 && this.e < this.a.e().size()) {
            List e2 = this.a.e();
            int i = this.e;
            this.e = i + 1;
            this.g = (kkc) e2.get(i);
            if (this.g != null && (this.a.o.c(this.g.b.g()) || this.a.g(this.g.b.a()))) {
                this.g.b.f(this.a.n, new hpw(this, this.g));
                z2 = true;
            }
        }
        return z2;
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, hns] */
    @Override // defpackage.hos
    public final void d(hne hneVar, Object obj, hns hnsVar, int i, hne hneVar2) {
        this.b.d(hneVar, obj, hnsVar, this.g.b.g(), hneVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e(kkc kkcVar) {
        kkc kkcVar2 = this.g;
        if (kkcVar2 != null && kkcVar2 == kkcVar) {
            return true;
        }
        return false;
    }
}
