package defpackage;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.TypedValue;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.ui.debug.DebugGServiceKeysItemView;
import com.google.android.apps.messaging.ui.debug.DebugMmsConfigItemView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class klv implements DialogInterface.OnShowListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public klv(LinearLayout linearLayout, Context context, int i) {
        this.c = i;
        this.b = context;
        this.a = linearLayout;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            ((AlertDialog) dialogInterface).getButton(-1).setOnClickListener(new ivq(this.a, (EditText) this.b, dialogInterface, 13));
                            return;
                        } else {
                            ((DebugMmsConfigItemView) this.a).e.requestFocus();
                            ((DebugMmsConfigItemView) this.a).e.selectAll();
                            ((InputMethodManager) ((Context) this.b).getSystemService("input_method")).toggleSoftInput(1, 0);
                            return;
                        }
                    }
                    ((DebugGServiceKeysItemView) this.a).a.requestFocus();
                    ((DebugGServiceKeysItemView) this.a).a.selectAll();
                    ((InputMethodManager) ((Context) this.b).getSystemService("input_method")).toggleSoftInput(1, 0);
                    return;
                }
                ((AlertDialog) dialogInterface).getButton(-1).setOnClickListener(new ivq(this.a, (EditText) this.b, dialogInterface, 12));
                return;
            }
            TextView textView = (TextView) ((fq) this.b).findViewById(R.id.message);
            textView.getClass();
            ahnz.s(textView);
            ahnz.t(textView);
            TypedValue typedValue = new TypedValue();
            ((igz) this.a).a.getResources().getValue(com.google.android.apps.messaging.R.dimen.H1_spacing_multiplier, typedValue, true);
            textView.setLineSpacing(brg.a, typedValue.getFloat());
            return;
        }
        TextView textView2 = (TextView) ((fq) this.b).findViewById(R.id.message);
        textView2.getClass();
        textView2.setPadding(textView2.getPaddingLeft(), ((klu) ((kma) this.a).b.b()).z().getDimensionPixelOffset(com.google.android.apps.messaging.R.dimen.dialog_message_top_padding), textView2.getPaddingRight(), textView2.getPaddingBottom());
    }

    public /* synthetic */ klv(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
