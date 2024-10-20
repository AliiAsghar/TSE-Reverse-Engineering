package defpackage;

import com.android.vcard.VCardConfig;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apay {
    static final Charset a;
    public static final byte[] b;
    public static final ByteBuffer c;

    static {
        Charset.forName("US-ASCII");
        a = Charset.forName("UTF-8");
        Charset.forName(VCardConfig.DEFAULT_INTERMEDIATE_CHARSET);
        byte[] bArr = new byte[0];
        b = bArr;
        c = ByteBuffer.wrap(bArr);
        aozg.L(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Object obj) {
        obj.getClass();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(apbt apbtVar) {
        if (!(apbtVar instanceof aoyk)) {
            return;
        }
        throw null;
    }
}
