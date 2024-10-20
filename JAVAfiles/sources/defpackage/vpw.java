package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class vpw extends vrd {
    private final aozb a;
    private final boolean b;

    public vpw(aozb aozbVar, boolean z) {
        if (aozbVar != null) {
            this.a = aozbVar;
            this.b = z;
            return;
        }
        throw new NullPointerException("Null transactionId");
    }

    @Override // defpackage.vrd
    public final aozb a() {
        return this.a;
    }

    @Override // defpackage.vrd
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vrd) {
            vrd vrdVar = (vrd) obj;
            if (this.a.equals(vrdVar.a()) && this.b == vrdVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() ^ 1000003;
        if (true != this.b) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (hashCode * 1000003) ^ i;
    }

    public final String toString() {
        return "MmsMessage{transactionId=" + this.a.toString() + ", isArbitraryDataStored=" + this.b + "}";
    }
}
