package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqn {
    public static final String a = "gqn";
    private final gqm b;
    private final gql c;
    private final gpm d;
    private final gpg e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public gqn() {
        /*
            r4 = this;
            gqm r0 = defpackage.gqm.b
            gql r1 = defpackage.gql.a
            gpk r2 = defpackage.gpk.a
            gpl r3 = defpackage.gpl.a
            gpm r2 = defpackage.gvf.aT(r2, r3, r3, r3)
            gpg r3 = defpackage.gpg.a
            r4.<init>(r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gqn.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gqn)) {
            return false;
        }
        gqn gqnVar = (gqn) obj;
        if (d.F(this.b, gqnVar.b) && d.F(this.c, gqnVar.c) && d.F(this.d, gqnVar.d) && d.F(this.e, gqnVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "gqn:{splitType=" + this.b + ", layoutDir=" + this.c + ", animationParams=" + this.d + ", dividerAttributes=" + this.e + " }";
    }

    public gqn(gqm gqmVar, gql gqlVar, gpm gpmVar, gpg gpgVar) {
        gqmVar.getClass();
        gqlVar.getClass();
        gpmVar.getClass();
        gpgVar.getClass();
        this.b = gqmVar;
        this.c = gqlVar;
        this.d = gpmVar;
        this.e = gpgVar;
    }
}
