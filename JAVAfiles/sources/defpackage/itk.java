package defpackage;

import android.location.Location;
import android.os.CancellationSignal;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import j$.time.Instant;
import j$.util.Optional;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class itk implements algk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ itk(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v22, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r3v45, types: [java.lang.Object, java.util.function.Function] */
    @Override // defpackage.algk
    public final Object apply(Object obj) {
        akrh e;
        List g;
        Object apply;
        boolean z = true;
        switch (this.b) {
            case 0:
                List list = (List) obj;
                itm itmVar = (itm) this.a;
                itmVar.w = false;
                if (itm.o(list, itmVar.p)) {
                    xzb.j("BugleDataModel", "We reached the end for load latest (i.e. we loaded everything and not just latest).");
                    itmVar.u = false;
                }
                if (list != null && !list.isEmpty()) {
                    xzb.j("BugleDataModel", list.size() + " results retrieved for load latest.");
                    itmVar.l(list);
                    itmVar.s = null;
                } else {
                    xzb.c("BugleDataModel", "No results returned for load latest.");
                }
                return true;
            case 1:
                alwo alwoVar = imk.a;
                return this.a;
            case 2:
                ixr ixrVar = (ixr) this.a;
                ixrVar.g.getAndSet(akfa.a((Conversation) obj, ixrVar.a.f()));
                return null;
            case 3:
                ixr ixrVar2 = (ixr) this.a;
                ixrVar2.g.getAndSet(akfa.a((Conversation) obj, ixrVar2.a.f()));
                return null;
            case 4:
                qei qeiVar = (qei) obj;
                aozy aozyVar = (aozy) this.a;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                vwz vwzVar = (vwz) aozyVar.b;
                vwz vwzVar2 = vwz.a;
                qeiVar.getClass();
                vwzVar.d = qeiVar;
                vwzVar.b |= 1;
                return (vwz) aozyVar.s();
            case 5:
                if (obj != null) {
                    kku kkuVar = (kku) this.a;
                    kkuVar.e.set(akfa.a(obj, kkuVar.b.f()));
                }
                return obj;
            case 6:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                if (!bool.booleanValue()) {
                    return Optional.empty();
                }
                Object b = ((apwt) ((kpo) this.a).c.get()).b();
                b.getClass();
                return Optional.of(b);
            case 7:
                Exception exc = (Exception) obj;
                alwl alwlVar = (alwl) kpo.a.g();
                alwlVar.X(ydl.M, ((kpo) this.a).b.toString());
                ((alwl) alwlVar.h("com/google/android/apps/messaging/featureprovider/AsyncFeatureProvider", "getFeature", 97, "AsyncFeatureProvider.java")).o();
                qiu.d(exc);
                throw new IllegalStateException(exc);
            case 8:
                Location location = (Location) obj;
                String format = String.format(Locale.US, "(%.4f, %.4f)", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
                xou xouVar = new xou((short[]) null);
                xouVar.j("currentLocation");
                xouVar.k(format);
                uvm i = xouVar.i();
                ?? r2 = this.a;
                r2.add(i);
                return r2;
            case 9:
                if (obj != null) {
                    ktc ktcVar = (ktc) this.a;
                    ktcVar.c.set(akfa.a(obj, ktcVar.a.f()));
                }
                return obj;
            case 10:
                int i2 = kwy.b;
                return this.a.a(obj);
            case 11:
                Object obj2 = this.a;
                yiy yiyVar = (yiy) obj;
                SuperSortLabel superSortLabel = (SuperSortLabel) ((kxx) obj2).l.get();
                akrh e2 = aktp.e("ConversationListDataSources#prefetchInitialQuery");
                try {
                    ((kxx) obj2).m();
                    if (((pcj) ((kxx) obj2).o.b()).a()) {
                        lbt lbtVar = ((kxx) obj2).m;
                        uye uyeVar = ((kxx) obj2).k;
                        int i3 = ((kxx) obj2).v;
                        Map map = ((kxx) obj2).y;
                        kxo kxoVar = new kxo((kxx) obj2);
                        e = aktp.e("ConversationListDataSources#buildFirstPageQuery");
                        try {
                            lbt.e("prefetchFirstPage", uyeVar, superSortLabel, true);
                            if (lbtVar.d != null) {
                                z = false;
                            }
                            albo.T(z);
                            lci b2 = lbtVar.b(uyeVar, superSortLabel);
                            lcp a = lcq.a();
                            a.e(i3);
                            a.f(yiyVar);
                            lbtVar.d = b2.a(a.a(), lbtVar.b);
                            lbtVar.f = kxoVar;
                            e.close();
                            try {
                                CancellationSignal cancellationSignal = new CancellationSignal();
                                lca lcaVar = lbtVar.d;
                                lcaVar.getClass();
                                agmc agmcVar = lbtVar.f;
                                agmcVar.getClass();
                                lca a2 = lbtVar.a(lcaVar, agmcVar, cancellationSignal);
                                a2.getClass();
                                g = lbtVar.f(a2, map, superSortLabel, cancellationSignal);
                            } catch (agpd e3) {
                                throw new IllegalStateException("This should never happen, prefetch is never cancelled.", e3);
                            }
                        } finally {
                        }
                    } else {
                        lbt lbtVar2 = ((kxx) obj2).m;
                        uye uyeVar2 = ((kxx) obj2).k;
                        int i4 = ((kxx) obj2).v;
                        Map map2 = ((kxx) obj2).y;
                        kxp kxpVar = new kxp((kxx) obj2);
                        e = aktp.e("ConversationListDataSources#buildFirstPageQuery");
                        try {
                            lbt.e("prefetchFirstPage", uyeVar2, superSortLabel, true);
                            if (lbtVar2.c != null) {
                                z = false;
                            }
                            albo.T(z);
                            ldk d = lbtVar2.d(uyeVar2, superSortLabel);
                            lcp a3 = lcq.a();
                            a3.e(i4);
                            a3.f(yiyVar);
                            lbtVar2.c = d.h(a3.a(), lbtVar2.b);
                            lbtVar2.e = kxpVar;
                            e.close();
                            try {
                                ldc ldcVar = lbtVar2.c;
                                ldcVar.getClass();
                                ldc c = lbtVar2.c(ldcVar, kxpVar);
                                c.getClass();
                                g = lbtVar2.g(c, map2, superSortLabel, new CancellationSignal());
                            } catch (agpd e4) {
                                throw new IllegalStateException("This should never happen, prefetch is never cancelled.", e4);
                            }
                        } finally {
                        }
                    }
                    int size = g.size();
                    ((ahqr) ((kxx) obj2).n.b()).g(kyb.b, null, ahqp.SUCCESS);
                    ((kxx) obj2).e.a(laj.a);
                    kxv kxvVar = new kxv(g, 0, size, false);
                    e2.close();
                    return kxvVar;
                } finally {
                }
            case 12:
                ((rae) this.a).b();
                return null;
            case 13:
                ((rae) this.a).b();
                return null;
            case 14:
                ((rae) this.a).b();
                return null;
            case 15:
                ((rae) this.a).b();
                return null;
            case 16:
                return ((lse) this.a).a((adpo) obj);
            case 17:
                Object obj3 = this.a;
                int i5 = mdt.d;
                aozy builder = ((mdn) obj).toBuilder();
                apct j = aotl.j((Instant) obj3);
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                mdn mdnVar = (mdn) builder.b;
                j.getClass();
                mdnVar.l = j;
                mdnVar.b |= 1024;
                return (mdn) builder.s();
            case 18:
                int i6 = mdt.d;
                aozy builder2 = ((mdn) obj).toBuilder();
                long longValue = ((Long) this.a).longValue();
                if (!builder2.b.isMutable()) {
                    builder2.u();
                }
                mdn mdnVar2 = (mdn) builder2.b;
                mdnVar2.b |= 32;
                mdnVar2.h = longValue;
                return (mdn) builder2.s();
            case 19:
                int i7 = mdt.d;
                aozy builder3 = ((mdn) obj).toBuilder();
                if (!builder3.b.isMutable()) {
                    builder3.u();
                }
                Object obj4 = this.a;
                mdn mdnVar3 = (mdn) builder3.b;
                obj4.getClass();
                mdnVar3.b |= 512;
                mdnVar3.k = (String) obj4;
                return (mdn) builder3.s();
            default:
                mdn mdnVar4 = (mdn) obj;
                int i8 = mdt.d;
                apply = this.a.apply(Long.valueOf(mdnVar4.d));
                return (mdn) ((Optional) apply).map(new lut(mdnVar4, 10)).orElse(mdnVar4);
        }
    }
}
