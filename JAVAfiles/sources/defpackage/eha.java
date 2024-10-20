package defpackage;

import android.database.DataSetObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eha extends DataSetObserver {
    final /* synthetic */ ehb a;

    public eha(ehb ehbVar) {
        this.a = ehbVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        ehb ehbVar = this.a;
        ehbVar.b = true;
        ehbVar.notifyDataSetChanged();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        ehb ehbVar = this.a;
        ehbVar.b = false;
        ehbVar.notifyDataSetInvalidated();
    }
}
