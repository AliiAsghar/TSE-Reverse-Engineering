package defpackage;

import com.google.android.ims.rcsservice.events.Event;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ikb implements ajoe {
    final /* synthetic */ ikc a;

    public ikb(ikc ikcVar) {
        this.a = ikcVar;
    }

    @Override // defpackage.ajoe
    public final String a() {
        return "RcsCapabilitiesDataService.rcsEventObserver";
    }

    @Override // defpackage.ajoe
    public final void b(Event event) {
        this.a.h();
        this.a.n.q(aktp.ag(null), "rcs_capabilities");
    }
}
