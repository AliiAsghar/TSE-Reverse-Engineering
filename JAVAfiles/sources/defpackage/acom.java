package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acom {
    public int h;
    public String a = "";
    public Optional b = Optional.empty();
    public Optional c = Optional.empty();
    public String d = "";
    public String e = "";
    public acpj f = new acpj(acpg.NONE);
    public acpj g = new acpj(acpg.NONE);
    public acor i = new acor();

    public final void a(acom acomVar) {
        if (this.b.isPresent()) {
            this.b.equals(acomVar.b);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof acom)) {
            return false;
        }
        acom acomVar = (acom) obj;
        if (this.h != acomVar.h || !TextUtils.equals(this.a, acomVar.a) || !TextUtils.equals(this.d, acomVar.d) || !TextUtils.equals(this.e, acomVar.e) || !this.b.equals(acomVar.b) || !this.i.equals(acomVar.i) || !this.f.equals(acomVar.f) || !this.g.equals(acomVar.g) || !this.c.equals(acomVar.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.h), this.a, this.d, this.e, this.b, this.i, this.f, this.g, this.c});
    }

    public final String toString() {
        String str;
        if (this.b.isPresent()) {
            str = advq.MESSAGE_CONTENT.c(this.b.get());
        } else {
            str = "Optional.empty()";
        }
        return "Subject: " + str + ", conference URIs: " + String.valueOf(this.f) + ", max user count: " + this.h + ", display text: " + this.a + ", free text: " + this.d + ", keywords: " + this.e + ", service URIs: " + String.valueOf(this.g) + ", available media: " + String.valueOf(this.i) + ", subject ext: " + String.valueOf(this.c);
    }
}
