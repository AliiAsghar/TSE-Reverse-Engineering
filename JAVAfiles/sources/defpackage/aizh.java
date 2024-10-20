package defpackage;

import android.os.CountDownTimer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aizh extends CountDownTimer {
    final /* synthetic */ apqf a;
    final /* synthetic */ aizi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aizh(aizi aiziVar, long j, apqf apqfVar) {
        super(j, 100L);
        this.a = apqfVar;
        this.b = aiziVar;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        aizi aiziVar = this.b;
        aiziVar.e.c(aiziVar.b(this.a));
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }
}
