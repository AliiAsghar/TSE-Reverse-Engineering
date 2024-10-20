package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atfx extends atfy {
    private static final long serialVersionUID = -9937958251642L;
    public final transient atgf a;
    private final byte z;

    public atfx(String str, byte b, atgf atgfVar) {
        super(str);
        this.z = b;
        this.a = atgfVar;
    }

    private Object readResolve() {
        switch (this.z) {
            case 1:
                return atfy.b;
            case 2:
                return atfy.c;
            case 3:
                return atfy.d;
            case 4:
                return atfy.e;
            case 5:
                return atfy.f;
            case 6:
                return atfy.g;
            case 7:
                return atfy.h;
            case 8:
                return atfy.i;
            case 9:
                return atfy.j;
            case 10:
                return atfy.k;
            case 11:
                return atfy.l;
            case 12:
                return atfy.m;
            case 13:
                return atfy.n;
            case 14:
                return atfy.o;
            case 15:
                return atfy.p;
            case 16:
                return atfy.q;
            case 17:
                return atfy.r;
            case 18:
                return atfy.s;
            case 19:
                return atfy.t;
            case 20:
                return atfy.u;
            case 21:
                return atfy.v;
            case 22:
                return atfy.w;
            default:
                return atfy.x;
        }
    }

    @Override // defpackage.atfy
    public final atfw a(atfu atfuVar) {
        byte b = this.z;
        atfu c = atfz.c(atfuVar);
        switch (b) {
            case 1:
                return c.i();
            case 2:
                return c.y();
            case 3:
                return c.c();
            case 4:
                return c.x();
            case 5:
                return c.w();
            case 6:
                return c.h();
            case 7:
                return c.q();
            case 8:
                return c.f();
            case 9:
                return c.v();
            case 10:
                return c.u();
            case 11:
                return c.t();
            case 12:
                return c.g();
            case 13:
                return c.j();
            case 14:
                return c.l();
            case 15:
                return c.e();
            case 16:
                return c.d();
            case 17:
                return c.k();
            case 18:
                return c.o();
            case 19:
                return c.p();
            case 20:
                return c.r();
            case 21:
                return c.s();
            case 22:
                return c.m();
            default:
                return c.n();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof atfx) && this.z == ((atfx) obj).z) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 1 << this.z;
    }
}
