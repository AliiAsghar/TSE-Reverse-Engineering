package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jxt {
    private static final alvi c = alvi.m("com/google/android/apps/messaging/conversation2/messagelist/LazyPagingScrollHelper");
    public final gqg b;
    private final aov d;
    private final boolean e;
    public final byn a = new byu(false, cav.a);
    private final arml f = armd.a(jlc.t);

    public jxt(aov aovVar, gqg gqgVar, boolean z) {
        this.d = aovVar;
        this.b = gqgVar;
        this.e = z;
    }

    public final boolean a() {
        Object a = this.f.a();
        a.getClass();
        return ((Boolean) a).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b0, code lost:
    
        if (r9.l(r8, r0) == r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(int r8, defpackage.arpe r9) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jxt.b(int, arpe):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxt)) {
            return false;
        }
        jxt jxtVar = (jxt) obj;
        if (d.F(this.d, jxtVar.d) && d.F(this.b, jxtVar.b) && this.e == jxtVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.d.hashCode() * 31) + this.b.hashCode()) * 31) + a.v(this.e);
    }

    public final String toString() {
        return "LazyPagingScrollHelper(messageListState=" + this.d + ", lazyMessages=" + this.b + ", fixCrashInScrollToItem=" + this.e + ")";
    }
}
