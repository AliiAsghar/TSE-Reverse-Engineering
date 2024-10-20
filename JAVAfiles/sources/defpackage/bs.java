package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bs implements DialogInterface.OnCancelListener {
    final /* synthetic */ bw a;

    public bs(bw bwVar) {
        this.a = bwVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        bw bwVar = this.a;
        Dialog dialog = bwVar.d;
        if (dialog != null) {
            bwVar.onCancel(dialog);
        }
    }
}
