package defpackage;

import android.database.sqlite.SQLiteTransactionListener;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aixb implements SQLiteTransactionListener {
    final /* synthetic */ aixc a;

    public aixb(aixc aixcVar) {
        this.a = aixcVar;
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public final void onRollback() {
        if (this.a.a) {
        } else {
            throw new aixq();
        }
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public final void onBegin() {
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public final void onCommit() {
    }
}
