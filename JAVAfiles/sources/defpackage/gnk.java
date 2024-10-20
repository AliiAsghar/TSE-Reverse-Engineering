package defpackage;

import android.database.DataSetObserver;
import androidx.viewpager.widget.ViewPager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gnk extends DataSetObserver {
    final /* synthetic */ ViewPager a;

    public gnk(ViewPager viewPager) {
        this.a = viewPager;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.a.e();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.e();
    }
}
