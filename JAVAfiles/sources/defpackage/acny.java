package defpackage;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public class acny extends acns {
    public static final String c = UUID.randomUUID().toString();
    public static final AtomicInteger d = new AtomicInteger();

    /* JADX INFO: Access modifiers changed from: protected */
    public acny(adeo adeoVar, adtn adtnVar, amnn amnnVar, anen anenVar, acnu acnuVar) {
        super(adeoVar, adtnVar, amnnVar, anenVar, acnuVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final aozy A() {
        aozy createBuilder = apjh.a.createBuilder();
        String str = c;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apjh apjhVar = (apjh) createBuilder.b;
        str.getClass();
        apjhVar.b |= 1;
        apjhVar.e = str;
        int incrementAndGet = d.incrementAndGet();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apjh apjhVar2 = (apjh) createBuilder.b;
        apjhVar2.b |= 2;
        apjhVar2.f = incrementAndGet;
        return createBuilder;
    }

    public final void u(Context context, apjh apjhVar) {
        aozy c2 = c(context);
        if (c2 == null) {
            advr.q("Unable to send diagnostic log", new Object[0]);
            return;
        }
        if (!c2.b.isMutable()) {
            c2.u();
        }
        amno amnoVar = (amno) c2.b;
        amno amnoVar2 = amno.a;
        apjhVar.getClass();
        amnoVar.f = apjhVar;
        amnoVar.e = 25;
        b(context, (amno) c2.s(), apkj.DIAGNOSTIC_EVENT);
    }

    protected final void v(Context context, apjm apjmVar) {
        aozy A = A();
        if (!A.b.isMutable()) {
            A.u();
        }
        apjh apjhVar = (apjh) A.b;
        apjh apjhVar2 = apjh.a;
        apjmVar.getClass();
        apjhVar.d = apjmVar;
        apjhVar.c = 3;
        u(context, (apjh) A.s());
    }

    public final void w(Context context, apjm apjmVar, String str) {
        aozy A = A();
        if (!A.b.isMutable()) {
            A.u();
        }
        apjh apjhVar = (apjh) A.b;
        apjh apjhVar2 = apjh.a;
        apjmVar.getClass();
        apjhVar.d = apjmVar;
        apjhVar.c = 3;
        if (str != null) {
            if (!A.b.isMutable()) {
                A.u();
            }
            apjh apjhVar3 = (apjh) A.b;
            apjhVar3.b |= 4;
            apjhVar3.g = str;
        }
        u(context, (apjh) A.s());
    }

    public final void x(Context context, apik apikVar) {
        aozy createBuilder = apjm.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apjm apjmVar = (apjm) createBuilder.b;
        apikVar.getClass();
        apjmVar.c = apikVar;
        apjmVar.b = 3;
        v(context, (apjm) createBuilder.s());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void y(Context context, apis apisVar) {
        aozy createBuilder = apjm.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apjm apjmVar = (apjm) createBuilder.b;
        apisVar.getClass();
        apjmVar.c = apisVar;
        apjmVar.b = 1;
        v(context, (apjm) createBuilder.s());
    }

    public final void z(Context context, apjl apjlVar, String str) {
        aozy createBuilder = apjm.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apjm apjmVar = (apjm) createBuilder.b;
        apjlVar.getClass();
        apjmVar.c = apjlVar;
        apjmVar.b = 2;
        w(context, (apjm) createBuilder.s(), str);
    }
}
