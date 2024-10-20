package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alpi extends alnt {
    public alsp a;
    public boolean b;
    public boolean c;

    public alpi() {
        this(4);
    }

    public final alpl a() {
        alsp alspVar = this.a;
        alspVar.getClass();
        if (alspVar.c == 0) {
            return altf.a;
        }
        if (this.c) {
            this.a = new alsp(alspVar);
            this.c = false;
        }
        this.b = true;
        return new altf(this.a);
    }

    public final void b(Iterable iterable) {
        alsp alspVar;
        alsp alspVar2 = this.a;
        alspVar2.getClass();
        if (iterable instanceof alsj) {
            alsj alsjVar = (alsj) iterable;
            if (alsjVar instanceof altf) {
                alspVar = ((altf) alsjVar).b;
            } else if (alsjVar instanceof alle) {
                alspVar = ((alle) alsjVar).a;
            } else {
                alspVar = null;
            }
            if (alspVar != null) {
                alspVar2.i(Math.max(alspVar2.c, alspVar.c));
                for (int a = alspVar.a(); a >= 0; a = alspVar.e(a)) {
                    d(alspVar.h(a), alspVar.c(a));
                }
                return;
            }
            Set j = alsjVar.j();
            alsp alspVar3 = this.a;
            alspVar3.i(Math.max(alspVar3.c, j.size()));
            for (alsk alskVar : alsjVar.j()) {
                d(alskVar.a, alskVar.a());
            }
            return;
        }
        super.e(iterable);
    }

    public final void d(Object obj, int i) {
        alsp alspVar = this.a;
        alspVar.getClass();
        if (i == 0) {
            return;
        }
        if (this.b) {
            this.a = new alsp(alspVar);
            this.c = false;
        }
        this.b = false;
        obj.getClass();
        alsp alspVar2 = this.a;
        alspVar2.o(obj, i + alspVar2.b(obj));
    }

    @Override // defpackage.alnt
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void c(Object obj) {
        d(obj, 1);
    }

    public alpi(int i) {
        this.b = false;
        this.c = false;
        this.a = new alsp(i);
    }
}
