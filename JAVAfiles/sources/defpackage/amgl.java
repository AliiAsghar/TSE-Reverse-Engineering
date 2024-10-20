package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amgl extends aozy implements apbu {
    public amgl() {
        super(amgu.a);
    }

    public final void a(Iterable iterable) {
        if (!this.b.isMutable()) {
            u();
        }
        amgu amguVar = (amgu) this.b;
        amgu amguVar2 = amgu.a;
        apao apaoVar = amguVar.Z;
        if (!apaoVar.c()) {
            amguVar.Z = apag.mutableCopy(apaoVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            amguVar.Z.g(((amgg) it.next()).u);
        }
    }
}
