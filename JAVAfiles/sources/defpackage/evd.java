package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import j$.nio.channels.DesugarChannels;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evd extends evb {
    private final ContentResolver a;
    private Uri b;
    private AssetFileDescriptor c;
    private FileInputStream d;
    private long e;
    private boolean f;

    public evd(Context context) {
        super(false);
        this.a = context.getContentResolver();
    }

    @Override // defpackage.eqe
    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.e;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new evc(e, 2000);
            }
        }
        FileInputStream fileInputStream = this.d;
        int i3 = eul.a;
        int read = fileInputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.e;
        if (j2 != -1) {
            this.e = j2 - read;
        }
        g(read);
        return read;
    }

    @Override // defpackage.evg
    public final long b(evl evlVar) {
        int i;
        AssetFileDescriptor openAssetFileDescriptor;
        try {
            try {
                Uri normalizeScheme = evlVar.a.normalizeScheme();
                this.b = normalizeScheme;
                j();
                if ("content".equals(normalizeScheme.getScheme())) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    openAssetFileDescriptor = this.a.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
                } else {
                    openAssetFileDescriptor = this.a.openAssetFileDescriptor(normalizeScheme, "r");
                }
                this.c = openAssetFileDescriptor;
                if (openAssetFileDescriptor != null) {
                    long length = openAssetFileDescriptor.getLength();
                    FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                    this.d = fileInputStream;
                    if (length != -1 && evlVar.e > length) {
                        throw new evc(null, 2008);
                    }
                    long startOffset = openAssetFileDescriptor.getStartOffset();
                    long skip = fileInputStream.skip(evlVar.e + startOffset) - startOffset;
                    if (skip == evlVar.e) {
                        if (length == -1) {
                            FileChannel convertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel());
                            long size = convertMaybeLegacyFileChannelFromLibrary.size();
                            if (size == 0) {
                                this.e = -1L;
                            } else {
                                long position = size - convertMaybeLegacyFileChannelFromLibrary.position();
                                this.e = position;
                                if (position < 0) {
                                    throw new evc(null, 2008);
                                }
                            }
                        } else {
                            long j = length - skip;
                            this.e = j;
                            if (j < 0) {
                                throw new evc(null, 2008);
                            }
                        }
                        long j2 = evlVar.f;
                        this.f = true;
                        i(evlVar);
                        long j3 = evlVar.f;
                        return this.e;
                    }
                    throw new evc(null, 2008);
                }
                i = 2000;
                try {
                    throw new evc(new IOException(a.cr(normalizeScheme, "Could not open file descriptor for: ")), 2000);
                } catch (IOException e) {
                    e = e;
                    if (true == (e instanceof FileNotFoundException)) {
                        i = 2005;
                    }
                    throw new evc(e, i);
                }
            } catch (evc e2) {
                throw e2;
            }
        } catch (IOException e3) {
            e = e3;
            i = 2000;
        }
    }

    @Override // defpackage.evg
    public final Uri c() {
        return this.b;
    }

    @Override // defpackage.evg
    public final void d() {
        this.b = null;
        try {
            try {
                try {
                    FileInputStream fileInputStream = this.d;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    this.d = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.c;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.c = null;
                        if (this.f) {
                            this.f = false;
                            h();
                        }
                    } catch (IOException e) {
                        throw new evc(e, 2000);
                    }
                } catch (IOException e2) {
                    throw new evc(e2, 2000);
                }
            } catch (Throwable th) {
                this.c = null;
                if (this.f) {
                    this.f = false;
                    h();
                }
                throw th;
            }
        } catch (Throwable th2) {
            this.d = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.c;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.c = null;
                if (this.f) {
                    this.f = false;
                    h();
                }
                throw th2;
            } catch (IOException e3) {
                throw new evc(e3, 2000);
            }
        }
    }
}
