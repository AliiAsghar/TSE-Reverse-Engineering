package defpackage;

import android.os.Bundle;
import android.os.Message;
import j$.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public class adhd extends acyi {
    final /* synthetic */ adhw a;

    public adhd(adhw adhwVar) {
        this.a = adhwVar;
    }

    @Override // defpackage.acyi, defpackage.acyh
    public void b() {
        advr.l(this.a.m, "Enter %s", a());
    }

    @Override // defpackage.acyi, defpackage.acyh
    public void c() {
        advr.l(this.a.m, "Exit %s", a());
        this.a.p(101);
    }

    @Override // defpackage.acyi, defpackage.acyh
    public boolean e(Message message) {
        String message2;
        int i = message.what;
        if (i != 5) {
            if (i != 7) {
                if (i != 101) {
                    advr.d(this.a.m, "[%s] Unexpected event %d", a(), Integer.valueOf(message.what));
                    return false;
                }
                if (message.obj instanceof Runnable) {
                    ((Runnable) message.obj).run();
                }
            } else {
                advr.d(this.a.m, "Registration is already in progress.", new Object[0]);
                if (((Boolean) adhw.i.a()).booleanValue()) {
                    this.a.N(acok.UNKNOWN);
                }
            }
            return true;
        }
        Bundle bundle = (Bundle) message.obj;
        Throwable th = (Throwable) bundle.getSerializable("transport_error_cause");
        String string = bundle.getString("transport_id");
        adhw adhwVar = this.a;
        if (Objects.isNull(th)) {
            message2 = "";
        } else {
            message2 = th.getMessage();
        }
        advr.r(adhwVar.m, "Unexpected transport error from transport %s. %s", string, message2);
        return false;
    }

    public final int f() {
        adey adeyVar = this.a.u;
        if (adeyVar == null) {
            return 8;
        }
        return adeyVar.l;
    }
}
