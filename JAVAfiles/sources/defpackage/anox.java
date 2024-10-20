package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anox extends anme {
    public final anow e;
    public final String f;
    public final anme g;
    private final anov h;

    public anox(anow anowVar, String str, anov anovVar, anme anmeVar) {
        super((byte[]) null);
        this.e = anowVar;
        this.f = str;
        this.h = anovVar;
        this.g = anmeVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof anox)) {
            return false;
        }
        anox anoxVar = (anox) obj;
        if (!anoxVar.h.equals(this.h) || !anoxVar.g.equals(this.g) || !anoxVar.f.equals(this.f) || !anoxVar.e.equals(this.e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(anox.class, this.f, this.h, this.g, this.e);
    }

    @Override // defpackage.anme
    public final boolean j() {
        if (this.e != anow.b) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.f + ", dekParsingStrategy: " + this.h.g + ", dekParametersForNewKeys: " + this.g.toString() + ", variant: " + this.e.c + ")";
    }
}
