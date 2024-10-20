package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.ims.util.common.RcsIntents;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adti extends adtd<Void> {
    private static final ConcurrentHashMap a = new ConcurrentHashMap();
    private final acoc b;

    public adti(acoc acocVar) {
        this.b = acocVar;
    }

    private static final String g(int i) {
        int i2 = i - 2;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    return "Unknown";
                }
                return "Reset Provisioning Engine";
            }
            return "Request re-configuration";
        }
        return "Send keep-alive";
    }

    public final String a(apfw apfwVar) {
        int Z = a.Z(apfwVar.b);
        if (Z == 0) {
            Z = 1;
        }
        return g(Z);
    }

    public final void b(adth adthVar, int i) {
        int ak = a.ak(i);
        ConcurrentHashMap concurrentHashMap = a;
        Integer valueOf = Integer.valueOf(ak);
        if (concurrentHashMap.containsKey(valueOf)) {
            advr.q("There is already an FCM tickle listener for message: %s!", g(i));
        }
        advr.c("Adding FCM tickle listener for action %s", g(i));
        concurrentHashMap.put(valueOf, adthVar);
    }

    @Override // defpackage.adtd
    public final /* synthetic */ void c(Context context, Intent intent) {
        char c;
        if (intent == null) {
            advr.q("Empty message received", new Object[0]);
            return;
        }
        if (!adtw.e(context, intent)) {
            advr.q("Caller not trusted, dropping self-service message: %s", intent);
            return;
        }
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode != 757492430) {
                if (hashCode == 1940170602 && action.equals(RcsIntents.ACTION_TACHYON_ANONYMOUS_DEVICE_ID)) {
                    c = 0;
                }
                c = 65535;
            } else {
                if (action.equals(RcsIntents.ACTION_RCS_SELF_SERVICE_MESSAGE)) {
                    c = 1;
                }
                c = 65535;
            }
            if (c != 0) {
                if (c != 1) {
                    return;
                }
                String stringExtra = intent.getStringExtra(RcsIntents.EXTRA_RCS_SELF_SERVICE_MESSAGE_ID);
                byte[] byteArrayExtra = intent.getByteArrayExtra(RcsIntents.EXTRA_RCS_SELF_SERVICE_MESSAGE);
                if (byteArrayExtra == null) {
                    advr.q("No extra found for a self-service message: %s", intent);
                    return;
                }
                try {
                    apfw apfwVar = (apfw) apag.parseFrom(apfw.a, byteArrayExtra, aozs.a());
                    if (!TextUtils.isEmpty(stringExtra)) {
                        aozy builder = apfwVar.toBuilder();
                        if (!builder.b.isMutable()) {
                            builder.u();
                        }
                        apfw apfwVar2 = (apfw) builder.b;
                        stringExtra.getClass();
                        apfwVar2.c = stringExtra;
                        apfwVar = (apfw) builder.s();
                    }
                    advr.c("Self-service message (%s) received: %s [%s]", stringExtra, intent.getAction(), a(apfwVar));
                    int Z = a.Z(apfwVar.b);
                    if (Z == 0 || Z != 3) {
                        this.b.g(context, apfwVar, null);
                    }
                    int i = apfwVar.b;
                    int Z2 = a.Z(i);
                    if (Z2 != 0 && Z2 == 2) {
                        advr.c("Unknown self-service message received", new Object[0]);
                        return;
                    }
                    adth adthVar = (adth) a.get(Integer.valueOf(i));
                    if (adthVar != null) {
                        adthVar.onTickle(apfwVar);
                        return;
                    } else {
                        advr.q("Cannot find a listener for self-service message: %s!", apfwVar);
                        return;
                    }
                } catch (apba e) {
                    String format = String.format("Could not parse extra for a self-service message: %s", intent);
                    advr.q("%s", format);
                    xyl.p(format, e);
                    return;
                }
            }
            String stringExtra2 = intent.getStringExtra(RcsIntents.EXTRA_TACHYON_ANONYMOUS_DEVICE_ID);
            if (TextUtils.isEmpty(stringExtra2)) {
                advr.q("No ID found for a self-service message: %s", intent);
            } else {
                advr.c("Self-service message received: %s [%s]", intent.getAction(), stringExtra2);
                aduv.i.e(stringExtra2);
            }
        }
    }

    public final void f(int i) {
        int ak = a.ak(i);
        ConcurrentHashMap concurrentHashMap = a;
        Integer valueOf = Integer.valueOf(ak);
        if (!concurrentHashMap.containsKey(valueOf)) {
            advr.q("There is no FCM tickle listener for action %s!", g(i));
        } else {
            advr.c("Removing FCM tickle listener for action %s", g(i));
            concurrentHashMap.remove(valueOf);
        }
    }
}
