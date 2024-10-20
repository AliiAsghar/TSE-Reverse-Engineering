package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acoq {
    public String a;
    public String b;
    public final acpd c;
    public final String d;

    public acoq(String str, String str2, String str3, acpd acpdVar) {
        this.a = "";
        this.b = "";
        acpd acpdVar2 = acpd.RECV_ONLY;
        this.d = str;
        this.b = str2;
        this.a = str3;
        this.c = acpdVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof acoq)) {
            return false;
        }
        acoq acoqVar = (acoq) obj;
        if (this.c != acoqVar.c || !TextUtils.equals(this.a, acoqVar.a) || !TextUtils.equals(this.d, acoqVar.d) || !TextUtils.equals(this.b, acoqVar.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.a, this.d, this.b});
    }

    public final String toString() {
        return "Label: " + this.d + ", display text: " + this.a + ", type: " + this.b + ", status: " + String.valueOf(this.c);
    }
}
