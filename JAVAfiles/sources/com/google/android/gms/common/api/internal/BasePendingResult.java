package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import defpackage.abgj;
import defpackage.abhg;
import defpackage.abrg;
import defpackage.abrh;
import defpackage.abri;
import defpackage.abrk;
import defpackage.abrm;
import defpackage.absc;
import defpackage.absd;
import defpackage.abse;
import defpackage.absp;
import defpackage.abtm;
import defpackage.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class BasePendingResult<R extends abrm> extends abri<R> {
    public static final ThreadLocal b = new absc();
    public abrm c;
    private Status h;
    private volatile boolean i;
    private boolean j;
    private volatile abgj k;
    private abse resultGuardian;
    private final Object a = new Object();
    private final CountDownLatch e = new CountDownLatch(1);
    private final ArrayList f = new ArrayList();
    private final AtomicReference g = new AtomicReference();
    public boolean d = false;

    @Deprecated
    BasePendingResult() {
        new absd(Looper.getMainLooper());
        new WeakReference(null);
    }

    public static void i(abrm abrmVar) {
        if (abrmVar instanceof abrk) {
            try {
                ((abrk) abrmVar).b();
            } catch (RuntimeException e) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(String.valueOf(abrmVar))), e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract abrm a(Status status);

    @Override // defpackage.abri
    public final void d(abrh abrhVar) {
        d.t(true, "Callback cannot be null.");
        synchronized (this.a) {
            if (k()) {
                abrhVar.a(this.h);
            } else {
                this.f.add(abrhVar);
            }
        }
    }

    @Override // defpackage.abri
    public final abrm e(TimeUnit timeUnit) {
        abrm abrmVar;
        abhg.i(!this.i, "Result has already been consumed.");
        abhg.i(true, "Cannot await if then() has been called.");
        try {
            if (!this.e.await(0L, timeUnit)) {
                h(Status.d);
            }
        } catch (InterruptedException unused) {
            h(Status.b);
        }
        abhg.i(k(), "Result is not ready.");
        synchronized (this.a) {
            abhg.i(!this.i, "Result has already been consumed.");
            abhg.i(k(), "Result is not ready.");
            abrmVar = this.c;
            this.c = null;
            this.i = true;
        }
        abtm abtmVar = (abtm) this.g.getAndSet(null);
        if (abtmVar != null) {
            abtmVar.a();
        }
        abhg.m(abrmVar);
        return abrmVar;
    }

    @Deprecated
    public final void h(Status status) {
        synchronized (this.a) {
            if (!k()) {
                j(a(status));
                this.j = true;
            }
        }
    }

    public final void j(abrm abrmVar) {
        synchronized (this.a) {
            if (!this.j) {
                k();
                abhg.i(!k(), "Results have already been set");
                abhg.i(!this.i, "Result has already been consumed");
                this.c = abrmVar;
                this.h = abrmVar.a();
                this.e.countDown();
                if (this.c instanceof abrk) {
                    this.resultGuardian = new abse(this);
                }
                ArrayList arrayList = this.f;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((abrh) arrayList.get(i)).a(this.h);
                }
                this.f.clear();
                return;
            }
            i(abrmVar);
        }
    }

    public final boolean k() {
        if (this.e.getCount() == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BasePendingResult(abrg abrgVar) {
        new absd(abrgVar != null ? ((absp) abrgVar).a.g : Looper.getMainLooper());
        new WeakReference(abrgVar);
    }
}
