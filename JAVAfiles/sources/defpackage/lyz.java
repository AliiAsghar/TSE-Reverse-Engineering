package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lyz implements kzy {
    private final Context a;
    private int b;
    private TextView c;
    private ImageView d;
    private xvy e;
    private xvy f;

    public lyz(Context context) {
        this.a = context;
    }

    @Override // defpackage.kzy
    public final void b(kzx kzxVar, boolean z) {
        boolean z2;
        if (!kzxVar.w) {
            int i = 8;
            if (TextUtils.isEmpty(kzxVar.J)) {
                if ((!yig.e() || !kzxVar.C) && (!ier.a() || !kzxVar.S)) {
                    this.e.g(8);
                }
                this.f.g(8);
                return;
            }
            this.e.g(0);
            TextView textView = (TextView) this.e.b();
            this.c = textView;
            if (textView != null) {
                String str = kzxVar.J;
                str.getClass();
                textView.setText(str);
                TextView textView2 = this.c;
                Integer num = kzxVar.L;
                num.getClass();
                num.intValue();
                textView2.setTextColor(ahnz.d(textView2, R.attr.colorOnSurfaceVariant));
            }
            if (!kzxVar.N && this.c != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            xvy xvyVar = this.f;
            if (true == z2) {
                i = 0;
            }
            xvyVar.g(i);
            if (z2) {
                Context context = this.a;
                Integer num2 = kzxVar.K;
                num2.getClass();
                num2.intValue();
                Drawable drawable = context.getDrawable(R.drawable.gs_schedule_send_vd_theme_24);
                drawable.getClass();
                drawable.setAutoMirrored(true);
                ImageView imageView = (ImageView) this.f.b();
                this.d = imageView;
                if (imageView != null) {
                    imageView.setImageDrawable(drawable);
                    ImageView imageView2 = this.d;
                    Integer num3 = kzxVar.M;
                    num3.getClass();
                    num3.intValue();
                    imageView2.setColorFilter(ahnz.d(imageView2, R.attr.colorOnSurfaceVariant));
                }
            }
        }
    }

    @Override // defpackage.kzy
    public final void c(View view) {
        this.e = new xvy(view, R.id.additional_text, R.id.additional_text, R.layout.additional_text_view);
        this.f = new xvy(view, R.id.additional_info_icon, R.id.additional_info_icon, R.layout.additional_info_icon);
    }

    @Override // defpackage.kzy
    public final boolean d(kzx kzxVar, kzx kzxVar2) {
        if (kzxVar.N == kzxVar2.N && TextUtils.equals(kzxVar.J, kzxVar2.J)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.kzy
    public final void e(kzw kzwVar, kzd kzdVar) {
        int parseInt;
        String d = kzdVar.d("scheduled_messages_count");
        if (d == null) {
            parseInt = 0;
        } else {
            parseInt = Integer.parseInt(d);
        }
        this.b = parseInt;
        if (((Boolean) wsm.a.e()).booleanValue() && this.b > 0) {
            kzwVar.C = this.a.getResources().getQuantityString(R.plurals.scheduled_message, this.b);
            kzwVar.D = Integer.valueOf(R.drawable.gs_schedule_send_vd_theme_24);
            Integer valueOf = Integer.valueOf(R.attr.colorOnSurfaceVariant);
            kzwVar.E = valueOf;
            kzwVar.F = valueOf;
        }
    }

    @Override // defpackage.kzy
    public final kzx a(kzx kzxVar) {
        return kzxVar;
    }
}
