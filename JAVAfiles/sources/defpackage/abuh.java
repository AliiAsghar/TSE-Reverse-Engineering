package defpackage;

import android.content.ComponentName;
import android.net.Uri;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abuh {
    public static final Uri a = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String b;
    public final String c;
    public final ComponentName d;
    public final int e;
    public final boolean f;

    public abuh(ComponentName componentName, int i) {
        this.b = null;
        this.c = null;
        abhg.m(componentName);
        this.d = componentName;
        this.e = i;
        this.f = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abuh)) {
            return false;
        }
        abuh abuhVar = (abuh) obj;
        if (d.B(this.b, abuhVar.b) && d.B(this.c, abuhVar.c) && d.B(this.d, abuhVar.d) && this.e == abuhVar.e && this.f == abuhVar.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, Integer.valueOf(this.e), Boolean.valueOf(this.f)});
    }

    public final String toString() {
        String str = this.b;
        if (str == null) {
            abhg.m(this.d);
            return this.d.flattenToString();
        }
        return str;
    }

    public abuh(String str, String str2, int i, boolean z) {
        abhg.k(str);
        this.b = str;
        abhg.k(str2);
        this.c = str2;
        this.d = null;
        this.e = i;
        this.f = z;
    }
}
