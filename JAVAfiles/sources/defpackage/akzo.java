package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akzo extends akzk {
    public final List a;
    public final Class b;
    private final boolean c;
    private final boolean d;

    public akzo() {
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
        return this.c;
    }

    @Override // defpackage.akzk
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akzo) {
            akzo akzoVar = (akzo) obj;
            if (this.a.equals(akzoVar.a) && this.c == akzoVar.c && this.d == akzoVar.d && this.b.equals(akzoVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() ^ 1000003;
        int i2 = 1231;
        if (true != this.c) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i3 = ((hashCode * 1000003) ^ i) * 1000003;
        if (true != this.d) {
            i2 = 1237;
        }
        return ((((i3 ^ i2) * 1000003) ^ 1237) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Class cls = this.b;
        return "StringOrEnumProperty{getPossibleValues=" + this.a.toString() + ", isRequired=" + this.c + ", isValueMatchRequired=" + this.d + ", isProhibited=false, enumType=" + cls.toString() + "}";
    }

    public akzo(List list, boolean z, boolean z2, Class cls) {
        if (list == null) {
            throw new NullPointerException("Null getPossibleValues");
        }
        this.a = list;
        this.c = z;
        this.d = z2;
        this.b = cls;
    }
}
