package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kys implements kzy {
    private final Context a;
    private final xnv b;
    private TextView c;
    private ImageView d;
    private xvy e;
    private xvy f;

    public kys(Context context, xnv xnvVar) {
        this.a = context;
        this.b = xnvVar;
    }

    private static long f(kzd kzdVar) {
        String d = kzdVar.d("earliest_reminder_trigger_time");
        if (TextUtils.isEmpty(d)) {
            return 0L;
        }
        return Long.parseLong(d);
    }

    private final void g(kzx kzxVar) {
        if (!abal.c()) {
            this.e.g(8);
            this.f.g(8);
            return;
        }
        if ((!yig.e() || !kzxVar.C) && ((!ier.a() || !kzxVar.S) && TextUtils.isEmpty(kzxVar.J))) {
            this.e.g(8);
        }
        if (TextUtils.isEmpty(kzxVar.J)) {
            this.f.g(8);
        }
    }

    private final void h(kzw kzwVar, kzd kzdVar, Long l, boolean z) {
        int i;
        int i2;
        boolean z2 = false;
        if (abal.b() && f(kzdVar) != 0 && l != null) {
            if (l.longValue() < this.b.f().toEpochMilli()) {
                z2 = true;
            }
            Resources resources = this.a.getResources();
            if (!z) {
                boolean c = abal.c();
                int i3 = R.drawable.quantum_ic_alarm_black_24;
                if (!c && z2) {
                    i3 = R.drawable.quantum_ic_alarm_on_black_24;
                }
                kzwVar.u = Integer.valueOf(i3);
            }
            kzwVar.r = l;
            kzwVar.e(true);
            kzwVar.d(!z);
            if (z2) {
                if (true != abal.c()) {
                    i = R.string.missed_reminder;
                } else {
                    i = R.string.active_reminder;
                }
            } else {
                i = R.string.upcoming_reminder;
            }
            kzwVar.s = resources.getText(i).toString();
            int i4 = R.attr.colorOnSurfaceVariant;
            if (true != z2) {
                i2 = R.attr.colorOnSurfaceVariant;
            } else {
                i2 = R.attr.colorPrimaryBrandNonIcon;
            }
            kzwVar.t = Integer.valueOf(i2);
            if (true == z2) {
                i4 = R.attr.colorPrimaryBrandIcon;
            }
            kzwVar.v = Integer.valueOf(i4);
            return;
        }
        kzwVar.e(false);
        kzwVar.d(false);
    }

    @Override // defpackage.kzy
    public final kzx a(kzx kzxVar) {
        kzw kzwVar = new kzw(kzxVar);
        h(kzwVar, kzxVar.a, kzxVar.v, kzxVar.N);
        return kzwVar.a();
    }

    @Override // defpackage.kzy
    public final void b(kzx kzxVar, boolean z) {
        boolean z2;
        Long l = kzxVar.v;
        if (l != null && l.longValue() != 0) {
            kzx a = a(kzxVar);
            if (!a.w) {
                g(a);
                return;
            }
            int i = 0;
            this.e.g(0);
            TextView textView = (TextView) this.e.b();
            this.c = textView;
            if (textView != null) {
                String str = a.y;
                str.getClass();
                textView.setText(str);
                TextView textView2 = this.c;
                Integer num = a.z;
                num.getClass();
                textView2.setTextColor(ahnz.d(textView2, num.intValue()));
            }
            if (this.c != null && a.x) {
                z2 = true;
            } else {
                z2 = false;
            }
            xvy xvyVar = this.f;
            if (true != z2) {
                i = 8;
            }
            xvyVar.g(i);
            if (z2) {
                ImageView imageView = (ImageView) this.f.b();
                this.d = imageView;
                if (imageView != null) {
                    Integer num2 = a.A;
                    num2.getClass();
                    imageView.setImageResource(num2.intValue());
                    ImageView imageView2 = this.d;
                    Integer num3 = a.B;
                    num3.getClass();
                    imageView2.setColorFilter(ahnz.d(imageView2, num3.intValue()));
                    return;
                }
                return;
            }
            return;
        }
        g(kzxVar);
    }

    @Override // defpackage.kzy
    public final void c(View view) {
        this.e = new xvy(view, R.id.additional_text, R.id.additional_text, R.layout.additional_text_view);
        this.f = new xvy(view, R.id.additional_info_icon, R.id.additional_info_icon, R.layout.additional_info_icon);
    }

    @Override // defpackage.kzy
    public final boolean d(kzx kzxVar, kzx kzxVar2) {
        boolean z;
        Long l = kzxVar2.v;
        if (l != null && !l.equals(kzxVar.v)) {
            z = true;
        } else {
            z = false;
        }
        if (abal.c()) {
            if (!z && kzxVar.w == kzxVar2.w && kzxVar.x == kzxVar2.x) {
                return false;
            }
            return true;
        }
        return z;
    }

    @Override // defpackage.kzy
    public final void e(kzw kzwVar, kzd kzdVar) {
        h(kzwVar, kzdVar, Long.valueOf(f(kzdVar)), kzdVar.e());
    }
}
