package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gex implements DialogInterface.OnMultiChoiceClickListener {
    final /* synthetic */ gey a;

    public gex(gey geyVar) {
        this.a = geyVar;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        gey geyVar = this.a;
        if (z) {
            geyVar.ah = geyVar.ag.add(geyVar.aj[i].toString()) | geyVar.ah;
        } else {
            geyVar.ah = geyVar.ag.remove(geyVar.aj[i].toString()) | geyVar.ah;
        }
    }
}
