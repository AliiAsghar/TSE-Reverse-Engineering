package defpackage;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsx implements ImageDecoder$OnHeaderDecodedListener {
    private final hue a = hue.a();
    private final int b;
    private final int c;
    private final hmw d;
    private final hts e;
    private final boolean f;
    private final hnk g;

    public hsx(int i, int i2, hnj hnjVar) {
        this.b = i;
        this.c = i2;
        this.d = (hmw) hnjVar.b(htv.a);
        this.e = (hts) hnjVar.b(hts.g);
        boolean z = false;
        if (hnjVar.b(htv.d) != null && ((Boolean) hnjVar.b(htv.d)).booleanValue()) {
            z = true;
        }
        this.f = z;
        this.g = (hnk) hnjVar.b(htv.b);
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        Size size;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        ColorSpace.Named named2;
        ColorSpace colorSpace2;
        ColorSpace colorSpace3;
        ColorSpace colorSpace4;
        boolean isWideGamut;
        if (this.a.b(this.b, this.c, this.f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.d == hmw.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new hsw());
        size = imageInfo.getSize();
        int i = this.b;
        if (i == Integer.MIN_VALUE) {
            i = size.getWidth();
        }
        int i2 = this.c;
        if (i2 == Integer.MIN_VALUE) {
            i2 = size.getHeight();
        }
        float a = this.e.a(size.getWidth(), size.getHeight(), i, i2);
        int round = Math.round(size.getWidth() * a);
        int round2 = Math.round(size.getHeight() * a);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + a);
        }
        imageDecoder.setTargetSize(round, round2);
        if (this.g != null) {
            if (Build.VERSION.SDK_INT < 28) {
                named = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(named);
                imageDecoder.setTargetColorSpace(colorSpace);
                return;
            }
            if (this.g == hnk.DISPLAY_P3) {
                colorSpace3 = imageInfo.getColorSpace();
                if (colorSpace3 != null) {
                    colorSpace4 = imageInfo.getColorSpace();
                    isWideGamut = colorSpace4.isWideGamut();
                    if (isWideGamut) {
                        named2 = ColorSpace.Named.DISPLAY_P3;
                        colorSpace2 = ColorSpace.get(named2);
                        imageDecoder.setTargetColorSpace(colorSpace2);
                    }
                }
            }
            named2 = ColorSpace.Named.SRGB;
            colorSpace2 = ColorSpace.get(named2);
            imageDecoder.setTargetColorSpace(colorSpace2);
        }
    }
}
