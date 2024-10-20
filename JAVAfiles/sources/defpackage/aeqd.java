package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeqd implements aeqg {
    public final aerb a;
    public final String b;
    public final String c;
    public final List d;
    public final arqg e;

    public aeqd(aerb aerbVar, String str, String str2, List list, arqg arqgVar) {
        aerbVar.getClass();
        this.a = aerbVar;
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = arqgVar;
    }

    @Override // defpackage.aeqg
    public final /* synthetic */ aeqg a(boolean z, arqg arqgVar) {
        return agkx.H(this, z, arqgVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeqd)) {
            return false;
        }
        aeqd aeqdVar = (aeqd) obj;
        if (this.a == aeqdVar.a && d.F(this.b, aeqdVar.b) && d.F(this.c, aeqdVar.c) && d.F(this.d, aeqdVar.d) && d.F(this.e, aeqdVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "Secure(icon=" + this.a + ", title=" + this.b + ", body=" + this.c + ", bodyAnnotations=" + this.d + ", onDismissRequest=" + this.e + ")";
    }
}
