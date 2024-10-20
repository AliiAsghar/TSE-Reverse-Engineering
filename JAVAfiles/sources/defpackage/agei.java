package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agei extends agej {
    public final int a;

    public agei(int i) {
        this.a = i;
    }

    @Override // defpackage.agej
    public final int a(Context context) {
        return context.getColor(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof agei) && this.a == ((agei) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "Resource(resource=" + this.a + ")";
    }
}
