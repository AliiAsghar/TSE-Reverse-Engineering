package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aokf implements aolh {
    public static final aqrq a = new aqrq("com.google.frameworks.client.data.android.auth.AuthContextInterceptor", false);
    private static final aquo b = new aquj("Authorization", aqut.c);
    private static final aquo c = new aquj("X-Auth-Time", aqut.c);
    private final alor d;
    private ListenableFuture e;

    public aokf(alor alorVar) {
        this.d = alorVar;
    }

    @Override // defpackage.aolh
    public final /* synthetic */ aolq a() {
        return aolq.a;
    }

    @Override // defpackage.aolh
    public final /* synthetic */ aolq b() {
        return aolq.a;
    }

    @Override // defpackage.aolh
    public final aolq f(atii atiiVar) {
        try {
            aoki aokiVar = (aoki) albo.bQ(this.e);
            Object obj = atiiVar.a;
            aquo aquoVar = b;
            albo.U(!((aqut) obj).j(aquoVar), "Already attached auth token");
            ((aqut) atiiVar.a).h(aquoVar, a.cp(aokiVar.a, "Bearer "));
            ((aqut) atiiVar.a).h(c, Long.toString(aokiVar.b));
            return aolq.a;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof aokh) {
                Status.Code code = Status.Code.UNAUTHENTICATED;
                List list = Status.a;
                return aolq.b(code.a().d(cause.getCause()), new aqut());
            }
            return aolq.b(Status.c(cause), new aqut());
        }
    }

    @Override // defpackage.aolh
    public final aolq g(final atii atiiVar) {
        final aokd aokdVar = (aokd) ((aqrr) atiiVar.d).f(aokd.a);
        aokdVar.getClass();
        if (!this.d.containsKey(aokdVar.c)) {
            boolean z = false;
            if (!aokdVar.c.equals("incognito") && !aokdVar.c.equals("pseudonymous")) {
                z = true;
            }
            albo.U(z, "Used non-google account without enabling API Key fallback");
            final aokg aokgVar = ((aojr) ((aqrr) atiiVar.d).f(aojs.a)).h;
            final Set b2 = ((aojx) ((aqrr) atiiVar.d).f(aojx.a)).b();
            akrh e = aktp.e("AuthContextInterceptor#tokenFuture");
            try {
                anel anelVar = new anel(akto.k(new Callable() { // from class: aoke
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        boolean booleanValue = ((Boolean) ((aqrr) atii.this.d).f(aokf.a)).booleanValue();
                        aokg aokgVar2 = aokgVar;
                        aokd aokdVar2 = aokdVar;
                        Set set = b2;
                        if (booleanValue) {
                            return aokgVar2.a(aokdVar2, set);
                        }
                        return aokgVar2.b(aokdVar2, set);
                    }
                }));
                e.b(anelVar);
                ((aojr) ((aqrr) atiiVar.d).f(aojs.a)).f.execute(anelVar);
                this.e = anelVar;
                aolq c2 = aolq.c(anelVar);
                e.close();
                return c2;
            } catch (Throwable th) {
                try {
                    e.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        Object obj = ((aojj) this.d.get(aokdVar.c)).b;
        throw null;
    }

    @Override // defpackage.aolh
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.aolh
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.aolh
    public final /* synthetic */ void e(aojh aojhVar) {
    }
}
