package defpackage;

import android.util.Pair;
import com.google.android.gms.feedback.FileTeleporter;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uvq extends abmr {
    private final Map e;
    private final anen f;
    private final pdz g;
    private alor h;
    private alor i;
    public static final uuf a = uuh.f(uuh.b, "feedback_async_timeout_ms", 4750);
    private static final xze d = xze.g("Bugle", "BugleFeedbackProductSpecificData");
    public static final alvi b = alvi.m("com/google/android/apps/messaging/shared/feedback/psd/BugleFeedbackProductSpecificDataV2");

    public uvq(Map map, anen anenVar, pdz pdzVar) {
        super(null);
        alor alorVar = altc.a;
        this.h = alorVar;
        this.i = alorVar;
        this.e = map;
        this.f = anenVar;
        this.g = pdzVar;
    }

    @Override // defpackage.abmr
    public final List a() {
        HashMap hashMap = new HashMap(this.e);
        hashMap.putAll(this.i);
        this.i = altc.a;
        List arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList((Collection) Collection.EL.stream(hashMap.keySet()).filter(new trt(14)).sorted().collect(Collectors.toCollection(new tyr(20))));
        try {
            try {
                List list = (List) Collection.EL.stream(arrayList2).map(new uuy(hashMap, 4)).collect(Collectors.toCollection(new tyr(20)));
                alvw g = b.g();
                g.X(alwp.a, "Bugle");
                ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/feedback/psd/BugleFeedbackProductSpecificDataV2", "getAsyncFeedbackPsbd", 210, "BugleFeedbackProductSpecificDataV2.java")).r("psbdLength: %s", list.size());
                try {
                    return (List) aktp.am(list).h(new uvp(list, 1), this.f).get(((Long) a.e()).longValue(), TimeUnit.MILLISECONDS);
                } catch (TimeoutException e) {
                    if (this.g.a()) {
                        alvw i = b.i();
                        i.X(alwp.a, "Bugle");
                        ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/feedback/psd/BugleFeedbackProductSpecificDataV2", "getAsyncFeedbackPsbd", 228, "BugleFeedbackProductSpecificDataV2.java")).q("Encountered a timeout while getting PSBD. Returning partial results.");
                        List list2 = (List) Collection.EL.stream(list).filter(new trt(16)).map(new uuy(e, 5)).filter(new trt(19)).map(new unt(19)).flatMap(new unt(20)).collect(Collectors.toCollection(new tyr(20)));
                        try {
                            list2.add(new FileTeleporter(((String) alzz.D(Collection.EL.stream(arrayList2), Collection.EL.stream(list), new mle(2)).filter(new trt(15)).map(new uvo(0)).collect(Collectors.joining("\n"))).getBytes(), "PSBD Feedback Timeouts"));
                            return list2;
                        } catch (InterruptedException e2) {
                            e = e2;
                            arrayList = list2;
                            d.r("Interrupt while getAsyncFeedbackPsbd()", e);
                            return arrayList;
                        } catch (ExecutionException e3) {
                            e = e3;
                            arrayList = list2;
                            d.r("Failed to getAsyncFeedbackPsbd()", e);
                            return arrayList;
                        } catch (TimeoutException e4) {
                            e = e4;
                            arrayList = list2;
                            d.r("Timeout while getAsyncFeedbackPsbd()", e);
                            return arrayList;
                        }
                    }
                    throw e;
                }
            } catch (InterruptedException e5) {
                e = e5;
            } catch (ExecutionException e6) {
                e = e6;
            }
        } catch (TimeoutException e7) {
            e = e7;
        }
    }

    @Override // defpackage.abmr
    public final List b() {
        HashMap hashMap = new HashMap(this.e);
        hashMap.putAll(this.h);
        this.h = altc.a;
        List arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        List list = (List) Collection.EL.stream(arrayList2).filter(new trt(14)).sorted().map(new uuy(hashMap, 6)).collect(Collectors.toCollection(new tyr(20)));
        try {
            try {
                try {
                    return (List) aktp.am(list).h(new uvp(list, 0), this.f).get(((Long) a.e()).longValue(), TimeUnit.MILLISECONDS);
                } catch (TimeoutException e) {
                    if (this.g.a()) {
                        ((alvg) d.j().h("com/google/android/apps/messaging/shared/feedback/psd/BugleFeedbackProductSpecificDataV2", "getAsyncFeedbackPsd", 147, "BugleFeedbackProductSpecificDataV2.java")).q("Encountered a timeout while getting PSD. Returning partial results.");
                        List list2 = (List) Collection.EL.stream(list).filter(new trt(18)).map(new uvo(3)).filter(new trt(19)).map(new unt(19)).flatMap(new unt(20)).map(new uvo(1)).collect(Collectors.toCollection(new tyr(20)));
                        try {
                            list2.add(new Pair("PSD Feedback Timeouts", (String) alzz.D(Collection.EL.stream(arrayList2), Collection.EL.stream(list), new mle(2)).filter(new trt(17)).map(new uvo(2)).collect(Collectors.joining("\n"))));
                            return list2;
                        } catch (InterruptedException e2) {
                            e = e2;
                            arrayList = list2;
                            d.r("Interrupt while getAsyncFeedbackPsd()", e);
                            return arrayList;
                        } catch (ExecutionException e3) {
                            e = e3;
                            arrayList = list2;
                            d.r("Failed to getAsyncFeedbackPsd()", e);
                            return arrayList;
                        } catch (TimeoutException e4) {
                            e = e4;
                            arrayList = list2;
                            d.r("Timeout while getAsyncFeedbackPsd()", e);
                            return arrayList;
                        }
                    }
                    throw e;
                }
            } catch (InterruptedException e5) {
                e = e5;
            } catch (ExecutionException e6) {
                e = e6;
            }
        } catch (TimeoutException e7) {
            e = e7;
        }
    }

    public final void c(alor alorVar) {
        this.h = alorVar;
        this.i = alorVar;
    }
}
