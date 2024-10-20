package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akxa {
    public final Object a;

    public akxa() {
        throw null;
    }

    public static akwz a() {
        akwz akwzVar = new akwz();
        akwzVar.b = (byte) 1;
        return akwzVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akxa) {
            Object obj2 = this.a;
            Object obj3 = ((akxa) obj).a;
            if (obj2 != null ? obj2.equals(obj3) : obj3 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return hashCode ^ 385623362;
    }

    public final String toString() {
        return "ExecutionResult{startDictation=false, output=" + String.valueOf(this.a) + "}";
    }

    public akxa(Object obj) {
        this.a = obj;
    }
}
