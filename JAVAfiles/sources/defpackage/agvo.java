package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class agvo {
    public final int a;
    public final oc b;
    public final agvx c;

    public agvo() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agvo) {
            agvo agvoVar = (agvo) obj;
            if (this.a == agvoVar.a && this.b.equals(agvoVar.b) && this.c.equals(agvoVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        agvx agvxVar = this.c;
        return "EmojiBodyViewInitParams{spanCount=" + this.a + ", recycledViewPool=" + this.b.toString() + ", delegate=" + agvxVar.toString() + "}";
    }

    public agvo(int i, oc ocVar, agvx agvxVar) {
        this.a = i;
        this.b = ocVar;
        if (agvxVar == null) {
            throw new NullPointerException("Null delegate");
        }
        this.c = agvxVar;
    }
}
