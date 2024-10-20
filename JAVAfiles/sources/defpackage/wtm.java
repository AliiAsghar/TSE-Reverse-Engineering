package defpackage;

import android.hardware.display.DisplayManager;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wtm {
    public final DisplayManager.DisplayListener a;
    public final Consumer b;

    public wtm() {
        this(null, 0 == true ? 1 : 0, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wtm)) {
            return false;
        }
        wtm wtmVar = (wtm) obj;
        if (d.F(this.a, wtmVar.a) && d.F(this.b, wtmVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        DisplayManager.DisplayListener displayListener = this.a;
        int i = 0;
        if (displayListener == null) {
            hashCode = 0;
        } else {
            hashCode = displayListener.hashCode();
        }
        Consumer consumer = this.b;
        if (consumer != null) {
            i = consumer.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        return "RecordingCallbacks(displayListener=" + this.a + ", consumer=" + this.b + ")";
    }

    public /* synthetic */ wtm(DisplayManager.DisplayListener displayListener, Consumer consumer, int i) {
        this.a = 1 == (i & 1) ? null : displayListener;
        this.b = (i & 2) != 0 ? null : consumer;
    }
}
