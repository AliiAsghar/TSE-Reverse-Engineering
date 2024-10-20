package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jnd {
    public final afsz a;
    public final afsp b;
    public final Long c;
    public final boolean d;

    public jnd() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jnd)) {
            return false;
        }
        jnd jndVar = (jnd) obj;
        if (this.a == jndVar.a && d.F(this.b, jndVar.b) && d.F(this.c, jndVar.c) && this.d == jndVar.d) {
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
        return (((hashCode2 * 31) + hashCode) * 31) + a.v(this.d);
    }

    public final String toString() {
        return "ConvertOptions(quality=" + this.a + ", capabilities=" + this.b + ", maxAttachmentSizeBytes=" + this.c + ", download=" + this.d + ")";
    }

    public jnd(jno jnoVar, boolean z) {
        this(jnoVar.a, jnoVar.b, jnoVar.c, z);
    }

    public jnd(afsz afszVar, afsp afspVar, Long l, boolean z) {
        afszVar.getClass();
        this.a = afszVar;
        this.b = afspVar;
        this.c = l;
        this.d = z;
    }

    public /* synthetic */ jnd(byte[] bArr) {
        this(afsz.d, new afsp(null, 7), null, false);
    }
}
