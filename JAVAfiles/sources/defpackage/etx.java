package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class etx {
    public final Object a;
    public boolean b;
    public boolean c;
    public apvo d = new apvo((char[]) null);

    public etx(Object obj) {
        this.a = obj;
    }

    public final void a(etw etwVar) {
        this.c = true;
        if (this.b) {
            this.b = false;
            etwVar.a(this.a, this.d.b());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.a.equals(((etx) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
