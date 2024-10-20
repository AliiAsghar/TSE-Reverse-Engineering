package defpackage;

import com.google.android.apps.messaging.ui.mediaviewer.BaseMediaViewerEvent;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aawz {
    private int a;
    private int b;
    private int c;
    private BaseMediaViewerEvent d;
    private byte e;

    public final MediaViewerButton a() {
        BaseMediaViewerEvent baseMediaViewerEvent;
        if (this.e == 7 && (baseMediaViewerEvent = this.d) != null) {
            return new aawj(this.a, this.b, this.c, baseMediaViewerEvent);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.e & 1) == 0) {
            sb.append(" titleRes");
        }
        if ((this.e & 2) == 0) {
            sb.append(" buttonDescriptionRes");
        }
        if ((this.e & 4) == 0) {
            sb.append(" iconRes");
        }
        if (this.d == null) {
            sb.append(" event");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.b = i;
        this.e = (byte) (this.e | 2);
    }

    public final void c(BaseMediaViewerEvent baseMediaViewerEvent) {
        if (baseMediaViewerEvent != null) {
            this.d = baseMediaViewerEvent;
            return;
        }
        throw new NullPointerException("Null event");
    }

    public final void d(int i) {
        this.c = i;
        this.e = (byte) (this.e | 4);
    }

    public final void e(int i) {
        this.a = i;
        this.e = (byte) (this.e | 1);
    }
}
