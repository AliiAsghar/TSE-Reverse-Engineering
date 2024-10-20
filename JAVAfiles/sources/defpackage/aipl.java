package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aipl {
    public static final /* synthetic */ int d = 0;
    private static final ExecutorService e = Executors.newSingleThreadExecutor(new acra(8));
    public final aiph a;
    public final Set b;
    public final aiim c;
    private final Set f;

    private aipl(aiim aiimVar) {
        aiimVar.getClass();
        this.c = aiimVar;
        this.a = new aiph();
        this.b = new HashSet();
        this.f = new HashSet();
    }

    public static void h(Set set, aipc aipcVar) {
        Collection.EL.stream(set).forEach(new aidg(aipcVar, 16));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, aipj] */
    public static aipl i(aiim aiimVar) {
        aipl aiplVar = new aipl(aiimVar);
        albo.U(aiplVar.a.b(), "already entered the initial state");
        aiplVar.a.c(new aipg(aiplVar.c.c, null));
        return aiplVar;
    }

    private final void j(aipg aipgVar) {
        aiph aiphVar = this.a;
        Set set = this.f;
        aipc c = aiphVar.c(aipgVar);
        h(set, c);
        e.execute(new ahnu(this, c, 15));
    }

    public final Object a(aipm aipmVar) {
        return c(null, aipmVar, null);
    }

    public final Object b(aipj aipjVar, aipm aipmVar) {
        return c(aipjVar, aipmVar, null);
    }

    public final Object c(aipj aipjVar, aipm aipmVar, aipj aipjVar2) {
        g(aipjVar);
        try {
            Object b = aipmVar.b();
            g(aipjVar2);
            return b;
        } catch (Exception e2) {
            f(e2);
            if (!aipmVar.a().isInstance(e2)) {
                if (e2 instanceof RuntimeException) {
                    throw ((RuntimeException) e2);
                }
                throw new IllegalStateException("unexpected exception", e2);
            }
            throw ((Throwable) aipmVar.a().cast(e2));
        }
    }

    public final void d(aipf aipfVar, Map map) {
        aipfVar.e(new aipd(this, map));
    }

    public final void e(aipi aipiVar) {
        if (aipiVar instanceof aipd) {
            this.f.add(aipiVar);
        } else {
            this.b.add(aipiVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, aipj] */
    public final void f(Throwable th) {
        Optional ofNullable;
        aipj a = this.a.a();
        aiim aiimVar = this.c;
        if (!((alor) aiimVar.b).containsKey(a)) {
            ofNullable = Optional.empty();
        } else {
            ofNullable = Optional.ofNullable((aipj) ((alor) ((asqc) ((alor) aiimVar.b).get(a)).a).get(th.getClass()));
        }
        if (ofNullable.isPresent()) {
            g((aipj) ofNullable.get());
        } else {
            j(aipg.a(this.c.a, th));
        }
    }

    public final void g(aipj aipjVar) {
        if (aipjVar == null) {
            return;
        }
        try {
            aiim aiimVar = this.c;
            Object a = this.a.a();
            if (!aiimVar.a(aipjVar)) {
                if (((alpg) aiimVar.d).map.containsKey(a)) {
                    if (!((alpg) aiimVar.d).v(a, aipjVar)) {
                        throw new aipe(String.format(Locale.US, "invalid transition from[%s] -> to[%s]", a, aipjVar));
                    }
                } else {
                    throw new aipe(String.format(Locale.US, "unknown transition from[%s] to[%s]", a, aipjVar));
                }
            }
            j(new aipg(aipjVar, null));
        } catch (aipe e2) {
            j(aipg.a(aipjVar, e2));
        }
    }
}
