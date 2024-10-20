package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akzh extends akzk {
    private final List a;
    private final boolean b;

    static {
        albo.k(new ArrayList(), false);
        albo.k(new ArrayList(), true);
    }

    public akzh() {
        throw null;
    }

    @Override // defpackage.akzk
    public final List a() {
        return this.a;
    }

    @Override // defpackage.akzk
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.akzk
    public final boolean c() {
        return false;
    }

    @Override // defpackage.akzk
    public final boolean d() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akzh) {
            akzh akzhVar = (akzh) obj;
            if (this.a.equals(akzhVar.a) && this.b == akzhVar.b) {
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
        return (((((hashCode * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ i;
    }

    public final String toString() {
        return "EntityProperty{possibleValues=" + this.a.toString() + ", required=false, valueMatchRequired=false, prohibited=" + this.b + "}";
    }

    public akzh(List list, boolean z) {
        if (list == null) {
            throw new NullPointerException("Null possibleValues");
        }
        this.a = list;
        this.b = z;
    }
}
