package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class alzc {
    public alzk b = null;
    public alyu c = null;

    public abstract alze a();

    public final void b(alvz alvzVar, Object obj) {
        if (obj == null) {
            return;
        }
        if (this.c == null) {
            this.c = new alyu();
        }
        this.c.a.add(new ansy(alvzVar, obj));
    }

    public final void c(alzk alzkVar) {
        boolean z;
        if (this.b == null) {
            z = true;
        } else {
            z = false;
        }
        alzz.d(z, "tags already set");
        this.b = alzkVar;
    }
}
