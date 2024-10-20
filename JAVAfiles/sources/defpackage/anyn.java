package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anyn extends anme {
    public final anym e;

    public anyn(anym anymVar) {
        super((int[]) null);
        this.e = anymVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof anyn) || ((anyn) obj).e != this.e) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(anyn.class, this.e);
    }

    @Override // defpackage.anme
    public final boolean j() {
        if (this.e != anym.d) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "Ed25519 Parameters (variant: " + this.e.e + ")";
    }
}
