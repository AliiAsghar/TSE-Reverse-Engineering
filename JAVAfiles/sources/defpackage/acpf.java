package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acpf {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public acpf(String str, String str2, String str3, String str4) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.a = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof acpf)) {
            return false;
        }
        acpf acpfVar = (acpf) obj;
        if (!TextUtils.equals(this.b, acpfVar.b) || !TextUtils.equals(this.a, acpfVar.a) || !TextUtils.equals(this.c, acpfVar.c) || !TextUtils.equals(this.d, acpfVar.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, this.d});
    }

    public final String toString() {
        return "Call ID: " + this.b + ", from: " + this.c + ", to: " + this.d + ", display text: " + this.a;
    }
}
