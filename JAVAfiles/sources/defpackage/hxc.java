package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hxc extends hwu {
    public static hxc a;
    public static hxc w;
    private static hxc x;
    private static hxc y;
    private static hxc z;

    public static hxc a() {
        if (y == null) {
            y = (hxc) ((hxc) new hxc().x()).w();
        }
        return y;
    }

    public static hxc b() {
        if (z == null) {
            z = (hxc) ((hxc) new hxc().z()).w();
        }
        return z;
    }

    public static hxc c(Class cls) {
        return (hxc) new hxc().A(cls);
    }

    public static hxc d(hpb hpbVar) {
        return (hxc) new hxc().B(hpbVar);
    }

    public static hxc e() {
        if (x == null) {
            x = (hxc) ((hxc) new hxc().F()).w();
        }
        return x;
    }

    @Override // defpackage.hwu
    public final boolean equals(Object obj) {
        if ((obj instanceof hxc) && super.equals(obj)) {
            return true;
        }
        return false;
    }
}
