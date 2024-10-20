package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aejd implements aejf {
    public final String a;
    public final aevy b;
    private final String d;
    public final aevr c = null;
    private final boolean e = false;

    public aejd(String str, aevy aevyVar, String str2) {
        this.a = str;
        this.b = aevyVar;
        this.d = str2;
    }

    @Override // defpackage.aejt
    public final String c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aejd)) {
            return false;
        }
        aejd aejdVar = (aejd) obj;
        if (!d.F(this.a, aejdVar.a) || !d.F(this.b, aejdVar.b) || !d.F(this.d, aejdVar.d)) {
            return false;
        }
        aevr aevrVar = aejdVar.c;
        if (!d.F(null, null)) {
            return false;
        }
        boolean z = aejdVar.e;
        return true;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.d.hashCode()) * 961) + 1237;
    }

    public final String toString() {
        return "Info(name=" + this.a + ", image=" + this.b + ", contentDescription=" + this.d + ", statusUiData=null, enableInBubbleReadReceipts=false)";
    }
}
