package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfw extends cfu {
    private final String b;
    private final Object c;

    public cfw(String str, Object obj, arqw arqwVar) {
        super(arqwVar);
        this.b = str;
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cfw) {
            cfw cfwVar = (cfw) obj;
            if (d.F(this.b, cfwVar.b) && d.F(this.c, cfwVar.c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }
}
