package defpackage;

import android.app.Dialog;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fr extends bw {
    @Override // defpackage.bw
    public Dialog gM(Bundle bundle) {
        return new fq(x(), this.b);
    }

    @Override // defpackage.bw
    public final void o(Dialog dialog, int i) {
        if (dialog instanceof fq) {
            fq fqVar = (fq) dialog;
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                } else {
                    dialog.getWindow().addFlags(24);
                }
            }
            fqVar.f();
            return;
        }
        super.o(dialog, i);
    }
}
