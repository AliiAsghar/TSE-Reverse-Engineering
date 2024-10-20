package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acyu extends aczc {
    private static volatile acyu e;
    public final afvz b;
    private static final Object f = new Object();
    public static final acyz a = aczd.a(149510230);

    private acyu() {
        super("BusinessInfoRetrieval__");
        this.b = new afvz(this);
    }

    public static acyu a() {
        if (e == null) {
            c();
        }
        return e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c() {
        synchronized (f) {
            if (e == null) {
                e = new acyu();
                e.l();
            }
        }
    }

    public static boolean d() {
        return ((Boolean) ((acza) a().b.i).a()).booleanValue();
    }

    @Override // defpackage.aczc
    protected final alog b() {
        afvz afvzVar = this.b;
        return alog.C(afvzVar.i, afvzVar.b, afvzVar.e, afvzVar.a, afvzVar.j, afvzVar.l, afvzVar.d, afvzVar.g, afvzVar.f, afvzVar.k, afvzVar.c, afvzVar.h, new acyz[0]);
    }
}
