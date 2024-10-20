package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class askb implements asjy {
    private final /* synthetic */ int a;

    public askb(int i) {
        this.a = i;
    }

    @Override // defpackage.asjy
    public final List a() {
        if (this.a != 0) {
            return new ArrayList(0);
        }
        return Arrays.asList("org.adw.launcher", "org.adwfreak.launcher");
    }

    @Override // defpackage.asjy
    public final void b(Context context, ComponentName componentName, int i) {
        if (this.a != 0) {
            Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
            intent.putExtra("badge_count", i);
            intent.putExtra("badge_count_package_name", componentName.getPackageName());
            intent.putExtra("badge_count_class_name", componentName.getClassName());
            if (arsd.aq(context, intent)) {
                context.sendBroadcast(intent);
                return;
            }
            throw new asjz("unable to resolve intent: ".concat(String.valueOf(intent.toString())));
        }
        Intent intent2 = new Intent("org.adw.launcher.counter.SEND");
        intent2.putExtra("PNAME", componentName.getPackageName());
        intent2.putExtra("CNAME", componentName.getClassName());
        intent2.putExtra("COUNT", i);
        if (arsd.aq(context, intent2)) {
            context.sendBroadcast(intent2);
            return;
        }
        throw new asjz("unable to resolve intent: ".concat(String.valueOf(intent2.toString())));
    }
}
