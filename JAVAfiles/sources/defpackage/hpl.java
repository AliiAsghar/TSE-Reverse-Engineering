package defpackage;

import java.security.MessageDigest;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpl implements hne {
    private final Object b;
    private final int c;
    private final int d;
    private final Class e;
    private final Class f;
    private final hne g;
    private final Map h;
    private final hnj i;
    private int j;

    public hpl(Object obj, hne hneVar, int i, int i2, Map map, Class cls, Class cls2, hnj hnjVar) {
        hwr.i(obj);
        this.b = obj;
        d.aB(hneVar, "Signature must not be null");
        this.g = hneVar;
        this.c = i;
        this.d = i2;
        hwr.i(map);
        this.h = map;
        d.aB(cls, "Resource class must not be null");
        this.e = cls;
        this.f = cls2;
        hwr.i(hnjVar);
        this.i = hnjVar;
    }

    @Override // defpackage.hne
    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.hne
    public final boolean equals(Object obj) {
        if (obj instanceof hpl) {
            hpl hplVar = (hpl) obj;
            if (this.b.equals(hplVar.b) && this.g.equals(hplVar.g) && this.d == hplVar.d && this.c == hplVar.c && this.h.equals(hplVar.h) && this.e.equals(hplVar.e) && this.f.equals(hplVar.f) && this.i.equals(hplVar.i)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hne
    public final int hashCode() {
        int i = this.j;
        if (i == 0) {
            int hashCode = this.b.hashCode();
            this.j = hashCode;
            int hashCode2 = (((((hashCode * 31) + this.g.hashCode()) * 31) + this.c) * 31) + this.d;
            this.j = hashCode2;
            int hashCode3 = (hashCode2 * 31) + this.h.hashCode();
            this.j = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.e.hashCode();
            this.j = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f.hashCode();
            this.j = hashCode5;
            int hashCode6 = (hashCode5 * 31) + this.i.hashCode();
            this.j = hashCode6;
            return hashCode6;
        }
        return i;
    }

    public final String toString() {
        hnj hnjVar = this.i;
        Map map = this.h;
        hne hneVar = this.g;
        Class cls = this.f;
        Class cls2 = this.e;
        return "EngineKey{model=" + this.b.toString() + ", width=" + this.c + ", height=" + this.d + ", resourceClass=" + cls2.toString() + ", transcodeClass=" + cls.toString() + ", signature=" + hneVar.toString() + ", hashCode=" + this.j + ", transformations=" + map.toString() + ", options=" + hnjVar.toString() + "}";
    }
}
