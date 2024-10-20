package defpackage;

import android.widget.PopupWindow;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.inputmethod.emoji.picker.EmojiPickerBodyRecyclerView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class afpq implements PopupWindow.OnDismissListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public afpq(it itVar, int i) {
        this.b = i;
        this.a = itVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                agvz agvzVar = (agvz) ((agvu) this.a).a;
                agso.a(agvzVar.b).b(R.string.close_popup_content_desc);
                EmojiPickerBodyRecyclerView emojiPickerBodyRecyclerView = agvzVar.w;
                if (emojiPickerBodyRecyclerView != null) {
                    emojiPickerBodyRecyclerView.a(true);
                    return;
                }
                return;
            }
            ((it) this.a).c();
            return;
        }
        afpr afprVar = (afpr) this.a;
        afprVar.d.cancel();
        afprVar.e.cancel();
        afprVar.e.start();
        afprVar.c = null;
    }

    public /* synthetic */ afpq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
