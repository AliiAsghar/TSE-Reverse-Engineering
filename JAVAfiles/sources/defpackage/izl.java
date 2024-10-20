package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class izl extends iza {
    int a = 0;
    private int b;
    private int c;

    @Override // defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.info_and_options_page_options_tab_fragment, viewGroup, false);
        this.b = x().getResources().getDimensionPixelSize(R.dimen.info_and_options_setting_item_min_height);
        this.c = x().getResources().getDimensionPixelSize(R.dimen.info_and_options_setting_item_vertical_margin);
        this.a = 0;
        e(inflate, false);
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(android.view.View r18, boolean r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            if (r1 == 0) goto Ld8
            izh r2 = r0.e
            if (r2 == 0) goto Ld8
            iyq r2 = r2.a()
            if (r2 != 0) goto L12
            goto Ld8
        L12:
            r2 = 2131428342(0x7f0b03f6, float:1.8478326E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r3 = 2131428341(0x7f0b03f5, float:1.8478324E38)
            android.view.View r1 = r1.findViewById(r3)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            izh r3 = r0.e
            iyq r3 = r3.a()
            alog r4 = r3.m()
            r5 = 1
            r6 = 0
            if (r19 == 0) goto L62
            int r7 = r2.getChildCount()
            int r8 = r1.getChildCount()
            if (r7 == 0) goto L62
            if (r8 != 0) goto L3f
            goto L62
        L3f:
            int r9 = r4.size()
            r10 = r6
            r11 = r10
            r12 = r11
        L46:
            if (r10 >= r9) goto L5c
            java.lang.Object r13 = r4.get(r10)
            rse r13 = (defpackage.rse) r13
            boolean r13 = defpackage.rse.b(r13)
            if (r13 == 0) goto L57
            int r11 = r11 + 1
            goto L59
        L57:
            int r12 = r12 + 1
        L59:
            int r10 = r10 + 1
            goto L46
        L5c:
            if (r7 != r11) goto L62
            if (r8 != r12) goto L62
            r7 = r5
            goto L63
        L62:
            r7 = r6
        L63:
            if (r7 != 0) goto L6b
            r2.removeAllViews()
            r1.removeAllViews()
        L6b:
            r8 = r6
            r9 = r8
            r10 = r9
        L6e:
            int r11 = r4.size()
            if (r8 >= r11) goto Ld8
            java.lang.Object r11 = r4.get(r8)
            rse r11 = (defpackage.rse) r11
            boolean r11 = defpackage.rse.b(r11)
            if (r11 == 0) goto L8a
            int r11 = r10 + 1
            r12 = r2
            r16 = r11
            r11 = r9
            r9 = r10
            r10 = r16
            goto L8d
        L8a:
            int r11 = r9 + 1
            r12 = r1
        L8d:
            if (r7 == 0) goto L96
            android.view.View r9 = r12.getChildAt(r9)
            com.google.android.apps.messaging.conversation.settings.ConversationSettingsOptionItemView r9 = (com.google.android.apps.messaging.conversation.settings.ConversationSettingsOptionItemView) r9
            goto Lac
        L96:
            cj r9 = r17.fe()
            android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r9)
            r13 = 2131624139(0x7f0e00cb, float:1.887545E38)
            android.view.View r9 = r9.inflate(r13, r12, r6)
            com.google.android.apps.messaging.conversation.settings.ConversationSettingsOptionItemView r9 = (com.google.android.apps.messaging.conversation.settings.ConversationSettingsOptionItemView) r9
            int r13 = r0.a
            int r13 = r13 + r5
            r0.a = r13
        Lac:
            r3.G(r9, r8)
            int r13 = r0.b
            r9.measure(r6, r6)
            int r14 = r9.getMeasuredHeight()
            if (r14 <= r13) goto Lbb
            r13 = r14
        Lbb:
            android.view.ViewGroup$LayoutParams r15 = r9.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r15 = (android.view.ViewGroup.MarginLayoutParams) r15
            r15.height = r13
            int r13 = r13 - r14
            int r14 = r0.c
            int r13 = r13 / 2
            int r14 = r14 - r13
            if (r14 <= 0) goto Lcf
            r15.topMargin = r14
            r15.bottomMargin = r14
        Lcf:
            if (r7 != 0) goto Ld4
            r12.addView(r9)
        Ld4:
            int r8 = r8 + 1
            r9 = r11
            goto L6e
        Ld8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.izl.e(android.view.View, boolean):void");
    }
}
