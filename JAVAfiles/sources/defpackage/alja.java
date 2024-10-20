package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class alja implements Iterator {
    int a;
    int b = -1;
    aljj c;
    AtomicReferenceArray d;
    alke e;
    alkc f;
    alkc g;
    final /* synthetic */ alkd h;

    public alja(alkd alkdVar) {
        this.h = alkdVar;
        this.a = alkdVar.f.length - 1;
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final alkc a() {
        alkc alkcVar = this.f;
        if (alkcVar != null) {
            this.g = alkcVar;
            b();
            return this.g;
        }
        throw new NoSuchElementException();
    }

    final void b() {
        this.f = null;
        if (d() || e()) {
            return;
        }
        while (true) {
            int i = this.a;
            if (i >= 0) {
                alkd alkdVar = this.h;
                this.a = i - 1;
                aljj aljjVar = alkdVar.f[i];
                this.c = aljjVar;
                if (aljjVar.b != 0) {
                    this.d = this.c.f;
                    this.b = r0.length() - 1;
                    if (e()) {
                        return;
                    }
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
    
        r6.f = new defpackage.alkc(r6.h, r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0034, code lost:
    
        r7 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean c(defpackage.alke r7) {
        /*
            r6 = this;
            alkd r0 = r6.h     // Catch: java.lang.Throwable -> L3d
            alhz r0 = r0.p     // Catch: java.lang.Throwable -> L3d
            long r0 = r0.a()     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r2 = r7.j()     // Catch: java.lang.Throwable -> L3d
            alkd r3 = r6.h     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r4 = r7.j()     // Catch: java.lang.Throwable -> L3d
            r5 = 0
            if (r4 != 0) goto L16
            goto L29
        L16:
            aljs r4 = r7.d()     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r4 = r4.get()     // Catch: java.lang.Throwable -> L3d
            if (r4 != 0) goto L21
            goto L29
        L21:
            boolean r7 = r3.k(r7, r0)     // Catch: java.lang.Throwable -> L3d
            if (r7 == 0) goto L28
            goto L29
        L28:
            r5 = r4
        L29:
            if (r5 == 0) goto L36
            alkc r7 = new alkc     // Catch: java.lang.Throwable -> L3d
            alkd r0 = r6.h     // Catch: java.lang.Throwable -> L3d
            r7.<init>(r0, r2, r5)     // Catch: java.lang.Throwable -> L3d
            r6.f = r7     // Catch: java.lang.Throwable -> L3d
            r7 = 1
            goto L37
        L36:
            r7 = 0
        L37:
            aljj r0 = r6.c
            r0.o()
            return r7
        L3d:
            r7 = move-exception
            aljj r0 = r6.c
            r0.o()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alja.c(alke):boolean");
    }

    final boolean d() {
        alke alkeVar = this.e;
        if (alkeVar == null) {
            return false;
        }
        while (true) {
            this.e = alkeVar.e();
            alke alkeVar2 = this.e;
            if (alkeVar2 != null) {
                if (c(alkeVar2)) {
                    return true;
                }
                alkeVar = this.e;
            } else {
                return false;
            }
        }
    }

    final boolean e() {
        while (true) {
            int i = this.b;
            if (i >= 0) {
                AtomicReferenceArray atomicReferenceArray = this.d;
                this.b = i - 1;
                alke alkeVar = (alke) atomicReferenceArray.get(i);
                this.e = alkeVar;
                if (alkeVar != null && (c(alkeVar) || d())) {
                    return true;
                }
            } else {
                return false;
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        if (this.g != null) {
            z = true;
        } else {
            z = false;
        }
        albo.T(z);
        this.h.remove(this.g.a);
        this.g = null;
    }
}
