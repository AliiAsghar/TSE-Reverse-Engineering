package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eay extends ebb {
    private static int g(FontStyle fontStyle, FontStyle fontStyle2) {
        int weight;
        int weight2;
        int slant;
        int slant2;
        int i;
        weight = fontStyle.getWeight();
        weight2 = fontStyle2.getWeight();
        int abs = Math.abs(weight - weight2) / 100;
        slant = fontStyle.getSlant();
        slant2 = fontStyle2.getSlant();
        if (slant == slant2) {
            i = 0;
        } else {
            i = 2;
        }
        return abs + i;
    }

    /* JADX WARN: Incorrect condition in loop: B:9:0x0027 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final android.graphics.fonts.Font h(android.graphics.fonts.FontFamily r6, int r7) {
        /*
            r0 = r7 & 1
            android.graphics.fonts.FontStyle r1 = new android.graphics.fonts.FontStyle
            r2 = 1
            if (r2 == r0) goto La
            r0 = 400(0x190, float:5.6E-43)
            goto Lc
        La:
            r0 = 700(0x2bc, float:9.81E-43)
        Lc:
            r7 = r7 & 2
            r3 = 0
            if (r7 == 0) goto L13
            r7 = r2
            goto L14
        L13:
            r7 = r3
        L14:
            r1.<init>(r0, r7)
            android.graphics.fonts.Font r7 = defpackage.coj$$ExternalSyntheticApiModelOutline1.m(r6, r3)
            android.graphics.fonts.FontStyle r0 = defpackage.coj$$ExternalSyntheticApiModelOutline1.m(r7)
            int r0 = g(r1, r0)
        L23:
            int r3 = defpackage.coj$$ExternalSyntheticApiModelOutline1.m(r6)
            if (r2 >= r3) goto L41
            android.graphics.fonts.Font r3 = defpackage.coj$$ExternalSyntheticApiModelOutline1.m(r6, r2)
            android.graphics.fonts.FontStyle r4 = defpackage.coj$$ExternalSyntheticApiModelOutline1.m(r3)
            int r4 = g(r1, r4)
            if (r4 >= r0) goto L39
            r5 = r4
            goto L3a
        L39:
            r5 = r0
        L3a:
            if (r4 >= r0) goto L3d
            r7 = r3
        L3d:
            int r2 = r2 + 1
            r0 = r5
            goto L23
        L41:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eay.h(android.graphics.fonts.FontFamily, int):android.graphics.fonts.Font");
    }

    private static FontFamily i(ebv[] ebvVarArr, ContentResolver contentResolver) {
        FontFamily build;
        Font.Builder weight;
        Font.Builder slant;
        Font.Builder ttcIndex;
        Font build2;
        FontFamily.Builder builder = null;
        for (ebv ebvVar : ebvVarArr) {
            try {
                ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(ebvVar.a, "r", null);
                if (openFileDescriptor != null) {
                    try {
                        weight = new Font.Builder(openFileDescriptor).setWeight(ebvVar.c);
                        slant = weight.setSlant(ebvVar.d ? 1 : 0);
                        ttcIndex = slant.setTtcIndex(ebvVar.b);
                        build2 = ttcIndex.build();
                        if (builder != null) {
                            builder.addFont(build2);
                        } else {
                            builder = new FontFamily.Builder(build2);
                        }
                        openFileDescriptor.close();
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                        break;
                    }
                } else {
                    continue;
                }
            } catch (IOException e) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            }
        }
        if (builder == null) {
            return null;
        }
        build = builder.build();
        return build;
    }

    @Override // defpackage.ebb
    public final Typeface a(Context context, ebv[] ebvVarArr, int i) {
        FontStyle style;
        Typeface.CustomFallbackBuilder style2;
        Typeface build;
        try {
            FontFamily i2 = i(ebvVarArr, context.getContentResolver());
            if (i2 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(i2);
            style = h(i2, i).getStyle();
            style2 = customFallbackBuilder.setStyle(style);
            build = style2.build();
            return build;
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.ebb
    public final Typeface b(Context context, efu efuVar, Resources resources, int i) {
        FontFamily build;
        FontStyle style;
        Typeface.CustomFallbackBuilder style2;
        Typeface build2;
        Font.Builder weight;
        Font.Builder slant;
        Font.Builder ttcIndex;
        Font.Builder fontVariationSettings;
        Font build3;
        try {
            Object obj = efuVar.a;
            int length = ((eai[]) obj).length;
            FontFamily.Builder builder = null;
            for (int i2 = 0; i2 < length; i2++) {
                eai eaiVar = ((eai[]) obj)[i2];
                try {
                    weight = new Font.Builder(resources, eaiVar.f).setWeight(eaiVar.b);
                    slant = weight.setSlant(eaiVar.c ? 1 : 0);
                    ttcIndex = slant.setTtcIndex(eaiVar.e);
                    fontVariationSettings = ttcIndex.setFontVariationSettings(eaiVar.d);
                    build3 = fontVariationSettings.build();
                    if (builder != null) {
                        builder.addFont(build3);
                    } else {
                        builder = new FontFamily.Builder(build3);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            build = builder.build();
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(build);
            style = h(build, i).getStyle();
            style2 = customFallbackBuilder.setStyle(style);
            build2 = style2.build();
            return build2;
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.ebb
    public final Typeface d(Context context, Resources resources, int i, String str, int i2) {
        Font build;
        FontFamily build2;
        FontStyle style;
        Typeface.CustomFallbackBuilder style2;
        Typeface build3;
        try {
            build = new Font.Builder(resources, i).build();
            build2 = new FontFamily.Builder(build).build();
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(build2);
            style = build.getStyle();
            style2 = customFallbackBuilder.setStyle(style);
            build3 = style2.build();
            return build3;
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.ebb
    public final Typeface f(Context context, List list, int i) {
        FontStyle style;
        Typeface.CustomFallbackBuilder style2;
        Typeface build;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily i2 = i((ebv[]) list.get(0), contentResolver);
            if (i2 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(i2);
            for (int i3 = 1; i3 < list.size(); i3++) {
                FontFamily i4 = i((ebv[]) list.get(i3), contentResolver);
                if (i4 != null) {
                    customFallbackBuilder.addCustomFallback(i4);
                }
            }
            style = h(i2, i).getStyle();
            style2 = customFallbackBuilder.setStyle(style);
            build = style2.build();
            return build;
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ebb
    public final Typeface l(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ebb
    public final ebv m(ebv[] ebvVarArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
