package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acnu {
    public static final advp a = new advp("ClearcutUtil");
    private static alog b;
    private final wwn c;
    private final String d = UUID.randomUUID().toString();
    private final AtomicInteger e = new AtomicInteger();
    private final AtomicInteger f = new AtomicInteger();
    private final anen g;
    private final armf h;

    public acnu(wwn wwnVar, anen anenVar, armf armfVar) {
        this.c = wwnVar;
        this.h = armfVar;
        this.g = anenVar;
    }

    protected static final amnm d(String str, Context context) {
        aozy createBuilder = amnm.a.createBuilder();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            int i = packageInfo.versionCode;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amnm amnmVar = (amnm) createBuilder.b;
            amnmVar.b |= 1;
            amnmVar.c = i;
            if (packageInfo.versionName != null) {
                String str2 = packageInfo.versionName;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amnm amnmVar2 = (amnm) createBuilder.b;
                str2.getClass();
                amnmVar2.b |= 2;
                amnmVar2.d = str2;
            }
            advr.d(a, "%s client info: %s", str, Integer.valueOf(packageInfo.versionCode));
        } catch (PackageManager.NameNotFoundException e) {
            advr.i(e, "Failed to get %s client info", str);
        }
        return (amnm) createBuilder.s();
    }

    public final amva a(adiv adivVar) {
        String str = adom.n(adivVar).a;
        wxb wxbVar = (wxb) this.c.j(adivVar).orElse(wxb.a);
        wwz a2 = this.c.a();
        aozy createBuilder = amva.a.createBuilder();
        String str2 = wxbVar.p;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amva amvaVar = (amva) createBuilder.b;
        str2.getClass();
        amvaVar.b |= 1;
        amvaVar.c = str2;
        boolean equals = a2.c.equals(str);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amva amvaVar2 = (amva) createBuilder.b;
        amvaVar2.b |= 2;
        amvaVar2.d = equals;
        boolean equals2 = a2.d.equals(str);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amva amvaVar3 = (amva) createBuilder.b;
        amvaVar3.b |= 4;
        amvaVar3.e = equals2;
        boolean equals3 = a2.e.equals(str);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amva amvaVar4 = (amva) createBuilder.b;
        amvaVar4.b |= 8;
        amvaVar4.f = equals3;
        return (amva) createBuilder.s();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x013a, code lost:
    
        if (r9 == defpackage.amnn.CARRIER_SERVICES_EVENT_SOURCE_COMMON) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.content.Context r8, defpackage.amno r9, defpackage.apkj r10) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acnu.b(android.content.Context, amno, apkj):void");
    }

    public final synchronized boolean c(String str) {
        alog alogVar;
        alogVar = b;
        if (alogVar == null) {
            alogVar = alog.p(((String) aczf.o().a.r.a()).split(","));
            b = alogVar;
        }
        return alogVar.contains(str);
    }

    public final aozy e(Context context, amnn amnnVar) {
        aozy createBuilder = amno.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amno amnoVar = (amno) createBuilder.b;
        amnoVar.j = amnnVar.e;
        amnoVar.b |= 128;
        f(createBuilder, context);
        return createBuilder;
    }

    public final void f(aozy aozyVar, Context context) {
        boolean equals;
        amno amnoVar = (amno) aozyVar.b;
        if ((amnoVar.b & 256) != 0) {
            int Y = a.Y(amnoVar.k);
            if (Y != 0 && Y == 2) {
                equals = true;
            } else {
                equals = false;
            }
        } else {
            equals = "com.google.android.apps.messaging".equals(context.getPackageName());
        }
        if (equals) {
            amnm d = d("com.google.android.apps.messaging", context);
            if (!aozyVar.b.isMutable()) {
                aozyVar.u();
            }
            amno amnoVar2 = (amno) aozyVar.b;
            d.getClass();
            amnoVar2.h = d;
            amnoVar2.b |= 4;
            amnm amnmVar = amnm.a;
            if (!aozyVar.b.isMutable()) {
                aozyVar.u();
            }
            apag apagVar = aozyVar.b;
            amno amnoVar3 = (amno) apagVar;
            amnmVar.getClass();
            amnoVar3.g = amnmVar;
            amnoVar3.b |= 2;
            if (!apagVar.isMutable()) {
                aozyVar.u();
            }
            amno amnoVar4 = (amno) aozyVar.b;
            amnoVar4.k = 1;
            amnoVar4.b |= 256;
        } else if ("com.google.android.apps.tycho".equals(context.getPackageName())) {
            amnm d2 = d("com.google.android.apps.tycho", context);
            if (!aozyVar.b.isMutable()) {
                aozyVar.u();
            }
            apag apagVar2 = aozyVar.b;
            amno amnoVar5 = (amno) apagVar2;
            d2.getClass();
            amnoVar5.g = d2;
            amnoVar5.b |= 2;
            if (!apagVar2.isMutable()) {
                aozyVar.u();
            }
            amno amnoVar6 = (amno) aozyVar.b;
            amnoVar6.k = 3;
            amnoVar6.b |= 256;
        } else {
            amnm d3 = d("com.google.android.apps.messaging", context);
            if (!aozyVar.b.isMutable()) {
                aozyVar.u();
            }
            amno amnoVar7 = (amno) aozyVar.b;
            d3.getClass();
            amnoVar7.h = d3;
            amnoVar7.b |= 4;
            amnm d4 = d("com.google.android.ims", context);
            if (!aozyVar.b.isMutable()) {
                aozyVar.u();
            }
            apag apagVar3 = aozyVar.b;
            amno amnoVar8 = (amno) apagVar3;
            d4.getClass();
            amnoVar8.g = d4;
            amnoVar8.b |= 2;
            if (!apagVar3.isMutable()) {
                aozyVar.u();
            }
            amno amnoVar9 = (amno) aozyVar.b;
            amnoVar9.k = 2;
            amnoVar9.b |= 256;
        }
        if (!TextUtils.isEmpty((CharSequence) acpy.j.a())) {
            String str = (String) acpy.j.a();
            if (!aozyVar.b.isMutable()) {
                aozyVar.u();
            }
            amno amnoVar10 = (amno) aozyVar.b;
            str.getClass();
            amnoVar10.b |= 1024;
            amnoVar10.m = str;
        }
    }
}
