package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kgd implements kkl {
    public kgc a;
    public miz b;
    public final qdq c;
    private final Set d;

    public kgd(qdq qdqVar, Set set) {
        qdqVar.getClass();
        this.c = qdqVar;
        this.d = set;
    }

    public final synchronized kam a(miz mizVar, miz mizVar2, miz mizVar3) {
        Object obj;
        kck kckVar;
        boolean z;
        kam j;
        kgc kgcVar = this.a;
        boolean z2 = true;
        if (mizVar3 == null) {
            kckVar = null;
        } else {
            aluq listIterator = ((altx) this.d).listIterator();
            loop0: while (true) {
                if (listIterator.hasNext()) {
                    obj = listIterator.next();
                    kck kckVar2 = (kck) obj;
                    if (kckVar2.h.a()) {
                        List B = aqjn.B(kck.a, kck.b, kck.c, kckVar2.j, kck.d, kck.e, kck.f, kck.g);
                        if (!B.isEmpty()) {
                            Iterator it = B.iterator();
                            while (it.hasNext()) {
                                if (!((Boolean) ((arqv) it.next()).a(mizVar, mizVar3)).booleanValue()) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            kckVar = (kck) obj;
        }
        if (kgcVar != null) {
            z = true;
        } else {
            z = false;
        }
        if (kckVar == null) {
            z2 = false;
        }
        if (z && z2) {
            j = this.c.j(new keu(mizVar), null, null);
            kgc kgcVar2 = this.a;
            kgcVar2.getClass();
            kckVar.getClass();
            kgcVar2.getClass();
            mizVar3.getClass();
            this.a = new kgc(new kci(kgcVar2.a, mizVar3), kgcVar2.b);
        } else if (z) {
            qdq qdqVar = this.c;
            kgc kgcVar3 = this.a;
            kgcVar3.getClass();
            kgcVar3.getClass();
            j = qdqVar.j(kgcVar3.a, kgcVar3.b, mizVar3);
            this.a = null;
        } else if (z2) {
            kam j2 = this.c.j(new keu(mizVar), null, null);
            kckVar.getClass();
            mizVar3.getClass();
            this.a = new kgc(new kci(mizVar, mizVar3), mizVar2);
            j = j2;
        } else {
            j = this.c.j(mizVar, mizVar2, mizVar3);
        }
        return j;
    }

    @Override // defpackage.kkl, java.lang.AutoCloseable
    public final void close() {
        this.a = null;
        this.b = null;
    }
}
