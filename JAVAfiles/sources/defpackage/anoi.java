package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anoi extends anme {
    public final int e;
    public final anoh f;

    public anoi(int i, anoh anohVar) {
        super((byte[]) null);
        this.e = i;
        this.f = anohVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof anoi)) {
            return false;
        }
        anoi anoiVar = (anoi) obj;
        if (anoiVar.e != this.e || anoiVar.f != this.f) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(anoi.class, Integer.valueOf(this.e), this.f);
    }

    @Override // defpackage.anme
    public final boolean j() {
        if (this.f != anoh.c) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "AesGcmSiv Parameters (variant: " + String.valueOf(this.f) + ", " + this.e + "-byte key)";
    }
}
