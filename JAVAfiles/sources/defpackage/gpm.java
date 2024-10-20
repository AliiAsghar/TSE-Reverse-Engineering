package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpm {
    private final gpk a;
    private final gpl b;
    private final gpl c;
    private final gpl d;

    public gpm(gpk gpkVar, gpl gplVar, gpl gplVar2, gpl gplVar3) {
        this.a = gpkVar;
        this.b = gplVar;
        this.c = gplVar2;
        this.d = gplVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpm)) {
            return false;
        }
        gpm gpmVar = (gpm) obj;
        if (d.F(this.a, gpmVar.a) && d.F(this.b, gpmVar.b) && d.F(this.c, gpmVar.c) && d.F(this.d, gpmVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "gpm:{animationBackground=" + this.a + ", openAnimation=" + this.b + ", closeAnimation=" + this.c + ", changeAnimation=" + this.d + " }";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public gpm() {
        /*
            r2 = this;
            gpk r0 = defpackage.gpk.a
            gpl r1 = defpackage.gpl.a
            r2.<init>(r0, r1, r1, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gpm.<init>():void");
    }
}
