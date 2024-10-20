package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afmf {
    public aflq a;
    public aflr b;

    public afmf() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afmf)) {
            return false;
        }
        afmf afmfVar = (afmf) obj;
        if (this.a == afmfVar.a && this.b == afmfVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        aflq aflqVar = this.a;
        int i = 0;
        if (aflqVar == null) {
            hashCode = 0;
        } else {
            hashCode = aflqVar.hashCode();
        }
        aflr aflrVar = this.b;
        if (aflrVar != null) {
            i = aflrVar.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        return "ModifierPreferences(gender=" + this.a + ", skinTone=" + this.b + ")";
    }

    public afmf(aflq aflqVar, aflr aflrVar) {
        this.a = aflqVar;
        this.b = aflrVar;
    }

    public /* synthetic */ afmf(byte[] bArr) {
        this(null, null);
    }
}
