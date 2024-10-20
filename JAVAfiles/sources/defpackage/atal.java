package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.drm.DrmConvertedStatus;
import android.drm.DrmManagerClient;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.setupcompat.ISetupCompatService;
import io.grpc.Status;
import j$.time.Duration;
import j$.util.DesugarArrays;
import j$.util.stream.Collectors;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atal {
    public static atal c;
    public final int a;
    public final Object b;

    private atal(int i, Status status) {
        this.a = i;
        this.b = status;
    }

    public static atal c(int i, Status status) {
        if (i != 4) {
            i = 5;
        }
        albo.T(true);
        status.getClass();
        return new atal(i, status);
    }

    public static atal d(int i) {
        albo.T(true);
        return new atal(i, (Status) null);
    }

    public static void e(ByteBuffer byteBuffer, String str, int i) {
        byteBuffer.put(aiin.c);
        byteBuffer.put(str.getBytes());
        byteBuffer.put((byte) i);
        byteBuffer.put(aiin.b);
    }

    public static void f(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        byteBuffer.put(bArr);
        byteBuffer.put(aiin.e);
        byteBuffer.put(bArr2);
        byteBuffer.put(aiin.b);
    }

    public static void g(ByteBuffer byteBuffer, String str, String str2) {
        byteBuffer.put(aiin.a);
        byteBuffer.put((byte) 32);
        byteBuffer.put(str.getBytes());
        byteBuffer.put((byte) 32);
        byteBuffer.put(str2.getBytes());
        byteBuffer.put(aiin.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003c A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.drm.DrmManagerClient] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.atal t(android.content.Context r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "DrmConvertSession"
            r1 = 0
            r2 = -1
            if (r6 == 0) goto L39
            boolean r3 = r7.isEmpty()
            if (r3 != 0) goto L39
            android.drm.DrmManagerClient r3 = new android.drm.DrmManagerClient     // Catch: java.lang.IllegalStateException -> L2b java.lang.IllegalArgumentException -> L32
            r3.<init>(r6)     // Catch: java.lang.IllegalStateException -> L2b java.lang.IllegalArgumentException -> L32
            int r6 = r3.openConvertSession(r7)     // Catch: java.lang.IllegalStateException -> L17 java.lang.IllegalArgumentException -> L1e
            r2 = r6
            goto L3a
        L17:
            r6 = move-exception
            java.lang.String r7 = "Could not access Open DrmFramework."
            android.util.Log.w(r0, r7, r6)     // Catch: java.lang.IllegalStateException -> L2c java.lang.IllegalArgumentException -> L33
            goto L3a
        L1e:
            r6 = move-exception
            java.lang.String r4 = "Conversion of Mimetype: "
            java.lang.String r5 = " is not supported."
            java.lang.String r7 = defpackage.a.bW(r7, r4, r5)     // Catch: java.lang.IllegalStateException -> L2c java.lang.IllegalArgumentException -> L33
            android.util.Log.w(r0, r7, r6)     // Catch: java.lang.IllegalStateException -> L2c java.lang.IllegalArgumentException -> L33
            goto L3a
        L2b:
            r3 = r1
        L2c:
            java.lang.String r6 = "DrmManagerClient didn't initialize properly."
            android.util.Log.w(r0, r6)
            goto L3a
        L32:
            r3 = r1
        L33:
            java.lang.String r6 = "DrmManagerClient instance could not be created, context is Illegal."
            android.util.Log.w(r0, r6)
            goto L3a
        L39:
            r3 = r1
        L3a:
            if (r3 == 0) goto L45
            if (r2 >= 0) goto L3f
            goto L45
        L3f:
            atal r6 = new atal
            r6.<init>(r3, r2)
            return r6
        L45:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atal.t(android.content.Context, java.lang.String):atal");
    }

    private final boolean u() {
        if (this.b == null) {
            return true;
        }
        return false;
    }

    private static int v(Activity activity) {
        return activity.getWindow().getAttributes().softInputMode;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length == this.a) {
            if (bArr2.length == 32) {
                return b(3, bArr, bArr2);
            }
            throw new IllegalArgumentException("wrong address length");
        }
        throw new IllegalArgumentException("wrong key length");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [assy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [assy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [assy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [assy, java.lang.Object] */
    public final byte[] b(int i, byte[] bArr, byte[] bArr2) {
        byte[] an = atow.an(i, this.a);
        this.b.e(an, 0, an.length);
        this.b.e(bArr, 0, bArr.length);
        this.b.e(bArr2, 0, bArr2.length);
        ?? r4 = this.b;
        boolean z = r4 instanceof asti;
        int i2 = this.a;
        byte[] bArr3 = new byte[i2];
        if (z) {
            ((asti) r4).l(bArr3, 0, i2);
        } else {
            r4.a(bArr3, 0);
        }
        return bArr3;
    }

    public final int h() {
        if (u()) {
            return this.a;
        }
        return ((atlr) this.b).a();
    }

    public final List i(Class cls) {
        if (!u()) {
            atmx[] e = ((atlr) this.b).e();
            if (e == null) {
                int i = alog.d;
                return alsx.a;
            }
            return (List) DesugarArrays.stream(e).filter(new adru(11)).map(new agoq(cls, 12)).collect(Collectors.toList());
        }
        throw new IllegalStateException("expected non-legacy LookupProxy");
    }

    public final void j() {
        ((agko) this.b).a(this.a);
    }

    public final void k() {
        ((agko) this.b).a(-2);
    }

    public final boolean l() {
        int i = this.a;
        if (i == 1 || i == 4) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        int i = this.a;
        if (i == 1 || i == 3 || i == 4) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        if (this.a == 0) {
            return true;
        }
        return false;
    }

    public final byte[] o(byte[] bArr, int i) {
        DrmConvertedStatus convertData;
        if (bArr != null) {
            try {
                if (i != bArr.length) {
                    convertData = ((DrmManagerClient) this.b).convertData(this.a, Arrays.copyOf(bArr, i));
                } else {
                    convertData = ((DrmManagerClient) this.b).convertData(this.a, bArr);
                }
                if (convertData == null || convertData.statusCode != 1 || convertData.convertedData == null) {
                    return null;
                }
                return convertData.convertedData;
            } catch (IllegalArgumentException e) {
                Log.w("DrmConvertSession", "Buffer with data to convert is illegal. Convertsession: " + this.a, e);
                return null;
            } catch (IllegalStateException e2) {
                Log.w("DrmConvertSession", "Could not convert data. Convertsession: " + this.a, e2);
                return null;
            }
        }
        throw new IllegalArgumentException("Parameter inBuffer is null");
    }

    public final Drawable p() {
        Resources resources = ((Context) this.b).getResources();
        Drawable drawable = resources.getDrawable(this.a, null);
        int i = (int) (resources.getDisplayMetrics().density * 24.0f);
        drawable.setBounds(0, 0, i, i);
        return drawable;
    }

    public final void q() {
        if (v((Activity) this.b) != 48) {
            if (Build.VERSION.SDK_INT > 29) {
                ((Activity) this.b).getWindow().setDecorFitsSystemWindows(false);
            }
            r(48);
        }
    }

    public final void r(int i) {
        ((Activity) this.b).getWindow().setSoftInputMode(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public final ebv[] s() {
        return (ebv[]) this.b.get(0);
    }

    public atal(int i, byte[] bArr, char[] cArr) {
        this.b = "spam_protection_feature_consent";
        this.a = i;
    }

    public atal(int i, char[] cArr) {
        this.b = null;
        this.a = i;
    }

    public atal(Context context) {
        this.b = context;
        this.a = 2;
    }

    public atal(Typeface typeface) {
        this.b = typeface;
        this.a = 0;
    }

    public atal(atlr atlrVar) {
        this.b = atlrVar;
        this.a = -1;
    }

    public atal(BusinessInfoData businessInfoData) {
        this.a = 3;
        this.b = businessInfoData;
    }

    public atal(Object obj, int i) {
        this.b = obj;
        this.a = i;
    }

    public atal(Object obj, int i, byte[] bArr) {
        this.b = obj;
        this.a = i;
    }

    public atal(List list) {
        this.a = 0;
        this.b = list;
    }

    public atal(byte[] bArr) {
        this.b = bArr;
        this.a = 0;
    }

    public atal() {
        this.a = 1;
        this.b = new ArrayList();
    }

    public atal(int i, Duration duration) {
        d.s(i >= -1);
        this.a = i;
        this.b = duration;
    }

    public atal(int i, byte[] bArr) {
        this.b = new SecureRandom();
        this.a = i;
    }

    public atal(Activity activity) {
        this.b = activity;
        this.a = v(activity);
    }

    public atal(ConnectionResult connectionResult, int i) {
        abhg.m(connectionResult);
        this.b = connectionResult;
        this.a = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public atal(ASN1ObjectIdentifier aSN1ObjectIdentifier, int i) {
        this.b = atai.b(aSN1ObjectIdentifier);
        this.a = i;
    }

    @Deprecated
    public atal(char[] cArr) {
        this.a = 1;
        this.b = Collections.singletonList(null);
    }

    public atal(int i) {
        this(i, (ISetupCompatService) null);
    }

    public atal(int i, ISetupCompatService iSetupCompatService) {
        this.a = i;
        this.b = iSetupCompatService;
        if (i == 4) {
            d.aB(iSetupCompatService, "CompatService cannot be null when state is connected");
        }
    }
}
