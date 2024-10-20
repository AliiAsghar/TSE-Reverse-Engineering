package defpackage;

import android.database.DataSetObserver;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajmh extends DataSetObserver {
    final /* synthetic */ TabLayout a;

    public ajmh(TabLayout tabLayout) {
        this.a = tabLayout;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.a.j();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.j();
    }
}
