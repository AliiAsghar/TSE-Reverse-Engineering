package defpackage;

import android.media.MediaCodec;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ffr implements ffc {
    private final MediaCodec a;

    public ffr(MediaCodec mediaCodec) {
        this.a = mediaCodec;
    }

    @Override // defpackage.ffc
    public final void c(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override // defpackage.ffc
    public final void f(int i, int i2, long j, int i3) {
        this.a.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.ffc
    public final void g(int i, ewh ewhVar, long j) {
        this.a.queueSecureInputBuffer(i, 0, ewhVar.i, j, 0);
    }

    @Override // defpackage.ffc
    public final void a() {
    }

    @Override // defpackage.ffc
    public final void b() {
    }

    @Override // defpackage.ffc
    public final void d() {
    }

    @Override // defpackage.ffc
    public final void e() {
    }
}
