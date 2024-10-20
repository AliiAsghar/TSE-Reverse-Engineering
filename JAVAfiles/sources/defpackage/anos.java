package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anos extends anme {
    public final String e;
    public final anor f;

    public anos(String str, anor anorVar) {
        super((byte[]) null);
        this.e = str;
        this.f = anorVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof anos)) {
            return false;
        }
        anos anosVar = (anos) obj;
        if (!anosVar.e.equals(this.e) || !anosVar.f.equals(this.f)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(anos.class, this.e, this.f);
    }

    @Override // defpackage.anme
    public final boolean j() {
        if (this.f != anor.b) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "LegacyKmsAead Parameters (keyUri: " + this.e + ", variant: " + this.f.c + ")";
    }
}
