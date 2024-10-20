package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jjb implements jjc {
    private final jji a;

    public jjb(jji jjiVar) {
        this.a = jjiVar;
    }

    @Override // defpackage.jjc
    public final jji a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof jjb) && d.F(this.a, ((jjb) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        jji jjiVar = this.a;
        if (jjiVar == null) {
            return 0;
        }
        return jjiVar.hashCode();
    }

    public final String toString() {
        return "ONE_TO_ONE_SMS(textCounterData=" + this.a + ")";
    }

    public jjb() {
        this(null);
    }
}
