package defpackage;

import android.os.Message;
import j$.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adhg extends adhd {
    final /* synthetic */ adhw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adhg(adhw adhwVar) {
        super(adhwVar);
        this.b = adhwVar;
    }

    @Override // defpackage.acyi, defpackage.acyh
    public final String a() {
        return "DeregisteredState";
    }

    @Override // defpackage.adhd, defpackage.acyi, defpackage.acyh
    public final void b() {
        super.b();
        adhw adhwVar = this.b;
        advr.d(adhwVar.m, "Deregistered. reason=%s", adhwVar.B);
        this.b.I();
        adhw adhwVar2 = this.b;
        adhwVar2.w = null;
        adhwVar2.u = null;
        this.b.O();
        adhw adhwVar3 = this.b;
        aior aiorVar = adhwVar3.v;
        if (!Objects.isNull(aiorVar)) {
            aiorVar.j(new aios() { // from class: adhb
                @Override // defpackage.aios
                public final void a(String str, Throwable th) {
                    acyz acyzVar = adhw.d;
                }
            });
        }
        adhwVar3.v = null;
        this.b.A();
        this.b.F(new adha(this, 8));
    }

    @Override // defpackage.adhd, defpackage.acyi, defpackage.acyh
    public final boolean e(Message message) {
        if (message.what != 17) {
            return super.e(message);
        }
        this.b.N(acok.SIM_REMOVED);
        adhw adhwVar = this.b;
        adhwVar.w(adhwVar.af);
        return true;
    }
}
