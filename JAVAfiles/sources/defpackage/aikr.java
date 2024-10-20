package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aikr extends aiku implements Cloneable {
    public boolean a;
    public String b;
    public aila c = new aila(null);

    @Override // defpackage.aiku
    public final String c() {
        String str;
        if (true != this.a) {
            str = "";
        } else {
            str = "+";
        }
        String valueOf = String.valueOf(this.b);
        boolean h = this.c.h();
        String concat = str.concat(valueOf);
        if (!h) {
            return concat.concat(";").concat(this.c.c());
        }
        return concat;
    }

    @Override // defpackage.aiku
    public final Object clone() {
        aikr aikrVar = new aikr();
        aikrVar.a = this.a;
        aikrVar.b = this.b;
        aikrVar.c = (aila) this.c.clone();
        return aikrVar;
    }
}
