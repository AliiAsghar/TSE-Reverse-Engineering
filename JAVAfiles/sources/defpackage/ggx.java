package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ggx {
    public final String a;
    public final int b;

    public ggx() {
        throw null;
    }

    public final boolean a() {
        if (this.a != null) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        if (obj instanceof ggx) {
            ggx ggxVar = (ggx) obj;
            String str = this.a;
            if (str == null) {
                if (ggxVar.a == null) {
                    equals = true;
                } else {
                    equals = false;
                }
            } else {
                equals = str.equals(ggxVar.a);
            }
            if (equals && this.b == ggxVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b >>> 8;
    }

    public ggx(int i, String str) {
        this.b = i;
        this.a = str;
    }
}
