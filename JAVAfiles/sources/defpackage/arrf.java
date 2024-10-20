package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class arrf implements Serializable, arte {
    public static final Object d = arre.a;
    private transient arte a;
    private final Class b;
    private final boolean c;
    protected final Object e;
    public final String f;
    public final String g;

    /* JADX INFO: Access modifiers changed from: protected */
    public arrf(Object obj, Class cls, String str, String str2, boolean z) {
        this.e = obj;
        this.b = cls;
        this.f = str;
        this.g = str2;
        this.c = z;
    }

    @Override // defpackage.arte
    public final String c() {
        return this.f;
    }

    public final arte e() {
        arte arteVar = this.a;
        if (arteVar == null) {
            i();
            this.a = this;
            return this;
        }
        return arteVar;
    }

    public final artg g() {
        artg arrhVar;
        Class cls = this.b;
        if (cls == null) {
            return null;
        }
        if (this.c) {
            arrhVar = new arrs(cls);
        } else {
            int i = arsc.a;
            arrhVar = new arrh(cls);
        }
        return arrhVar;
    }

    @Override // defpackage.arte
    public final Object h() {
        throw null;
    }

    protected abstract void i();
}
