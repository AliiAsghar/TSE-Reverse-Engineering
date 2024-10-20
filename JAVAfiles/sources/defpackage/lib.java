package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lib {
    public final lhw a;
    public final List b;
    public final boolean c;

    public lib() {
        this(false, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lib)) {
            return false;
        }
        lib libVar = (lib) obj;
        if (d.F(this.a, libVar.a) && d.F(this.b, libVar.b) && this.c == libVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        lhw lhwVar = this.a;
        if (lhwVar == null) {
            hashCode = 0;
        } else {
            hashCode = lhwVar.hashCode();
        }
        return (((hashCode * 31) + this.b.hashCode()) * 31) + a.v(this.c);
    }

    public final String toString() {
        return "ConversationUiData(loadText=" + this.a + ", entries=" + this.b + ", loaded=" + this.c + ")";
    }

    public lib(lhw lhwVar, List list, boolean z) {
        list.getClass();
        this.a = lhwVar;
        this.b = list;
        this.c = z;
    }

    public /* synthetic */ lib(boolean z, int i) {
        this(null, (i & 2) != 0 ? arnv.a : null, z & ((i & 4) == 0));
    }
}
