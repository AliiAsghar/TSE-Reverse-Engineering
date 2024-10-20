package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import j$.nio.channels.DesugarChannels;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ewa extends evb {
    private final Context a;
    private evl b;
    private AssetFileDescriptor c;
    private InputStream d;
    private long e;
    private boolean f;

    public ewa(Context context) {
        super(false);
        this.a = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse(a.bV(i, "rawresource:///"));
    }

    private static int k(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new evz("Resource identifier must be an integer.", null, 1004);
        }
    }

    private static AssetFileDescriptor l(Context context, evl evlVar) {
        String host;
        Resources resourcesForApplication;
        int identifier;
        Uri normalizeScheme = evlVar.a.normalizeScheme();
        if (TextUtils.equals("rawresource", normalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            List<String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() == 1) {
                identifier = k(pathSegments.get(0));
            } else {
                throw new evz("rawresource:// URI must have exactly one path element, found " + pathSegments.size());
            }
        } else if (TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
            String path = normalizeScheme.getPath();
            dzg.g(path);
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            if (TextUtils.isEmpty(normalizeScheme.getHost())) {
                host = context.getPackageName();
            } else {
                host = normalizeScheme.getHost();
            }
            if (host.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(host);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new evz("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, 2005);
                }
            }
            if (path.matches("\\d+")) {
                identifier = k(path);
            } else {
                identifier = resourcesForApplication.getIdentifier(a.co(path, host, ":"), "raw", null);
                if (identifier == 0) {
                    throw new evz("Resource not found.", null, 2005);
                }
            }
        } else {
            throw new evz("Unsupported URI scheme (" + normalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
        }
        try {
            AssetFileDescriptor openRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (openRawResourceFd != null) {
                return openRawResourceFd;
            }
            throw new evz("Resource is compressed: ".concat(String.valueOf(String.valueOf(normalizeScheme))), null, 2000);
        } catch (Resources.NotFoundException e2) {
            throw new evz(null, e2, 2005);
        }
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
                throw new evz(null, e, 2000);
            }
        }
        InputStream inputStream = this.d;
        int i3 = eul.a;
        int read = inputStream.read(bArr, i, i2);
        if (read == -1) {
            if (this.e == -1) {
                return -1;
            }
            throw new evz("End of stream reached having not read sufficient data.", new EOFException(), 2000);
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
        this.b = evlVar;
        j();
        AssetFileDescriptor l = l(this.a, evlVar);
        this.c = l;
        long length = l.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.c.getFileDescriptor());
        this.d = fileInputStream;
        if (length != -1) {
            try {
                if (evlVar.e > length) {
                    throw new evz(null, null, 2008);
                }
            } catch (evz e) {
                throw e;
            } catch (IOException e2) {
                throw new evz(null, e2, 2000);
            }
        }
        long startOffset = this.c.getStartOffset();
        long skip = fileInputStream.skip(evlVar.e + startOffset) - startOffset;
        if (skip == evlVar.e) {
            if (length == -1) {
                FileChannel convertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel());
                if (convertMaybeLegacyFileChannelFromLibrary.size() == 0) {
                    this.e = -1L;
                } else {
                    long size = convertMaybeLegacyFileChannelFromLibrary.size() - convertMaybeLegacyFileChannelFromLibrary.position();
                    this.e = size;
                    if (size < 0) {
                        throw new evz(null, null, 2008);
                    }
                }
            } else {
                long j = length - skip;
                this.e = j;
                if (j < 0) {
                    throw new evi(2008);
                }
            }
            long j2 = evlVar.f;
            this.f = true;
            i(evlVar);
            long j3 = evlVar.f;
            return this.e;
        }
        throw new evz(null, null, 2008);
    }

    @Override // defpackage.evg
    public final Uri c() {
        evl evlVar = this.b;
        if (evlVar != null) {
            return evlVar.a;
        }
        return null;
    }

    @Override // defpackage.evg
    public final void d() {
        this.b = null;
        try {
            try {
                try {
                    InputStream inputStream = this.d;
                    if (inputStream != null) {
                        inputStream.close();
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
                        throw new evz(null, e, 2000);
                    }
                } catch (IOException e2) {
                    throw new evz(null, e2, 2000);
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
                throw new evz(null, e3, 2000);
            }
        }
    }
}
