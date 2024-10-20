package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agwk {
    public static final alvi a = alvi.m("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerPopupViewController");
    public final Context b;
    public View.OnClickListener c;
    public PopupWindow d;
    public final boolean e;
    public final View.OnClickListener f = new agrb(this, 10);

    public agwk(Context context, boolean z) {
        this.b = context;
        this.e = z;
    }

    public final void a() {
        PopupWindow popupWindow = this.d;
        if (popupWindow != null && popupWindow.isShowing()) {
            this.d.dismiss();
        }
    }
}
