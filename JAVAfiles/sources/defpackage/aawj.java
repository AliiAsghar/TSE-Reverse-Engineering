package defpackage;

import com.google.android.apps.messaging.ui.mediaviewer.BaseMediaViewerEvent;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerButton;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aawj extends MediaViewerButton {
    public final BaseMediaViewerEvent a;
    private final int b;
    private final int c;
    private final int d;

    public aawj(int i, int i2, int i3, BaseMediaViewerEvent baseMediaViewerEvent) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.a = baseMediaViewerEvent;
    }

    @Override // com.google.android.apps.messaging.ui.mediaviewer.MediaViewerButton
    public final int a() {
        return this.c;
    }

    @Override // com.google.android.apps.messaging.ui.mediaviewer.MediaViewerButton
    public final int b() {
        return this.d;
    }

    @Override // com.google.android.apps.messaging.ui.mediaviewer.MediaViewerButton
    public final int c() {
        return this.b;
    }

    @Override // com.google.android.apps.messaging.ui.mediaviewer.MediaViewerButton
    public final BaseMediaViewerEvent d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MediaViewerButton) {
            MediaViewerButton mediaViewerButton = (MediaViewerButton) obj;
            if (this.b == mediaViewerButton.c() && this.c == mediaViewerButton.a() && this.d == mediaViewerButton.b() && this.a.equals(mediaViewerButton.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.b ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return "MediaViewerButton{titleRes=" + this.b + ", buttonDescriptionRes=" + this.c + ", iconRes=" + this.d + ", event=" + this.a.toString() + "}";
    }
}
