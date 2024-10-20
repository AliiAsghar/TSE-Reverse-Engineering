package defpackage;

import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class khr extends arpw implements arqv {
    int a;
    final /* synthetic */ khs b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public khr(khs khsVar, arpe arpeVar) {
        super(2, arpeVar);
        this.b = khsVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((khr) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            Intent putExtra = lqn.g("android.settings.SATELLITE_SETTING").a().putExtra("sub_id", this.b.a.c());
            putExtra.getClass();
            lkd lkdVar = (lkd) this.b.b.b();
            lla llaVar = new lla("launchSatelliteSettings", new sl(), putExtra, null);
            this.a = 1;
            obj = lkdVar.a(llaVar, this);
            if (obj == arplVar) {
                return arplVar;
            }
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new khr(this.b, arpeVar);
    }
}
