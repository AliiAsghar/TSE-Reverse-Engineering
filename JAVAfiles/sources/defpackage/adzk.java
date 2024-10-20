package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class adzk {
    public final annb a;
    private final String b = null;

    public adzk(annb annbVar) {
        this.a = annbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof adzk)) {
            return false;
        }
        adzk adzkVar = (adzk) obj;
        if (!d.F(this.a, adzkVar.a)) {
            return false;
        }
        String str = adzkVar.b;
        if (d.F(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "ProtectionEncryptionKey{ vm_owner=null }";
    }
}
