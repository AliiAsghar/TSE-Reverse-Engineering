package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acpc {
    public final String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public acpd f = acpd.NONE;

    public acpc(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof acpc)) {
            return false;
        }
        acpc acpcVar = (acpc) obj;
        if (this.f != acpcVar.f || !TextUtils.equals(this.a, acpcVar.a) || !TextUtils.equals(this.e, acpcVar.e) || !TextUtils.equals(this.c, acpcVar.c) || !TextUtils.equals(this.d, acpcVar.d) || !TextUtils.equals(this.b, acpcVar.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f, this.a, this.e, this.c, this.d, this.b});
    }

    public final String toString() {
        return "Media ID: " + this.a + ", type: " + this.c + ", display text: " + this.b + ", status: " + String.valueOf(this.f);
    }
}
