package defpackage;

import android.database.ContentObserver;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aatm extends ContentObserver {
    final /* synthetic */ aatn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aatm(aatn aatnVar) {
        super(null);
        this.a = aatnVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        if (this.a.h.compareAndSet(false, true)) {
            xzw.b(this.a.p(), 150L);
        }
    }
}
