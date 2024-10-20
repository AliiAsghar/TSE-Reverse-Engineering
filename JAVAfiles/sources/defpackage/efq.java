package defpackage;

import android.view.Window;
import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
class efq extends efp {
    public efq(Window window) {
        super(window);
    }

    @Override // defpackage.eec
    public final void d(boolean z) {
        if (z) {
            k(VCardConfig.FLAG_APPEND_TYPE_PARAM);
            l();
            i(8192);
            return;
        }
        j(8192);
    }

    @Override // defpackage.eec
    public final boolean f() {
        if ((this.a.getDecorView().getSystemUiVisibility() & 8192) != 0) {
            return true;
        }
        return false;
    }
}
