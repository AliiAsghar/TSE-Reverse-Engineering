package defpackage;

import android.media.MediaCodecList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahjr {
    public final int a;
    public Object b;

    public ahjr() {
        this.a = 3;
    }

    public final void a() {
        if (this.b == null) {
            this.b = new MediaCodecList(this.a).getCodecInfos();
        }
    }

    public ahjr(boolean z, boolean z2) {
        int i = 1;
        if (!z && !z2) {
            i = 0;
        }
        this.a = i;
    }
}
