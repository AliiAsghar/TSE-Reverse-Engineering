package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;
import defpackage.fek;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface ImageOutput {
    public static final ImageOutput a = new fek();

    void a();

    void onImageAvailable(long j, Bitmap bitmap);
}
