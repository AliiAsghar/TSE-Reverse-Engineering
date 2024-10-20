package defpackage;

import android.support.v7.widget.ShareActionProvider;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pe implements jx {
    final /* synthetic */ ShareActionProvider a;

    public pe(ShareActionProvider shareActionProvider) {
        this.a = shareActionProvider;
    }

    @Override // defpackage.jx
    public final void a() {
        pd pdVar = this.a.mOnShareTargetSelectedListener;
        if (pdVar != null) {
            pdVar.a();
        }
    }
}
