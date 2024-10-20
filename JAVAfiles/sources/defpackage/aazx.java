package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aazx implements akgh<Integer> {
    final /* synthetic */ aazt a;

    public aazx(aazt aaztVar) {
        this.a = aaztVar;
    }

    @Override // defpackage.akgh
    public final void a(Throwable th) {
        aazt.b.r("GetRepromptCountCallback exception", th);
    }

    @Override // defpackage.akgh
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        int intValue;
        Integer num = (Integer) obj;
        if (this.a.r() == 3) {
            intValue = num.intValue() + 1;
        } else {
            intValue = num.intValue();
        }
        aazt aaztVar = this.a;
        if (((Optional) aaztVar.c.getAndSet(Optional.of(Integer.valueOf(intValue)))).isEmpty()) {
            aazt aaztVar2 = this.a;
            if (aaztVar2.d.az()) {
                aaztVar2.k(amlw.RCS_PROVISIONING_MANUAL_MSISDN_ENTRY_SEEN);
            }
        }
    }

    @Override // defpackage.akgh
    public final /* synthetic */ void b() {
    }
}
