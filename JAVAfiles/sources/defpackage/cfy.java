package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfy extends cfu {
    private final String b;
    private final Object c;
    private final Object d;
    private final Object f;

    public cfy(String str, Object obj, Object obj2, Object obj3, arqw arqwVar) {
        super(arqwVar);
        this.b = str;
        this.c = obj;
        this.d = obj2;
        this.f = obj3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cfy) {
            cfy cfyVar = (cfy) obj;
            if (d.F(this.b, cfyVar.b) && d.F(this.c, cfyVar.c) && d.F(this.d, cfyVar.d) && d.F(this.f, cfyVar.f)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f.hashCode();
    }
}
