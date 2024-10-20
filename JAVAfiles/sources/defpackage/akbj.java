package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akbj {
    public final SettableFuture c;
    public final anea d;
    public final AtomicLong a = new AtomicLong(b(Integer.MIN_VALUE, Integer.MIN_VALUE));
    public final AtomicReference b = new AtomicReference(null);
    private final AtomicReference e = new AtomicReference(null);
    private final Executor f = new anew(andi.a);

    public akbj(ancr ancrVar, Executor executor) {
        SettableFuture create = SettableFuture.create();
        this.c = create;
        anea aneaVar = new anea(ancrVar, executor, 1);
        this.d = aneaVar;
        create.c(aneaVar, andi.a);
    }

    public static int a(long j) {
        return (int) (j >>> 32);
    }

    public static long b(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public final ListenableFuture c() {
        long j;
        final int a;
        ListenableFuture g;
        if (this.c.isDone()) {
            return this.c;
        }
        do {
            j = this.a.get();
            a = a(j);
        } while (!this.a.compareAndSet(j, b(a, ((int) j) + 1)));
        AtomicReference atomicReference = this.e;
        final SettableFuture create = SettableFuture.create();
        ListenableFuture listenableFuture = (ListenableFuture) atomicReference.getAndSet(create);
        if (listenableFuture == null) {
            g = albo.bN(akto.c(new ancr() { // from class: akbf
                @Override // defpackage.ancr
                public final ListenableFuture a() {
                    return akbj.this.d(a);
                }
            }), andi.a);
        } else {
            g = ancd.g(listenableFuture, Throwable.class, akto.d(new mhp(this, a, 7)), this.f);
        }
        create.m(g);
        final akbh akbhVar = new akbh(this, a);
        create.c(new Runnable() { // from class: akbg
            @Override // java.lang.Runnable
            public final void run() {
                akbh akbhVar2 = akbhVar;
                SettableFuture settableFuture = create;
                try {
                    Object bQ = albo.bQ(settableFuture);
                    akbj akbjVar = akbj.this;
                    akbjVar.c.set(bQ);
                    akbhVar2.m(akbjVar.c);
                } catch (Throwable unused) {
                    akbhVar2.m(settableFuture);
                }
            }
        }, andi.a);
        return akbhVar;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [ancr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final ListenableFuture d(int i) {
        akbi akbiVar;
        if (a(this.a.get()) > i) {
            return albo.bG();
        }
        akbi akbiVar2 = new akbi(i);
        do {
            akbiVar = (akbi) this.b.get();
            if (akbiVar != null && akbiVar.a > i) {
                return albo.bG();
            }
        } while (!a.bC(this.b, akbiVar, akbiVar2));
        if (a(this.a.get()) > i) {
            akbiVar2.cancel(true);
            a.bC(this.b, akbiVar2, null);
            return akbiVar2;
        }
        anea aneaVar = this.d;
        ?? r1 = aneaVar.a;
        ?? r4 = aneaVar.b;
        if (r1 != 0 && r4 != 0) {
            akbiVar2.m(albo.bN(akto.c(r1), r4));
        } else {
            akbiVar2.m(this.c);
        }
        return akbiVar2;
    }

    public final boolean e() {
        return this.c.isDone();
    }
}
