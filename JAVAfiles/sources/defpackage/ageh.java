package defpackage;

import android.R;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ageh extends agej {
    private final int a = R.attr.colorBackground;

    @Override // defpackage.agej
    public final int a(Context context) {
        return ahnz.f(context, R.attr.colorBackground, "HugoColor");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ageh)) {
            return false;
        }
        int i = ((ageh) obj).a;
        return true;
    }

    public final int hashCode() {
        return R.attr.colorBackground;
    }

    public final String toString() {
        return "Attribute(attribute=16842801)";
    }
}
