package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.rastermill.FrameSequence;
import android.support.rastermill.FrameSequenceDrawable;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ufq extends ufu {
    private static final xze a = xze.g("Bugle", "GifImageResource");
    private FrameSequence b;

    public ufq(String str, FrameSequence frameSequence, xnv xnvVar) {
        super(str, 1, xnvVar);
        this.b = frameSequence;
    }

    public static ufq m(String str, InputStream inputStream, xnv xnvVar) {
        try {
            try {
                FrameSequence decodeStream = FrameSequence.decodeStream(inputStream);
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
                if (decodeStream != null) {
                    return new ufq(str, decodeStream, xnvVar);
                }
                return null;
            } catch (UnsatisfiedLinkError unused2) {
                inputStream.close();
                return null;
            } catch (Throwable th) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
                throw th;
            }
        } catch (IOException unused4) {
            return null;
        }
    }

    @Override // defpackage.ugg
    public final int a() {
        xyl.c("GifImageResource should not be used by a media cache");
        return 0;
    }

    @Override // defpackage.ugg
    protected final void b() {
        o();
        try {
            this.b = null;
        } finally {
            r();
        }
    }

    @Override // defpackage.ufu
    public final Bitmap d() {
        throw new uft();
    }

    @Override // defpackage.ufu
    public final Bitmap e() {
        return null;
    }

    @Override // defpackage.ufu
    public final Drawable f(Resources resources) {
        try {
            FrameSequence frameSequence = this.b;
            frameSequence.getClass();
            return new FrameSequenceDrawable(frameSequence);
        } catch (Throwable th) {
            a.n("Error getting drawable for GIF.", th);
            return null;
        }
    }

    @Override // defpackage.ugg
    public final boolean h() {
        return false;
    }

    @Override // defpackage.ufu
    public final boolean i() {
        return false;
    }

    @Override // defpackage.ufu
    public final byte[] j() {
        throw new uft();
    }
}
