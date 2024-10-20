package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dyn extends dzk {
    private IconCompat a;
    private IconCompat b;
    private boolean c;
    private boolean d;

    private static IconCompat g(Parcelable parcelable) {
        if (parcelable != null) {
            if (!(parcelable instanceof Icon)) {
                if (parcelable instanceof Bitmap) {
                    return IconCompat.f((Bitmap) parcelable);
                }
                return null;
            }
            return dzd.h((Icon) parcelable);
        }
        return null;
    }

    @Override // defpackage.dzk
    protected final String a() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dzk
    public final void b(Bundle bundle) {
        super.b(bundle);
        bundle.remove("android.largeIcon.big");
        bundle.remove("android.picture");
        bundle.remove("android.pictureIcon");
        bundle.remove("android.showBigPictureWhenCollapsed");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dzk
    public final void c(Bundle bundle) {
        IconCompat g;
        super.c(bundle);
        if (bundle.containsKey("android.largeIcon.big")) {
            this.b = g(bundle.getParcelable("android.largeIcon.big"));
            this.c = true;
        }
        Parcelable parcelable = bundle.getParcelable("android.picture");
        if (parcelable != null) {
            g = g(parcelable);
        } else {
            g = g(bundle.getParcelable("android.pictureIcon"));
        }
        this.a = g;
        this.d = bundle.getBoolean("android.showBigPictureWhenCollapsed");
    }

    public final void d(Bitmap bitmap) {
        IconCompat f;
        if (bitmap == null) {
            f = null;
        } else {
            f = IconCompat.f(bitmap);
        }
        this.b = f;
        this.c = true;
    }

    public final void e(Bitmap bitmap) {
        IconCompat f;
        if (bitmap == null) {
            f = null;
        } else {
            f = IconCompat.f(bitmap);
        }
        this.a = f;
    }

    @Override // defpackage.dzk
    public final void f(fqf fqfVar) {
        Bitmap bitmap;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle((Notification.Builder) fqfVar.e).setBigContentTitle(this.h);
        if (this.a != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                dym.a(bigContentTitle, dzd.f(this.a, (Context) fqfVar.c));
            } else if (this.a.b() == 1) {
                IconCompat iconCompat = this.a;
                int i = iconCompat.b;
                if (i == -1) {
                    Object obj = iconCompat.c;
                    if (obj instanceof Bitmap) {
                        bitmap = (Bitmap) obj;
                    } else {
                        bitmap = null;
                    }
                } else if (i == 1) {
                    bitmap = (Bitmap) iconCompat.c;
                } else if (i == 5) {
                    Bitmap bitmap2 = (Bitmap) iconCompat.c;
                    int min = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.6666667f);
                    Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    Paint paint = new Paint(3);
                    paint.setColor(0);
                    float f = min;
                    float f2 = 0.010416667f * f;
                    paint.setShadowLayer(f2, brg.a, 0.020833334f * f, 1023410176);
                    float f3 = f * 0.5f;
                    float f4 = 0.9166667f * f3;
                    canvas.drawCircle(f3, f3, f4, paint);
                    paint.setShadowLayer(f2, brg.a, brg.a, 503316480);
                    canvas.drawCircle(f3, f3, f4, paint);
                    paint.clearShadowLayer();
                    paint.setColor(-16777216);
                    BitmapShader bitmapShader = new BitmapShader(bitmap2, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
                    Matrix matrix = new Matrix();
                    matrix.setTranslate((-(bitmap2.getWidth() - min)) / 2.0f, (-(bitmap2.getHeight() - min)) / 2.0f);
                    bitmapShader.setLocalMatrix(matrix);
                    paint.setShader(bitmapShader);
                    canvas.drawCircle(f3, f3, f4, paint);
                    canvas.setBitmap(null);
                    bitmap = createBitmap;
                } else {
                    Objects.toString(iconCompat);
                    throw new IllegalStateException("called getBitmap() on ".concat(iconCompat.toString()));
                }
                bigContentTitle = bigContentTitle.bigPicture(bitmap);
            }
        }
        if (this.c) {
            IconCompat iconCompat2 = this.b;
            if (iconCompat2 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                dyl.a(bigContentTitle, dzd.f(iconCompat2, (Context) fqfVar.c));
            }
        }
        if (this.j) {
            bigContentTitle.setSummaryText(this.i);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            dym.c(bigContentTitle, this.d);
            dym.b(bigContentTitle, null);
        }
    }
}
