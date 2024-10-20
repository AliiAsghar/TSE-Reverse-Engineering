package com.google.android.apps.messaging.ui.conversationlist.fab;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.aais;
import defpackage.aait;
import defpackage.alvg;
import defpackage.alvi;
import defpackage.alvw;
import defpackage.alwp;
import defpackage.dxt;
import defpackage.emq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ConversationListFabBehavior extends dxt<Button> {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/ui/conversationlist/fab/ConversationListFabBehavior");
    private final Object b;
    private Animation c;
    private Animation d;
    private int e;

    public ConversationListFabBehavior() {
        this.b = new Object();
        this.e = -1;
    }

    private final void L(View view) {
        Object obj = this.b;
        int width = view.getWidth();
        synchronized (obj) {
            int i = this.e - width;
            if (i < 0) {
                alvw i2 = a.i();
                i2.X(alwp.a, "Bugle");
                ((alvg) ((alvg) i2).h("com/google/android/apps/messaging/ui/conversationlist/fab/ConversationListFabBehavior", "expand", 112, "ConversationListFabBehavior.java")).q("widthToGrow is negative!");
                return;
            }
            Animation animation = this.d;
            if (animation != null) {
                animation.cancel();
                this.d = null;
            }
            if (this.c != null) {
                return;
            }
            aais aaisVar = new aais(view, width, i);
            this.c = aaisVar;
            aaisVar.setDuration((int) (this.e / view.getContext().getResources().getDisplayMetrics().density));
            this.c.setInterpolator(new emq());
            view.startAnimation(this.c);
        }
    }

    @Override // defpackage.dxt
    public final /* synthetic */ boolean h(View view, View view2) {
        return view2 instanceof RecyclerView;
    }

    @Override // defpackage.dxt
    public final /* bridge */ /* synthetic */ void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Button button = (Button) view;
        if (((RecyclerView) view2).computeVerticalScrollOffset() == 0) {
            L(button);
        }
    }

    @Override // defpackage.dxt
    public final /* bridge */ /* synthetic */ void m(View view, int i) {
        Button button = (Button) view;
        if (i > 10 && button.getVisibility() == 0) {
            synchronized (this.b) {
                if (this.e <= 0) {
                    this.e = button.getMeasuredWidth();
                }
            }
            int width = button.getWidth();
            int measuredHeight = button.getMeasuredHeight();
            int i2 = width - measuredHeight;
            if (i2 < 0) {
                alvw i3 = a.i();
                i3.X(alwp.a, "Bugle");
                ((alvg) ((alvg) i3).h("com/google/android/apps/messaging/ui/conversationlist/fab/ConversationListFabBehavior", "collapse", 165, "ConversationListFabBehavior.java")).q("widthToShrink is negative!");
                return;
            }
            synchronized (this.b) {
                Animation animation = this.c;
                if (animation != null) {
                    animation.cancel();
                    this.c = null;
                }
                if (this.d != null) {
                    return;
                }
                aait aaitVar = new aait(button, measuredHeight, width, i2);
                this.d = aaitVar;
                aaitVar.setDuration((int) (width / button.getContext().getResources().getDisplayMetrics().density));
                this.d.setInterpolator(new emq());
                button.startAnimation(this.d);
                return;
            }
        }
        if (i < -10 && button.getVisibility() == 0) {
            L(button);
        }
    }

    @Override // defpackage.dxt
    public final /* bridge */ /* synthetic */ boolean r(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    public ConversationListFabBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Object();
        this.e = -1;
    }
}
