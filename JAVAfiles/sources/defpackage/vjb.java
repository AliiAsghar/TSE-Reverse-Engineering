package defpackage;

import android.app.Notification;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vjb extends vhr {
    private final vja a;

    public vjb(vjs vjsVar, vja vjaVar, vhu vhuVar, String str, vin vinVar) {
        super(vjsVar.o(vhuVar, str, vinVar));
        this.a = new viz(vjaVar);
    }

    @Override // defpackage.vhr, defpackage.vhv
    public final Notification b() {
        return this.a.a(g());
    }
}
