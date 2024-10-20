package defpackage;

import android.view.Window;
import com.android.vcard.VCardConfig;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class efr extends efq {
    public efr(Window window) {
        super(window);
    }

    @Override // defpackage.eec
    public final void c(boolean z) {
        if (z) {
            k(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS);
            l();
            i(16);
            return;
        }
        j(16);
    }

    @Override // defpackage.eec
    public final boolean e() {
        if ((this.a.getDecorView().getSystemUiVisibility() & 16) != 0) {
            return true;
        }
        return false;
    }
}
