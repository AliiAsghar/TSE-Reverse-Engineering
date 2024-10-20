package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class askd implements asjy {
    @Override // defpackage.asjy
    public final List a() {
        return Arrays.asList("com.asus.launcher");
    }

    @Override // defpackage.asjy
    public final void b(Context context, ComponentName componentName, int i) {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i);
        intent.putExtra("badge_count_package_name", componentName.getPackageName());
        intent.putExtra("badge_count_class_name", componentName.getClassName());
        intent.putExtra("badge_vip_count", 0);
        if (arsd.aq(context, intent)) {
            context.sendBroadcast(intent);
            return;
        }
        throw new asjz("unable to resolve intent: ".concat(String.valueOf(intent.toString())));
    }
}
