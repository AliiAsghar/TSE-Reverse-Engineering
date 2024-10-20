package defpackage;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hvn implements hnl {
    private final List a;
    private final hnl b;
    private final hqh c;

    public hvn(List list, hnl hnlVar, hqh hqhVar) {
        this.a = list;
        this.b = hnlVar;
        this.c = hqhVar;
    }

    @Override // defpackage.hnl
    public final /* bridge */ /* synthetic */ hpt a(Object obj, int i, int i2, hnj hnjVar) {
        byte[] bArr;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e);
            }
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.b.a(ByteBuffer.wrap(bArr), i, i2, hnjVar);
    }

    @Override // defpackage.hnl
    public final /* bridge */ /* synthetic */ boolean b(Object obj, hnj hnjVar) {
        InputStream inputStream = (InputStream) obj;
        if (!((Boolean) hnjVar.b(hvm.b)).booleanValue() && hlc.n(this.a, inputStream, this.c) == ImageHeaderParser.ImageType.GIF) {
            return true;
        }
        return false;
    }
}
