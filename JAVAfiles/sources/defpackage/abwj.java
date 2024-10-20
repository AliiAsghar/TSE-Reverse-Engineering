package defpackage;

import android.os.Build;
import android.util.Log;
import android.util.Pair;
import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abwj {
    public static final zfm a = new zfm();

    public static final boolean a(File file, abwf abwfVar) {
        Pair N;
        try {
            try {
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file.getAbsolutePath(), "r");
                    try {
                        if (randomAccessFile.length() < 22) {
                            N = null;
                        } else {
                            N = gvf.N(randomAccessFile, 0);
                            if (N == null) {
                                N = gvf.N(randomAccessFile, 65535);
                            }
                        }
                        if (N != null) {
                            ByteBuffer byteBuffer = (ByteBuffer) N.first;
                            long longValue = ((Long) N.second).longValue();
                            long j = (-20) + longValue;
                            if (j >= 0) {
                                randomAccessFile.seek(j);
                                if (randomAccessFile.readInt() == 1347094023) {
                                    throw new hit("ZIP64 APK not supported");
                                }
                            }
                            d.E(byteBuffer);
                            long M = gvf.M(byteBuffer, byteBuffer.position() + 16);
                            if (M < longValue) {
                                d.E(byteBuffer);
                                if (gvf.M(byteBuffer, byteBuffer.position() + 12) + M == longValue) {
                                    if (M >= 32) {
                                        ByteBuffer allocate = ByteBuffer.allocate(24);
                                        allocate.order(ByteOrder.LITTLE_ENDIAN);
                                        randomAccessFile.seek(M - allocate.capacity());
                                        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                                        if (allocate.getLong(8) == 2334950737559900225L && allocate.getLong(16) == 3617552046287187010L) {
                                            long j2 = allocate.getLong(0);
                                            if (j2 >= allocate.capacity() && j2 <= 2147483639) {
                                                int i = (int) (8 + j2);
                                                long j3 = M - i;
                                                if (j3 >= 0) {
                                                    ByteBuffer allocate2 = ByteBuffer.allocate(i);
                                                    allocate2.order(ByteOrder.LITTLE_ENDIAN);
                                                    randomAccessFile.seek(j3);
                                                    randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                                                    long j4 = allocate2.getLong(0);
                                                    if (j4 == j2) {
                                                        Pair create = Pair.create(allocate2, Long.valueOf(j3));
                                                        ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
                                                        long longValue2 = ((Long) create.second).longValue();
                                                        d.E(byteBuffer2);
                                                        int capacity = byteBuffer2.capacity() - 24;
                                                        if (capacity >= 8) {
                                                            int capacity2 = byteBuffer2.capacity();
                                                            if (capacity <= byteBuffer2.capacity()) {
                                                                int limit = byteBuffer2.limit();
                                                                int position = byteBuffer2.position();
                                                                try {
                                                                    byteBuffer2.position(0);
                                                                    byteBuffer2.limit(capacity);
                                                                    byteBuffer2.position(8);
                                                                    ByteBuffer slice = byteBuffer2.slice();
                                                                    slice.order(byteBuffer2.order());
                                                                    byteBuffer2.position(0);
                                                                    byteBuffer2.limit(limit);
                                                                    byteBuffer2.position(position);
                                                                    int i2 = 0;
                                                                    while (slice.hasRemaining()) {
                                                                        i2++;
                                                                        if (slice.remaining() >= 8) {
                                                                            long j5 = slice.getLong();
                                                                            if (j5 >= 4 && j5 <= 2147483647L) {
                                                                                int i3 = (int) j5;
                                                                                int position2 = slice.position() + i3;
                                                                                if (i3 <= slice.remaining()) {
                                                                                    if (slice.getInt() == 1896449818) {
                                                                                        X509Certificate[][] O = gvf.O(DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel()), new his(d.D(slice, i3 - 4), longValue2, M, longValue, byteBuffer));
                                                                                        randomAccessFile.close();
                                                                                        try {
                                                                                            randomAccessFile.close();
                                                                                        } catch (IOException unused) {
                                                                                        }
                                                                                        if (O.length == 1) {
                                                                                            byte[] digest = MessageDigest.getInstance("SHA-256").digest(O[0][0].getEncoded());
                                                                                            if (!Arrays.equals(((abwg) abwfVar).d, digest) && ("user".equals(Build.TYPE) || !Arrays.equals(((abwg) abwfVar).c, digest))) {
                                                                                                return false;
                                                                                            }
                                                                                            return true;
                                                                                        }
                                                                                        throw new GeneralSecurityException("APK has more than one signature.");
                                                                                    }
                                                                                    slice.position(position2);
                                                                                } else {
                                                                                    throw new hit("APK Signing Block entry #" + i2 + " size out of range: " + i3 + ", available: " + slice.remaining());
                                                                                }
                                                                            } else {
                                                                                throw new hit("APK Signing Block entry #" + i2 + " size out of range: " + j5);
                                                                            }
                                                                        } else {
                                                                            throw new hit(a.bV(i2, "Insufficient data to read size of APK Signing Block entry #"));
                                                                        }
                                                                    }
                                                                    throw new hit("No APK Signature Scheme v2 block in APK Signing Block");
                                                                } catch (Throwable th) {
                                                                    byteBuffer2.position(0);
                                                                    byteBuffer2.limit(limit);
                                                                    byteBuffer2.position(position);
                                                                    throw th;
                                                                }
                                                            }
                                                            throw new IllegalArgumentException(a.bU(capacity2, capacity, "end > capacity: ", " > "));
                                                        }
                                                        throw new IllegalArgumentException("end < start: " + capacity + " < 8");
                                                    }
                                                    throw new hit(a.cs(j2, j4, "APK Signing Block sizes in header and footer do not match: ", " vs "));
                                                }
                                                throw new hit(a.ck(j3, "APK Signing Block offset out of range: "));
                                            }
                                            throw new hit(a.ck(j2, "APK Signing Block size out of range: "));
                                        }
                                        throw new hit("No APK Signing Block before ZIP Central Directory");
                                    }
                                    throw new hit(a.ck(M, "APK too small for APK Signing Block. ZIP Central Directory offset: "));
                                }
                                throw new hit("ZIP Central Directory is not immediately followed by End of Central Directory");
                            }
                            throw new hit(a.cs(longValue, M, "ZIP Central Directory offset out of range: ", ". ZIP End of Central Directory offset: "));
                        }
                        throw new hit("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
                    } catch (Throwable th2) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException unused2) {
                        }
                        throw th2;
                    }
                } catch (hit e) {
                    throw new GeneralSecurityException("Package is not signed", e);
                } catch (RuntimeException e2) {
                    e = e2;
                    throw new GeneralSecurityException("Failed to verify signatures", e);
                }
            } catch (IOException e3) {
                e = e3;
                throw new GeneralSecurityException("Failed to verify signatures", e);
            }
        } catch (GeneralSecurityException e4) {
            Log.e("DG", "APK at " + file.getAbsolutePath() + " failed signature verification", e4);
            return false;
        }
    }
}
