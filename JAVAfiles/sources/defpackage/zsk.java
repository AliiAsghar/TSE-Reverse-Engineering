package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zsk implements Comparable {
    public final zsr a;
    public final zsn b;

    public zsk() {
        throw null;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.b.a, ((zsk) obj).b.a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zsk) {
            zsk zskVar = (zsk) obj;
            if (this.a.equals(zskVar.a) && this.b.equals(zskVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        zsn zsnVar = this.b;
        return "CreationParams{bannerFactory=" + this.a.toString() + ", priority=" + zsnVar.toString() + "}";
    }

    public zsk(zsr zsrVar, zsn zsnVar) {
        this.a = zsrVar;
        this.b = zsnVar;
    }
}
