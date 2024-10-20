package com.bumptech.glide.load;

import defpackage.hqh;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface ImageHeaderParser {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        ANIMATED_WEBP(true),
        AVIF(true),
        ANIMATED_AVIF(true),
        UNKNOWN(false);

        private final boolean a;

        ImageType(boolean z) {
            this.a = z;
        }

        public boolean hasAlpha() {
            return this.a;
        }

        public boolean isWebp() {
            int ordinal = ordinal();
            if (ordinal != 5 && ordinal != 6 && ordinal != 7) {
                return false;
            }
            return true;
        }
    }

    ImageType a(InputStream inputStream);

    ImageType b(ByteBuffer byteBuffer);

    int c(InputStream inputStream, hqh hqhVar);

    int d(ByteBuffer byteBuffer, hqh hqhVar);
}
