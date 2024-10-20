package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.surveys.internal.view.SystemInfoDialogFragment;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajbs extends nq {
    final /* synthetic */ View a;
    final /* synthetic */ SystemInfoDialogFragment b;

    public ajbs(SystemInfoDialogFragment systemInfoDialogFragment, View view) {
        this.a = view;
        this.b = systemInfoDialogFragment;
    }

    @Override // defpackage.nq
    public final void dG(RecyclerView recyclerView, int i, int i2) {
        int i3;
        if (!recyclerView.canScrollVertically(-1)) {
            this.a.findViewById(R.id.survey_system_info_dialog_title).setElevation(brg.a);
        } else {
            this.a.findViewById(R.id.survey_system_info_dialog_title).setElevation(this.b.z().getDimensionPixelSize(R.dimen.survey_system_info_dialog_title_elevation));
        }
        boolean canScrollVertically = recyclerView.canScrollVertically(1);
        View findViewById = this.a.findViewById(R.id.survey_system_info_dialog_section_divider);
        if (true != canScrollVertically) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        findViewById.setVisibility(i3);
    }
}
