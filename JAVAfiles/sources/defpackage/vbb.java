package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vbb {
    public final int a;
    private final boolean b;

    public vbb() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vbb) {
            vbb vbbVar = (vbb) obj;
            if (this.a == vbbVar.a && this.b == vbbVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = this.a;
        a.bm(i2);
        if (true != this.b) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((i2 ^ 1000003) * 1000003) ^ i;
    }

    public final String toString() {
        return "ConversationTypeInfo{type=" + Integer.toString(a.an(this.a)) + ", needsRefresh=" + this.b + "}";
    }

    public vbb(int i, boolean z) {
        this.a = i;
        this.b = z;
    }
}
