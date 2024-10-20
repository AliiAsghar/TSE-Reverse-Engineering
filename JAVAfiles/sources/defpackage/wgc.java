package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wgc {
    public final String a;
    public final wfx b;

    public wgc() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wgc) {
            wgc wgcVar = (wgc) obj;
            if (this.a.equals(wgcVar.a) && this.b.equals(wgcVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "PhoneNumberInputRequest{simId=" + this.a + ", uiVariant=" + this.b.toString() + "}";
    }

    public wgc(String str, wfx wfxVar) {
        if (str == null) {
            throw new NullPointerException("Null simId");
        }
        this.a = str;
        if (wfxVar != null) {
            this.b = wfxVar;
            return;
        }
        throw new NullPointerException("Null uiVariant");
    }
}
