package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeit implements aeja {
    private final String a;
    private final aeiz b;
    private final afbz c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final aevr g;
    private final aeiu h;

    public /* synthetic */ aeit(String str, aeiz aeizVar, boolean z, boolean z2, boolean z3, aeiu aeiuVar, int i) {
        boolean z4;
        boolean z5;
        aeiuVar = (i & 128) != 0 ? new aeiu() : aeiuVar;
        int i2 = i & 32;
        int i3 = i & 16;
        int i4 = i & 8;
        int i5 = i & 2;
        if (i2 != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (i3 != 0) {
            z5 = false;
        } else {
            z5 = true;
        }
        boolean z6 = z3 & z4;
        boolean z7 = z2 & z5;
        boolean z8 = z & (i4 == 0);
        aeizVar = i5 != 0 ? null : aeizVar;
        aeiuVar.getClass();
        this.a = str;
        this.b = aeizVar;
        this.c = null;
        this.d = z8;
        this.e = z7;
        this.f = z6;
        this.g = null;
        this.h = aeiuVar;
    }

    @Override // defpackage.aeja
    public final aeiz a() {
        return this.b;
    }

    @Override // defpackage.aeja
    public final afbz b() {
        return null;
    }

    @Override // defpackage.aejt
    public final String c() {
        return this.a;
    }

    @Override // defpackage.aeja
    public final boolean d() {
        return this.f;
    }

    @Override // defpackage.aeja
    public final boolean e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeit)) {
            return false;
        }
        aeit aeitVar = (aeit) obj;
        if (!d.F(this.a, aeitVar.a) || !d.F(this.b, aeitVar.b)) {
            return false;
        }
        afbz afbzVar = aeitVar.c;
        if (!d.F(null, null) || this.d != aeitVar.d || this.e != aeitVar.e || this.f != aeitVar.f) {
            return false;
        }
        aevr aevrVar = aeitVar.g;
        if (d.F(null, null) && d.F(this.h, aeitVar.h)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.aeja
    public final boolean f() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        aeiz aeizVar = this.b;
        if (aeizVar == null) {
            hashCode = 0;
        } else {
            hashCode = aeizVar.hashCode();
        }
        return ((((((((hashCode2 + hashCode) * 961) + a.v(this.d)) * 31) + a.v(this.e)) * 31) + a.v(this.f)) * 961) + this.h.hashCode();
    }

    public final String toString() {
        return "Error(contentDescription=" + this.a + ", transcript=" + this.b + ", voiceMood=null, isOutgoing=" + this.d + ", isRichType=" + this.e + ", isHighlighted=" + this.f + ", statusUiData=null, flags=" + this.h + ")";
    }
}
