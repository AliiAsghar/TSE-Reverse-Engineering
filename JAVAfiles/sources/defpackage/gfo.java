package defpackage;

import android.text.TextUtils;
import androidx.preference.Preference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gfo {
    final int a;
    final int b;
    final String c;

    public gfo(Preference preference) {
        this.c = preference.getClass().getName();
        this.a = preference.y;
        this.b = preference.z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gfo)) {
            return false;
        }
        gfo gfoVar = (gfo) obj;
        if (this.a != gfoVar.a || this.b != gfoVar.b || !TextUtils.equals(this.c, gfoVar.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.a + 527) * 31) + this.b) * 31) + this.c.hashCode();
    }
}
