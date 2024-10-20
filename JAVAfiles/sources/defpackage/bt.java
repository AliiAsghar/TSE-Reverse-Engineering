package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bt implements DialogInterface.OnDismissListener {
    final /* synthetic */ bw a;

    public bt(bw bwVar) {
        this.a = bwVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        bw bwVar = this.a;
        Dialog dialog = bwVar.d;
        if (dialog != null) {
            bwVar.onDismiss(dialog);
        }
    }
}
