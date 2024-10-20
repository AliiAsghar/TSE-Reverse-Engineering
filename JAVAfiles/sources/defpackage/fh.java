package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fh extends fj {
    public final PowerManager a;
    final /* synthetic */ fo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh(fo foVar, Context context) {
        super(foVar);
        this.b = foVar;
        this.a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // defpackage.fj
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        return intentFilter;
    }

    @Override // defpackage.fj
    public final void b() {
        this.b.o();
    }
}
