package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aenz {
    public final boolean a;
    public final aepi b;

    public aenz() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aenz)) {
            return false;
        }
        aenz aenzVar = (aenz) obj;
        if (this.a == aenzVar.a && this.b == aenzVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (a.v(this.a) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Flags(hideMagicRewriteOnDraftEntered=" + this.a + ", voiceButtonBackground=" + this.b + ")";
    }

    public aenz(boolean z, aepi aepiVar) {
        aepiVar.getClass();
        this.a = z;
        this.b = aepiVar;
    }

    public /* synthetic */ aenz(byte[] bArr) {
        this(false, aepi.VOICE_BUTTON_BACKGROUND_DEFAULT);
    }
}
