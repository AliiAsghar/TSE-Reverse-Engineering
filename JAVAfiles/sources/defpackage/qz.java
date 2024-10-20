package defpackage;

import android.window.BackEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qz {
    public final float a;
    private final float b;
    private final float c;
    private final int d;

    public qz(BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        backEvent.getClass();
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        progress = backEvent.getProgress();
        swipeEdge = backEvent.getSwipeEdge();
        this.b = touchX;
        this.c = touchY;
        this.a = progress;
        this.d = swipeEdge;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.b + ", touchY=" + this.c + ", progress=" + this.a + ", swipeEdge=" + this.d + '}';
    }
}
