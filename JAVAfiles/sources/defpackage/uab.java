package defpackage;

import android.R;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class uab implements DialogInterface.OnShowListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ uab(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        int dividerHeight;
        switch (this.b) {
            case 0:
                View findViewById = ((fq) this.a).findViewById(R.id.message);
                if (findViewById != null) {
                    ahnz.s((TextView) findViewById);
                    return;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 1:
                utz utzVar = itb.a;
                TextView textView = (TextView) ((fq) this.a).findViewById(R.id.message);
                textView.getClass();
                ahnz.s(textView);
                return;
            case 2:
                View findViewById2 = ((Dialog) dialogInterface).findViewById(com.google.android.apps.messaging.R.id.design_bottom_sheet);
                if (findViewById2 != null) {
                    findViewById2.setBackground(((View) this.a).getContext().getDrawable(com.google.android.apps.messaging.R.drawable.rounded_bottom_sheet));
                    return;
                }
                return;
            case 3:
                ev evVar = ((zhz) this.a).f;
                if (evVar != null) {
                    ListView b = evVar.b();
                    ViewGroup.LayoutParams layoutParams = b.getLayoutParams();
                    if (layoutParams.height != -1 && layoutParams.height != -2) {
                        ListAdapter adapter = b.getAdapter();
                        if (adapter == null) {
                            dividerHeight = -2;
                        } else {
                            int i = 0;
                            for (int i2 = 0; i2 < adapter.getCount(); i2++) {
                                View view = adapter.getView(i2, null, b);
                                if (view != null) {
                                    view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                                    i += view.getMeasuredHeight();
                                }
                            }
                            dividerHeight = i + (b.getDividerHeight() * (adapter.getCount() - 1));
                        }
                        if (dividerHeight < layoutParams.height) {
                            layoutParams.height = -2;
                            b.setLayoutParams(layoutParams);
                            b.setPadding(0, 0, 0, ((zhz) this.a).a.getResources().getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.bugle_settings_vertical_padding));
                            b.requestLayout();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 4:
                alvi alviVar = zkv.a;
                TextView textView2 = (TextView) ((fq) this.a).findViewById(R.id.message);
                textView2.getClass();
                ahnz.s(textView2);
                ahnz.t(textView2);
                return;
            case 5:
                aain aainVar = (aain) this.a;
                ((kor) aainVar.e.b()).i(mgw.b, aainVar.n.get());
                return;
            case 6:
                View findViewById3 = ((Dialog) dialogInterface).findViewById(com.google.android.apps.messaging.R.id.design_bottom_sheet);
                BottomSheetBehavior N = BottomSheetBehavior.N(findViewById3);
                N.V(3);
                N.T(false);
                if (findViewById3 != null) {
                    findViewById3.setBackground(findViewById3.getContext().getDrawable(com.google.android.apps.messaging.R.drawable.fasttrack_bottom_sheet_background));
                    return;
                }
                return;
            case 7:
                AlertDialog alertDialog = (AlertDialog) dialogInterface;
                Button button = alertDialog.getButton(-1);
                Object obj = this.a;
                aaok aaokVar = (aaok) obj;
                int i3 = 1;
                button.setOnClickListener(new akwb((aksr) aaokVar.f.b(), "Clicked Submit", new aafl(obj, 12), i3));
                alertDialog.getButton(-3).setOnClickListener(new akwb((aksr) aaokVar.f.b(), "Clicked refresh status", new aafl(obj, 13), i3));
                return;
            default:
                Dialog dialog = (Dialog) dialogInterface;
                View findViewById4 = dialog.findViewById(com.google.android.apps.messaging.R.id.design_bottom_sheet);
                if (findViewById4 != null) {
                    findViewById4.setBackground(findViewById4.getContext().getDrawable(com.google.android.apps.messaging.R.drawable.bottomsheet_background));
                }
                if (((aazt) this.a).o()) {
                    dialog.findViewById(com.google.android.apps.messaging.R.id.scroll_view).setMinimumHeight(Resources.getSystem().getDisplayMetrics().heightPixels);
                }
                BottomSheetBehavior N2 = BottomSheetBehavior.N(findViewById4);
                N2.V(3);
                N2.v = false;
                ((aazt) this.a).d.r();
                return;
        }
    }

    public uab(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
