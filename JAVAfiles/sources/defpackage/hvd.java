package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hvd implements hnl {
    private static final hgj c = new hgj((byte[]) null, (byte[]) null);
    private final Context a;
    private final List b;
    private final hgj d;
    private final ico e;

    public hvd(Context context, List list, hqa hqaVar, hqh hqhVar) {
        hgj hgjVar = c;
        this.a = context.getApplicationContext();
        this.b = list;
        this.e = new ico(hqaVar, hqhVar);
        this.d = hgjVar;
    }

    @Override // defpackage.hnl
    public final /* bridge */ /* synthetic */ hpt a(Object obj, int i, int i2, hnj hnjVar) {
        boolean z;
        String str;
        int i3;
        hmd hmdVar;
        boolean z2;
        int i4;
        boolean z3;
        String str2;
        hvh hvhVar;
        Bitmap.Config config;
        String str3 = "Decoded GIF from stream in ";
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        hme f = this.d.f(byteBuffer);
        try {
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            try {
                if (f.b != null) {
                    if (f.e()) {
                        hmdVar = f.c;
                        str = "Decoded GIF from stream in ";
                        i3 = 0;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        for (int i5 = 0; i5 < 6; i5++) {
                            sb.append((char) f.a());
                        }
                        if (!sb.toString().startsWith("GIF")) {
                            f.c.b = 1;
                            str = "Decoded GIF from stream in ";
                        } else {
                            f.c.f = f.b();
                            f.c.g = f.b();
                            int a = f.a();
                            hmd hmdVar2 = f.c;
                            if ((a & 128) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            hmdVar2.h = z;
                            str = "Decoded GIF from stream in ";
                            try {
                                hmdVar2.i = (int) Math.pow(2.0d, (a & 7) + 1);
                                f.c.j = f.a();
                                f.c.k = f.a();
                                if (f.c.h && !f.e()) {
                                    hmd hmdVar3 = f.c;
                                    hmdVar3.a = f.f(hmdVar3.i);
                                    hmd hmdVar4 = f.c;
                                    hmdVar4.l = hmdVar4.a[hmdVar4.j];
                                }
                            } catch (Throwable th) {
                                th = th;
                                str3 = str;
                                if (Log.isLoggable("BufferGifDecoder", 2)) {
                                    Log.v("BufferGifDecoder", str3 + hyq.a(elapsedRealtimeNanos));
                                }
                                throw th;
                            }
                        }
                        if (!f.e()) {
                            while (!f.e()) {
                                int i6 = f.c.c;
                                int a2 = f.a();
                                if (a2 != 33) {
                                    if (a2 != 44) {
                                        if (a2 == 59) {
                                            break;
                                        }
                                        f.c.b = 1;
                                    } else {
                                        hmd hmdVar5 = f.c;
                                        if (hmdVar5.d == null) {
                                            hmdVar5.d = new hmc();
                                        }
                                        hmdVar5.d.a = f.b();
                                        f.c.d.b = f.b();
                                        f.c.d.c = f.b();
                                        f.c.d.d = f.b();
                                        int a3 = f.a();
                                        int i7 = a3 & 128;
                                        int pow = (int) Math.pow(2.0d, (a3 & 7) + 1);
                                        hmc hmcVar = f.c.d;
                                        if ((a3 & 64) != 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        hmcVar.e = z2;
                                        if (i7 != 0) {
                                            hmcVar.k = f.f(pow);
                                        } else {
                                            hmcVar.k = null;
                                        }
                                        f.c.d.j = f.b.position();
                                        f.a();
                                        f.d();
                                        if (!f.e()) {
                                            hmd hmdVar6 = f.c;
                                            hmdVar6.c++;
                                            hmdVar6.e.add(hmdVar6.d);
                                        }
                                    }
                                } else {
                                    int a4 = f.a();
                                    if (a4 != 1) {
                                        if (a4 != 249) {
                                            if (a4 != 254) {
                                                if (a4 != 255) {
                                                    f.d();
                                                } else {
                                                    f.c();
                                                    StringBuilder sb2 = new StringBuilder();
                                                    for (int i8 = 0; i8 < 11; i8++) {
                                                        sb2.append((char) f.a[i8]);
                                                    }
                                                    if (sb2.toString().equals("NETSCAPE2.0")) {
                                                        do {
                                                            f.c();
                                                            byte[] bArr = f.a;
                                                            if (bArr[0] == 1) {
                                                                f.c.m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
                                                            }
                                                            if (f.d > 0) {
                                                            }
                                                        } while (!f.e());
                                                    } else {
                                                        f.d();
                                                    }
                                                }
                                            } else {
                                                f.d();
                                            }
                                        } else {
                                            f.c.d = new hmc();
                                            f.a();
                                            int a5 = f.a();
                                            hmc hmcVar2 = f.c.d;
                                            int i9 = (a5 & 28) >> 2;
                                            hmcVar2.g = i9;
                                            if (i9 == 0) {
                                                i4 = 1;
                                                hmcVar2.g = 1;
                                            } else {
                                                i4 = 1;
                                            }
                                            if (i4 != (a5 & 1)) {
                                                z3 = false;
                                            } else {
                                                z3 = true;
                                            }
                                            hmcVar2.f = z3;
                                            int b = f.b();
                                            if (b < 2) {
                                                b = 10;
                                            }
                                            hmc hmcVar3 = f.c.d;
                                            hmcVar3.i = b * 10;
                                            hmcVar3.h = f.a();
                                            f.a();
                                        }
                                    } else {
                                        f.d();
                                    }
                                }
                            }
                            i3 = 0;
                            hmd hmdVar7 = f.c;
                            if (hmdVar7.c < 0) {
                                hmdVar7.b = 1;
                            }
                        } else {
                            i3 = 0;
                        }
                        hmdVar = f.c;
                    }
                    if (hmdVar.c > 0 && hmdVar.b == 0) {
                        if (hnjVar.b(hvm.a) == hmw.PREFER_RGB_565) {
                            config = Bitmap.Config.RGB_565;
                        } else {
                            config = Bitmap.Config.ARGB_8888;
                        }
                        int min = Math.min(hmdVar.g / i2, hmdVar.f / i);
                        if (min != 0) {
                            i3 = Integer.highestOneBit(min);
                        }
                        int max = Math.max(1, i3);
                        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
                            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i + "x" + i2 + "], actual dimens: [" + hmdVar.f + "x" + hmdVar.g + "]");
                        }
                        hmf hmfVar = new hmf(this.e, hmdVar, byteBuffer, max);
                        if (config != Bitmap.Config.ARGB_8888 && config != Bitmap.Config.RGB_565) {
                            throw new IllegalArgumentException("Unsupported format: " + String.valueOf(config) + ", must be one of " + String.valueOf(Bitmap.Config.ARGB_8888) + " or " + String.valueOf(Bitmap.Config.RGB_565));
                        }
                        hmfVar.i = config;
                        hmfVar.b();
                        Bitmap a6 = hmfVar.a();
                        if (a6 == null) {
                            if (Log.isLoggable("BufferGifDecoder", 2)) {
                                str2 = str + hyq.a(elapsedRealtimeNanos);
                                Log.v("BufferGifDecoder", str2);
                            }
                            hvhVar = null;
                            return hvhVar;
                        }
                        String str4 = str;
                        hvhVar = new hvh(new hvf(new hve(new hvl(hkz.b(this.a), hmfVar, i, i2, hsz.b, a6))));
                        if (Log.isLoggable("BufferGifDecoder", 2)) {
                            Log.v("BufferGifDecoder", str4 + hyq.a(elapsedRealtimeNanos));
                        }
                        return hvhVar;
                    }
                    String str5 = str;
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        str2 = str5 + hyq.a(elapsedRealtimeNanos);
                        Log.v("BufferGifDecoder", str2);
                    }
                    hvhVar = null;
                    return hvhVar;
                }
                throw new IllegalStateException("You must call setData() before parseHeader()");
            } catch (Throwable th2) {
                th = th2;
            }
        } finally {
            this.d.g(f);
        }
    }

    @Override // defpackage.hnl
    public final /* bridge */ /* synthetic */ boolean b(Object obj, hnj hnjVar) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (!((Boolean) hnjVar.b(hvm.b)).booleanValue() && hlc.k(this.b, byteBuffer) == ImageHeaderParser.ImageType.GIF) {
            return true;
        }
        return false;
    }
}
