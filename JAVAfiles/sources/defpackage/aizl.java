package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aizl extends ClickableSpan {
    final /* synthetic */ String a;
    final /* synthetic */ Activity b;
    final /* synthetic */ String c;

    public aizl(String str, Activity activity, String str2) {
        this.a = str;
        this.b = activity;
        this.c = str2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        asgf asgfVar = new asgf();
        String str = this.a;
        if (str != null) {
            ahnz.Q(this.b, str);
        } else {
            try {
                Activity activity = this.b;
                String str2 = this.c;
                activity.getClass();
                if (str2 != null && !str2.isEmpty()) {
                    Intent putExtra = new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.accountName", str2).putExtra("extra.screenId", 500);
                    if (putExtra.resolveActivity(activity.getPackageManager()) == null) {
                        ahop.b(activity);
                    } else {
                        activity.startActivityForResult(putExtra, 0);
                    }
                }
                ahop.b(activity);
            } catch (aicr e) {
                Log.e("ResourceUtils", "No app found to open URL: ".concat(String.valueOf(e.a)));
            }
        }
        Activity activity2 = this.b;
        String str3 = this.c;
        ahnz ahnzVar = aizp.c;
        if (!aizp.c(aqpe.b(aizp.b))) {
            return;
        }
        aizq a = aizq.a();
        aozy createBuilder = appi.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((appi) createBuilder.b).b = a.ap(2);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((appi) createBuilder.b).c = a.aj(4);
        a.d((appi) createBuilder.s(), asgfVar.b(), asgfVar.a(), activity2, str3);
    }
}
