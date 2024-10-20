package defpackage;

import j$.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anqx extends anme {
    public static final Set e = (Set) anuj.a(new anpd(8));
    public final anqt f;
    public final anqu g;
    public final anqv h;
    public final anqw i;
    public final aocj j;
    public final anme k;

    public anqx(anqt anqtVar, anqu anquVar, anqv anqvVar, anme anmeVar, anqw anqwVar, aocj aocjVar) {
        super((int[]) null);
        this.f = anqtVar;
        this.g = anquVar;
        this.h = anqvVar;
        this.k = anmeVar;
        this.i = anqwVar;
        this.j = aocjVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof anqx)) {
            return false;
        }
        anqx anqxVar = (anqx) obj;
        if (!Objects.equals(anqxVar.f, this.f) || !Objects.equals(anqxVar.g, this.g) || !Objects.equals(anqxVar.h, this.h) || !Objects.equals(anqxVar.k, this.k) || !Objects.equals(anqxVar.i, this.i) || !Objects.equals(anqxVar.j, this.j)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(anqx.class, this.f, this.g, this.h, this.k, this.i, this.j);
    }

    @Override // defpackage.anme
    public final boolean j() {
        if (this.i != anqw.c) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return String.format("EciesParameters(curveType=%s, hashType=%s, pointFormat=%s, demParameters=%s, variant=%s, salt=%s)", this.f, this.g, this.h, this.k, this.i, this.j);
    }
}
