package defpackage;

import android.content.Context;
import android.text.format.Formatter;
import com.google.android.apps.messaging.R;
import j$.util.DesugarArrays;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zhy extends zhz {
    private final ydf g;
    private final ykw h;
    private final armf i;

    public zhy(Context context, ydf ydfVar, ykw ykwVar, armf armfVar) {
        super(context);
        this.g = ydfVar;
        this.h = ykwVar;
        this.i = armfVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i) {
        float f = i;
        float f2 = 1.0f;
        while (f > 1024.0f) {
            f /= 1024.0f;
            f2 *= 1000.0f;
        }
        return (int) (f2 * f);
    }

    @Override // defpackage.zhz
    public final void b(int i) {
        String[] stringArray = this.a.getResources().getStringArray(R.array.rcs_mobile_data_auto_download_limit_entries);
        this.h.l(this.a.getString(R.string.rcs_mobile_data_auto_download_limit_pref_key), stringArray[i]);
        d();
    }

    @Override // defpackage.zhz
    public final void c() {
        String[] strArr;
        Context context = this.a;
        ykw ykwVar = this.h;
        String string = context.getString(R.string.rcs_mobile_data_auto_download_limit_disable_entry);
        String string2 = context.getString(R.string.rcs_mobile_data_auto_download_limit_default_entry);
        String f = ykwVar.f(context.getString(R.string.rcs_mobile_data_auto_download_limit_pref_key), context.getString(R.string.rcs_mobile_data_auto_download_limit_default_entry));
        if (this.g.f()) {
            strArr = this.a.getResources().getStringArray(R.array.rcs_mobile_data_auto_download_limit_entries);
        } else {
            strArr = (String[]) DesugarArrays.stream(this.a.getResources().getStringArray(R.array.rcs_mobile_data_auto_download_limit_entries)).filter(new zko(string, 1)).toArray(new adak(1));
        }
        this.d = Arrays.asList(strArr).indexOf(f);
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (str.equals(string)) {
                str = this.a.getString(R.string.rcs_mobile_data_auto_download_limit_disable_entry_text);
            } else if (str.equals(string2)) {
                if (this.g.f()) {
                    str = this.a.getString(R.string.rcs_mobile_data_auto_download_carrier_format_entry, Formatter.formatShortFileSize(this.a, a(this.g.e())));
                } else {
                    Context context2 = this.a;
                    str = context2.getString(R.string.rcs_mobile_data_auto_download_carrier_format_entry, context2.getString(R.string.rcs_mobile_data_auto_download_limit_disable_entry_text));
                }
            } else {
                int parseInt = Integer.parseInt(str);
                if (!((ogk) this.i.b()).a()) {
                    parseInt = a(parseInt);
                }
                if (parseInt != 0) {
                    str = Formatter.formatShortFileSize(this.a, parseInt);
                }
            }
            strArr[i] = str;
        }
        this.b = this.a.getString(R.string.set_rcs_mobile_data_auto_download_limit_title);
        this.c = strArr;
        super.c();
    }
}
