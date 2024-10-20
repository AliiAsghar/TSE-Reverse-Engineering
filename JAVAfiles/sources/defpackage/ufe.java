package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ufe extends ufc {
    private static Bitmap g;

    public ufe(Context context, xvc xvcVar, ufd ufdVar) {
        super(context, xvcVar, ufdVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ufc, defpackage.ugh, defpackage.ufr
    public final ufu b(List list) {
        ufu b;
        int color;
        int color2;
        akrh e = aktp.e("SimSelectorAvatarRequest.loadMediaInternal");
        try {
            aiut.b();
            Uri uri = ((ufd) this.b).k;
            if (uri != null && "s".equals(xvc.j(uri))) {
                ufd ufdVar = (ufd) this.b;
                int i = ufdVar.b;
                int i2 = ufdVar.c;
                String k = xvc.k(uri);
                xyl.l(uri);
                boolean parseBoolean = Boolean.parseBoolean(uri.getQueryParameter("s"));
                xyl.l(uri);
                int parseInt = Integer.parseInt(albo.ag(uri.getQueryParameter("c")));
                Resources resources = this.a.getResources();
                float f = i / 2;
                float f2 = i2 / 2;
                if (parseBoolean) {
                    color = parseInt;
                } else {
                    color = this.a.getResources().getColor(R.color.sim_icon_background_color);
                }
                if (parseBoolean) {
                    color2 = -1;
                } else if (((-16777216) & parseInt) != 0) {
                    color2 = parseInt;
                } else {
                    color2 = this.a.getResources().getColor(R.color.sim_icon_text_color);
                }
                if (true == parseBoolean) {
                    parseInt = -1;
                }
                Bitmap b2 = i().b(i, i2, color);
                Paint paint = new Paint(1);
                Canvas canvas = new Canvas(b2);
                if (g == null) {
                    g = ((BitmapDrawable) this.a.getResources().getDrawable(R.drawable.ic_sim_card_send)).getBitmap();
                    int density = b2.getDensity();
                    if (g.getDensity() != density) {
                        g.setDensity(density);
                    }
                }
                paint.setColorFilter(new PorterDuffColorFilter(parseInt, PorterDuff.Mode.SRC_ATOP));
                paint.setAlpha(255);
                canvas.drawBitmap(g, f - (r10.getWidth() / 2), f2 - (g.getHeight() / 2), paint);
                paint.setColorFilter(null);
                paint.setAlpha(255);
                if (!TextUtils.isEmpty(k)) {
                    paint.setTypeface(xvw.e(this.a));
                    paint.setTextSize(resources.getDimensionPixelSize(R.dimen.sim_identifier_text_size));
                    paint.setColor(color2);
                    String upperCase = k.substring(0, 1).toUpperCase(Locale.US);
                    paint.getTextBounds(upperCase, 0, 1, new Rect());
                    canvas.drawText(upperCase, f - r7.centerX(), f2 - r7.centerY(), paint);
                }
                b = new ufh(m(), b2, 1, this.c, this.d);
            } else {
                b = super.b(list);
            }
            e.close();
            return b;
        } catch (Throwable th) {
            try {
                e.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // defpackage.ufr
    public final int f() {
        return 2;
    }
}
