package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class armr implements Serializable, arml {
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(armr.class, Object.class, "c");
    private volatile arqg b;
    private volatile Object c = army.a;

    public armr(arqg arqgVar) {
        this.b = arqgVar;
    }

    private final Object writeReplace() {
        return new armi(a());
    }

    @Override // defpackage.arml
    public final Object a() {
        Object obj = this.c;
        if (obj != army.a) {
            return obj;
        }
        arqg arqgVar = this.b;
        if (arqgVar != null) {
            Object a2 = arqgVar.a();
            if (d.o(a, this, army.a, a2)) {
                this.b = null;
                return a2;
            }
        }
        return this.c;
    }

    @Override // defpackage.arml
    public final boolean b() {
        throw null;
    }

    public final String toString() {
        if (this.c != army.a) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
