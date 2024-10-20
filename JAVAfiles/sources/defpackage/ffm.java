package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ffm {
    public final String a;
    public final boolean b;
    public final boolean c;

    public ffm(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == ffm.class) {
            ffm ffmVar = (ffm) obj;
            if (TextUtils.equals(this.a, ffmVar.a) && this.b == ffmVar.b && this.c == ffmVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() + 31;
        int i2 = 1237;
        if (true != this.b) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i3 = ((hashCode * 31) + i) * 31;
        if (true == this.c) {
            i2 = 1231;
        }
        return i3 + i2;
    }
}
