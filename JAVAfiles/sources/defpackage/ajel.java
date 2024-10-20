package defpackage;

import android.app.Dialog;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ajel extends fr {
    @Override // defpackage.bw
    public void d() {
        Dialog dialog = this.d;
        if (dialog instanceof ajek) {
            boolean z = ((ajek) dialog).a().t;
        }
        super.d();
    }

    @Override // defpackage.fr, defpackage.bw
    public Dialog gM(Bundle bundle) {
        return new ajek(x(), this.b);
    }
}
