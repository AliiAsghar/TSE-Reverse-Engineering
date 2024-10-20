package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jlp {
    public final jmz a;
    private final List b;

    public jlp(jmz jmzVar, List list) {
        this.a = jmzVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jlp)) {
            return false;
        }
        jlp jlpVar = (jlp) obj;
        if (this.a == jlpVar.a && d.F(this.b, jlpVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AddAttachmentResult(validation=" + this.a + ", updatedList=" + this.b + ")";
    }
}
