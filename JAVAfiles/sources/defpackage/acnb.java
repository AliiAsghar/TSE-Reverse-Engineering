package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabase;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoMedia;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acnb {
    public static final advp a = new advp("BusinessInfoRetriever");
    public final acna b;
    final acna c;
    private final Context d;
    private final BusinessInfoDatabase e;
    private final yjr f;
    private final adih g;
    private final ConcurrentHashMap h;
    private final ConcurrentHashMap i;
    private final ConcurrentHashMap j;

    public acnb(Context context, BusinessInfoDatabase businessInfoDatabase, yjr yjrVar, adih adihVar) {
        acmx acmxVar = new acmx(this, TimeUnit.MICROSECONDS, new LinkedBlockingQueue());
        this.b = acmxVar;
        this.c = new acmy(this, TimeUnit.MICROSECONDS, new LinkedBlockingQueue());
        this.h = new ConcurrentHashMap();
        this.i = new ConcurrentHashMap();
        this.j = new ConcurrentHashMap();
        this.d = context;
        this.e = businessInfoDatabase;
        acmxVar.allowCoreThreadTimeOut(true);
        this.f = yjrVar;
        this.g = adihVar;
    }

    final acmu a(String str) {
        acmu acmuVar = new acmu(str, this.d, 0, this.e, this.g);
        acmu acmuVar2 = (acmu) this.i.putIfAbsent(str, acmuVar);
        if (acmuVar2 == null) {
            advr.l(a, "Caching new business media runnable for botId %s", advq.GENERIC.c(str));
            return acmuVar;
        }
        advr.l(a, "Returning cached business media runnable for botId %s", advq.GENERIC.c(str));
        return acmuVar2;
    }

    final acmu b(String str) {
        acmu acmuVar = new acmu(str, this.d, 2, this.e, this.g);
        acmu acmuVar2 = (acmu) this.i.putIfAbsent(String.valueOf(str).concat("-verifier-logo"), acmuVar);
        if (acmuVar2 == null) {
            advr.l(a, "Caching new business media runnable for verifier logo for botId %s", advq.GENERIC.c(str));
            return acmuVar;
        }
        advr.l(a, "Returning cached business media runnable for verifier logo for botId %s", advq.GENERIC.c(str));
        return acmuVar2;
    }

    public final acmv c(String str, yjr yjrVar) {
        boolean z;
        if (acyu.d() && BusinessInfoData.getVerifiedBotPlatform(str) == 1) {
            z = true;
        } else {
            z = false;
        }
        acmv acmvVar = new acmv(str, this.d, this.e, z, yjrVar);
        acmv acmvVar2 = (acmv) this.h.putIfAbsent(str + "_" + z, acmvVar);
        if (acmvVar2 == null) {
            advr.l(a, "Caching new business metadata runnable for botId %s", advq.GENERIC.c(str));
            return acmvVar;
        }
        advr.l(a, "Returning cached business metadata runnable for botId %s", advq.GENERIC.c(str));
        return acmvVar2;
    }

    public final acmz d(String str) {
        acmz acmzVar = c(str, this.f).d;
        if (acmzVar == acmz.INFO_LOCALLY_AVAILABLE) {
            acmu a2 = a(str);
            if (acyu.d() && BusinessInfoData.getVerifiedBotPlatform(str) == 1 && a2.d == acmz.INFO_LOCALLY_AVAILABLE) {
                return b(str).d;
            }
            return a2.d;
        }
        return acmzVar;
    }

    public final void e(String str) {
        acmu b;
        this.e.getClass();
        for (Integer num : BusinessInfoMedia.ALL_MEDIA_TYPES) {
            int intValue = num.intValue();
            if (!TextUtils.isEmpty(this.e.getLocalMediaPath(str, intValue))) {
                if (intValue == 0) {
                    advr.l(a, "Logo image exists locally for botId %s", advq.GENERIC.c(str));
                } else if (intValue == 1) {
                    advr.l(a, "Hero image exists locally for botId %s", advq.GENERIC.c(str));
                } else if (intValue == 2) {
                    advr.l(a, "Verifier logo image exists locally for botId %s", advq.GENERIC.c(str));
                } else {
                    advr.l(a, "Unknown media type %d exists locally for botId %s", num, advq.GENERIC.c(str));
                }
            } else {
                if (intValue == 0) {
                    advr.l(a, "Logo image does not exist locally for botId %s", advq.GENERIC.c(str));
                    intValue = 0;
                } else if (intValue == 1) {
                    advr.l(a, "Hero image does not exist locally for botId %s", advq.GENERIC.c(str));
                    intValue = 1;
                } else if (intValue == 2) {
                    advr.l(a, "Verifier logo image does not exist locally for botId %s", advq.GENERIC.c(str));
                    intValue = 2;
                } else {
                    advr.l(a, "Unknown media type %d does not exist locally for botId %s", num, advq.GENERIC.c(str));
                }
                if (intValue == 0) {
                    advr.l(a, "Queuing download of logo for botId %s", advq.GENERIC.c(str));
                    b = a(str);
                } else if (intValue == 1) {
                    advr.l(a, "Queuing download of hero image for botId %s", advq.GENERIC.c(str));
                    b = new acmu(str, this.d, 1, this.e, this.g);
                } else if (intValue == 2) {
                    if (acyu.d() && BusinessInfoData.getVerifiedBotPlatform(str) == 1) {
                        advr.l(a, "Queuing download of verifier logo image for botId %s", advq.GENERIC.c(str));
                        b = b(str);
                    } else {
                        advr.l(a, "Skipping unsupported download of verifier logo for botId %s", advq.GENERIC.c(str));
                    }
                } else {
                    throw new IllegalStateException(String.format("Unhandled business media type %d", Integer.valueOf(intValue)));
                }
                this.c.a(b);
            }
        }
    }

    public final boolean f(String str) {
        acmz d = d(str);
        if (d != acmz.INFO_LOCALLY_AVAILABLE && d != acmz.SERVER_ERROR && d != acmz.CLIENT_ERROR) {
            return false;
        }
        return true;
    }

    public final void g(String str) {
        if (!this.j.containsKey(str)) {
            advr.l(a, "No listeners set for botId %s", advq.GENERIC.c(str));
            return;
        }
        advr.l(a, "Notifying and removing listeners for botId %s", advq.GENERIC.c(str));
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.j.get(str);
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            aoij aoijVar = (aoij) it.next();
            Object obj = aoijVar.c;
            Object obj2 = aoijVar.b;
            Object obj3 = aoijVar.a;
            if (str.equals(obj2) && ((acnb) obj3).f(str)) {
                synchronized (((adrc) obj).P) {
                    ((adrc) obj).P.notifyAll();
                }
            }
            copyOnWriteArraySet.remove(aoijVar);
        }
    }

    public final void h(String str, aoij aoijVar) {
        if (TextUtils.isEmpty(str)) {
            advr.h(a, "RBM botId is missing for bot info retrieval.", new Object[0]);
            return;
        }
        acmv c = c(str, this.f);
        if (aoijVar != null) {
            if (!this.j.containsKey(str)) {
                this.j.putIfAbsent(str, new CopyOnWriteArraySet());
            }
            ((CopyOnWriteArraySet) this.j.get(str)).add(aoijVar);
        }
        if (c.d == acmz.INFO_LOCALLY_AVAILABLE) {
            advp advpVar = a;
            advr.l(advpVar, "Bot info is locally available for botId: %s", advq.GENERIC.c(str));
            e(str);
            Long queryExpiryMillisByBotId = this.e.queryExpiryMillisByBotId(str);
            Long W = agkx.W();
            long longValue = W.longValue();
            if (queryExpiryMillisByBotId != null && queryExpiryMillisByBotId.longValue() > longValue) {
                advr.l(advpVar, "Bot info has not expired for botId: %s expiry: %d currentTime: %d", advq.GENERIC.c(str), queryExpiryMillisByBotId, W);
                g(str);
                return;
            }
        }
        advr.l(a, "Running bot info retrieval for botId: %s", advq.GENERIC.c(str));
        this.b.a(c);
    }
}
