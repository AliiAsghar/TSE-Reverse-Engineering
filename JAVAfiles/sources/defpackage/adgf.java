package defpackage;

import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adgf extends adgd {
    final /* synthetic */ adgp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adgf(adgp adgpVar) {
        super(adgpVar);
        this.b = adgpVar;
    }

    @Override // defpackage.acyi, defpackage.acyh
    public final String a() {
        return "DeregisteringState";
    }

    @Override // defpackage.adgd, defpackage.acyi, defpackage.acyh
    public final void b() {
        super.b();
        adgp adgpVar = this.b;
        adfk adfkVar = adgpVar.v;
        if (adfkVar != null) {
            adfkVar.h(acok.DISABLED);
        }
        adgpVar.w(adgpVar.t);
    }

    @Override // defpackage.adgd, defpackage.acyi, defpackage.acyh
    public final boolean e(Message message) {
        return true;
    }
}
