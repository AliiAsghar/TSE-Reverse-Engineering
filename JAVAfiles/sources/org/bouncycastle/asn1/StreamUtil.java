package org.bouncycastle.asn1;

import j$.nio.channels.DesugarChannels;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class StreamUtil {
    StreamUtil() {
    }

    public static int a(InputStream inputStream) {
        long j;
        if (inputStream instanceof LimitedInputStream) {
            return ((LimitedInputStream) inputStream).d;
        }
        if (inputStream instanceof ASN1InputStream) {
            return ((ASN1InputStream) inputStream).a;
        }
        if (inputStream instanceof ByteArrayInputStream) {
            return ((ByteArrayInputStream) inputStream).available();
        }
        if (inputStream instanceof FileInputStream) {
            try {
                FileChannel convertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(((FileInputStream) inputStream).getChannel());
                if (convertMaybeLegacyFileChannelFromLibrary != null) {
                    j = convertMaybeLegacyFileChannelFromLibrary.size();
                } else {
                    j = 2147483647L;
                }
                if (j < 2147483647L) {
                    return (int) j;
                }
            } catch (IOException unused) {
            }
        }
        long maxMemory = Runtime.getRuntime().maxMemory();
        if (maxMemory > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) maxMemory;
    }
}
