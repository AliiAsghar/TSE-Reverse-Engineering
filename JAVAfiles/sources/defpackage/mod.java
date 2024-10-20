package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mod {
    public final moe a;
    public final xwb b;

    public mod(moe moeVar, xwb xwbVar) {
        moeVar.getClass();
        this.a = moeVar;
        this.b = xwbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mod)) {
            return false;
        }
        mod modVar = (mod) obj;
        if (this.a == modVar.a && d.F(this.b, modVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        xwb xwbVar = this.b;
        if (xwbVar == null) {
            hashCode = 0;
        } else {
            hashCode = xwbVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "PalModeData(state=" + this.a + ", geminiConversationId=" + this.b + ")";
    }

    public /* synthetic */ mod(moe moeVar) {
        this(moeVar, null);
    }
}
