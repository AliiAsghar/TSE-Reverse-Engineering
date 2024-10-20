package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akzq extends akzk {
    public static final akzq a = albo.i(new ArrayList(), false, false);
    private final List b;
    private final boolean c;
    private final boolean d;

    static {
        albo.i(new ArrayList(), true, false);
        albo.i(new ArrayList(), false, true);
    }

    public akzq() {
        throw null;
    }

    @Override // defpackage.akzk
    public final List a() {
        return this.b;
    }

    @Override // defpackage.akzk
    public final boolean b() {
        return this.d;
    }

    @Override // defpackage.akzk
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.akzk
    public final boolean d() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akzq) {
            akzq akzqVar = (akzq) obj;
            if (this.b.equals(akzqVar.b) && this.c == akzqVar.c && this.d == akzqVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.b.hashCode() ^ 1000003;
        int i2 = 1231;
        if (true != this.c) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i3 = ((((hashCode * 1000003) ^ i) * 1000003) ^ 1237) * 1000003;
        if (true != this.d) {
            i2 = 1237;
        }
        return i3 ^ i2;
    }

    public final String toString() {
        return "StringProperty{possibleValues=" + this.b.toString() + ", required=" + this.c + ", valueMatchRequired=false, prohibited=" + this.d + "}";
    }

    public akzq(List list, boolean z, boolean z2) {
        if (list == null) {
            throw new NullPointerException("Null possibleValues");
        }
        this.b = list;
        this.c = z;
        this.d = z2;
    }
}
