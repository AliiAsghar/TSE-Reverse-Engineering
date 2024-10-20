package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import com.android.vcard.VCardConfig;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aknd {
    public static final alvi a = alvi.m("com/google/apps/tiktok/nav/gateway/GatewayMixin");
    private static final String h = "$GA$" + System.currentTimeMillis();
    public final akbo b;
    public final aknb c;
    public final boolean d;
    public int f;
    public int g;
    private final Activity i;
    private final ajyk j = new akaf(this, 3);
    public final akbp e = new akbp<Void, akna>() { // from class: aknd.1
        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
            alvw h2 = aknd.a.h();
            h2.X(alwp.a, "GatewayActivityPeer");
            ((alvg) ((alvg) ((alvg) h2).g(th)).h("com/google/apps/tiktok/nav/gateway/GatewayMixin$2", "onFailure", 'k', "GatewayMixin.java")).q("Couldn't get redirect intent.");
            aknd.this.b(akna.b());
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            aknd.this.b((akna) obj2);
        }

        @Override // defpackage.akbp
        public final /* synthetic */ void b(Object obj) {
        }
    };

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006a, code lost:
    
        if (r7.getBoolean("com.google.apps.tiktok.nav.gateway.skip_intent_filter_validation") != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008e, code lost:
    
        if (r14.getAction() == null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public aknd(android.app.Activity r11, java.util.Map r12, defpackage.armf r13, defpackage.akbo r14) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aknd.<init>(android.app.Activity, java.util.Map, armf, akbo):void");
    }

    private static void d(Intent intent) {
        boolean z;
        if ((intent.getFlags() & 195) == 0) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "Redirects to external apps must not grant Uri access.");
    }

    private static void e(Intent intent) {
        albo.U(!intent.hasExtra(h), "GatewayHandlers must not blindly forward all intent extras.");
    }

    private static void f(Intent intent) {
        String str = h;
        intent.putExtra(str, str);
        Bundle extras = intent.getExtras();
        if (extras != null) {
            ArrayList arrayList = new ArrayList();
            for (String str2 : extras.keySet()) {
                try {
                    Object obj = extras.get(str2);
                    if (obj instanceof Intent) {
                        f((Intent) obj);
                    }
                } catch (Throwable th) {
                    alvw h2 = a.h();
                    h2.X(alwp.a, "GatewayActivityPeer");
                    ((alvg) ((alvg) ((alvg) h2).g(th)).h("com/google/apps/tiktok/nav/gateway/GatewayMixin", "taintExtras", (char) 464, "GatewayMixin.java")).q("Failed to read extra from Intent. Removing it.");
                    arrayList.add(str2);
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                intent.removeExtra((String) arrayList.get(i));
            }
        }
    }

    public final void a() {
        int i = this.f;
        if (i != 0) {
            this.i.setTheme(i);
        }
        int i2 = this.g;
        if (i2 != 0) {
            this.i.setContentView(i2);
        }
    }

    public final void b(akna aknaVar) {
        int i = aknaVar.a;
        Intent intent = null;
        boolean z = true;
        if (i == 1) {
            List<Intent> list = aknaVar.b;
            albo.T(!list.isEmpty());
            String packageName = this.i.getPackageName();
            for (Intent intent2 : list) {
                e(intent2);
                intent2.setPackage(packageName);
                if (intent2.getData() != null && intent2.getType() == null && "content".equals(intent2.getData().getScheme())) {
                    alvw h2 = a.h();
                    h2.X(alwp.a, "GatewayActivityPeer");
                    ((alvg) ((alvg) h2).h("com/google/apps/tiktok/nav/gateway/GatewayMixin", "handleDestination", 251, "GatewayMixin.java")).q("Intent with [data] was missing [type]. Both must be set.");
                }
            }
            Intent intent3 = (Intent) list.get(list.size() - 1);
            if (list.size() == 1) {
                intent3.addFlags(VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING);
            } else if (list.size() > 1) {
                if ((((Intent) list.get(0)).getFlags() & VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES) == 0) {
                    z = false;
                }
                d.t(z, "Adding multiple activities requires using a new task.");
            }
            if (!aknaVar.c) {
                intent3.addFlags(65536);
            }
            try {
                Activity activity = this.i;
                Intent[] intentArr = (Intent[]) list.toArray(new Intent[0]);
                long j = akto.a;
                activity.getClass();
                intentArr.getClass();
                int length = intentArr.length;
                if (length != 0) {
                    int i2 = length - 1;
                    Intent intent4 = new Intent(intentArr[i2]);
                    intentArr[i2] = intent4;
                    akti r = akto.r(intent4);
                    try {
                        activity.startActivities(intentArr);
                        armd.i(r, null);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            armd.i(r, th);
                            throw th2;
                        }
                    }
                }
            } catch (ActivityNotFoundException | SecurityException e) {
                alvw h3 = a.h();
                h3.X(alwp.a, "GatewayActivityPeer");
                ((alvg) ((alvg) ((alvg) h3).g(e)).h("com/google/apps/tiktok/nav/gateway/GatewayMixin", "handleDestination", (char) 275, "GatewayMixin.java")).q("Missing internal activity.");
            }
            this.i.finish();
            return;
        }
        if (i == 2) {
            Intent intent5 = (Intent) alzz.aP(aknaVar.b);
            e(intent5);
            d(intent5);
            try {
                akto.n(this.i, intent5);
            } catch (ActivityNotFoundException | SecurityException e2) {
                alvw h4 = a.h();
                h4.X(alwp.a, "GatewayActivityPeer");
                ((alvg) ((alvg) ((alvg) h4).g(e2)).h("com/google/apps/tiktok/nav/gateway/GatewayMixin", "handleDestination", 286, "GatewayMixin.java")).t("Missing external activity for %s.", intent5);
            }
            this.i.finish();
            return;
        }
        if (i == 3) {
            Intent intent6 = this.i.getIntent();
            if (intent6.getPackage() != null) {
                this.i.finish();
            }
            Uri data = intent6.getData();
            if (data != null && ("https".equals(data.getScheme()) || "http".equals(data.getScheme()))) {
                Activity activity2 = this.i;
                Intent intent7 = new Intent("android.intent.action.VIEW", Uri.parse("https://*"));
                intent7.addCategory("android.intent.category.BROWSABLE");
                String packageName2 = activity2.getPackageName();
                Iterator<ResolveInfo> it = activity2.getPackageManager().queryIntentActivities(intent7, 65536).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityInfo activityInfo = it.next().activityInfo;
                    if (!packageName2.equals(activityInfo.packageName)) {
                        intent = new Intent("android.intent.action.VIEW", data);
                        intent.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                        break;
                    }
                }
                if (intent != null) {
                    intent.addFlags(524288);
                    akto.n(this.i, intent);
                } else {
                    alvw g = a.g();
                    g.X(alwp.a, "GatewayActivityPeer");
                    ((alvg) ((alvg) g).h("com/google/apps/tiktok/nav/gateway/GatewayMixin", "handleDestination", 314, "GatewayMixin.java")).q("No browser is installed on the device.");
                }
                this.i.finish();
                return;
            }
            alvw h5 = a.h();
            h5.X(alwp.a, "GatewayActivityPeer");
            ((alvg) ((alvg) h5).h("com/google/apps/tiktok/nav/gateway/GatewayMixin", "handleDestination", 304, "GatewayMixin.java")).q("Can't redirect non-http(s) intent to browser.");
            this.i.finish();
            return;
        }
        if (i == 4) {
            if (!aknaVar.b.isEmpty()) {
                Intent intent8 = (Intent) alzz.aP(aknaVar.b);
                d(intent8);
                e(intent8);
                this.i.setResult(-1, intent8);
            }
            this.i.finish();
            return;
        }
        if (i == 5) {
            alvw f = a.f();
            f.X(alwp.a, "GatewayActivityPeer");
            ((alvg) ((alvg) f).h("com/google/apps/tiktok/nav/gateway/GatewayMixin", "handleDestination", 333, "GatewayMixin.java")).q("Not redirecting");
            this.i.finish();
        }
    }

    public final void c() {
        ListenableFuture c = this.c.c();
        if (!c.isDone()) {
            this.c.d();
            this.f = 0;
            this.c.b();
            this.g = 0;
            a();
        }
        this.b.k(new ahlp(c), new ahlp((Object) null), this.e);
    }
}
