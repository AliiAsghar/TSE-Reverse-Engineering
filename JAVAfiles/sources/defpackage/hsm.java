package defpackage;

import android.util.Log;
import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hsm implements hns {
    private final Object a;
    private final /* synthetic */ int b;

    public hsm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.hns
    public final Class a() {
        if (this.b != 0) {
            return ByteBuffer.class;
        }
        return this.a.getClass();
    }

    @Override // defpackage.hns
    public final void f(hlh hlhVar, hnr hnrVar) {
        RandomAccessFile randomAccessFile;
        if (this.b != 0) {
            try {
                Object obj = this.a;
                int i = hyi.a;
                FileChannel fileChannel = null;
                try {
                    long length = ((File) obj).length();
                    if (length <= 2147483647L) {
                        if (length != 0) {
                            randomAccessFile = new RandomAccessFile((File) obj, "r");
                            try {
                                fileChannel = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
                                MappedByteBuffer load = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                                if (fileChannel != null) {
                                    try {
                                        fileChannel.close();
                                    } catch (IOException unused) {
                                    }
                                }
                                try {
                                    randomAccessFile.close();
                                } catch (IOException unused2) {
                                }
                                hnrVar.b(load);
                                return;
                            } catch (Throwable th) {
                                th = th;
                                if (fileChannel != null) {
                                    try {
                                        fileChannel.close();
                                    } catch (IOException unused3) {
                                    }
                                }
                                if (randomAccessFile != null) {
                                    try {
                                        randomAccessFile.close();
                                        throw th;
                                    } catch (IOException unused4) {
                                        throw th;
                                    }
                                }
                                throw th;
                            }
                        }
                        throw new IOException("File unsuitable for memory mapping");
                    }
                    throw new IOException("File too large to map into memory");
                } catch (Throwable th2) {
                    th = th2;
                    randomAccessFile = null;
                }
            } catch (IOException e) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
                }
                hnrVar.e(e);
            }
        } else {
            hnrVar.b(this.a);
        }
    }

    @Override // defpackage.hns
    public final int g() {
        return 1;
    }

    @Override // defpackage.hns
    public final void d() {
    }

    @Override // defpackage.hns
    public final void eX() {
    }
}
