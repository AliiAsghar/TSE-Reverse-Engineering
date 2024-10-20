package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asnl {
    public final long a;
    public final Object b;
    public final Object c;
    public final Object d;

    public asnl(Uri uri, String str, String str2, long j) {
        this.d = uri;
        this.c = str;
        this.b = str2;
        this.a = j;
    }

    public final boolean a(aslb aslbVar, asnh asnhVar, List list, boolean z) {
        Iterator it = ((ConcurrentLinkedQueue) this.d).iterator();
        it.getClass();
        while (it.hasNext()) {
            asnj asnjVar = (asnj) it.next();
            asnjVar.getClass();
            synchronized (asnjVar) {
                if (z) {
                    if (!asnjVar.i()) {
                        continue;
                    }
                }
                if (asnjVar.h(aslbVar, list)) {
                    asnhVar.e(asnjVar);
                    return true;
                }
            }
        }
        return false;
    }

    public asnl(exy exyVar, eqq eqqVar, long j, kkc kkcVar) {
        this.b = exyVar;
        this.d = eqqVar;
        this.a = j;
        this.c = kkcVar;
    }

    public asnl(alhr alhrVar, alhr alhrVar2, armf armfVar) {
        this.a = SystemClock.uptimeMillis();
        this.b = alhrVar;
        this.d = alhrVar2;
        this.c = armfVar;
    }

    public asnl(asmy asmyVar, TimeUnit timeUnit) {
        asmyVar.getClass();
        this.a = timeUnit.toNanos(5L);
        this.b = asmyVar.a();
        this.c = new asnk(this, String.valueOf(asmt.f).concat(" ConnectionPool"));
        this.d = new ConcurrentLinkedQueue();
    }
}
