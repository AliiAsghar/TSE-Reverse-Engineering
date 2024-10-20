package defpackage;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.ContentProviderClient;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Bundle;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzl {
    public static Notification.Action.Builder a(Notification.Action.Builder builder, Bundle bundle) {
        return builder.addExtras(bundle);
    }

    public static Notification.Action.Builder b(Notification.Action.Builder builder, RemoteInput remoteInput) {
        return builder.addRemoteInput(remoteInput);
    }

    public static Notification.Action c(Notification.Action.Builder builder) {
        return builder.build();
    }

    public static final void d(ContentProviderClient contentProviderClient) {
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    public static void e(evg evgVar) {
        try {
            evgVar.d();
        } catch (IOException unused) {
        }
    }

    public static Bitmap f(byte[] bArr, int i, BitmapFactory.Options options, int i2) {
        int i3 = 0;
        if (i2 != -1) {
            if (options == null) {
                options = new BitmapFactory.Options();
            }
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, i, options);
            options.inJustDecodeBounds = false;
            options.inSampleSize = 1;
            for (int max = Math.max(options.outWidth, options.outHeight); max > i2; max >>= 1) {
                int i4 = options.inSampleSize;
                options.inSampleSize = i4 + i4;
            }
        }
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i, options);
        if (options != null) {
            options.inSampleSize = 1;
        }
        if (decodeByteArray != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                elx elxVar = new elx(byteArrayInputStream);
                byteArrayInputStream.close();
                switch (elxVar.a("Orientation", 1)) {
                    case 3:
                    case 4:
                        i3 = 180;
                        break;
                    case 5:
                    case 8:
                        i3 = 270;
                        break;
                    case 6:
                    case 7:
                        i3 = 90;
                        break;
                }
                if (i3 != 0) {
                    Matrix matrix = new Matrix();
                    matrix.postRotate(i3);
                    return Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
                }
                return decodeByteArray;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        throw new erm("Could not decode image data", new IllegalStateException(), true, 1);
    }
}
