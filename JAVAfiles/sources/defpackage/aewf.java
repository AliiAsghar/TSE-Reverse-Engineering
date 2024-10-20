package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aewf implements aewe {
    public final List a;
    private final String b;
    private final aewd c;
    private final float d;
    private final arqg e;
    private final int f;

    public aewf() {
        this(null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aewf)) {
            return false;
        }
        aewf aewfVar = (aewf) obj;
        String str = aewfVar.b;
        if (!d.F(null, null)) {
            return false;
        }
        int i = aewfVar.f;
        if (!d.F(this.a, aewfVar.a) || this.c != aewfVar.c) {
            return false;
        }
        float f = aewfVar.d;
        if (Float.compare(0.05f, 0.05f) != 0) {
            return false;
        }
        arqg arqgVar = aewfVar.e;
        if (d.F(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        a.bm(1);
        return (((((this.a.hashCode() + 31) * 31) + this.c.hashCode()) * 31) + Float.floatToIntBits(0.05f)) * 31;
    }

    public final String toString() {
        return "MultiMonogramUiData(contentDescription=null, iconOverride=NONE, items=" + this.a + ", shape=" + this.c + ", spacerWeight=0.05, onClick=null)";
    }

    public /* synthetic */ aewf(List list, int i) {
        list = (i & 4) != 0 ? arnv.a : list;
        int i2 = i & 2;
        aewd aewdVar = aewd.a;
        if (i2 == 0) {
            throw null;
        }
        list.getClass();
        aewdVar.getClass();
        this.b = null;
        this.f = 1;
        this.a = list;
        this.c = aewdVar;
        this.d = 0.05f;
        this.e = null;
    }
}
