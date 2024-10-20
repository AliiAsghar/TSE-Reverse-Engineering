package defpackage;

import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class am {
    final an a;
    am b;
    public al f;
    final int g;
    public int c = 0;
    int d = -1;
    public int h = 1;
    public int i = 1;
    public int e = 0;

    public am(an anVar, int i) {
        this.a = anVar;
        this.g = i;
    }

    private final String f(HashSet hashSet) {
        String str;
        if (hashSet.add(this)) {
            StringBuilder sb = new StringBuilder("null:");
            sb.append(a.c(this.g));
            am amVar = this.b;
            if (amVar != null) {
                str = " connected to ".concat(amVar.f(hashSet));
            } else {
                str = "";
            }
            sb.append(str);
            return sb.toString();
        }
        return "<-";
    }

    public final int a() {
        am amVar;
        if (this.a.K == 8) {
            return 0;
        }
        int i = this.d;
        if (i >= 0 && (amVar = this.b) != null && amVar.a.K == 8) {
            return i;
        }
        return this.c;
    }

    public final void b() {
        this.b = null;
        this.c = 0;
        this.d = -1;
        this.h = 2;
        this.e = 0;
        this.i = 1;
    }

    public final boolean c() {
        if (this.b != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x005f, code lost:
    
        if (r15 != 9) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0079, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0076, code lost:
    
        if (r15 != 8) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(defpackage.am r10, int r11, int r12, int r13, int r14, boolean r15) {
        /*
            r9 = this;
            r0 = -1
            r1 = 2
            r2 = 0
            r3 = 1
            if (r10 != 0) goto L12
            r10 = 0
            r9.b = r10
            r9.c = r2
            r9.d = r0
            r9.h = r3
            r9.e = r1
            return
        L12:
            if (r15 != 0) goto L7f
            int r15 = r10.g
            int r4 = r9.g
            r5 = 6
            if (r15 != r4) goto L34
            r15 = 7
            if (r4 != r15) goto L20
            goto L7e
        L20:
            if (r4 != r5) goto L7f
            an r15 = r10.a
            boolean r15 = r15.r()
            if (r15 == 0) goto L7e
            an r15 = r9.a
            boolean r15 = r15.r()
            if (r15 == 0) goto L7e
            goto L7f
        L34:
            int r4 = r4 + r0
            r0 = 8
            r6 = 4
            if (r4 == r3) goto L64
            r7 = 9
            r8 = 3
            if (r4 == r1) goto L4d
            if (r4 == r8) goto L64
            if (r4 == r6) goto L4d
            if (r4 == r5) goto L46
            goto L7e
        L46:
            if (r15 == r5) goto L7e
            if (r15 == r0) goto L7e
            if (r15 == r7) goto L7e
            goto L7f
        L4d:
            if (r15 == r8) goto L56
            r0 = 5
            if (r15 != r0) goto L54
            r15 = r0
            goto L56
        L54:
            r0 = r2
            goto L57
        L56:
            r0 = r3
        L57:
            an r1 = r10.a
            boolean r1 = r1 instanceof defpackage.ap
            if (r1 == 0) goto L62
            if (r0 != 0) goto L7c
            if (r15 != r7) goto L79
            goto L7c
        L62:
            r3 = r0
            goto L7c
        L64:
            if (r15 == r1) goto L6d
            if (r15 != r6) goto L6b
            r1 = r3
            r15 = r6
            goto L6e
        L6b:
            r1 = r2
            goto L6e
        L6d:
            r1 = r3
        L6e:
            an r4 = r10.a
            boolean r4 = r4 instanceof defpackage.ap
            if (r4 == 0) goto L7b
            if (r1 != 0) goto L7c
            if (r15 != r0) goto L79
            goto L7c
        L79:
            r3 = r2
            goto L7c
        L7b:
            r3 = r1
        L7c:
            if (r3 != 0) goto L7f
        L7e:
            return
        L7f:
            r9.b = r10
            if (r11 <= 0) goto L86
            r9.c = r11
            goto L88
        L86:
            r9.c = r2
        L88:
            r9.d = r12
            r9.h = r13
            r9.e = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.am.d(am, int, int, int, int, boolean):void");
    }

    public final void e() {
        al alVar = this.f;
        if (alVar == null) {
            this.f = new al(1);
        } else {
            alVar.b();
        }
    }

    public final String toString() {
        String str;
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder("null:");
        sb.append(a.c(this.g));
        am amVar = this.b;
        if (amVar != null) {
            str = " connected to ".concat(amVar.f(hashSet));
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }
}
