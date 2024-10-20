package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jrk implements myr {
    private final String a;

    public jrk(String str) {
        this.a = str;
        if (str.length() > 0) {
        } else {
            throw new IllegalStateException("Check failed.");
        }
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof jrk) && d.F(this.a, ((jrk) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.myr, defpackage.mym
    public final /* synthetic */ String j() {
        return "text/plain";
    }

    public final String toString() {
        return "Text(text=" + ((Object) yyb.be(this.a)) + ")";
    }
}
