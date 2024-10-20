package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jxq {
    public final aenr a;
    public final aeoa b;
    public final aeoo c;
    public final aeom d;
    public final aeop e;
    private final float f;

    public jxq(aenr aenrVar, aeoo aeooVar) {
        aeooVar.getClass();
        this.a = aenrVar;
        this.b = null;
        this.c = aeooVar;
        this.f = 0.1f;
        this.d = new aeom(arnv.a, null, jyp.b);
        this.e = new aeop(true, true, false, 43);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxq)) {
            return false;
        }
        jxq jxqVar = (jxq) obj;
        if (!d.F(this.a, jxqVar.a)) {
            return false;
        }
        aeoa aeoaVar = jxqVar.b;
        if (!d.F(null, null) || this.c != jxqVar.c) {
            return false;
        }
        float f = jxqVar.f;
        if (Float.compare(0.1f, 0.1f) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 961) + this.c.hashCode()) * 31) + Float.floatToIntBits(0.1f);
    }

    public final String toString() {
        return "FullScreenComposeRowUiData(draft=" + this.a + ", inputs=null, backgroundStyle=" + this.c + ", backgroundAlpha=0.1)";
    }
}
