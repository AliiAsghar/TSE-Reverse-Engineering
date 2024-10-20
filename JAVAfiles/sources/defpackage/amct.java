package defpackage;

import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amct {
    public static final byte[] a(File file) {
        boolean z;
        amcr amcrVar = new amcr();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            amcrVar.a.addFirst(fileInputStream);
            long size = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel()).size();
            if (size >= 0) {
                z = true;
            } else {
                z = false;
            }
            albo.M(z, "expectedSize (%s) must be non-negative", size);
            if (size <= 2147483639) {
                int i = (int) size;
                byte[] bArr = new byte[i];
                int i2 = i;
                while (true) {
                    if (i2 > 0) {
                        int i3 = i - i2;
                        int read = fileInputStream.read(bArr, i3, i2);
                        if (read == -1) {
                            bArr = Arrays.copyOf(bArr, i3);
                            break;
                        }
                        i2 -= read;
                    } else {
                        int read2 = fileInputStream.read();
                        if (read2 != -1) {
                            ArrayDeque arrayDeque = new ArrayDeque(22);
                            arrayDeque.add(bArr);
                            arrayDeque.add(new byte[]{(byte) read2});
                            bArr = amcp.c(fileInputStream, arrayDeque, i + 1);
                        }
                    }
                }
                return bArr;
            }
            throw new OutOfMemoryError(size + " bytes is too large to fit in a byte array");
        } catch (Throwable th) {
            try {
                amcrVar.b = th;
                alhx.a(th, IOException.class);
                alhx.b(th);
                throw new RuntimeException(th);
            } finally {
                amcrVar.close();
            }
        }
    }
}
