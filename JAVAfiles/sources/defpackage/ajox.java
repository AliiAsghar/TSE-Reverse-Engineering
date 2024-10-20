package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajox extends ajpp {
    private final String a;
    private final String b;
    private final String c;

    public ajox(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // defpackage.ajpp
    public final String a() {
        return this.b;
    }

    @Override // defpackage.ajpp
    public final String b() {
        return this.a;
    }

    @Override // defpackage.ajpp
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajpp) {
            ajpp ajppVar = (ajpp) obj;
            if (this.a.equals(ajppVar.b()) && this.b.equals(ajppVar.a()) && this.c.equals(ajppVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }
}
