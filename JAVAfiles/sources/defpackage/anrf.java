package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anrf extends anme {
    public final anrd e;
    public final anrc f;
    public final anra g;
    public final anre h;

    public anrf(anrd anrdVar, anrc anrcVar, anra anraVar, anre anreVar) {
        super((int[]) null);
        this.e = anrdVar;
        this.f = anrcVar;
        this.g = anraVar;
        this.h = anreVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof anrf)) {
            return false;
        }
        anrf anrfVar = (anrf) obj;
        if (this.e != anrfVar.e || this.f != anrfVar.f || this.g != anrfVar.g || this.h != anrfVar.h) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(anrf.class, this.e, this.f, this.g, this.h);
    }

    @Override // defpackage.anme
    public final boolean j() {
        if (this.h != anre.c) {
            return true;
        }
        return false;
    }
}
