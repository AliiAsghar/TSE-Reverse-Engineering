package defpackage;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class egz extends ContentObserver {
    final /* synthetic */ ehb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egz(ehb ehbVar) {
        super(new Handler());
        this.a = ehbVar;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        Cursor cursor;
        ehb ehbVar = this.a;
        if (ehbVar.c && (cursor = ehbVar.d) != null && !cursor.isClosed()) {
            ehbVar.b = ehbVar.d.requery();
        }
    }
}
