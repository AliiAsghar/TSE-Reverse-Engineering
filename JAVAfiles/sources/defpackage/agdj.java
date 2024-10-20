package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Looper;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Optional;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agdj implements apxw {
    public static afke a(Optional optional, armf armfVar, armf armfVar2) {
        armfVar.getClass();
        armfVar2.getClass();
        optional.isPresent();
        if (((afkf) optional.get()).a) {
            Object b = armfVar.b();
            b.getClass();
            return (afke) b;
        }
        Object b2 = armfVar2.b();
        b2.getClass();
        return (afke) b2;
    }

    public static agae c() {
        return agiz.M(agek.g, agjb.a);
    }

    public static Looper d(ThreadFactory threadFactory) {
        final SettableFuture create = SettableFuture.create();
        new agjk(agiz.j("Lite", new euk(threadFactory, 4)), agiz.i()).newThread(new Runnable() { // from class: agjl
            @Override // java.lang.Runnable
            public final void run() {
                SettableFuture settableFuture = SettableFuture.this;
                try {
                    Looper.prepare();
                    settableFuture.set(Looper.myLooper());
                    Looper.loop();
                    if (!"robolectric".equals(Build.FINGERPRINT)) {
                        aiut.e(new zth(16));
                    }
                } catch (Throwable th) {
                    settableFuture.set(Looper.myLooper());
                    throw th;
                }
            }
        }).start();
        try {
            Looper looper = (Looper) d.p(create);
            looper.getClass();
            return looper;
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    public static agkh e() {
        agkh agkhVar = agkh.LOG_ERROR;
        agkhVar.getClass();
        return agkhVar;
    }

    public static gto f(Set set) {
        gsl gslVar = new gsl();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            gto gtoVar = (gto) it.next();
            gtoVar.getClass();
            gslVar.a.add(gtoVar);
        }
        return gslVar;
    }

    public static Class g() {
        return ahjg.class;
    }

    public static ahnv h(algw algwVar) {
        ahnv ahnvVar = (ahnv) ahmc.w(algwVar, new msl(17));
        ahnvVar.getClass();
        return ahnvVar;
    }

    public static ahma i(algw algwVar) {
        ahma ahmaVar = (ahma) ahmc.w(algwVar, new ahjy(2));
        ahmaVar.getClass();
        return ahmaVar;
    }

    public static ahnb j(algw algwVar) {
        ahnb ahnbVar = (ahnb) ahmc.w(algwVar, new msl(15));
        ahnbVar.getClass();
        return ahnbVar;
    }

    public static ahni k(algw algwVar) {
        ahni ahniVar = (ahni) ahmc.w(algwVar, new ahjy(4));
        ahniVar.getClass();
        return ahniVar;
    }

    public static ahol l(algw algwVar) {
        ahol aholVar = (ahol) ahmc.w(algwVar, new msl(18));
        aholVar.getClass();
        return aholVar;
    }

    public static ahpm m(algw algwVar) {
        ahpm ahpmVar = (ahpm) ahmc.w(algwVar, new ahjy(1));
        ahpmVar.getClass();
        return ahpmVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public static SharedPreferences n(Context context) {
        ?? r2 = new agud(context, 8).get();
        r2.getClass();
        return r2;
    }

    public static ahqj o(algw algwVar) {
        ahqj ahqjVar = (ahqj) ahmc.w(algwVar, new msl(20));
        ahqjVar.getClass();
        return ahqjVar;
    }

    public static void p(ahkc ahkcVar) {
        ahkc.b(ahkcVar);
        ahkcVar.getClass();
    }

    public static ahkc q(armf armfVar, armf armfVar2) {
        int i = ahkc.b;
        if (!aiut.g()) {
            ahms ahmsVar = (ahms) armfVar2.b();
            if (!ahms.b()) {
                ((alvg) ((alvg) ahkh.a.i()).h("com/google/android/libraries/performance/primes/CrashOnBadPrimesConfiguration", "observedBackgroundInitialization", 29, "CrashOnBadPrimesConfiguration.java")).t("Primes init triggered from background in package: %s", ahmsVar.a);
                if (!ahmsVar.a()) {
                    throw new IllegalStateException(String.format("Primes init triggered from background in package: %s", ahmsVar.a));
                }
            }
        }
        return new ahkc((ahkd) armfVar.b());
    }

    public static ahoz r(algw algwVar) {
        ahoz ahozVar = (ahoz) ((armf) algwVar.d(new ahjy(6))).b();
        ahozVar.getClass();
        return ahozVar;
    }

    public static boolean s(Context context) {
        return aqno.a.get().c(context);
    }

    public static ashc t(Context context) {
        ashc b = aqno.a.get().b(context);
        b.getClass();
        return b;
    }

    public static adec u(Context context, Executor executor, Class cls, alhr alhrVar, ahiy ahiyVar) {
        Context applicationContext = context.getApplicationContext();
        algw i = algw.i(cls);
        executor.getClass();
        return new adec(applicationContext, i, new anew(executor), algw.i(ahiyVar), albo.D(alhrVar));
    }

    public static ahjj v(Context context) {
        context.getClass();
        return new ahjj(context, (byte[]) null);
    }

    @Override // defpackage.armf, defpackage.arme
    public final /* synthetic */ Object b() {
        throw null;
    }
}
