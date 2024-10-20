package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hor implements hne {
    private final hne b;
    private final hne c;

    public hor(hne hneVar, hne hneVar2) {
        this.b = hneVar;
        this.c = hneVar2;
    }

    @Override // defpackage.hne
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
        this.c.a(messageDigest);
    }

    @Override // defpackage.hne
    public final boolean equals(Object obj) {
        if (obj instanceof hor) {
            hor horVar = (hor) obj;
            if (this.b.equals(horVar.b) && this.c.equals(horVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hne
    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public final String toString() {
        hne hneVar = this.c;
        return "DataCacheKey{sourceKey=" + String.valueOf(this.b) + ", signature=" + String.valueOf(hneVar) + "}";
    }
}
