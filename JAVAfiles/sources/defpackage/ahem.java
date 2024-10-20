package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ahem implements ancr {
    public final /* synthetic */ String a;
    public final /* synthetic */ ListenableFuture b;
    public final /* synthetic */ ListenableFuture c;
    public final /* synthetic */ ListenableFuture d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    private final /* synthetic */ int j;

    public /* synthetic */ ahem(ahen ahenVar, String str, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, algw algwVar, ListenableFuture listenableFuture3, ahdx ahdxVar, ListenableFuture listenableFuture4, agrk agrkVar, int i) {
        this.j = i;
        this.e = ahenVar;
        this.a = str;
        this.b = listenableFuture;
        this.c = listenableFuture2;
        this.f = algwVar;
        this.d = listenableFuture3;
        this.g = ahdxVar;
        this.h = listenableFuture4;
        this.i = agrkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [ahci, ahdu, java.lang.Object] */
    @Override // defpackage.ancr
    public final ListenableFuture a() {
        apae checkIsLite;
        apae checkIsLite2;
        Object c;
        boolean z;
        boolean z2;
        if (this.j != 0) {
            Uri uri = (Uri) albo.bQ(this.b);
            Uri uri2 = (Uri) albo.bQ(this.c);
            Uri uri3 = (Uri) albo.bQ(this.d);
            Object obj = this.g;
            Object obj2 = this.i;
            boolean z3 = true;
            if (uri != null && uri2 != null && uri3 != null) {
                String str = this.a;
                Object obj3 = this.h;
                prk.a.o("Download successful for business logo + hero image + verifier logo.");
                prk prkVar = (prk) obj2;
                String str2 = (String) obj3;
                Optional e = uhq.e(prkVar.l, str2, uhp.BUSINESS_LOGO, uri);
                Optional e2 = uhq.e(prkVar.l, str2, uhp.BUSINESS_HERO_IMAGE, uri2);
                Optional e3 = uhq.e(prkVar.l, str, uhp.VERIFIER_LOGO, uri3);
                int i = 18;
                if (Stream.CC.of((Object[]) new Optional[]{e, e2, e3}).anyMatch(new nfp(3))) {
                    xyo e4 = prk.a.e();
                    e4.H("Could not create URI");
                    e4.A("business logo copied", e.isPresent());
                    e4.A("hero image copied", e2.isPresent());
                    e4.A("verifier logo copied", e3.isPresent());
                    e4.q();
                    return prkVar.f(new prr("Could not save media image locally", 18), (prl) obj);
                }
                Object obj4 = this.f;
                BusinessInfoData businessInfoData = (BusinessInfoData) obj4;
                businessInfoData.setLogoImageLocalUri(((Uri) e.get()).toString());
                businessInfoData.setHeroImageLocalUri(((Uri) e2.get()).toString());
                businessInfoData.setVerifierLogoImageLocalUri(((Uri) e3.get()).toString());
                prt prtVar = prkVar.q;
                String rbmBotId = businessInfoData.getRbmBotId();
                ParticipantsTable.BindData b = ((rxq) prtVar.g.b()).b(rbmBotId);
                if (b == null) {
                    alvw g = prt.b.g();
                    g.X(alwp.a, "BugleNotifications");
                    ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoUpdateHelper", "createParticipantForBotIfDoesntExist", 114, "RbmBusinessInfoUpdateHelper.java")).t("Creating bot participant for: %s...", rbmBotId);
                    b = rxn.a(rbmBotId, businessInfoData.getName(), businessInfoData.getColor());
                    ((rxq) prtVar.g.b()).g(b);
                }
                Object obj5 = this.e;
                alvw g2 = prt.b.g();
                g2.X(alwp.a, "BugleNotifications");
                ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoUpdateHelper", "createParticipantForBotIfDoesntExist", 118, "RbmBusinessInfoUpdateHelper.java")).D("Bot participant: %s -> %s", rbmBotId, b.M());
                prd prdVar = prkVar.m;
                pro proVar = (pro) obj5;
                return aktp.ah(new prc(prdVar, obj4, (String) proVar.b.orElse(null), proVar.c, 3), prdVar.b).i(new mhv(obj2, obj3, obj4, 11, (char[]) null), prkVar.h).h(new mme(i), andi.a);
            }
            xyo e5 = prk.a.e();
            e5.H("Empty URI returned when downloading.");
            if (uri == null) {
                z = true;
            } else {
                z = false;
            }
            e5.A("business logo uri present", z);
            if (uri2 == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            e5.A("hero image uri present", z2);
            if (uri3 != null) {
                z3 = false;
            }
            e5.A("verifier logo uri present", z3);
            e5.q();
            return ((prk) obj2).f(new prr("No URI after downloading media", 17), (prl) obj);
        }
        anzh a = ahcj.a();
        a.B(this.a);
        a.C((apbt) albo.bQ(this.b));
        a.a = (amnr) albo.bQ(this.c);
        a.e = (Integer) ((algw) this.f).e();
        a.c = (int[]) albo.bQ(this.d);
        ahen ahenVar = (ahen) this.e;
        ahdy ahdyVar = ahenVar.a;
        ?? r4 = this.g;
        a.D(ahdyVar.f(r4));
        ahenVar.a.b(r4);
        int[] iArr = (int[]) albo.bQ(this.h);
        ahcw aG = ahji.aG(r4);
        checkIsLite = apag.checkIsLite(ahff.a);
        aG.b(checkIsLite);
        if (aG.l.o(checkIsLite.d) || iArr != null) {
            ahcw aG2 = ahji.aG(r4);
            checkIsLite2 = apag.checkIsLite(ahff.a);
            aG2.b(checkIsLite2);
            Object l = aG2.l.l(checkIsLite2.d);
            if (l == null) {
                c = checkIsLite2.b;
            } else {
                c = checkIsLite2.c(l);
            }
            HashSet hashSet = new HashSet(((ahfe) c).b);
            if (iArr != null) {
                hashSet.addAll(albo.cx(iArr));
            }
            a.f = albo.cy(hashSet);
        }
        return ahenVar.b.b(a.A(), ((agrk) this.i).b);
    }

    public /* synthetic */ ahem(prk prkVar, akul akulVar, akul akulVar2, akul akulVar3, prl prlVar, String str, String str2, BusinessInfoData businessInfoData, pro proVar, int i) {
        this.j = i;
        this.i = prkVar;
        this.b = akulVar;
        this.c = akulVar2;
        this.d = akulVar3;
        this.g = prlVar;
        this.h = str;
        this.a = str2;
        this.f = businessInfoData;
        this.e = proVar;
    }
}
