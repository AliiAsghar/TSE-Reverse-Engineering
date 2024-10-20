package defpackage;

import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adhq extends adhd {
    final /* synthetic */ adhw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adhq(adhw adhwVar) {
        super(adhwVar);
        this.b = adhwVar;
    }

    @Override // defpackage.acyi, defpackage.acyh
    public final String a() {
        return "RetryState";
    }

    @Override // defpackage.adhd, defpackage.acyi, defpackage.acyh
    public final void b() {
        super.b();
        adhw adhwVar = this.b;
        adhwVar.F = 0L;
        adhwVar.F(new adhp(this, 0));
    }

    @Override // defpackage.adhd, defpackage.acyi, defpackage.acyh
    public final void c() {
        super.c();
        this.b.z();
        adhw adhwVar = this.b;
        adhwVar.E.a = 0;
        adhwVar.p(15);
    }

    @Override // defpackage.adhd, defpackage.acyi, defpackage.acyh
    public final boolean e(Message message) {
        int i = message.what;
        if (i != 4) {
            if (i != 8) {
                if (i != 15) {
                    return super.e(message);
                }
                advr.d(this.b.m, "Triggering registration retry.", new Object[0]);
                adhw adhwVar = this.b;
                adhwVar.w(adhwVar.U);
                return true;
            }
            this.b.N(message.obj);
            adhw adhwVar2 = this.b;
            adhwVar2.w(adhwVar2.S);
            return true;
        }
        adhw adhwVar3 = this.b;
        advr.d(adhwVar3.m, "Ignore connectivity event. Next retry in %dms", Long.valueOf(adhwVar3.F - agkx.W().longValue()));
        return true;
    }
}
