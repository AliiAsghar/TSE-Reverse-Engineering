package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acpa {
    public final String a;
    public final String b;
    public final acpj c;

    public acpa(String str, String str2, acpj acpjVar) {
        this.a = str;
        this.b = str2;
        this.c = acpjVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof acpa)) {
            return false;
        }
        acpa acpaVar = (acpa) obj;
        if (!TextUtils.equals(this.a, acpaVar.a) || !TextUtils.equals(this.b, acpaVar.b) || !this.c.equals(acpaVar.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        return "Display text: " + this.a + ", web page: " + this.b + ", uris: " + this.c.toString();
    }
}
