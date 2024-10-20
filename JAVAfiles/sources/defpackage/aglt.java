package defpackage;

import android.content.Context;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aglt implements abom {
    private final agll a;
    private final aglp b;

    protected aglt(Context context, aglp aglpVar) {
        Object obj;
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        aglu agluVar = new aglu();
        anjm anjmVar = new anjm(null, null, null);
        anjmVar.k();
        if (applicationContext != null) {
            anjmVar.c = applicationContext;
            anjmVar.b = algw.i(agluVar);
            anjmVar.k();
            if (anjmVar.a == 1 && (obj = anjmVar.c) != null) {
                Context context2 = (Context) obj;
                this.a = new agll(context2, (algw) anjmVar.e, (algw) anjmVar.b, (algw) anjmVar.d);
                this.b = aglpVar;
                return;
            }
            StringBuilder sb = new StringBuilder();
            if (anjmVar.c == null) {
                sb.append(" context");
            }
            if (anjmVar.a == 0) {
                sb.append(" googlerOverridesCheckbox");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        throw new NullPointerException("Null context");
    }

    public static abom b(Context context, aglk aglkVar) {
        return new aglt(context, new aglp(aglkVar));
    }

    @Override // defpackage.abom
    public final void a(aozb aozbVar) {
        Context context;
        aozbVar.H();
        if (!Looper.getMainLooper().equals(Looper.myLooper())) {
            agll agllVar = this.a;
            aodz aodzVar = agln.a;
            if (!agls.a) {
                synchronized (agls.b) {
                    if (!agls.a) {
                        agls.a = true;
                        synchronized (ahta.a) {
                            Context context2 = ahta.b;
                            context = agllVar.a;
                            if (context2 == null) {
                                try {
                                    ahta.b = context.getApplicationContext();
                                } catch (NullPointerException unused) {
                                    ahta.e();
                                    ahof.c(Level.WARNING, (Executor) ahta.c.get(), "context.getApplicationContext() yielded NullPointerException", new Object[0]);
                                }
                            }
                        }
                        ahtp.f(context);
                        if (!aglo.l(context)) {
                            if (aqmj.a.get().b()) {
                                abqm a = abqq.c(context).a(context.getPackageName());
                                a.b();
                                if (!a.b) {
                                    Log.w("CBVerifier", "Phenotype flags were not sycned because package was not Google Signed.");
                                }
                            }
                            agls.a(agllVar, aodzVar);
                        }
                    }
                }
            }
            if (aqmj.a.get().a()) {
                if (aglo.f == null) {
                    synchronized (aglo.class) {
                        if (aglo.f == null) {
                            aglo.f = new aglo();
                        }
                    }
                }
                aglp aglpVar = this.b;
                aglo agloVar = aglo.f;
                aglpVar.a.a();
            }
            aqmm.a.get();
            aqmj.a.get().c();
            return;
        }
        throw new NetworkOnMainThreadException();
    }

    public final String toString() {
        return "CollectionBasisLogVerifier{collectionBasisContext=" + this.a + ", basis=" + this.b + "}";
    }
}
