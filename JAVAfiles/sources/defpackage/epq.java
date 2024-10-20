package defpackage;

import android.database.ContentObserver;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class epq extends ContentObserver {
    final /* synthetic */ epr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public epq(epr eprVar) {
        super(new Handler());
        this.a = eprVar;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.j();
    }
}
