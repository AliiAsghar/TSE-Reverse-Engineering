package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nel {
    public final sdt a;

    public nel(sdt sdtVar) {
        this.a = sdtVar;
    }

    public final String a() {
        return this.a.i();
    }

    public final String b() {
        return this.a.g();
    }

    public final String c() {
        return this.a.j();
    }

    public final String d() {
        return this.a.k();
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!d.F(cls2, cls)) {
            return false;
        }
        obj.getClass();
        return d.F(this.a, ((nel) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
