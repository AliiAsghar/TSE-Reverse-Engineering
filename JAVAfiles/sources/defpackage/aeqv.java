package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeqv implements aetv {
    public final List a;
    public final boolean b;
    public final arqg c;
    private final aequ d;
    private final String e = null;
    private final arqg f = aepz.i;

    public aeqv(List list, aequ aequVar, boolean z, arqg arqgVar) {
        this.a = list;
        this.d = aequVar;
        this.b = z;
        this.c = arqgVar;
    }

    @Override // defpackage.aetv
    public final String a() {
        throw null;
    }

    @Override // defpackage.aetv
    public final arqg b() {
        return this.f;
    }

    @Override // defpackage.aetv
    public final arqg c() {
        throw null;
    }

    @Override // defpackage.aetv
    public final boolean d() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeqv)) {
            return false;
        }
        aeqv aeqvVar = (aeqv) obj;
        if (!d.F(this.a, aeqvVar.a) || !d.F(this.d, aeqvVar.d) || this.b != aeqvVar.b || !d.F(this.c, aeqvVar.c)) {
            return false;
        }
        String str = aeqvVar.e;
        if (d.F(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() * 31) + 1237) * 31) + a.v(this.b)) * 31) + this.c.hashCode()) * 31;
    }

    public final String toString() {
        return "GalleryBubbleUiData(mediaItems=" + this.a + ", flags=" + this.d + ", isHighlighted=" + this.b + ", onLayout=" + this.c + ", contentDescription=null)";
    }
}
