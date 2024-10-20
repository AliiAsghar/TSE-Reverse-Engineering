package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aewj implements aewk {
    public final Float a;
    public final arqg b;
    private final boolean c;
    private final arqg d;
    private final arqg e;
    private final String f;

    public aewj(Float f, arqg arqgVar, boolean z, arqg arqgVar2, arqg arqgVar3, String str) {
        this.a = f;
        this.b = arqgVar;
        this.c = z;
        this.d = arqgVar2;
        this.e = arqgVar3;
        this.f = str;
    }

    @Override // defpackage.aetv
    public final String a() {
        throw null;
    }

    @Override // defpackage.aetv
    public final arqg b() {
        return this.d;
    }

    @Override // defpackage.aetv
    public final arqg c() {
        return this.e;
    }

    @Override // defpackage.aetv
    public final boolean d() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aewj)) {
            return false;
        }
        aewj aewjVar = (aewj) obj;
        if (d.F(this.a, aewjVar.a) && d.F(this.b, aewjVar.b) && this.c == aewjVar.c && d.F(this.d, aewjVar.d) && d.F(this.e, aewjVar.e) && d.F(this.f, aewjVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Float f = this.a;
        if (f == null) {
            hashCode = 0;
        } else {
            hashCode = f.hashCode();
        }
        return (((((((((hashCode * 31) + this.b.hashCode()) * 31) + a.v(this.c)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "Transferring(progressPercentage=" + this.a + ", onCancelButtonClicked=" + this.b + ", isHighlighted=" + this.c + ", onClick=" + this.d + ", onLayout=" + this.e + ", contentDescription=" + this.f + ")";
    }
}
