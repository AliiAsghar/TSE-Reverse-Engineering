package defpackage;

import android.content.Context;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahta {
    public static Context b;
    private static volatile ahta j;
    private static volatile ahta k;
    public final Context d;
    public final alhr e;
    public final ahvr f;
    public final alhr g;
    public final ahuz h;
    public final adef i = new adef();
    private final alhr l;
    private final alhr m;
    private final alhr n;
    public static final Object a = new Object();
    public static final alhr c = albo.D(new abnl(11));

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public interface a {
        algw hN();
    }

    public ahta(Context context, alhr alhrVar, alhr alhrVar2, alhr alhrVar3, alhr alhrVar4, alhr alhrVar5) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        alhrVar.getClass();
        alhrVar2.getClass();
        alhrVar3.getClass();
        alhrVar4.getClass();
        alhrVar5.getClass();
        alhr D = albo.D(alhrVar);
        alhr D2 = albo.D(alhrVar2);
        alhr D3 = albo.D(alhrVar3);
        alhr D4 = albo.D(alhrVar4);
        alhr D5 = albo.D(alhrVar5);
        this.d = applicationContext;
        this.l = D;
        this.m = D2;
        this.e = D3;
        this.n = D4;
        this.f = new ahvr(applicationContext, D, D4, D2);
        this.g = D5;
        this.h = new ahuz(D3, D2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ahta a(Context context) {
        boolean z;
        ahta ahtaVar = j;
        if (ahtaVar != null) {
            return ahtaVar;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            try {
                return (ahta) ((alha) ((a) akec.w(applicationContext, a.class)).hN()).a;
            } catch (IllegalStateException unused) {
                z = true;
                synchronized (a) {
                    if (j != null) {
                        return j;
                    }
                    algw algwVar = alfd.a;
                    boolean z2 = applicationContext instanceof a;
                    if (z2) {
                        algwVar = ((a) applicationContext).hN();
                    }
                    ahta ahtaVar2 = (ahta) algwVar.c(new agud(applicationContext, 18));
                    j = ahtaVar2;
                    if (!z && !z2) {
                        ahof.c(Level.CONFIG, ahtaVar2.d(), "Application doesn't implement PhenotypeApplication interface, falling back to globally set context. See go/phenotype-flag#process-stable-init for more info.", new Object[0]);
                    }
                    return ahtaVar2;
                }
            }
        } catch (IllegalStateException unused2) {
            z = false;
        }
    }

    public static alhr c(Context context) {
        return albo.D(new agud(context, 19));
    }

    public static void e() {
        ahtc.a();
        if (b == null && ahtc.a == null) {
            ahtc.a = new ahtb();
        }
    }

    public final ahtx b() {
        return (ahtx) this.m.get();
    }

    public final aneo d() {
        return (aneo) this.l.get();
    }

    public final agcp f() {
        return (agcp) this.n.get();
    }
}
