package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class utt {
    public static final alwo a = alwo.o("BuglePhenotype");
    public final Context b;
    public final armf c;
    private final alhr e;
    private final armf g;
    private final List f = new CopyOnWriteArrayList();
    public volatile boolean d = false;

    public utt(Context context, apwt apwtVar, armf armfVar, armf armfVar2) {
        this.b = context;
        this.e = albo.D(new uqw(apwtVar, 11));
        this.c = armfVar;
        this.g = armfVar2;
    }

    public final void a() {
        akrh e = aktp.e("PhenotypeHelper#onCsLibPhenotypeChanged");
        try {
            agkx.R();
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                ((acys) it.next()).onCsLibPhenotypeUpdated();
            }
            Iterator it2 = ((Set) this.e.get()).iterator();
            while (it2.hasNext()) {
                ((acys) it2.next()).onCsLibPhenotypeUpdated();
            }
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(final Context context, final yll yllVar) {
        akrh e = aktp.e("PhenotypeHelper#registerCsLibPhenotype");
        try {
            algk a2 = akto.a(new uvz(this, context, 1, null));
            final ylk ylkVar = (ylk) ((xyt) this.c.b()).a();
            final uts utsVar = new uts(a2, 0);
            ylk.d.l("Unregistering legacy CSLib packages");
            alog alogVar = ylk.e;
            acgo acgoVar = new acgo() { // from class: ylh
                @Override // defpackage.acgo
                public final void a(boolean z) {
                    ylk.this.b(context, utsVar, yllVar);
                }
            };
            xyo a3 = yld.a.a();
            a3.z("Unregistering packages", alogVar);
            a3.q();
            ArrayList arrayList = new ArrayList();
            alur it = alogVar.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                acgl acglVar = (acgl) ylkVar.c.a();
                ajxp ajxpVar = new ajxp(null);
                ajxpVar.c = new abot(str, 10);
                acir g = acglVar.g(ajxpVar.b());
                g.q(new uyb(str, 2));
                arrayList.add(g);
            }
            actx.t(arrayList).q(new uyb(acgoVar, 3));
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void c(acys acysVar) {
        this.f.add(acysVar);
    }

    public final void d(Context context) {
        utr utrVar = (utr) this.g.b();
        akrh e = aktp.e("PhenotypeHelper#registerPhenotype");
        try {
            algk a2 = akto.a(new ult(utrVar, 7));
            context.getClass();
            yuv a3 = yuv.a(context);
            a3.getClass();
            int i = a3.b;
            aaoc aaocVar = acge.a;
            new acgl(context).c(uvl.i(context), i, utr.c, utr.a().toByteArray()).q(new uyb(a2, 1));
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void e() {
        ((utr) this.g.b()).b();
    }
}
