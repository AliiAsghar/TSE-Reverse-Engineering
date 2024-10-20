package defpackage;

import android.content.IntentFilter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fk extends fj {
    final /* synthetic */ fo a;
    public final kkc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk(fo foVar, kkc kkcVar) {
        super(foVar);
        this.a = foVar;
        this.b = kkcVar;
    }

    @Override // defpackage.fj
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_TICK");
        return intentFilter;
    }

    @Override // defpackage.fj
    public final void b() {
        this.a.o();
    }
}
