package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zig extends zhz {
    private String[] g;
    private String[] h;
    private String[] i;
    private Locale j;
    private final adve k;

    public zig(Context context, adve adveVar) {
        super(context);
        this.k = adveVar;
    }

    private static int a(String[] strArr, String str) {
        if (strArr != null) {
            for (int i = 0; i < strArr.length; i++) {
                if (TextUtils.equals(strArr[i], str)) {
                    return i;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // defpackage.zhz
    public final void b(int i) {
        String str;
        int a;
        xyl.d(i, 0, this.i.length - 1);
        if (i > 0 && (a = a(this.h, this.i[i])) >= 0) {
            str = this.g[a];
        } else {
            str = "auto";
        }
        adve adveVar = this.k;
        ((ykw) adveVar.b).l(adveVar.f(), str);
    }

    @Override // defpackage.zhz
    public final void c() {
        int i = 0;
        Locale f = dzf.c(this.a.getResources().getConfiguration()).f(0);
        if (!Objects.equals(this.j, f)) {
            this.j = f;
            String[] iSOCountries = Locale.getISOCountries();
            this.g = iSOCountries;
            this.h = new String[iSOCountries.length];
            int i2 = 0;
            while (true) {
                String[] strArr = this.g;
                if (i2 >= strArr.length) {
                    break;
                }
                this.h[i2] = new Locale("", strArr[i2]).getDisplayCountry(this.j);
                i2++;
            }
            String[] strArr2 = new String[this.h.length + 1];
            this.i = strArr2;
            strArr2[0] = this.a.getString(R.string.auto_detected_country);
            String[] strArr3 = this.h;
            System.arraycopy(strArr3, 0, this.i, 1, strArr3.length);
            String[] strArr4 = this.i;
            Arrays.sort(strArr4, 1, strArr4.length);
        }
        this.b = this.a.getString(R.string.current_country_pref_title);
        this.c = this.i;
        String e = this.k.e();
        if (!yyb.an(e)) {
            int a = a(this.g, e);
            if (a < 0) {
                i = -1;
            } else {
                i = a(this.i, this.h[a]);
            }
        }
        this.d = i;
        super.c();
    }
}
