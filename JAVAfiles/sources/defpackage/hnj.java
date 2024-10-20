package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hnj implements hne {
    public final tm b = new hyj();

    @Override // defpackage.hne
    public final void a(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            tm tmVar = this.b;
            if (i < tmVar.d) {
                hni hniVar = (hni) tmVar.d(i);
                tm tmVar2 = this.b;
                hnh hnhVar = hniVar.c;
                Object g = tmVar2.g(i);
                if (hniVar.e == null) {
                    hniVar.e = hniVar.d.getBytes(hne.a);
                }
                hnhVar.a(hniVar.e, g, messageDigest);
                i++;
            } else {
                return;
            }
        }
    }

    public final Object b(hni hniVar) {
        if (this.b.containsKey(hniVar)) {
            return this.b.get(hniVar);
        }
        return hniVar.b;
    }

    public final void c(hnj hnjVar) {
        this.b.i(hnjVar.b);
    }

    public final void d(hni hniVar, Object obj) {
        this.b.put(hniVar, obj);
    }

    @Override // defpackage.hne
    public final boolean equals(Object obj) {
        if (obj instanceof hnj) {
            return this.b.equals(((hnj) obj).b);
        }
        return false;
    }

    @Override // defpackage.hne
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.b.toString() + "}";
    }
}
