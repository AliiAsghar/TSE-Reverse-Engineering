package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akzi extends akzk {
    private final List a;
    private final boolean b;
    private final Class c;

    public akzi() {
        throw null;
    }

    @Override // defpackage.akzk
    public final List a() {
        return this.a;
    }

    @Override // defpackage.akzk
    public final boolean b() {
        return false;
    }

    @Override // defpackage.akzk
    public final boolean c() {
        return false;
    }

    @Override // defpackage.akzk
    public final boolean d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akzi) {
            akzi akziVar = (akzi) obj;
            if (this.a.equals(akziVar.a) && this.b == akziVar.b && this.c.equals(akziVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() ^ 1000003;
        if (true != this.b) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (((((((hashCode * 1000003) ^ 1237) * 1000003) ^ i) * 1000003) ^ 1237) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        Class cls = this.c;
        return "EnumProperty{getPossibleValues=" + this.a.toString() + ", isRequired=false, isValueMatchRequired=" + this.b + ", isProhibited=false, enumType=" + cls.toString() + "}";
    }

    public akzi(List list, Class cls) {
        if (list == null) {
            throw new NullPointerException("Null getPossibleValues");
        }
        this.a = list;
        this.b = true;
        this.c = cls;
    }
}
