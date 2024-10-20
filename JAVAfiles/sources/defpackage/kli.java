package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.RecurringTelemetryUploaderAction;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateConversationEncryptionStatusAction;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.gms.feedback.FileTeleporter;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kli implements Callable {
    private final /* synthetic */ int a;

    public /* synthetic */ kli(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object apply;
        int i = 0;
        switch (this.a) {
            case 0:
                uuf uufVar = klj.a;
                return null;
            case 1:
                return Thread.currentThread();
            case 2:
                xze xzeVar = kpa.a;
                return null;
            case 3:
                ArrayList arrayList = new ArrayList();
                StringBuilder sb = new StringBuilder();
                tcw tcwVar = new tcw(tcz.a);
                tcwVar.w("getUnredactedPhoneNumberPsbd");
                apply = new koa(8).apply(new tcy());
                tcwVar.k(new agpw((tcy) apply));
                ifq ifqVar = tcz.d;
                tct[] tctVarArr = {(tct) ifqVar.a, (tct) ifqVar.b};
                int c = a.bp().c();
                Integer.valueOf(c).getClass();
                while (i < 2) {
                    if (((Integer) tcz.b.getOrDefault(tctVarArr[i].toString(), -1)).intValue() > c) {
                        agnc.t("columnReference.toString()", c);
                    }
                    i++;
                }
                tcwVar.m(tctVarArr);
                tcu tcuVar = (tcu) tcwVar.b().n();
                while (tcuVar.moveToNext()) {
                    try {
                        String f = tcuVar.f();
                        String g = tcuVar.g();
                        f.getClass();
                        g.getClass();
                        sb.append("original = ");
                        sb.append(f);
                        sb.append(", hashValue = ");
                        sb.append(g);
                        sb.append("\n");
                    } catch (Throwable th) {
                        try {
                            tcuVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                tcuVar.close();
                if (TextUtils.isEmpty(sb.toString())) {
                    sb.append("No unredacted phone number.\n");
                }
                arrayList.add(new FileTeleporter(sb.toString().getBytes(), "unredacted_phone_number"));
                return arrayList;
            case 4:
                return Integer.valueOf(yyb.aZ());
            case 5:
                return Long.valueOf(mfo.f);
            case 6:
                sxy d = MessagesTable.d();
                d.w("SharedRecurringMetrics#create");
                d.q();
                return Integer.valueOf(d.b().i());
            case 7:
                return Integer.valueOf(yyb.aZ());
            case 8:
                sjk a = sjm.a();
                a.w("getContactHeaderSections");
                a.q();
                a.d(new mfk(12));
                a.n(new agpk("COUNT(distinct $V)", new Object[]{sjm.e.o}), "count");
                tby tbyVar = sjm.e;
                a.e(new atkn((agmh) tbyVar.f, (byte[]) null), new atkn((agmh) tbyVar.k, (byte[]) null));
                a.t((agmh) sjm.e.b);
                sjh sjhVar = (sjh) a.b().n();
                try {
                    alob alobVar = new alob();
                    while (sjhVar.moveToNext()) {
                        int parseInt = Integer.parseInt(sjhVar.cX("count"));
                        alobVar.h(new mkc(sjhVar.s(), i, parseInt));
                        i += parseInt;
                    }
                    alog g2 = alobVar.g();
                    sjhVar.close();
                    return g2;
                } catch (Throwable th3) {
                    try {
                        sjhVar.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            case 9:
            case 14:
            case 16:
            case 17:
            case 18:
            default:
                return null;
            case 10:
                return upm.b();
            case 11:
                return Integer.valueOf(qyo.b());
            case 12:
                return Long.valueOf(RecurringTelemetryUploaderAction.d);
            case 13:
                xze xzeVar2 = UpdateConversationEncryptionStatusAction.a;
                return null;
            case 15:
                return upm.b();
            case 19:
                int i2 = uvb.c;
                return null;
        }
    }
}
