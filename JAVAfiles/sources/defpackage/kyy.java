package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kyy implements kzy {
    private final Context a;
    private final Resources b;
    private TextView c;
    private final znj d;

    public kyy(Context context, znj znjVar) {
        this.a = context;
        this.b = context.getResources();
        this.d = znjVar;
    }

    @Override // defpackage.kzy
    public final void b(kzx kzxVar, boolean z) {
        if (kzxVar.b == null) {
            this.c.setVisibility(8);
            return;
        }
        this.c.setVisibility(0);
        this.c.setText(kzxVar.b);
        TextView textView = this.c;
        Typeface typeface = kzxVar.c;
        Integer num = kzxVar.d;
        num.getClass();
        textView.setTypeface(typeface, num.intValue());
        TextView textView2 = this.c;
        Integer num2 = kzxVar.G;
        num2.getClass();
        textView2.setTextColor(ahnz.d(textView2, num2.intValue()));
    }

    @Override // defpackage.kzy
    public final void c(View view) {
        this.c = (TextView) view.findViewById(R.id.conversation_timestamp);
    }

    @Override // defpackage.kzy
    public final boolean d(kzx kzxVar, kzx kzxVar2) {
        boolean equals = TextUtils.equals(kzxVar2.b, kzxVar.b);
        boolean equals2 = Objects.equals(null, null);
        if (equals && equals2) {
            if (kzxVar.o == kzxVar2.o) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // defpackage.kzy
    public final void e(kzw kzwVar, kzd kzdVar) {
        boolean z;
        int i;
        int i2;
        int i3 = 1;
        if (!kzdVar.Y && kzdVar.E) {
            z = true;
        } else {
            z = false;
        }
        kzwVar.c = xvw.e(this.a);
        boolean a = ofn.a();
        int i4 = R.attr.colorOnSurfaceVariant;
        if ((!a || kzdVar.ac != mmy.c) && !z) {
            i4 = R.attr.colorOnSurface;
        }
        kzwVar.z = Integer.valueOf(i4);
        boolean K = lga.K(kzdVar);
        if (kzdVar.G) {
            kzwVar.b = this.b.getString(R.string.draft_indicator);
            if (true != K) {
                i2 = 3;
            } else {
                i2 = 2;
            }
            kzwVar.d = Integer.valueOf(i2);
            return;
        }
        znj znjVar = this.d;
        long j = kzdVar.L;
        if (true != DateFormat.is24HourFormat((Context) znjVar.a)) {
            i = 64;
        } else {
            i = 128;
        }
        kzwVar.b = yyb.aW(j, i, "M/d HH:mm", "M/d h:mma").toString();
        if ((ofn.a() && kzdVar.ac == mmy.c) || K) {
            i3 = 0;
        }
        kzwVar.d = Integer.valueOf(i3);
    }

    @Override // defpackage.kzy
    public final kzx a(kzx kzxVar) {
        return kzxVar;
    }
}
