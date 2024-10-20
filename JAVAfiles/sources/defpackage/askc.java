package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class askc implements asjy {
    @Override // defpackage.asjy
    public final List a() {
        return Arrays.asList("com.anddoes.launcher");
    }

    @Override // defpackage.asjy
    public final void b(Context context, ComponentName componentName, int i) {
        Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
        intent.putExtra("package", componentName.getPackageName());
        intent.putExtra("count", i);
        intent.putExtra("class", componentName.getClassName());
        if (arsd.aq(context, intent)) {
            context.sendBroadcast(intent);
            return;
        }
        throw new asjz("unable to resolve intent: ".concat(String.valueOf(intent.toString())));
    }
}
