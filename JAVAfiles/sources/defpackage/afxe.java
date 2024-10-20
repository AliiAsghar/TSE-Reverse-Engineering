package defpackage;

import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afxe implements agen {
    public final List a;
    public final Integer b;
    private final int c;
    private final boolean d;

    public afxe(List list, Integer num) {
        list.getClass();
        this.a = list;
        this.c = R.drawable.shortcut_icon_shape;
        this.b = num;
        this.d = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afxe)) {
            return false;
        }
        afxe afxeVar = (afxe) obj;
        if (!d.F(this.a, afxeVar.a)) {
            return false;
        }
        int i = afxeVar.c;
        if (!d.F(this.b, afxeVar.b)) {
            return false;
        }
        boolean z = afxeVar.d;
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        Integer num = this.b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return ((((hashCode2 + R.drawable.shortcut_icon_shape) * 31) + hashCode) * 31) + 1237;
    }

    public final String toString() {
        return "ShortcutsConfiguration(shortcuts=" + this.a + ", shapeDrawable=2131232216, backgroundDrawable=" + this.b + ", stretchOnExpand=false)";
    }
}
