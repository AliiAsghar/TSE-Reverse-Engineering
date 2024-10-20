package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jno {
    public final afsz a;
    public final afsp b;
    public final Long c;

    public jno(afsz afszVar, afsp afspVar, Long l) {
        afszVar.getClass();
        this.a = afszVar;
        this.b = afspVar;
        this.c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jno)) {
            return false;
        }
        jno jnoVar = (jno) obj;
        if (this.a == jnoVar.a && d.F(this.b, jnoVar.b) && d.F(this.c, jnoVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() * 31) + this.b.hashCode();
        Long l = this.c;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        return (hashCode2 * 31) + hashCode;
    }

    public final String toString() {
        return "VariationOptions(quality=" + this.a + ", mediaCapabilities=" + this.b + ", maxAttachmentSizeBytes=" + this.c + ")";
    }
}
