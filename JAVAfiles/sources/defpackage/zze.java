package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zze {
    public final aevv a;
    public final arqg b;

    public zze(aevv aevvVar, arqg arqgVar) {
        this.a = aevvVar;
        this.b = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zze)) {
            return false;
        }
        zze zzeVar = (zze) obj;
        if (d.F(this.a, zzeVar.a) && d.F(this.b, zzeVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        aevv aevvVar = this.a;
        if (aevvVar == null) {
            hashCode = 0;
        } else {
            hashCode = aevvVar.hashCode();
        }
        return (hashCode * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AvatarUiData(avatar=" + this.a + ", onAvatarClick=" + this.b + ")";
    }
}
