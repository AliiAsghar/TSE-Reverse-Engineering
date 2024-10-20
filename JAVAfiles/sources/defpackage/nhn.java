package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class nhn implements View.OnTouchListener {
    private final /* synthetic */ int a;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r7 != 3) goto L35;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            int r0 = r5.a
            r1 = 3
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L5b
            r4 = 2
            if (r0 == r3) goto L3e
            if (r0 == r4) goto L33
            if (r0 == r1) goto L29
            r1 = 4
            if (r0 == r1) goto L12
            return r3
        L12:
            int r0 = r7.getAction()
            if (r0 != 0) goto L1c
            r6.setPressed(r3)
            goto L28
        L1c:
            int r7 = r7.getAction()
            if (r7 != r3) goto L28
            r6.performClick()
            r6.setPressed(r2)
        L28:
            return r2
        L29:
            int r7 = r7.getAction()
            if (r7 != r3) goto L32
            r6.performClick()
        L32:
            return r3
        L33:
            int r7 = r7.getAction()
            if (r7 != r3) goto L3d
            r6.performClick()
            return r3
        L3d:
            return r2
        L3e:
            int r7 = r7.getAction()
            if (r7 == 0) goto L53
            if (r7 == r3) goto L4b
            if (r7 == r4) goto L53
            if (r7 == r1) goto L4b
            goto L5a
        L4b:
            android.view.ViewParent r6 = r6.getParent()
            r6.requestDisallowInterceptTouchEvent(r2)
            goto L5a
        L53:
            android.view.ViewParent r6 = r6.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
        L5a:
            return r2
        L5b:
            int r0 = com.google.android.apps.messaging.shared.audio.attachment.ui.AudioPlaybackSeekBar.h
            int r0 = r7.getAction()
            if (r0 != 0) goto L6b
            android.view.ViewParent r6 = r6.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            goto L7e
        L6b:
            int r0 = r7.getAction()
            if (r0 == r3) goto L77
            int r7 = r7.getAction()
            if (r7 != r1) goto L7e
        L77:
            android.view.ViewParent r6 = r6.getParent()
            r6.requestDisallowInterceptTouchEvent(r2)
        L7e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nhn.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
