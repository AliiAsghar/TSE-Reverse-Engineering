package defpackage;

import android.text.SpannableString;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wia {
    public final String a;
    public final SpannableString b;
    public final SpannableString c;
    public final boolean d;

    public wia(String str, SpannableString spannableString, SpannableString spannableString2, boolean z) {
        str.getClass();
        this.a = str;
        this.b = spannableString;
        this.c = spannableString2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wia)) {
            return false;
        }
        wia wiaVar = (wia) obj;
        if (d.F(this.a, wiaVar.a) && d.F(this.b, wiaVar.b) && d.F(this.c, wiaVar.c) && this.d == wiaVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + a.v(this.d);
    }

    public final String toString() {
        return "WelcomeMessageRequest(simId=" + this.a + ", title=" + ((Object) this.b) + ", message=" + ((Object) this.c) + ", settingsButtonEnabled=" + this.d + ")";
    }
}
