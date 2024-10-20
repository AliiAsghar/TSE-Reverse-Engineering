package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zyz {
    public final zze a;
    public final zzf b;
    public final zzc c;
    public final zyy d;

    public zyz(zze zzeVar, zzf zzfVar, zzc zzcVar, zyy zyyVar) {
        zzeVar.getClass();
        zzfVar.getClass();
        zzcVar.getClass();
        this.a = zzeVar;
        this.b = zzfVar;
        this.c = zzcVar;
        this.d = zyyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zyz)) {
            return false;
        }
        zyz zyzVar = (zyz) obj;
        if (d.F(this.a, zyzVar.a) && d.F(this.b, zyzVar.b) && d.F(this.c, zyzVar.c) && d.F(this.d, zyzVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "HeaderUiData(avatarUiData=" + this.a + ", titleUiData=" + this.b + ", actionButtons=" + this.c + ", flags=" + this.d + ")";
    }
}
