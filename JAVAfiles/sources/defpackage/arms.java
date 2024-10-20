package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arms implements Serializable, arml {
    private arqg a;
    private volatile Object b = army.a;
    private final Object c = this;

    private final Object writeReplace() {
        return new armi(a());
    }

    @Override // defpackage.arml
    public final Object a() {
        Object obj;
        Object obj2 = this.b;
        if (obj2 != army.a) {
            return obj2;
        }
        synchronized (this.c) {
            obj = this.b;
            if (obj == army.a) {
                arqg arqgVar = this.a;
                arqgVar.getClass();
                obj = arqgVar.a();
                this.b = obj;
                this.a = null;
            }
        }
        return obj;
    }

    @Override // defpackage.arml
    public final boolean b() {
        if (this.b != army.a) {
            return true;
        }
        return false;
    }

    public final String toString() {
        if (b()) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
