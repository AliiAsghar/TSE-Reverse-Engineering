package defpackage;

import android.os.Message;

/* compiled from: PG */
/* loaded from: classes.dex */
class adgd extends acyi {
    final /* synthetic */ adgp a;

    public adgd(adgp adgpVar) {
        this.a = adgpVar;
    }

    @Override // defpackage.acyi, defpackage.acyh
    public void b() {
        advr.l(this.a.i, "Enter %s", a());
    }

    @Override // defpackage.acyi, defpackage.acyh
    public void c() {
        advr.l(this.a.i, "Exit %s", a());
        this.a.p(101);
    }

    @Override // defpackage.acyi, defpackage.acyh
    public boolean e(Message message) {
        if (message.what == 101) {
            if (message.obj instanceof Runnable) {
                ((Runnable) message.obj).run();
            }
            return true;
        }
        advr.d(this.a.i, "[%s] Unexpected event %d", a(), Integer.valueOf(message.what));
        return false;
    }
}
