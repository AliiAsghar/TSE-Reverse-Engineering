package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class key {
    public final boolean a;
    public final tqc b;
    public final kha c;
    public final kap d;
    public final kam e;

    public key(kam kamVar, boolean z, tqc tqcVar, kha khaVar, kap kapVar) {
        this.e = kamVar;
        this.a = z;
        this.b = tqcVar;
        this.c = khaVar;
        this.d = kapVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof key)) {
            return false;
        }
        key keyVar = (key) obj;
        if (d.F(this.e, keyVar.e) && this.a == keyVar.a && this.b == keyVar.b && d.F(this.c, keyVar.c) && d.F(this.d, keyVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((((this.e.hashCode() * 31) + a.v(this.a)) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        kap kapVar = this.d;
        if (kapVar == null) {
            hashCode = 0;
        } else {
            hashCode = kapVar.hashCode();
        }
        return (hashCode2 * 31) + hashCode;
    }

    public final String toString() {
        return "MultiPartMessageArgs(messageWithMetadata=" + this.e + ", isGroupConversation=" + this.a + ", archiveStatus=" + this.b + ", selectionData=" + this.c + ", searchData=" + this.d + ")";
    }
}
