package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class askn implements asjy {
    @Override // defpackage.asjy
    public final List a() {
        return Arrays.asList("com.miui.miuilite", "com.miui.home", "com.miui.miuihome", "com.miui.miuihome2", "com.miui.mihome", "com.miui.mihome2");
    }

    @Override // defpackage.asjy
    public final void b(Context context, ComponentName componentName, int i) {
        Object valueOf;
        Object obj = "";
        try {
            Object newInstance = Class.forName("android.app.MiuiNotification").newInstance();
            Field declaredField = newInstance.getClass().getDeclaredField("messageCount");
            declaredField.setAccessible(true);
            if (i == 0) {
                valueOf = "";
            } else {
                try {
                    valueOf = Integer.valueOf(i);
                } catch (Exception unused) {
                    declaredField.set(newInstance, Integer.valueOf(i));
                    return;
                }
            }
            declaredField.set(newInstance, valueOf.toString());
        } catch (Exception unused2) {
            Intent intent = new Intent("android.intent.action.APPLICATION_MESSAGE_UPDATE");
            intent.putExtra("android.intent.extra.update_application_component_name", componentName.getPackageName() + "/" + componentName.getClassName());
            if (i != 0) {
                obj = Integer.valueOf(i);
            }
            intent.putExtra("android.intent.extra.update_application_message_text", obj.toString());
            if (arsd.aq(context, intent)) {
                context.sendBroadcast(intent);
                return;
            }
            throw new asjz("unable to resolve intent: ".concat(String.valueOf(intent.toString())));
        }
    }
}
