package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajoq extends ajpd {
    private final String a;
    private final String b;
    private final alor c;

    public ajoq(String str, String str2, alor alorVar) {
        this.a = str;
        this.b = str2;
        this.c = alorVar;
    }

    @Override // defpackage.ajpd
    public final alor a() {
        return this.c;
    }

    @Override // defpackage.ajpd
    public final String b() {
        return this.b;
    }

    @Override // defpackage.ajpd
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajpd) {
            ajpd ajpdVar = (ajpd) obj;
            if (this.a.equals(ajpdVar.c()) && this.b.equals(ajpdVar.b()) && alzz.am(this.c, ajpdVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }
}
