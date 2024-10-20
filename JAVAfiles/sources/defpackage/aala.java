package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aala implements DialogInterface.OnClickListener {
    private final /* synthetic */ int a;

    public /* synthetic */ aala(int i) {
        this.a = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.a) {
            case 0:
                dialogInterface.dismiss();
                return;
            case 1:
                dialogInterface.dismiss();
                return;
            case 2:
                dialogInterface.dismiss();
                return;
            case 3:
                dialogInterface.dismiss();
                return;
            case 4:
                return;
            case 5:
                xzb.j("Bugle", "TermsAndConditions: dismissed rejection dialog.");
                dialogInterface.dismiss();
                return;
            case 6:
                dialogInterface.dismiss();
                return;
            case 7:
                return;
            default:
                dialogInterface.dismiss();
                return;
        }
    }
}
