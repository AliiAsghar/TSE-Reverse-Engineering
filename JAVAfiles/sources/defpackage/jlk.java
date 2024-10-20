package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jlk implements jln {
    public final jgx a;
    public final String b;

    public jlk(jgx jgxVar, String str) {
        this.a = jgxVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jlk)) {
            return false;
        }
        jlk jlkVar = (jlk) obj;
        if (d.F(this.a, jlkVar.a) && d.F(this.b, jlkVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Add(draftAttachment=" + this.a + ", textCaption=" + this.b + ")";
    }
}
