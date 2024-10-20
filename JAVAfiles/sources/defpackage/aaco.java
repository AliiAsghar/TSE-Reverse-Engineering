package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaco implements View.OnLongClickListener, View.OnTouchListener {
    private static final alwo d = alwo.o("BugleLinkify");
    public final View.OnClickListener a;
    public boolean b = false;
    public Runnable c;
    private final View.OnLongClickListener e;
    private final iyh f;
    private final ryg g;

    public aaco(Context context, View.OnLongClickListener onLongClickListener, View.OnClickListener onClickListener, iyh iyhVar) {
        this.e = onLongClickListener;
        this.a = onClickListener;
        this.g = new ryg(context, new aacn(this, iyhVar));
        this.f = iyhVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (((Boolean) aaci.c.e()).booleanValue()) {
            ((alwl) ((alwl) d.g()).h("com/google/android/apps/messaging/ui/conversation/message/ConversationMessageTextController$IgnoreLinkLongClickHelper", "onLongClick", 1151, "ConversationMessageTextController.java")).q("Passing long click to delegate handler");
        }
        return this.e.onLongClick(view);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.g.q(motionEvent);
        int i = 1;
        if (motionEvent.getAction() == 0) {
            this.c = new aaki(this, view, i);
        }
        if (motionEvent.getActionMasked() == 3) {
            this.b = false;
            return false;
        }
        if (this.b) {
            this.b = false;
            if (((Boolean) aaci.c.e()).booleanValue()) {
                ((alwl) ((alwl) d.g()).h("com/google/android/apps/messaging/ui/conversation/message/ConversationMessageTextController$IgnoreLinkLongClickHelper", "onTouch", 1174, "ConversationMessageTextController.java")).q("Long press detected in onTouch, handling it.");
            }
            return onLongClick(view);
        }
        if (!this.f.d()) {
            return true;
        }
        return false;
    }
}
