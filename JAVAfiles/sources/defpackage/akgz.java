package defpackage;

import com.google.android.apps.messaging.R;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akgz extends akha implements emx {
    public final enm a;
    public akhj b;
    private final allp c = new alnm();
    private boolean d = true;
    private final Executor e;
    private final akbl f;
    private final akbl g;
    private final aqws h;
    private final akmy i;

    public akgz(enm enmVar, akmy akmyVar, Executor executor) {
        this.a = enmVar;
        this.i = akmyVar;
        try {
            this.h = (aqws) ((akmc) akmyVar.a).a(R.id.first_lifecycle_owner_instance, enmVar, new akhd(1), new akhe(2));
            this.e = executor;
            akbl akblVar = new akbl(executor, true, false);
            this.f = akblVar;
            akblVar.b();
            this.g = new akbl(executor, false, false);
            enmVar.N().c(this);
        } catch (IllegalStateException e) {
            throw new IllegalStateException("Both an unqualified and a `@ViewLifecycle LocalSubscriptionMixin` have been injectedin this Fragment scope. Only one of the two LocalSubscriptionMixins may be used in a given Fragment - either the unqualified or `@ViewLifecycle`LocalSubscriptionMixin exclusively.", e);
        }
    }

    @Override // defpackage.akha
    public final akec b(int i, akgs akgsVar, final algw algwVar) {
        boolean z;
        aiut.c();
        boolean z2 = false;
        int i2 = 1;
        if (this.b == null) {
            z = true;
        } else {
            z = false;
        }
        albo.T(z);
        if (this.c.put(akgsVar, (aodz) this.i.a(i, this.a, new akmb() { // from class: akgv
            @Override // defpackage.akmb
            public final Object a() {
                algw i3 = algw.i(((alha) algw.this).a);
                alfd alfdVar = alfd.a;
                return new aodz(new akhk(i3, alfdVar, alfdVar, alfdVar));
            }
        }, new akhe(i2))) == null) {
            z2 = true;
        }
        albo.T(z2);
        return new akgw(this, akgsVar);
    }

    @Override // defpackage.emx
    public final void gF(enm enmVar) {
        aiut.c();
        akhj akhjVar = this.b;
        if (akhjVar != null) {
            aiut.c();
            akhjVar.d.execute(akto.j(new akhg(akhjVar, 5)));
        }
        this.h.a = false;
    }

    @Override // defpackage.emx
    public final void h(enm enmVar) {
        boolean z;
        int i;
        aiut.c();
        if (this.d) {
            if (this.b == null) {
                z = true;
            } else {
                z = false;
            }
            albo.T(z);
            Set entrySet = this.c.entrySet();
            if (entrySet instanceof Collection) {
                i = entrySet.size();
            } else {
                i = 4;
            }
            alnp alnpVar = new alnp(i);
            alnpVar.d(entrySet);
            this.b = new akhj(alnpVar.b(), this.e, this.f, this.g);
            if (this.h.a && this.d) {
                akhj akhjVar = this.b;
                aiut.c();
                akhjVar.d.execute(akto.j(new akhg(akhjVar, 4)));
            } else {
                akhj akhjVar2 = this.b;
                aiut.c();
                akhjVar2.d.execute(akto.j(new akhg(akhjVar2, 0)));
            }
            this.c.clear();
            this.d = false;
        }
        akhj akhjVar3 = this.b;
        aiut.c();
        akhjVar3.e.b();
    }

    @Override // defpackage.emx
    public final void i(enm enmVar) {
        aiut.c();
        akhj akhjVar = this.b;
        aiut.c();
        akhjVar.e.c();
    }

    @Override // defpackage.emx
    public final /* synthetic */ void d(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void f(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void gG(enm enmVar) {
    }
}
