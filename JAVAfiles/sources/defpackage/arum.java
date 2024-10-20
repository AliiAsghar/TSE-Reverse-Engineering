package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arum implements Iterator, arse {
    final /* synthetic */ arun a;
    private int b = -1;
    private int c;
    private int d;
    private artb e;
    private int f;

    public arum(arun arunVar) {
        this.a = arunVar;
        int u = arrn.u(0, 0, arunVar.a.length());
        this.c = u;
        this.d = u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if (r6 < r3) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void a() {
        /*
            r7 = this;
            int r0 = r7.d
            r1 = 0
            if (r0 >= 0) goto Lb
            r7.b = r1
            r0 = 0
            r7.e = r0
            return
        Lb:
            arun r2 = r7.a
            int r3 = r2.b
            r4 = -1
            r5 = 1
            if (r3 <= 0) goto L1a
            int r6 = r7.f
            int r6 = r6 + r5
            r7.f = r6
            if (r6 >= r3) goto L22
        L1a:
            java.lang.CharSequence r2 = r2.a
            int r2 = r2.length()
            if (r0 <= r2) goto L36
        L22:
            artb r0 = new artb
            int r1 = r7.c
            arun r2 = r7.a
            java.lang.CharSequence r2 = r2.a
            int r2 = defpackage.arsd.B(r2)
            r0.<init>(r1, r2)
            r7.e = r0
            r7.d = r4
            goto L7f
        L36:
            arun r0 = r7.a
            int r2 = r7.d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            arqv r3 = r0.c
            java.lang.CharSequence r0 = r0.a
            java.lang.Object r0 = r3.a(r0, r2)
            if (r0 != 0) goto L5c
            artb r0 = new artb
            int r1 = r7.c
            arun r2 = r7.a
            java.lang.CharSequence r2 = r2.a
            int r2 = defpackage.arsd.B(r2)
            r0.<init>(r1, r2)
            r7.e = r0
            r7.d = r4
            goto L7f
        L5c:
            armo r0 = (defpackage.armo) r0
            java.lang.Object r2 = r0.a
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.b
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r3 = r7.c
            artb r3 = defpackage.arrn.B(r3, r2)
            r7.e = r3
            int r2 = r2 + r0
            r7.c = r2
            if (r0 != 0) goto L7c
            r1 = r5
        L7c:
            int r2 = r2 + r1
            r7.d = r2
        L7f:
            r7.b = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arum.a():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b == -1) {
            a();
        }
        if (this.b == 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.b == -1) {
            a();
        }
        if (this.b != 0) {
            artb artbVar = this.e;
            artbVar.getClass();
            this.e = null;
            this.b = -1;
            return artbVar;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.g();
    }
}
