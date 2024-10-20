package defpackage;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class atjj extends atgc {
    private static final long serialVersionUID = 6941492635554961361L;
    final int e;
    final atjm f;
    final atjm g;

    public atjj(String str, int i, atjm atjmVar, atjm atjmVar2) {
        super(str);
        this.e = i;
        this.f = atjmVar;
        this.g = atjmVar2;
    }

    private final atjm n(long j) {
        long j2;
        int i = this.e;
        atjm atjmVar = this.f;
        atjm atjmVar2 = this.g;
        try {
            j2 = atjmVar.a(j, i, atjmVar2.c);
        } catch (ArithmeticException | IllegalArgumentException unused) {
            j2 = j;
        }
        try {
            j = atjmVar2.a(j, i, atjmVar.c);
        } catch (ArithmeticException | IllegalArgumentException unused2) {
        }
        if (j2 > j) {
            return atjmVar;
        }
        return atjmVar2;
    }

    @Override // defpackage.atgc
    public final int a(long j) {
        return this.e + n(j).c;
    }

    @Override // defpackage.atgc
    public final int c(long j) {
        return this.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r5 < 0) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c A[RETURN] */
    @Override // defpackage.atgc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long e(long r9) {
        /*
            r8 = this;
            int r0 = r8.e
            atjm r1 = r8.f
            atjm r2 = r8.g
            r3 = 0
            int r5 = r2.c     // Catch: java.lang.Throwable -> L16
            long r5 = r1.a(r9, r0, r5)     // Catch: java.lang.Throwable -> L16
            int r7 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r7 <= 0) goto L17
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 >= 0) goto L17
        L16:
            r5 = r9
        L17:
            int r1 = r1.c     // Catch: java.lang.Throwable -> L27
            long r0 = r2.a(r9, r0, r1)     // Catch: java.lang.Throwable -> L27
            int r2 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r2 <= 0) goto L26
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto L26
            goto L27
        L26:
            r9 = r0
        L27:
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 <= 0) goto L2c
            return r9
        L2c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atjj.e(long):long");
    }

    @Override // defpackage.atgc
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof atjj) {
            atjj atjjVar = (atjj) obj;
            if (this.c.equals(atjjVar.c) && this.e == atjjVar.e && this.f.equals(atjjVar.f) && this.g.equals(atjjVar.g)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if (r5 > 0) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    @Override // defpackage.atgc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long f(long r9) {
        /*
            r8 = this;
            int r0 = r8.e
            atjm r1 = r8.f
            atjm r2 = r8.g
            r3 = 1
            long r9 = r9 + r3
            r3 = 0
            int r5 = r2.c     // Catch: java.lang.Throwable -> L19
            long r5 = r1.b(r9, r0, r5)     // Catch: java.lang.Throwable -> L19
            int r7 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r7 >= 0) goto L1a
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 <= 0) goto L1a
        L19:
            r5 = r9
        L1a:
            int r1 = r1.c     // Catch: java.lang.Throwable -> L2a
            long r0 = r2.b(r9, r0, r1)     // Catch: java.lang.Throwable -> L2a
            int r2 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r2 >= 0) goto L29
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L29
            goto L2a
        L29:
            r9 = r0
        L2a:
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 > 0) goto L2f
            r5 = r9
        L2f:
            r9 = -1
            long r5 = r5 + r9
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atjj.f(long):long");
    }

    @Override // defpackage.atgc
    public final String g(long j) {
        return n(j).b;
    }

    @Override // defpackage.atgc
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.e), this.f, this.g});
    }

    @Override // defpackage.atgc
    public final boolean k() {
        return false;
    }
}
