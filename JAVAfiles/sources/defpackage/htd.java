package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class htd implements hnl {
    private final hqa a = new hqb();

    @Override // defpackage.hnl
    public final /* bridge */ /* synthetic */ hpt a(Object obj, int i, int i2, hnj hnjVar) {
        return c(cok$$ExternalSyntheticApiModelOutline0.m136m(obj), i, i2, hnjVar);
    }

    @Override // defpackage.hnl
    public final /* bridge */ /* synthetic */ boolean b(Object obj, hnj hnjVar) {
        cok$$ExternalSyntheticApiModelOutline0.m136m(obj);
        return true;
    }

    public final hpt c(ImageDecoder.Source source, int i, int i2, hnj hnjVar) {
        Bitmap decodeBitmap;
        decodeBitmap = ImageDecoder.decodeBitmap(source, new hsx(i, i2, hnjVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + decodeBitmap.getWidth() + "x" + decodeBitmap.getHeight() + "] for [" + i + "x" + i2 + "]");
        }
        return new huh(decodeBitmap, this.a, 1);
    }
}
