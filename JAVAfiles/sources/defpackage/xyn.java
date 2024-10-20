package defpackage;

import android.telephony.SubscriptionManager;
import android.text.TextPaint;
import defpackage.yta;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.concurrent.ThreadLocalRandom;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class xyn implements alhr {
    private final /* synthetic */ int a;

    public /* synthetic */ xyn(int i) {
        this.a = i;
    }

    @Override // defpackage.alhr
    public final Object get() {
        int defaultSmsSubscriptionId;
        int i = 20;
        switch (this.a) {
            case 0:
                return Pattern.compile("[^\\p{Punct}\\d+]+");
            case 1:
                return Pattern.compile("messages\\.android_(\\d+)_(\\d+)_rc(\\d+)[^\\d].*");
            case 2:
                return Pattern.compile("\\d+");
            case 3:
                return ThreadLocalRandom.current();
            case 4:
                return new TextPaint();
            case 5:
                tfy tfyVar = new tfy(tgb.a);
                tfyVar.w("cleanUpRecentGifs");
                tfyVar.c(new atkn((Object) tgb.c.c, true));
                tfv tfvVar = (tfv) tfyVar.b().n();
                try {
                    ArrayList<tfr> arrayList = new ArrayList();
                    for (int count = tfvVar.getCount() - 20; tfvVar.moveToNext() && count > 0; count--) {
                        arrayList.add((tfr) tfvVar.cK());
                    }
                    for (tfr tfrVar : arrayList) {
                        tfw tfwVar = new tfw();
                        tfwVar.f("cleanUpRecentGifs");
                        tfwVar.b(new xol(tfrVar, 18));
                        tfwVar.d();
                    }
                    tfvVar.close();
                    return arrayList;
                } catch (Throwable th) {
                    try {
                        tfvVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 6:
                utz utzVar = yig.a;
                return ahik.a.toByteArray();
            case 7:
                alhr alhrVar = yih.a;
                return uuh.q(238637483);
            case 8:
                uuf uufVar = yiq.a;
                return yil.b.toByteArray();
            case 9:
                return Pattern.compile("\\s");
            case 10:
                xze xzeVar = yjr.a;
                return alpt.o(((aplg) aczf.o().a.ap.a()).b);
            case 11:
                defaultSmsSubscriptionId = SubscriptionManager.getDefaultSmsSubscriptionId();
                return Integer.valueOf(defaultSmsSubscriptionId);
            case 12:
                return Pattern.compile("^(?:[a-z2-7]{8})*(?:[a-z2-7]{2}={6}|[a-z2-7]{4}={4}|[a-z2-7]{5}={3}|[a-z2-7]{7}=)?$");
            case 13:
                ((yta.a) yyb.aL(yta.a.class)).OA();
                Stream map = Collection.EL.stream(((ysy) yta.c.e()).b).map(new ybe(i));
                int i2 = alog.d;
                return (alog) map.collect(alls.a);
            case 14:
                ((yta.a) yyb.aL(yta.a.class)).OA();
                Stream map2 = Collection.EL.stream(yta.b.b).map(new ybe(i));
                int i3 = alog.d;
                return (alog) map2.collect(alls.a);
            case 15:
                return ((yta.a) yyb.aL(yta.a.class)).aa();
            case 16:
                return new albo(null, null);
            case 17:
                alhr alhrVar2 = zsv.a;
                return uuh.e(uuh.b, "banner_animation_repeat_count", 3);
            case 18:
                alhr alhrVar3 = aagh.a;
                return uuh.q(228975570);
            case 19:
                return Optional.of("US");
            default:
                return a.bz();
        }
    }
}
