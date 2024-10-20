package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aofa implements aohf {
    private static final Object a = new Object();
    private volatile Object b = a;
    private volatile aohf c;

    public aofa(aohf aohfVar) {
        this.c = aohfVar;
    }

    @Override // defpackage.aohf
    public final Object a() {
        Object obj = this.b;
        Object obj2 = a;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.b;
                if (obj == obj2) {
                    obj = this.c.a();
                    this.b = obj;
                    this.c = null;
                }
            }
        }
        return obj;
    }
}
