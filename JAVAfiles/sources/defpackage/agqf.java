package defpackage;

import com.google.mediapipe.framework.TextureFrame;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agqf implements aoxl {
    public aoxl a;
    long b = Long.MAX_VALUE;

    @Override // defpackage.aoxl
    public final void a(TextureFrame textureFrame) {
        aoxl aoxlVar = this.a;
        if (aoxlVar == null) {
            textureFrame.release();
            return;
        }
        long nanoTime = System.nanoTime() / 1000;
        long j = ((aoxm) textureFrame).e;
        long min = Math.min(this.b, nanoTime - j);
        this.b = min;
        aoxlVar.a(new agqg(textureFrame, j + min));
    }
}
