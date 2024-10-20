package defpackage;

import com.google.mediapipe.framework.GlSyncToken;
import com.google.mediapipe.framework.TextureFrame;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agqg implements TextureFrame {
    private final long a;
    private final TextureFrame b;

    public agqg(TextureFrame textureFrame, long j) {
        this.b = textureFrame;
        this.a = j;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final int getHeight() {
        return ((aoxm) this.b).d;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final int getTextureName() {
        return ((aoxm) this.b).b;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final long getTimestamp() {
        return this.a;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final int getWidth() {
        return ((aoxm) this.b).c;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final void release() {
        this.b.release();
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final /* synthetic */ void retain() {
        aovn.c();
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final /* synthetic */ boolean supportsRetain() {
        return false;
    }

    @Override // com.google.mediapipe.framework.TextureFrame, com.google.mediapipe.framework.TextureReleaseCallback
    public final void release(GlSyncToken glSyncToken) {
        this.b.release(glSyncToken);
    }
}
