package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zzw {
    public final aaaa a;
    public final ascv b;

    public zzw(aaaa aaaaVar, ascv ascvVar) {
        this.a = aaaaVar;
        this.b = ascvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzw)) {
            return false;
        }
        zzw zzwVar = (zzw) obj;
        if (d.F(this.a, zzwVar.a) && d.F(this.b, zzwVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ConversationDetailsScreenUiData(conversationDetailsUiData=" + this.a + ", popupUiData=" + this.b + ")";
    }
}
