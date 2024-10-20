package defpackage;

import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adgh extends adgd {
    final /* synthetic */ adgp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adgh(adgp adgpVar) {
        super(adgpVar);
        this.b = adgpVar;
    }

    @Override // defpackage.acyi, defpackage.acyh
    public final String a() {
        return "InitialState";
    }

    @Override // defpackage.adgd, defpackage.acyi, defpackage.acyh
    public final boolean e(Message message) {
        int i = message.what;
        if (i != 3) {
            if (i != 4) {
                return false;
            }
            adgp adgpVar = this.b;
            adgpVar.w(adgpVar.t);
            return true;
        }
        adgp adgpVar2 = this.b;
        adgpVar2.w(adgpVar2.k);
        return true;
    }
}
