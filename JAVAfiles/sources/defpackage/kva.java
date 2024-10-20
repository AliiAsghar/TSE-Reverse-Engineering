package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.gms.feedback.FileTeleporter;
import j$.util.Optional;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kva implements Callable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kva(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v95, types: [xyt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v22, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v28, types: [armf, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        boolean z = true;
        switch (this.b) {
            case 0:
                alvw g = kvw.a.g();
                g.X(alwp.a, "HomeFragmentFlogger");
                ((alvg) ((alvg) g).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "onCreate", 1084, "HomeFragmentPeer.java")).q("Home data service notify OobeWontLaunch");
                ((kvw) this.a).z.b();
                return null;
            case 1:
                File file = (File) this.a;
                if (!file.exists()) {
                    return Optional.empty();
                }
                FileInputStream fileInputStream = new FileInputStream(file);
                Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream);
                fileInputStream.close();
                file.delete();
                return Optional.of(decodeStream);
            case 2:
                alvw g2 = kvw.a.g();
                g2.X(alwp.a, "HomeFragmentFlogger");
                ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "onCreate", 1073, "HomeFragmentPeer.java")).q("Home data service notify OobeWontLaunch");
                ((kvw) this.a).z.b();
                return null;
            case 3:
                its itsVar = new its(15);
                agmq n = ((agoz) this.a).n();
                try {
                    alob d = alog.d(n.getCount());
                    while (n.moveToNext()) {
                        d.h(itsVar.apply(n));
                    }
                    alog g3 = d.g();
                    n.close();
                    return g3;
                } catch (Throwable th) {
                    try {
                        n.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 4:
                return Boolean.valueOf(((zxy) ((rae) this.a).a).o());
            case 5:
                return Boolean.valueOf(((zxy) ((rae) this.a).a).n());
            case 6:
                return Boolean.valueOf(((zxy) ((rae) this.a).a).r());
            case 7:
                slk slkVar = new slk(slm.a);
                slkVar.w("logPinToTopDailyEventLogger");
                int i2 = slkVar.b().i();
                aozy createBuilder = amwr.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                Object obj = this.a;
                amwr amwrVar = (amwr) createBuilder.b;
                amwrVar.b |= 1;
                amwrVar.c = i2;
                amwr amwrVar2 = (amwr) createBuilder.s();
                maq maqVar = (maq) ((lxe) obj).b.b();
                amfq amfqVar = (amfq) amfr.a.createBuilder();
                amfp amfpVar = amfp.PIN_TO_TOP_EVENT;
                if (!amfqVar.b.isMutable()) {
                    amfqVar.u();
                }
                amfr amfrVar = (amfr) amfqVar.b;
                amfrVar.i = amfpVar.dg;
                amfrVar.b |= 1;
                aozy createBuilder2 = amws.a.createBuilder();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                amws amwsVar = (amws) createBuilder2.b;
                amwrVar2.getClass();
                amwsVar.c = amwrVar2;
                amwsVar.b = 5;
                if (!amfqVar.b.isMutable()) {
                    amfqVar.u();
                }
                amfr amfrVar2 = (amfr) amfqVar.b;
                amws amwsVar2 = (amws) createBuilder2.s();
                amwsVar2.getClass();
                amfrVar2.aJ = amwsVar2;
                amfrVar2.e |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
                maqVar.j(amfqVar);
                return null;
            case 8:
                lrb lrbVar = (lrb) this.a;
                lqx lqxVar = lrbVar.a;
                long e = ((ykw) lqxVar.d.b()).e("conversation_list_last_popup_show_timestamp_ms", 0L);
                long epochMilli = lqxVar.e.f().toEpochMilli();
                if (e == 0 || epochMilli >= e + lqx.c) {
                    yyt yytVar = (yyt) lrbVar.b.b();
                    atal X = ((wfh) yytVar.c.b()).X();
                    if (!X.l() && (i = X.a) != 1 && i != 2 && (!X.n() || !yytVar.i(X, ((ykw) yytVar.d.b()).q(((Context) yytVar.b).getString(R.string.spam_detection_pref_key), false)))) {
                        if (!((ykw) yytVar.d.b()).q("spam_popup_dismissed", false)) {
                            long e2 = ((ykw) yytVar.d.b()).e("spam_popup_seen_timestamp", -1L);
                            if (e2 != -1 && ((xnv) yytVar.a).f().toEpochMilli() > e2 + TimeUnit.HOURS.toMillis(12L)) {
                                yytVar.a();
                            }
                            return Boolean.valueOf(z);
                        }
                        yytVar.h(X);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 9:
                ((wnz) ((lsr) this.a).e.b()).A();
                return null;
            case 10:
                ArrayList arrayList = new ArrayList();
                if (((Boolean) utw.Y.e()).booleanValue()) {
                    mel melVar = (mel) this.a;
                    byte[] b = melVar.b();
                    if (b != null) {
                        arrayList.add(new FileTeleporter(b, "Message status log"));
                    }
                    byte[] a = melVar.a();
                    if (a != null) {
                        arrayList.add(new FileTeleporter(a, "App event log"));
                    }
                }
                return arrayList;
            case 11:
                return Integer.valueOf(((lzy) ((lig) this.a).k).c(mho.a));
            case 12:
                return Integer.valueOf(((lzy) ((lig) this.a).k).c(mho.c));
            case 13:
                return Integer.valueOf(((lzy) ((lig) this.a).k).b(mho.a));
            case 14:
                return Integer.valueOf(((lzy) ((lig) this.a).k).b(mho.c));
            case 15:
                return ((lzy) ((lig) this.a).k).d(mho.a);
            case 16:
                return ((vrn) ((lig) this.a).e.a()).x();
            case 17:
                return ((lzy) ((lig) this.a).k).d(mho.b);
            case 18:
                return ((lzy) ((lig) this.a).k).d(mho.c);
            case 19:
                return Integer.valueOf(((lzy) ((lig) this.a).k).a(mho.a));
            default:
                return Integer.valueOf(((lzy) ((lig) this.a).k).a(mho.c));
        }
    }
}
