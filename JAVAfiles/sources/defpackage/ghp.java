package defpackage;

/* compiled from: PG */
@armg
/* loaded from: classes.dex */
public abstract class ghp extends gil {
    public ghp(gid gidVar) {
        super(gidVar);
    }

    public final void a(Object obj) {
        gkp d = d();
        try {
            b(d, obj);
            d.a.executeInsert();
        } finally {
            f(d);
        }
    }

    protected abstract void b(gkp gkpVar, Object obj);
}
