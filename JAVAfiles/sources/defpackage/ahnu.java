package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.CancellationSignal;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.performance.primes.metrics.crash.NativeCrashHandlerImpl;
import com.google.android.libraries.surveys.internal.view.SurveyViewPager;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ahnu implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ahnu(acit acitVar, int i) {
        this.c = i;
        this.b = acitVar;
        this.a = "Location timeout.";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, android.view.ViewTreeObserver$OnDrawListener] */
    /* JADX WARN: Type inference failed for: r1v32, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.lang.Object, aiia] */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, aiib] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.Collection, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                ((NativeCrashHandlerImpl) this.a).b((ahnn) this.b);
                return;
            case 1:
                int i = ((ahkg) this.b).a;
                if (i != 0) {
                    Process.setThreadPriority(i);
                }
                this.a.run();
                return;
            case 2:
                ((ahoe) this.b).i((algw) this.a);
                return;
            case 3:
                ((ahpc) this.a).b.d.a(5, ((ahka) this.b).a);
                return;
            case 4:
                ((ahpc) this.a).b.d.a(6, ((ahka) this.b).a);
                return;
            case 5:
                ((View) this.b).getViewTreeObserver().removeOnDrawListener(this.a);
                return;
            case 6:
                ((ahrr) this.b).a(this.a);
                return;
            case 7:
                SharedPreferences a = ahvb.a((Context) this.b);
                SharedPreferences.Editor editor = null;
                for (Map.Entry<String, ?> entry : a.getAll().entrySet()) {
                    if (entry.getValue() instanceof String) {
                        if (entry.getValue().equals(this.a)) {
                            if (editor == null) {
                                editor = a.edit();
                            }
                            editor.remove(entry.getKey());
                        }
                    }
                }
                if (editor != null) {
                    editor.commit();
                    return;
                }
                return;
            case 8:
                ahta ahtaVar = (ahta) this.b;
                if (!ahtaVar.d.getPackageName().equals("com.android.vending")) {
                    Object obj = this.a;
                    if (!ahuv.a(ahtaVar.d).containsKey(obj)) {
                        Log.e("PhenotypeCombinedFlags", a.bW((String) obj, "Config package ", " cannot use PROCESS_STABLE backing without declarative registration. See go/phenotype-android-integration#phenotype for more information. This will lead to stale flags."));
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ((ahut) this.b).c(this.a);
                return;
            case 10:
                try {
                    albo.bQ(this.a);
                    return;
                } catch (Exception e) {
                    Log.w("MobStoreFlagStore", "Failed to store account on flag read for: " + ((ahut) this.b).b + " which may lead to stale flags.", e);
                    return;
                }
            case 11:
                ((acit) this.b).c(new abra(new Status(15, (String) this.a)));
                return;
            case 12:
                aieb.a(this.b, (Object[]) this.a);
                return;
            case 13:
                advp advpVar = aihw.a;
                this.a.a((aihy) this.b);
                return;
            case 14:
                advp advpVar2 = aihw.a;
                this.a.a((aihz) this.b);
                return;
            case 15:
                aipl.h(((aipl) this.a).b, (aipc) this.b);
                return;
            case 16:
                if (((anel) this.a).isCancelled()) {
                    ((CancellationSignal) ((agrk) this.b).a).cancel();
                    return;
                }
                return;
            case 17:
                aizi aiziVar = (aizi) this.b;
                aiziVar.e.c(aiziVar.b((apqf) this.a));
                return;
            case 18:
                ((SurveyViewPager) this.b).u().q((String) this.a);
                return;
            case 19:
                ((gnm) this.b).b(((ViewPager) this.a).c);
                return;
            default:
                albo.U(Looper.getMainLooper().equals(Looper.myLooper()), "Should be called on the UI thread!");
                Object obj2 = ((adnx) this.b).a;
                ajca ajcaVar = (ajca) obj2;
                ajby ajbyVar = ajcaVar.d;
                ajbyVar.c = alog.n(this.a);
                ajbyVar.p();
                ajcaVar.b.setDisplayedChild(1);
                if (!ajcaVar.ag) {
                    String string = ((cg) obj2).m.getString("com.google.android.libraries.tachyon.countrycode.arg.COUNTRY_CODE_SELECTED");
                    int i2 = 0;
                    for (int i3 = 0; i3 < ajcaVar.d.b(); i3++) {
                        if (TextUtils.equals(((ajcb) ajcaVar.d.c.get(i3)).c, string)) {
                            ajcaVar.c.post(new ajbz(obj2, i3, i2));
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ ahnu(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ ahnu(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
