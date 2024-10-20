package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mdt {
    public static final /* synthetic */ int d = 0;
    private static final long e = TimeUnit.SECONDS.toMillis(60);
    public final anen a;
    public final anen b;
    public final aiwu c;
    private final AtomicLong f = new AtomicLong(0);

    public mdt(aiwu aiwuVar, anen anenVar, anen anenVar2) {
        this.c = aiwuVar;
        this.a = anenVar;
        this.b = anenVar2;
    }

    public final akul a() {
        return akul.g(this.c.a()).h(new its(18), this.b);
    }

    public final akul b() {
        return akul.g(this.c.a()).h(new mdr(2), andi.a);
    }

    public final akul c() {
        return akul.g(this.c.a()).h(new mdr(3), andi.a);
    }

    public final ListenableFuture d() {
        return aktp.Y(this.c.a(), new mdr(5), andi.a);
    }

    public final ListenableFuture e(Long l) {
        return this.c.b(akto.a(new itk(l, 18)), andi.a);
    }

    public final ListenableFuture f(long j) {
        long j2 = this.f.get();
        long abs = Math.abs(j - j2);
        if (j2 != 0 && abs <= e) {
            return aktp.ag(null);
        }
        this.f.set(j);
        return this.c.b(akto.a(new mdq(j, 3)), andi.a);
    }

    public final ListenableFuture g(Long l) {
        return this.c.b(akto.a(new mds(l, 1)), andi.a);
    }
}
