package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aetb implements aesg {
    public final String a;
    public final aerb b;
    public final boolean c;
    public final arqg d;
    private final String e = null;
    private final boolean f = true;

    public aetb(String str, aerb aerbVar, boolean z, arqg arqgVar) {
        this.a = str;
        this.b = aerbVar;
        this.c = z;
        this.d = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aetb)) {
            return false;
        }
        aetb aetbVar = (aetb) obj;
        if (!d.F(this.a, aetbVar.a) || this.b != aetbVar.b) {
            return false;
        }
        String str = aetbVar.e;
        if (!d.F(null, null) || this.c != aetbVar.c || !d.F(this.d, aetbVar.d)) {
            return false;
        }
        boolean z = aetbVar.f;
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        aerb aerbVar = this.b;
        if (aerbVar == null) {
            hashCode = 0;
        } else {
            hashCode = aerbVar.hashCode();
        }
        return ((((((hashCode2 + hashCode) * 961) + a.v(this.c)) * 31) + this.d.hashCode()) * 31) + a.v(true);
    }

    public final String toString() {
        return "SwitchListItemUiData(title=" + this.a + ", icon=" + this.b + ", subtitle=null, isChecked=" + this.c + ", onToggle=" + this.d + ", isEnabled=true)";
    }
}
