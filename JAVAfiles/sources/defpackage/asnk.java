package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asnk extends asmv {
    final /* synthetic */ asnl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asnk(asnl asnlVar, String str) {
        super(str);
        this.d = asnlVar;
    }

    @Override // defpackage.asmv
    public final long a() {
        long nanoTime = System.nanoTime();
        asnl asnlVar = this.d;
        Iterator it = ((ConcurrentLinkedQueue) asnlVar.d).iterator();
        it.getClass();
        long j = Long.MIN_VALUE;
        asnj asnjVar = null;
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            asnj asnjVar2 = (asnj) it.next();
            asnjVar2.getClass();
            synchronized (asnjVar2) {
                byte[] bArr = asmt.a;
                List list = asnjVar2.l;
                int i3 = 0;
                while (true) {
                    if (i3 < list.size()) {
                        Reference reference = (Reference) list.get(i3);
                        if (reference.get() != null) {
                            i3++;
                        } else {
                            reference.getClass();
                            aspx.b.f("A connection to " + asnjVar2.a.a.h + " was leaked. Did you forget to close a response body?", ((asnf) reference).a);
                            list.remove(i3);
                            asnjVar2.k();
                            if (list.isEmpty()) {
                                asnjVar2.m = nanoTime - asnlVar.a;
                                break;
                            }
                        }
                    } else if (list.size() > 0) {
                        i2++;
                    }
                }
                i++;
                long j2 = nanoTime - asnjVar2.m;
                if (j2 > j) {
                    j = j2;
                }
                if (j2 > j) {
                    asnjVar = asnjVar2;
                }
            }
        }
        long j3 = asnlVar.a;
        if (j < j3 && i <= 5) {
            if (i > 0) {
                return j3 - j;
            }
            if (i2 <= 0) {
                return -1L;
            }
            return j3;
        }
        asnjVar.getClass();
        synchronized (asnjVar) {
            if (!asnjVar.l.isEmpty()) {
                return 0L;
            }
            if (asnjVar.m + j != nanoTime) {
                return 0L;
            }
            asnjVar.k();
            ((ConcurrentLinkedQueue) asnlVar.d).remove(asnjVar);
            asmt.q(asnjVar.a());
            if (!((ConcurrentLinkedQueue) asnlVar.d).isEmpty()) {
                return 0L;
            }
            ((asmx) asnlVar.b).a();
            return 0L;
        }
    }
}
