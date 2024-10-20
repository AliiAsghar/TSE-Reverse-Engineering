package defpackage;

import android.content.Context;
import java.security.SecureRandom;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aizq {
    private static aizq b;
    public aodz a;
    private final String c;

    private aizq() {
        long abs;
        long nextLong = new SecureRandom().nextLong();
        long currentTimeMillis = System.currentTimeMillis();
        if (nextLong == Long.MIN_VALUE) {
            abs = 0;
        } else {
            abs = Math.abs(nextLong);
        }
        this.c = currentTimeMillis + "_" + abs;
    }

    public static aizq a() {
        if (b == null) {
            b = new aizq();
        }
        return b;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x033d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void e(defpackage.aozy r10, defpackage.apct r11, defpackage.aozn r12, android.content.Context r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 835
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aizq.e(aozy, apct, aozn, android.content.Context, java.lang.String):void");
    }

    public final void b(apob apobVar, apct apctVar, aozn aoznVar, Context context, String str) {
        aozy createBuilder = appj.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        appj appjVar = (appj) createBuilder.b;
        apobVar.getClass();
        appjVar.e = apobVar;
        appjVar.b |= 2;
        e(createBuilder, apctVar, aoznVar, context, str);
    }

    public final void c(apoj apojVar, apct apctVar, aozn aoznVar, Context context, String str) {
        aozy createBuilder = appj.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        appj appjVar = (appj) createBuilder.b;
        apojVar.getClass();
        appjVar.g = apojVar;
        appjVar.b |= 8;
        e(createBuilder, apctVar, aoznVar, context, str);
    }

    public final void d(appi appiVar, apct apctVar, aozn aoznVar, Context context, String str) {
        aozy createBuilder = appj.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        appj appjVar = (appj) createBuilder.b;
        appiVar.getClass();
        appjVar.f = appiVar;
        appjVar.b |= 4;
        e(createBuilder, apctVar, aoznVar, context, str);
    }
}
