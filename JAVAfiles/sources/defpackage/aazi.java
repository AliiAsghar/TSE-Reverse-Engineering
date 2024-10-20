package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aazi implements DialogInterface.OnShowListener {
    private final /* synthetic */ int a;

    public aazi(int i) {
        this.a = i;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        if (this.a != 0) {
            alwo alwoVar = aayi.a;
            dialogInterface.getClass();
            BottomSheetBehavior N = BottomSheetBehavior.N(((Dialog) dialogInterface).findViewById(R.id.design_bottom_sheet));
            N.getClass();
            N.V(3);
            return;
        }
        View findViewById = ((Dialog) dialogInterface).findViewById(R.id.design_bottom_sheet);
        BottomSheetBehavior N2 = BottomSheetBehavior.N(findViewById);
        N2.V(3);
        N2.T(false);
        if (findViewById != null) {
            findViewById.setBackground(findViewById.getContext().getDrawable(R.drawable.fasttrack_bottom_sheet_background));
        }
    }
}
