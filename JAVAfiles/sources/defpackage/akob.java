package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akob {
    public final boolean a;
    public final aknz b;
    public final armf c;
    private final aknv d;

    public akob() {
        throw null;
    }

    public final aknv a() {
        albo.U(this.a, "Synclet binding must be enabled to have a SyncConfig");
        aknv aknvVar = this.d;
        aknvVar.getClass();
        return aknvVar;
    }

    public final boolean equals(Object obj) {
        aknz aknzVar;
        aknv aknvVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof akob) {
            akob akobVar = (akob) obj;
            if (this.a == akobVar.a && ((aknzVar = this.b) != null ? aknzVar.equals(akobVar.b) : akobVar.b == null) && ((aknvVar = this.d) != null ? aknvVar.equals(akobVar.d) : akobVar.d == null)) {
                armf armfVar = this.c;
                armf armfVar2 = akobVar.c;
                if (armfVar != null ? armfVar.equals(armfVar2) : armfVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int hashCode2;
        aknz aknzVar = this.b;
        int i2 = 0;
        if (aknzVar == null) {
            hashCode = 0;
        } else {
            hashCode = aknzVar.hashCode();
        }
        if (true != this.a) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i3 = hashCode ^ ((i ^ 1000003) * 1000003);
        aknv aknvVar = this.d;
        if (aknvVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = aknvVar.hashCode();
        }
        int i4 = ((i3 * 1000003) ^ hashCode2) * 1000003;
        armf armfVar = this.c;
        if (armfVar != null) {
            i2 = armfVar.hashCode();
        }
        return i4 ^ i2;
    }

    public final String toString() {
        armf armfVar = this.c;
        aknv aknvVar = this.d;
        return "SyncletBinding{enabled=" + this.a + ", syncKey=" + String.valueOf(this.b) + ", syncConfig=" + String.valueOf(aknvVar) + ", syncletProvider=" + String.valueOf(armfVar) + "}";
    }

    public akob(boolean z, aknz aknzVar, aknv aknvVar, armf armfVar) {
        this.a = true;
        this.b = aknzVar;
        this.d = aknvVar;
        this.c = armfVar;
    }
}
