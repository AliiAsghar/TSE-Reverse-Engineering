package defpackage;

import android.os.RemoteException;
import android.util.Log;
import com.android.vcard.VCardConfig;
import com.google.android.gms.common.internal.ICertData;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class abqg extends ICertData.Stub {
    private final int a;

    /* JADX INFO: Access modifiers changed from: protected */
    public abqg(byte[] bArr) {
        boolean z;
        if (bArr.length == 25) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        this.a = Arrays.hashCode(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static byte[] b(String str) {
        try {
            return str.getBytes(VCardConfig.DEFAULT_INTERMEDIATE_CHARSET);
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public abstract byte[] c();

    public final boolean equals(Object obj) {
        IObjectWrapper bytesWrapped;
        if (obj != null && (obj instanceof ICertData)) {
            try {
                ICertData iCertData = (ICertData) obj;
                if (iCertData.getHashCode() != this.a || (bytesWrapped = iCertData.getBytesWrapped()) == null) {
                    return false;
                }
                return Arrays.equals(c(), (byte[]) ObjectWrapper.unwrap(bytesWrapped));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.common.internal.ICertData
    public final IObjectWrapper getBytesWrapped() {
        return ObjectWrapper.wrap(c());
    }

    @Override // com.google.android.gms.common.internal.ICertData
    public final int getHashCode() {
        return this.a;
    }

    public final int hashCode() {
        return this.a;
    }
}
