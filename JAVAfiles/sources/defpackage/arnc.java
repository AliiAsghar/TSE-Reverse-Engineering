package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arnc implements Serializable, arml {
    private arqg a;
    private Object b = army.a;

    public arnc(arqg arqgVar) {
        this.a = arqgVar;
    }

    private final Object writeReplace() {
        return new armi(a());
    }

    @Override // defpackage.arml
    public final Object a() {
        if (this.b == army.a) {
            arqg arqgVar = this.a;
            arqgVar.getClass();
            this.b = arqgVar.a();
            this.a = null;
        }
        return this.b;
    }

    @Override // defpackage.arml
    public final boolean b() {
        throw null;
    }

    public final String toString() {
        if (this.b != army.a) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
