package defpackage;

import android.os.StrictMode;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahqg {
    private static volatile algw a;
    private static volatile algw b;

    public static algw a() {
        algw algwVar;
        algw algwVar2;
        algw algwVar3;
        algw i;
        algw algwVar4 = a;
        if (algwVar4 == null) {
            long sysconf = Os.sysconf(OsConstants._SC_CLK_TCK);
            long j = 0;
            if (sysconf > 0) {
                algwVar = algw.i(Long.valueOf(sysconf));
            } else {
                algwVar = alfd.a;
            }
            if (!algwVar.f()) {
                i = alfd.a;
            } else {
                StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                byte[] bArr = new byte[440];
                boolean z = false;
                try {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(new File("/proc/self/stat"));
                        try {
                            int read = fileInputStream.read(bArr);
                            fileInputStream.close();
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            algwVar2 = algw.i(ByteBuffer.wrap(bArr, 0, read));
                        } catch (Throwable th) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (IOException unused) {
                        alfd alfdVar = alfd.a;
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        algwVar2 = alfdVar;
                    }
                    if (!algwVar2.f()) {
                        i = alfd.a;
                    } else {
                        Object b2 = algwVar2.b();
                        long longValue = ((Long) algwVar.b()).longValue();
                        while (true) {
                            ByteBuffer byteBuffer = (ByteBuffer) b2;
                            if (byteBuffer.remaining() <= 17) {
                                break;
                            }
                            if (byteBuffer.get() == 40) {
                                int i2 = 16;
                                while (true) {
                                    if (i2 < 0) {
                                        break;
                                    }
                                    if (byteBuffer.get(byteBuffer.position() + i2) == 41) {
                                        byteBuffer.position(byteBuffer.position() + i2 + 1);
                                        if (byteBuffer.get() == 32 && b(byteBuffer, 1) && b(byteBuffer, 18)) {
                                            while (true) {
                                                if (!byteBuffer.hasRemaining()) {
                                                    break;
                                                }
                                                byte b3 = byteBuffer.get();
                                                if (b3 == 32) {
                                                    if (z) {
                                                        algwVar3 = algw.i(Long.valueOf(j));
                                                    }
                                                } else {
                                                    if (b3 < 48 || b3 > 57 || j > 922337203685477580L) {
                                                        break;
                                                    }
                                                    j = (j * 10) + (b3 - 48);
                                                    z = true;
                                                }
                                            }
                                            algwVar3 = alfd.a;
                                        }
                                    } else {
                                        i2--;
                                    }
                                }
                            }
                        }
                        algwVar3 = alfd.a;
                        if (!algwVar3.f()) {
                            i = alfd.a;
                        } else {
                            i = algw.i(Long.valueOf(TimeUnit.SECONDS.toMillis(((Long) algwVar3.b()).longValue()) / longValue));
                        }
                    }
                } catch (Throwable th3) {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    throw th3;
                }
            }
            a = i;
            return i;
        }
        return algwVar4;
    }

    private static boolean b(ByteBuffer byteBuffer, int i) {
        while (byteBuffer.hasRemaining()) {
            if (i > 0) {
                if (byteBuffer.get() == 32) {
                    i--;
                }
            } else {
                return true;
            }
        }
        if (i != 0) {
            return false;
        }
        return true;
    }
}
