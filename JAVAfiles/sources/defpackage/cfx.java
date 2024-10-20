package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfx extends cfu {
    private final String b;
    private final Object c;
    private final Object d;

    public cfx(String str, Object obj, Object obj2, arqw arqwVar) {
        super(arqwVar);
        this.b = str;
        this.c = obj;
        this.d = obj2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cfx) {
            cfx cfxVar = (cfx) obj;
            if (d.F(this.b, cfxVar.b) && d.F(this.c, cfxVar.c) && d.F(this.d, cfxVar.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.b.hashCode() * 31;
        Object obj = this.c;
        int i2 = 0;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        Object obj2 = this.d;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        return i3 + i2;
    }
}
