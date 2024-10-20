package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class atgm implements atgk {
    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long millis = getMillis();
        long millis2 = ((atgk) obj).getMillis();
        if (millis < millis2) {
            return -1;
        }
        if (millis > millis2) {
            return 1;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof atgk) && getMillis() == ((atgk) obj).getMillis()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long millis = getMillis();
        return (int) (millis ^ (millis >>> 32));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r7 = this;
            long r0 = r7.getMillis()
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            java.lang.String r3 = "PT"
            r2.append(r3)
            int r3 = (int) r0
            int r4 = defpackage.atjc.a
            long r4 = (long) r3
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 != 0) goto L1a
            defpackage.atjc.d(r2, r3)     // Catch: java.io.IOException -> L21
            goto L21
        L1a:
            java.lang.String r3 = java.lang.Long.toString(r0)     // Catch: java.io.IOException -> L21
            r2.append(r3)     // Catch: java.io.IOException -> L21
        L21:
            int r3 = r2.length()
            r4 = 0
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 >= 0) goto L2d
            r5 = 7
            goto L2e
        L2d:
            r5 = 6
        L2e:
            if (r3 >= r5) goto L3b
            if (r4 >= 0) goto L34
            r3 = 3
            goto L35
        L34:
            r3 = 2
        L35:
            java.lang.String r4 = "0"
            r2.insert(r3, r4)
            goto L21
        L3b:
            r3 = 1000(0x3e8, double:4.94E-321)
            long r5 = r0 / r3
            long r5 = r5 * r3
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 != 0) goto L4e
            int r0 = r2.length()
            int r0 = r0 + (-3)
            r2.setLength(r0)
            goto L59
        L4e:
            int r0 = r2.length()
            int r0 = r0 + (-3)
            java.lang.String r1 = "."
            r2.insert(r0, r1)
        L59:
            r0 = 83
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atgm.toString():java.lang.String");
    }
}
