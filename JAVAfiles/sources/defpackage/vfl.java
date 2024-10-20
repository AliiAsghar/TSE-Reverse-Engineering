package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vfl {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/net/handler/TachyonRegisterDataBuilder");
    public final Context b;
    public final anen c;
    public ListenableFuture g;
    public akul h;
    public akul i;
    public long k;
    public boolean l;
    public String o;
    public final aozy q;
    private final xnv r;
    private final uum s;
    private final Optional t;
    private final Set u;
    private final Set v;
    private final Set w;
    private final anen x;
    public final Object m = new Object();
    public final Map n = new HashMap();
    public Optional j = Optional.empty();
    public ListenableFuture d = albo.bI("");
    public akul e = aktp.ag(Optional.empty());
    public akul f = aktp.ag(Optional.empty());
    public final akul p = aktp.ag(Optional.empty());

    public vfl(Context context, xnv xnvVar, uum uumVar, Optional optional, Set set, Set set2, Set set3, anen anenVar, anen anenVar2) {
        this.b = context;
        this.r = xnvVar;
        this.s = uumVar;
        this.t = optional;
        this.u = set;
        this.v = set2;
        this.x = anenVar;
        this.c = anenVar2;
        this.w = set3;
        aozy createBuilder = aqep.a.createBuilder();
        this.q = createBuilder;
        this.g = albo.bI(createBuilder);
        this.i = aktp.ag(aqfk.b.createBuilder());
        this.h = aktp.ag(aqfj.a.createBuilder());
    }

    public static boolean d(List list, List list2, String str) {
        Stream filter = Collection.EL.stream(list).filter(new uhe(list2, 9));
        int i = alog.d;
        alog alogVar = (alog) filter.collect(alls.a);
        if (alogVar.isEmpty()) {
            return false;
        }
        alvw i2 = a.i();
        i2.X(alwp.a, "BugleNetwork");
        ((alvg) ((alvg) i2).h("com/google/android/apps/messaging/shared/net/handler/TachyonRegisterDataBuilder", "hasValueRemoved", 246, "TachyonRegisterDataBuilder.java")).D("Decorator removed %s: %s", str, alogVar);
        return true;
    }

    public final long a() {
        long j;
        synchronized (this.m) {
            if (this.l && this.k <= 0) {
                this.k = TimeUnit.MILLISECONDS.toMicros(this.r.f().toEpochMilli());
            }
            j = this.k;
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ListenableFuture b() {
        return aktp.as(this.g, this.d, this.e, this.f, this.p, this.i, this.h).m(new Callable() { // from class: vfk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String c;
                vfl vflVar = vfl.this;
                aozy aozyVar = (aozy) albo.bQ(vflVar.g);
                String str = (String) albo.bQ(vflVar.d);
                Optional optional = (Optional) albo.bQ(vflVar.e);
                Optional optional2 = (Optional) albo.bQ(vflVar.f);
                aozy aozyVar2 = (aozy) albo.bQ(vflVar.i);
                aozy aozyVar3 = (aozy) albo.bQ(vflVar.h);
                String languageTag = yhx.b(vflVar.b).toLanguageTag();
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                aqep aqepVar = (aqep) aozyVar.b;
                aqep aqepVar2 = aqep.a;
                languageTag.getClass();
                aqepVar.j = languageTag;
                if (!TextUtils.isEmpty(str)) {
                    aozy createBuilder = aqfm.a.createBuilder();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    apag apagVar = createBuilder.b;
                    ((aqfm) apagVar).b = a.at(3);
                    if (!apagVar.isMutable()) {
                        createBuilder.u();
                    }
                    aqfm aqfmVar = (aqfm) createBuilder.b;
                    str.getClass();
                    aqfmVar.c = str;
                    if (!aozyVar.b.isMutable()) {
                        aozyVar.u();
                    }
                    aqep aqepVar3 = (aqep) aozyVar.b;
                    aqfm aqfmVar2 = (aqfm) createBuilder.s();
                    aqfmVar2.getClass();
                    aqepVar3.e = aqfmVar2;
                    aqepVar3.b |= 1;
                    if (!aozyVar.b.isMutable()) {
                        aozyVar.u();
                    }
                    aqep aqepVar4 = (aqep) aozyVar.b;
                    str.getClass();
                    aqepVar4.f = str;
                } else {
                    alvw d = vfl.a.d();
                    d.X(alwp.a, "BugleNetwork");
                    ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/net/handler/TachyonRegisterDataBuilder", "updateRegisterData", 420, "TachyonRegisterDataBuilder.java")).q("GCM token is empty");
                }
                if (optional.isPresent()) {
                    String str2 = (String) optional.get();
                    if (!aozyVar.b.isMutable()) {
                        aozyVar.u();
                    }
                    ((aqep) aozyVar.b).p = str2;
                } else {
                    alvw d2 = vfl.a.d();
                    d2.X(alwp.a, "BugleNetwork");
                    ((alvg) ((alvg) d2).h("com/google/android/apps/messaging/shared/net/handler/TachyonRegisterDataBuilder", "updateRegisterData", 426, "TachyonRegisterDataBuilder.java")).q("Constellation IID token is not available.");
                }
                if (optional2.isPresent()) {
                    asmb asmbVar = (asmb) optional2.get();
                    aozy createBuilder2 = aqfu.a.createBuilder();
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    ((aqfu) createBuilder2.b).b = a.an(3);
                    aozb w = aozb.w(((atju) asmbVar.a).a());
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    ((aqfu) createBuilder2.b).c = w;
                    if (!aozyVar.b.isMutable()) {
                        aozyVar.u();
                    }
                    aqep aqepVar5 = (aqep) aozyVar.b;
                    aqfu aqfuVar = (aqfu) createBuilder2.s();
                    aqfuVar.getClass();
                    aqepVar5.i = aqfuVar;
                    aqepVar5.b |= 4;
                } else {
                    alvw d3 = vfl.a.d();
                    d3.X(alwp.a, "BugleNetwork");
                    ((alvg) ((alvg) d3).h("com/google/android/apps/messaging/shared/net/handler/TachyonRegisterDataBuilder", "updateRegisterData", 436, "TachyonRegisterDataBuilder.java")).q("Key pair is not available.");
                }
                if (!vflVar.n.isEmpty()) {
                    c = vflVar.c(vflVar.n);
                } else {
                    long a2 = vflVar.a();
                    Optional optional3 = vflVar.j;
                    String str3 = "Bugle";
                    if (vflVar.o == null) {
                        vflVar.o = "Bugle";
                    }
                    String str4 = vflVar.o;
                    if (true != albo.ah(str4)) {
                        str3 = str4;
                    }
                    ArrayMap arrayMap = new ArrayMap();
                    arrayMap.put("APP_NAME", str3);
                    if (a2 > 0) {
                        arrayMap.put("ISSUED_AT", String.valueOf(a2));
                    }
                    optional3.ifPresent(new uoa(arrayMap, 12));
                    c = vflVar.c(arrayMap);
                }
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                aqep aqepVar6 = (aqep) aozyVar.b;
                c.getClass();
                aqepVar6.c = 7;
                aqepVar6.d = c;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                aqep aqepVar7 = (aqep) aozyVar.b;
                aqfj aqfjVar = (aqfj) aozyVar3.s();
                aqfjVar.getClass();
                aqepVar7.m = aqfjVar;
                aqepVar7.b |= 16;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                aqep aqepVar8 = (aqep) aozyVar.b;
                aqfk aqfkVar = (aqfk) aozyVar2.s();
                aqfkVar.getClass();
                aqepVar8.n = aqfkVar;
                aqepVar8.b |= 128;
                return aozyVar;
            }
        }, this.x);
    }

    public final String c(Map map) {
        alvi alviVar = a;
        alvw d = alviVar.d();
        d.X(alwp.a, "BugleNetwork");
        ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/net/handler/TachyonRegisterDataBuilder", "buildDroidguardResult", 477, "TachyonRegisterDataBuilder.java")).q("Starting droidguard registration");
        String b = zfm.b(this.b, "tachyon_registration", map);
        alvw d2 = alviVar.d();
        d2.X(alwp.a, "BugleNetwork");
        ((alvg) ((alvg) d2).h("com/google/android/apps/messaging/shared/net/handler/TachyonRegisterDataBuilder", "buildDroidguardResult", 480, "TachyonRegisterDataBuilder.java")).q("Finished droidguard registration");
        if (b == null) {
            alvw h = alviVar.h();
            h.X(alwp.a, "BugleNetwork");
            ((alvg) ((alvg) h).h("com/google/android/apps/messaging/shared/net/handler/TachyonRegisterDataBuilder", "buildDroidguardResult", 482, "TachyonRegisterDataBuilder.java")).q("droidGuardResult is null. Registration without droidGuardResult will fail");
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(msh mshVar) {
        akul ag = aktp.ag(aqfk.b.createBuilder());
        Iterator it = this.v.iterator();
        while (it.hasNext()) {
            ag = ag.i(new vfj((vfy) it.next(), mshVar, 2), this.c);
        }
        this.i = ag;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(msh mshVar) {
        akul ag = aktp.ag(aqfj.a.createBuilder());
        Iterator it = this.w.iterator();
        while (it.hasNext()) {
            ag = ag.i(new vfj((vfx) it.next(), mshVar, 0), this.c);
        }
        this.h = ag;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(msh mshVar, int i) {
        aozy aozyVar = this.q;
        aqhz aqhzVar = aqhz.a;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        aqep aqepVar = (aqep) aozyVar.b;
        aqep aqepVar2 = aqep.a;
        aqhzVar.getClass();
        aqepVar.l = aqhzVar;
        aqepVar.b |= 8;
        aozy aozyVar2 = this.q;
        Set set = this.u;
        akul ag = aktp.ag(aozyVar2);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ag = ag.i(new tuy(this, (vgf) it.next(), mshVar, i, 2), this.c);
        }
        this.g = ag;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        this.o = "RCS";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i() {
        akul ag;
        boolean z;
        boolean booleanValue;
        if (this.t.isPresent()) {
            vdp vdpVar = (vdp) this.t.get();
            if (vdpVar.f != null) {
                booleanValue = vdpVar.f.booleanValue();
            } else {
                if (vdpVar.c.h(vdpVar.b, 12200000) == 0) {
                    z = true;
                } else {
                    z = false;
                }
                vdpVar.f = Boolean.valueOf(z);
                booleanValue = vdpVar.f.booleanValue();
            }
            if (!booleanValue) {
                vdp.a.q("Google Play Service is not available, C11N IIDToken request not sent.");
                vdpVar.e.c("Bugle.Constellation.IIDToken.Request.Skipped.API.Unavailable");
                ag = aktp.ag(Optional.empty());
            } else {
                ag = akul.g(d.m(new uqe(vdpVar, 3)));
            }
        } else {
            ag = aktp.ag(Optional.empty());
        }
        this.e = ag;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j() {
        uum uumVar = this.s;
        if (uumVar == null) {
            this.d = albo.bH(new NullPointerException("firebaseInstanceIDManager is null"));
        } else {
            this.d = uumVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(Callable callable) {
        try {
            this.f = (akul) callable.call();
        } catch (Exception e) {
            throw new IllegalStateException("failed to get key pair", e);
        }
    }
}
