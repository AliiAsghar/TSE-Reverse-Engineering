package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akuk {
    public final andc a;

    public akuk(andc andcVar) {
        this.a = andcVar;
    }

    public static akuk a(ListenableFuture listenableFuture) {
        return new akuk(new andc(listenableFuture));
    }

    public static akuk b(ancx ancxVar, Executor executor) {
        return new akuk(andc.b(akto.f(ancxVar), executor));
    }

    public static akuk c(ancu ancuVar, Executor executor) {
        long j = akto.a;
        return new akuk(andc.c(new izd(akqj.e(), ancuVar, 18), executor));
    }

    public final akuk d(ancy ancyVar, Executor executor) {
        return new akuk(this.a.d(akto.g(ancyVar), executor));
    }

    public final akuk e(ancv ancvVar, Executor executor) {
        return new akuk(this.a.e(akto.e(ancvVar), executor));
    }

    public final akul f() {
        return akul.g(this.a.l());
    }

    public final String toString() {
        return "PropagatedClosingFuture[" + this.a.toString() + "]";
    }
}
