package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abqr extends bw {
    public Dialog ag;
    public DialogInterface.OnCancelListener ah;
    private Dialog ai;

    @Override // defpackage.bw
    public final Dialog gM(Bundle bundle) {
        Dialog dialog = this.ag;
        if (dialog == null) {
            this.c = false;
            if (this.ai == null) {
                Context x = x();
                abhg.m(x);
                this.ai = new AlertDialog.Builder(x).create();
            }
            return this.ai;
        }
        return dialog;
    }

    @Override // defpackage.bw, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.ah;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
