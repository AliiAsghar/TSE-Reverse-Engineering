package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class abrd {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public abrd(anen anenVar, anen anenVar2, vbs vbsVar, vbu vbuVar, xdj xdjVar) {
        this.e = vbsVar;
        this.b = anenVar;
        this.d = vbuVar;
        this.a = anenVar2;
        this.c = xdjVar;
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, wjr] */
    /* JADX WARN: Type inference failed for: r4v2, types: [apwt, java.lang.Object] */
    public final void a(Activity activity, int i, int i2, aayl aaylVar) {
        if (i != 201) {
            return;
        }
        if (i2 == -1) {
            ((ykw) this.b).h("boew_promo_complete", true);
            ((adnk) this.a.b()).G();
            this.c.j(((adtn) this.e).l(), amww.BATTERY_OPTIMIZATION_DIALOG);
            aaylVar.h(activity);
            return;
        }
        aaylVar.j();
        ((mho) this.d.b()).aS(41);
        new AlertDialog.Builder(activity).setTitle(R.string.boew_promo_double_check_dialog_title_v2).setMessage(R.string.boew_promo_double_check_dialog_text_v2).setCancelable(false).setNegativeButton(R.string.boew_promo_double_check_dialog_negative_button_text, new ise(aaylVar, activity, 12, null)).setPositiveButton(R.string.boew_promo_double_check_dialog_positive_button_text, new aajo(aaylVar, 7)).create().show();
    }

    public abrd(ykw ykwVar, apwt apwtVar, wjr wjrVar, adtn adtnVar, armf armfVar) {
        this.b = ykwVar;
        this.d = apwtVar;
        this.c = wjrVar;
        this.e = adtnVar;
        this.a = armfVar;
    }

    public abrd(Context context) {
        this.a = new HashSet();
        new HashSet();
        this.d = new tm();
        this.e = new tm();
        abqa abqaVar = abqa.a;
        abqt abqtVar = achv.a;
        new ArrayList();
        new ArrayList();
        context.getMainLooper();
        this.b = context.getPackageName();
        this.c = context.getClass().getName();
    }
}
