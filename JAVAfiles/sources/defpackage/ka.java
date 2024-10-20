package defpackage;

import android.database.DataSetObserver;
import android.support.v7.widget.ActivityChooserView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ka extends DataSetObserver {
    final /* synthetic */ ActivityChooserView a;

    public ka(ActivityChooserView activityChooserView) {
        this.a = activityChooserView;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        super.onChanged();
        this.a.a.notifyDataSetChanged();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        super.onInvalidated();
        this.a.a.notifyDataSetInvalidated();
    }
}
