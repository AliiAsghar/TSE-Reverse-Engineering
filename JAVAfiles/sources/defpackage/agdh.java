package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agdh {
    public final aftq a;
    public final String b;
    public final arqg c;
    private final arqg d;

    public agdh(aftq aftqVar, String str, arqg arqgVar) {
        aftqVar.getClass();
        this.a = aftqVar;
        this.b = str;
        this.d = null;
        this.c = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agdh)) {
            return false;
        }
        agdh agdhVar = (agdh) obj;
        if (!d.F(this.a, agdhVar.a) || !d.F(this.b, agdhVar.b)) {
            return false;
        }
        arqg arqgVar = agdhVar.d;
        if (d.F(null, null) && d.F(this.c, agdhVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 961) + this.c.hashCode();
    }

    public final String toString() {
        return "LocalVideoRendererUiAdapterArgs(attachment=" + this.a + ", contentDescription=" + this.b + ", onTuneButtonClick=null, onDeleteButtonClick=" + this.c + ")";
    }
}
