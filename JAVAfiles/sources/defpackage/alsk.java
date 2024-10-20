package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alsk {
    public final Object a;
    int b;
    final /* synthetic */ alsp c;

    public alsk() {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (defpackage.d.B(r4.a, r2.a[r0]) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a() {
        /*
            r4 = this;
            int r0 = r4.b
            r1 = -1
            if (r0 == r1) goto L17
            alsp r2 = r4.c
            int r3 = r2.c
            if (r0 >= r3) goto L17
            java.lang.Object r3 = r4.a
            java.lang.Object[] r2 = r2.a
            r0 = r2[r0]
            boolean r0 = defpackage.d.B(r3, r0)
            if (r0 != 0) goto L21
        L17:
            alsp r0 = r4.c
            java.lang.Object r2 = r4.a
            int r0 = r0.d(r2)
            r4.b = r0
        L21:
            int r0 = r4.b
            if (r0 != r1) goto L27
            r0 = 0
            return r0
        L27:
            alsp r1 = r4.c
            int[] r1 = r1.b
            r0 = r1[r0]
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alsk.a():int");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof alsk) {
            alsk alskVar = (alsk) obj;
            if (a() == alskVar.a() && d.B(this.a, alskVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return hashCode ^ a();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int a = a();
        if (a == 1) {
            return valueOf;
        }
        return valueOf + " x " + a;
    }

    public alsk(alsp alspVar, int i) {
        this.c = alspVar;
        this.a = alspVar.a[i];
        this.b = i;
    }
}
