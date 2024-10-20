package defpackage;

import android.os.Looper;
import j$.time.Instant;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class utx implements utz {
    public static final AtomicBoolean a = new AtomicBoolean(false);
    protected final ahtp b;
    public final Object c;
    protected final AtomicReference d = new AtomicReference();

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        uub Oh();

        ahiy QR();

        xnv fN();

        anen hQ();
    }

    public utx(ahtp ahtpVar, Object obj) {
        this.b = ahtpVar;
        this.c = obj;
    }

    public static boolean n() {
        if (!a.get()) {
            int i = xyp.a;
            if (i != 0) {
                if (i != 2) {
                    return false;
                }
                return true;
            }
            throw null;
        }
        return true;
    }

    @Override // defpackage.akfb
    public final andc a() {
        long a2 = ((a) yyb.aL(a.class)).fN().a();
        Object obj = this.d.get();
        if (obj != null) {
            return new andc(aktp.ag(akfa.a(obj, Instant.ofEpochMilli(a2))));
        }
        return new andc(aktp.ag(akfa.a));
    }

    @Override // defpackage.akfb
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final akul b() {
        Object obj = this.d.get();
        if (obj != null) {
            return aktp.ag(obj);
        }
        return aktp.ai(new rbg(this, 19), ((a) yyb.aL(a.class)).hQ());
    }

    @Override // defpackage.uuf
    public final Object e() {
        if (Looper.myLooper() == Looper.getMainLooper() && !n()) {
            throw new IllegalThreadStateException(String.valueOf(this.b.d()).concat(" read blocked UI thread at startup"));
        }
        Object obj = this.d.get();
        if (obj != null) {
            return obj;
        }
        return h();
    }

    @Override // defpackage.uuf
    public final Object f() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Object g() {
        try {
            return this.b.b();
        } catch (IllegalStateException | NullPointerException e) {
            alvw f = uty.a.f();
            f.X(alwp.a, "BuglePhenotype");
            ((alvg) ((alvg) ((alvg) f).g(e)).h("com/google/android/apps/messaging/shared/experiments/flags/CachedFlag", "readPhenotypeFlag", 'l', "CachedFlag.java")).q("Phenotype Flags not initialized. Initializing now.");
            ((a) yyb.aL(a.class)).Oh().a();
            return this.b.b();
        }
    }

    public Object h() {
        Object g;
        synchronized (this.b) {
            g = g();
            this.d.set(g);
        }
        return g;
    }

    @Override // defpackage.akfb
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public String c() {
        return this.b.d();
    }

    @Override // defpackage.uuf
    public String j() {
        return this.b.d();
    }

    @Override // defpackage.uuf
    public void k(Object obj) {
        synchronized (this.b) {
            this.b.g(obj);
            this.d.set(obj);
        }
    }

    @Override // defpackage.uuf
    public void l() {
        this.d.set(null);
        ((a) yyb.aL(a.class)).QR().r(aktp.ag(null), c());
    }

    @Override // defpackage.uuf
    public final void m() {
        synchronized (this.b) {
            this.b.d = -1;
            this.d.set(null);
        }
    }
}
