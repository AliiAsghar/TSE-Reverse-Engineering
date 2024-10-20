package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anqm extends anme {
    public final int e;
    public final anql f;

    public anqm(int i, anql anqlVar) {
        super((int[]) null);
        this.e = i;
        this.f = anqlVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof anqm)) {
            return false;
        }
        anqm anqmVar = (anqm) obj;
        if (anqmVar.e != this.e || anqmVar.f != this.f) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(anqm.class, Integer.valueOf(this.e), this.f);
    }

    @Override // defpackage.anme
    public final boolean j() {
        if (this.f != anql.c) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "AesSiv Parameters (variant: " + String.valueOf(this.f) + ", " + this.e + "-byte key)";
    }
}
