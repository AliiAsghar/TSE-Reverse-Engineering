package com.google.android.setupdesign.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.ajvp;
import defpackage.ajwj;
import defpackage.no;
import defpackage.nw;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class HeaderRecyclerView extends RecyclerView {
    public View ab;
    private int ac;
    private boolean ad;

    public HeaderRecyclerView(Context context) {
        super(context);
        this.ad = false;
        a((AttributeSet) null, 0);
    }

    private final void a(AttributeSet attributeSet, int i) {
        if (isInEditMode()) {
            return;
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, ajvp.g, i, 0);
        this.ac = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void ag(no noVar) {
        if (this.ab != null && noVar != null) {
            ajwj ajwjVar = new ajwj(noVar);
            ajwjVar.c = this.ab;
            noVar = ajwjVar;
        }
        super.ag(noVar);
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void aj(nw nwVar) {
        super.aj(nwVar);
        if (nwVar != null && this.ab == null && this.ac != 0) {
            this.ab = LayoutInflater.from(getContext()).inflate(this.ac, (ViewGroup) this, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
    
        if (r1 != false) goto L30;
     */
    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = r5.ad
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L10
            int r0 = r6.getAction()
            if (r0 != r2) goto L10
            r5.ad = r1
            goto L87
        L10:
            int r0 = r6.getAction()
            if (r0 != 0) goto L88
            int r0 = r6.getKeyCode()
            r3 = 19
            r4 = 2
            if (r0 == r3) goto L58
            r3 = 20
            if (r0 == r3) goto L24
            goto L82
        L24:
            android.view.View r0 = r5.findFocus()
            if (r0 != 0) goto L2b
            goto L82
        L2b:
            int[] r3 = new int[r4]
            int[] r4 = new int[r4]
            r0.getLocationInWindow(r3)
            r5.getLocationInWindow(r4)
            r3 = r3[r2]
            int r0 = r0.getMeasuredHeight()
            int r3 = r3 + r0
            r0 = r4[r2]
            int r4 = r5.getMeasuredHeight()
            int r0 = r0 + r4
            int r3 = r3 - r0
            if (r3 <= 0) goto L82
            int r0 = r5.getMeasuredHeight()
            float r0 = (float) r0
            r4 = 1060320051(0x3f333333, float:0.7)
            float r0 = r0 * r4
            int r0 = (int) r0
            int r0 = java.lang.Math.min(r0, r3)
            r5.am(r1, r0)
            goto L81
        L58:
            android.view.View r0 = r5.findFocus()
            if (r0 != 0) goto L5f
            goto L82
        L5f:
            int[] r3 = new int[r4]
            int[] r4 = new int[r4]
            r0.getLocationInWindow(r3)
            r5.getLocationInWindow(r4)
            r0 = r3[r2]
            r3 = r4[r2]
            int r0 = r0 - r3
            if (r0 >= 0) goto L82
            int r3 = r5.getMeasuredHeight()
            float r3 = (float) r3
            r4 = -1087163597(0xffffffffbf333333, float:-0.7)
            float r3 = r3 * r4
            int r3 = (int) r3
            int r0 = java.lang.Math.max(r3, r0)
            r5.am(r1, r0)
        L81:
            r1 = r2
        L82:
            r5.ad = r1
            if (r1 != 0) goto L87
            goto L88
        L87:
            return r2
        L88:
            boolean r6 = super.dispatchKeyEvent(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.setupdesign.view.HeaderRecyclerView.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int i;
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (this.ab != null) {
            i = 1;
        } else {
            i = 0;
        }
        accessibilityEvent.setItemCount(accessibilityEvent.getItemCount() - i);
        accessibilityEvent.setFromIndex(Math.max(accessibilityEvent.getFromIndex() - i, 0));
        accessibilityEvent.setToIndex(Math.max(accessibilityEvent.getToIndex() - i, 0));
    }

    public HeaderRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ad = false;
        a(attributeSet, 0);
    }

    public HeaderRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ad = false;
        a(attributeSet, i);
    }
}
