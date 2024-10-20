package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jrl implements mys {
    private final String a;
    private final String b;
    private final boolean c;

    public jrl() {
        this(null, null, false);
    }

    @Override // defpackage.myr
    public final /* synthetic */ alog a() {
        int i = alog.d;
        return alsx.a;
    }

    @Override // defpackage.myr
    public final String b() {
        return this.a;
    }

    @Override // defpackage.mys
    public final String c() {
        return this.b;
    }

    @Override // defpackage.mys
    public final boolean d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jrl)) {
            return false;
        }
        jrl jrlVar = (jrl) obj;
        if (d.F(this.a, jrlVar.a) && d.F(this.b, jrlVar.b) && this.c == jrlVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (((hashCode * 31) + i) * 31) + a.v(this.c);
    }

    @Override // defpackage.myr, defpackage.mym
    public final /* synthetic */ String j() {
        return "text/plain";
    }

    public final String toString() {
        CharSequence charSequence;
        String str = this.a;
        CharSequence charSequence2 = null;
        if (str != null) {
            charSequence = yyb.be(str);
        } else {
            charSequence = null;
        }
        String str2 = this.b;
        if (str2 != null) {
            charSequence2 = yyb.be(str2);
        }
        return "TextWithSubject(text=" + ((Object) charSequence) + ", subject=" + ((Object) charSequence2) + ", isUrgent=" + this.c + ")";
    }

    public jrl(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
        if (str != null && str.length() <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (str2 != null && str2.length() <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (str == null && str2 == null && !z) {
            throw new IllegalStateException("Check failed.");
        }
    }
}
