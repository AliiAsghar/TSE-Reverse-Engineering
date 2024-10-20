package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.inputmethod.emoji.picker.EmojiPickerBodyRecyclerView;
import com.google.android.libraries.inputmethod.emoji.view.EmojiView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class agvv implements View.OnTouchListener, View.OnHoverListener, View.OnClickListener, View.OnLongClickListener {
    final /* synthetic */ agvz a;

    public agvv(agvz agvzVar) {
        this.a = agvzVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        agyx.a(view.getContext()).d(view);
        if (view instanceof EmojiView) {
            agvz agvzVar = this.a;
            agxv agxvVar = ((EmojiView) view).c;
            agvu agvuVar = (agvu) agvzVar.A;
            agvz agvzVar2 = (agvz) agvuVar.a;
            if (agvzVar2.o) {
                alog alogVar = agvzVar2.h;
                for (int i = 0; i < ((alsx) alogVar).c; i++) {
                    ((agvj) alogVar.get(i)).d(aglo.w(agxvVar.b));
                }
            }
            agvr agvrVar = ((agvz) agvuVar.a).y;
            if (agvrVar != null) {
                agvrVar.J(agxvVar, false);
            }
            agvx agvxVar = ((agvz) agvuVar.a).c;
            if (agvxVar != null) {
                agxvVar.getClass();
                String str = agxvVar.b;
                str.getClass();
                ((afpg) ((agvu) agvxVar).a).m.a(str, false);
                return;
            }
            return;
        }
        ((alvg) ((alvg) agvz.a.h()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerController$2", "onClick", 319, "EmojiPickerController.java")).t("Clicked view is not EmojiView: %s", view);
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(final View view) {
        boolean z;
        int i;
        boolean z2;
        agvx agvxVar = this.a.A;
        agvu agvuVar = (agvu) agvxVar;
        if (((agvz) agvuVar.a).c != null) {
            view.getClass();
            z = true;
        } else {
            z = false;
        }
        EmojiView emojiView = (EmojiView) view.findViewById(R.id.emoji_view);
        if (emojiView != null && ((agvz) agvuVar.a).w != null) {
            alog alogVar = emojiView.b;
            if (!alogVar.isEmpty()) {
                agvz agvzVar = (agvz) agvuVar.a;
                agso.a(agvzVar.b).b(R.string.open_popup_content_desc);
                EmojiPickerBodyRecyclerView emojiPickerBodyRecyclerView = agvzVar.w;
                if (emojiPickerBodyRecyclerView != null) {
                    emojiPickerBodyRecyclerView.a(false);
                }
                ((agvz) agvuVar.a).C.a();
                int[] iArr = {0, ((agvz) agvuVar.a).b.getResources().getDisplayMetrics().widthPixels};
                agvz agvzVar2 = (agvz) agvuVar.a;
                final agwk agwkVar = agvzVar2.C;
                EmojiPickerBodyRecyclerView emojiPickerBodyRecyclerView2 = agvzVar2.w;
                final afpq afpqVar = new afpq(agvxVar, 2);
                float f = ((agvz) agvuVar.a).z;
                int width = view.getWidth();
                int height = view.getHeight();
                int i2 = iArr[0];
                int i3 = iArr[1];
                agxv agxvVar = emojiView.c;
                CharSequence charSequence = ((agvz) agvuVar.a).d.g;
                int[] iArr2 = new int[2];
                view.getLocationInWindow(iArr2);
                agwi agwiVar = new agwi(agwkVar.b, alogVar, agwkVar.f, (int) (width * f), (int) (height * f), f, agxvVar);
                View b = eek.b(agwiVar, R.id.emoji_picker_popup_view_holder);
                float f2 = iArr2[0];
                float width2 = view.getWidth();
                float a = agwiVar.a();
                float elevation = b.getElevation();
                float max = Math.max((f2 + ((f * width2) / 2.0f)) - (a / 2.0f), i2 + elevation);
                if (agwiVar.a() + max >= i3) {
                    max = (i3 - agwiVar.a()) - elevation;
                }
                int i4 = iArr2[1];
                int i5 = agwiVar.k;
                if (i5 != 3 && i5 != 4) {
                    i = agwiVar.f;
                } else {
                    i = agwiVar.f + 1;
                }
                int max2 = Math.max(0, i4 - (((((i * agwiVar.g) + agwiVar.c.getPaddingTop()) + agwiVar.c.getPaddingBottom()) + agwiVar.b.getPaddingTop()) + agwiVar.b.getPaddingBottom()));
                Drawable background = b.getBackground();
                if (background == null && (background = agwkVar.b.getDrawable(R.drawable.popup_view_rounded_background)) == null) {
                    background = new ColorDrawable(-7829368);
                }
                b.setElevation(brg.a);
                b.setBackground(null);
                agwkVar.d = new PopupWindow(agwiVar, -2, -2, agwkVar.e);
                agwkVar.d.setTouchable(agwiVar.isEnabled());
                agwkVar.d.setOutsideTouchable(true);
                agwkVar.d.setSoftInputMode(32);
                agwkVar.d.setBackgroundDrawable(background);
                agwkVar.d.setElevation(elevation);
                agwkVar.d.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: agwj
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public final void onDismiss() {
                        afpqVar.onDismiss();
                        agso.a(agwk.this.b).d(view);
                    }
                });
                agwkVar.d.setAnimationStyle(R.style.VariantSelectorPopupAnimation);
                if (!agwkVar.d.isShowing()) {
                    agwkVar.d.showAtLocation(emojiPickerBodyRecyclerView2, 0, (int) max, max2);
                    z2 = true;
                } else {
                    PopupWindow popupWindow = agwkVar.d;
                    z2 = true;
                    popupWindow.update(iArr2[0], iArr2[1], popupWindow.getWidth(), agwkVar.d.getHeight());
                }
                agwiVar.post(new adhc(agwkVar, agwiVar, 18));
                return z2;
            }
        }
        return z;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((agvz) ((agvu) this.a.A).a).c != null) {
            view.getClass();
            motionEvent.getClass();
            return false;
        }
        return false;
    }
}
