package defpackage;

import android.content.Context;
import android.util.Pair;
import android.view.Surface;
import j$.util.Objects;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fkd implements esl {
    public static final Executor a = new sp(3);
    public final Context b;
    public final fka c;
    public final fkh d;
    public final fkl e;
    public final eru f;
    public final List g;
    public final eti h;
    public final CopyOnWriteArraySet i;
    public eqn j;
    public fke k;
    public etu l;
    public Pair m;
    public int n;
    public int o;
    public long p;
    public eyt q;

    public fkd(fjz fjzVar) {
        Context context = fjzVar.a;
        this.b = context;
        fka fkaVar = new fka(this, context);
        this.c = fkaVar;
        eti etiVar = fjzVar.f;
        this.h = etiVar;
        fkh fkhVar = fjzVar.b;
        this.d = fkhVar;
        fkhVar.b = etiVar;
        this.e = new fkl(new qdq(this, null), fkhVar);
        eru eruVar = fjzVar.d;
        dzg.h(eruVar);
        this.f = eruVar;
        this.g = fjzVar.e;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.i = copyOnWriteArraySet;
        this.o = 0;
        copyOnWriteArraySet.add(fkaVar);
    }

    public static eqd e(eqd eqdVar) {
        if (eqdVar != null && eqdVar.g()) {
            return eqdVar;
        }
        return eqd.a;
    }

    @Override // defpackage.esl
    public final void a(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.esl
    public final void b(esh eshVar) {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            fka fkaVar = (fka) it.next();
            fkaVar.q.execute(new faq(fkaVar, fkaVar.p, eshVar, 5, (short[]) null));
        }
    }

    @Override // defpackage.esl
    public final void d(int i, int i2) {
        esn esnVar = new esn(i, i2);
        fkl fklVar = this.e;
        if (!Objects.equals(fklVar.d, esnVar)) {
            fklVar.d = esnVar;
        }
    }

    public final void f(Surface surface, int i, int i2) {
        erv ervVar;
        if (this.q != null) {
            if (surface != null) {
                ervVar = new erv(surface, i, i2, 0, false);
            } else {
                ervVar = null;
            }
            this.q.g(ervVar);
            this.d.k(surface);
        }
    }

    public final boolean g(long j) {
        if (this.n == 0) {
            long j2 = this.e.g;
            if (j2 != -9223372036854775807L && j2 >= j) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.esl
    public final void i(long j) {
        if (this.n > 0) {
            return;
        }
        fkl fklVar = this.e;
        long j2 = j - this.p;
        esn esnVar = fklVar.d;
        if (esnVar != null) {
            fklVar.h.h(j2, esnVar);
            fklVar.d = null;
        }
        fklVar.c.c(j2);
    }
}
