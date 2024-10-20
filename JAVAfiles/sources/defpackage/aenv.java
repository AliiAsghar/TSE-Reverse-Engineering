package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aenv implements aenp {
    public final String a;
    public final arqg b;
    public final arqg c;
    private final String d = null;
    private final aenu e;

    public aenv(String str, arqg arqgVar, arqg arqgVar2, aenu aenuVar) {
        this.a = str;
        this.b = arqgVar;
        this.c = arqgVar2;
        this.e = aenuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aenv)) {
            return false;
        }
        aenv aenvVar = (aenv) obj;
        if (!d.F(this.a, aenvVar.a)) {
            return false;
        }
        String str = aenvVar.d;
        if (d.F(null, null) && d.F(this.b, aenvVar.b) && d.F(this.c, aenvVar.c) && d.F(this.e, aenvVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 961) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + 1237;
    }

    public final String toString() {
        return "ComposeRowHeaderUiData(headerText=" + this.a + ", onClick=<redacted>, onDismiss=<redacted>)";
    }
}
