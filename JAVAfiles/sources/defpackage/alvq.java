package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alvq extends alvr {
    private final String b;
    private final String c;
    private final int d;
    private final String e;
    private int f = 0;

    public alvq(String str, String str2, int i, String str3) {
        str.getClass();
        this.b = str;
        str2.getClass();
        this.c = str2;
        this.d = i;
        this.e = str3;
    }

    @Override // defpackage.alvr
    public final int a() {
        return (char) this.d;
    }

    @Override // defpackage.alvr
    public final String b() {
        return this.b.replace('/', '.');
    }

    @Override // defpackage.alvr
    public final String c() {
        return this.e;
    }

    @Override // defpackage.alvr
    public final String d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof alvq) {
            alvq alvqVar = (alvq) obj;
            if (this.c.equals(alvqVar.c) && this.d == alvqVar.d && b().equals(alvqVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f;
        if (i == 0) {
            int hashCode = ((this.c.hashCode() + 4867) * 31) + this.d;
            this.f = hashCode;
            return hashCode;
        }
        return i;
    }
}
