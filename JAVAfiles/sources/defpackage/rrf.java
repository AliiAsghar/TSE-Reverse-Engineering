package defpackage;

import android.database.ContentObserver;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rrf extends ContentObserver {
    final /* synthetic */ rrh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rrf(rrh rrhVar) {
        super(null);
        this.a = rrhVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.b.clear();
    }
}
