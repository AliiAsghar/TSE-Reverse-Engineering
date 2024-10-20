package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acpi {
    public final String a;
    public final String b;
    public final String c;
    public final acoz d;

    public acpi(String str, String str2, String str3, acoz acozVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = acozVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof acpi)) {
            return false;
        }
        acpi acpiVar = (acpi) obj;
        if (!TextUtils.equals(this.a, acpiVar.a) || !TextUtils.equals(this.c, acpiVar.c) || !TextUtils.equals(this.b, acpiVar.b)) {
            return false;
        }
        acoz acozVar = this.d;
        if (acozVar == null && acpiVar.d != null) {
            return false;
        }
        if (acozVar != null && !acozVar.equals(acpiVar.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.b, this.d});
    }

    public final String toString() {
        return "Uri: " + advq.URI.c(this.a) + ", purpose: " + this.c + ". display text: " + advq.USER_ID.c(this.b) + ", modified: " + String.valueOf(this.d);
    }
}
