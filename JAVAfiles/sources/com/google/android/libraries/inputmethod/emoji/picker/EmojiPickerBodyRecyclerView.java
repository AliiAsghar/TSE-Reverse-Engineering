package com.google.android.libraries.inputmethod.emoji.picker;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.google.android.apps.messaging.R;
import defpackage.alvg;
import defpackage.alvi;
import defpackage.nq;
import defpackage.nw;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class EmojiPickerBodyRecyclerView extends RecyclerView {
    public static final alvi ab = alvi.m("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerBodyRecyclerView");
    public int ac;
    public nq ad;

    public EmojiPickerBodyRecyclerView(Context context) {
        super(context);
    }

    public final void a(boolean z) {
        String name;
        nw nwVar = this.m;
        if (nwVar instanceof EmojiPickerLayoutManager) {
            ((EmojiPickerLayoutManager) nwVar).J = z;
            return;
        }
        if (nwVar == null) {
            name = "null";
        } else {
            name = nwVar.getClass().getName();
        }
        ((alvg) ((alvg) ab.i()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerBodyRecyclerView", "setScrollable", 101, "EmojiPickerBodyRecyclerView.java")).t("Called setScrollable() with %s, but this only works when the LayoutManager of this RecyclerView is an EmojiPickerLayoutManager", name);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (this.D == 1) {
            motionEvent.setAction(3);
        }
        return onTouchEvent;
    }

    public EmojiPickerBodyRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setTag(R.id.default_focus_in_navigation_mode, true);
    }

    public EmojiPickerBodyRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
