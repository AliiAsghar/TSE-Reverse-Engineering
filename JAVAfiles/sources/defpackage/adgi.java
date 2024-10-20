package defpackage;

import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adgi extends adgd {
    final /* synthetic */ adgp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adgi(adgp adgpVar) {
        super(adgpVar);
        this.b = adgpVar;
    }

    @Override // defpackage.acyi, defpackage.acyh
    public final String a() {
        return "PublishedState";
    }

    @Override // defpackage.adgd, defpackage.acyi, defpackage.acyh
    public final void b() {
        adfk adfkVar;
        super.b();
        if (adgp.P() && (adfkVar = this.b.v) != null) {
            adfkVar.g();
        }
    }

    @Override // defpackage.adgd, defpackage.acyi, defpackage.acyh
    public final void c() {
        if (adgp.P()) {
            this.b.G(acok.ERROR_RESPONSE);
        }
        super.c();
    }

    @Override // defpackage.adgd, defpackage.acyi, defpackage.acyh
    public final boolean e(Message message) {
        int i = message.what;
        if (i != 9) {
            if (i != 10 && i != 17) {
                if (i != 18) {
                    return false;
                }
                this.b.J(message.arg1);
                return true;
            }
            advr.r(this.b.i, "[%s] Publish failed.", "PublishedState");
            adgp adgpVar = this.b;
            adgpVar.w(adgpVar.o);
        }
        return true;
    }
}
