package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aenn {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public aenn() {
        /*
            r2 = this;
            r0 = 0
            r1 = 7
            r2.<init>(r0, r0, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aenn.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aenn)) {
            return false;
        }
        aenn aennVar = (aenn) obj;
        if (this.a == aennVar.a && this.b == aennVar.b && this.c == aennVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((a.v(this.a) * 31) + a.v(this.b)) * 31) + a.v(this.c);
    }

    public final String toString() {
        return "Flags(catchNullPointerExceptionsOnTextFieldDraw=" + this.a + ", skipContentSizeAnimation=" + this.b + ", hidePlaceholderOnFocus=" + this.c + ")";
    }

    public aenn(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public /* synthetic */ aenn(boolean z, boolean z2, boolean z3, int i) {
        this(1 == ((z ? 1 : 0) & ((i & 1) ^ 1)), z2 & ((i & 2) == 0), z3 & ((i & 4) == 0));
    }
}
