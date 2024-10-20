package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akzj extends akzk {
    private final List a;
    private final boolean b;

    static {
        albo.j(false);
        albo.j(true);
    }

    public akzj() {
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
        return this.b;
    }

    @Override // defpackage.akzk
    public final boolean d() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akzj) {
            akzj akzjVar = (akzj) obj;
            if (this.a.equals(akzjVar.a) && this.b == akzjVar.b) {
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
        return (((((hashCode * 1000003) ^ i) * 1000003) ^ 1237) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "IntegerProperty{possibleValues=" + this.a.toString() + ", required=" + this.b + ", valueMatchRequired=false, prohibited=false}";
    }

    public akzj(List list, boolean z) {
        if (list == null) {
            throw new NullPointerException("Null possibleValues");
        }
        this.a = list;
        this.b = z;
    }
}
