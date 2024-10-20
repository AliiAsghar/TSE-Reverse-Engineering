package defpackage;

import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adhj extends adhd {
    final /* synthetic */ adhw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adhj(adhw adhwVar) {
        super(adhwVar);
        this.b = adhwVar;
    }

    @Override // defpackage.acyi, defpackage.acyh
    public final String a() {
        return "ReadyState";
    }

    @Override // defpackage.adhd, defpackage.acyi, defpackage.acyh
    public final void b() {
        super.b();
        this.b.F(new adha(this, 10));
    }

    @Override // defpackage.adhd, defpackage.acyi, defpackage.acyh
    public final boolean e(Message message) {
        int i = message.what;
        if (i != 8) {
            if (i != 17) {
                return super.e(message);
            }
            this.b.N(acok.SIM_REMOVED);
            adhw adhwVar = this.b;
            adhwVar.w(adhwVar.af);
            return true;
        }
        this.b.N(message.obj);
        adhw adhwVar2 = this.b;
        adhwVar2.w(adhwVar2.S);
        return true;
    }
}
