package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class imw implements myr {
    private final String a;

    public imw() {
        throw null;
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
        if (obj == this) {
            return true;
        }
        if (obj instanceof imw) {
            return this.a.equals(((imw) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @Override // defpackage.myr, defpackage.mym
    public final /* synthetic */ String j() {
        return "text/plain";
    }

    public final String toString() {
        return "EmojiContent{text=" + this.a + "}";
    }

    public imw(String str) {
        this.a = str;
    }
}
