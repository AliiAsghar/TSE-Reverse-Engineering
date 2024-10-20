package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xrq {
    public static final alwo a = alwo.o("BugleFileTransfer");
    private final Context b;
    private final ydh c;
    private final yfo d;

    public xrq(Context context, ydh ydhVar, yfo yfoVar) {
        this.b = context;
        this.c = ydhVar;
        this.d = yfoVar;
    }

    private final byte[] d(Uri uri, int i, int i2, int i3) {
        return this.d.o(i2, i3, 250, 250, i, uri, "image/jpeg");
    }

    public final byte[] a(rwz rwzVar, int i) {
        d.s(rwzVar.aV());
        Uri t = rwzVar.t();
        if (t == null) {
            return null;
        }
        if (rwzVar.c() <= 0 || rwzVar.b() <= 0) {
            rwzVar.ah();
        }
        int c = rwzVar.c();
        int b = rwzVar.b();
        try {
            String U = rwzVar.U();
            if (gh.z(U)) {
                return c(t, i, c, b);
            }
            return b(t, U, i, c, b);
        } catch (IOException e) {
            ((alwl) ((alwl) ((alwl) a.h()).g(e)).h("com/google/android/apps/messaging/shared/transfer/preview/FilePreviewCreator", "getImagePreview", 'H', "FilePreviewCreator.java")).q("Cannot get a File Transfer preview.");
            return null;
        }
    }

    public final byte[] b(Uri uri, String str, int i, int i2, int i3) {
        d.s(gh.m(str));
        if (this.d.l(str, uri)) {
            ((alwl) ((alwl) a.d()).h("com/google/android/apps/messaging/shared/transfer/preview/FilePreviewCreator", "getPreviewForImage", 108, "FilePreviewCreator.java")).q("Getting preview for GIF-files is not supported at the moment.");
            return null;
        }
        return d(uri, i, i2, i3);
    }

    public final byte[] c(Uri uri, int i, int i2, int i3) {
        Bitmap e = this.d.e(uri, 250, 250);
        Context context = this.b;
        Uri d = uhl.d(null, context);
        File i4 = uhl.i(d, context);
        if (e != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(i4);
                try {
                    e.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                    fileOutputStream.close();
                } finally {
                }
            } finally {
                e.recycle();
            }
        }
        byte[] d2 = d(d, i, i2, i3);
        this.c.i(i4);
        return d2;
    }
}
