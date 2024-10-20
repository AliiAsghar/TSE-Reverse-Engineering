package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.maps.model.LatLng;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahxl implements aibx {
    public final ahwx a;
    public final aegu b;
    public final ahiy c;
    public final aogy d;
    private final ahwu e;
    private final ahyr f;
    private final atsg g;

    public ahxl(ahyr ahyrVar, aogy aogyVar, ahwu ahwuVar, ahwx ahwxVar, ahiy ahiyVar, aegu aeguVar, atsg atsgVar) {
        this.f = ahyrVar;
        this.d = aogyVar;
        this.e = ahwuVar;
        this.a = ahwxVar;
        this.c = ahiyVar;
        this.b = aeguVar;
        this.g = atsgVar;
    }

    public static void j(ahka ahkaVar) {
        ahka.a(ahkaVar, new ahka("Duration"));
        ahka.a(ahkaVar, new ahka("Battery"));
    }

    @Override // defpackage.aibx
    public final acir a(aibj aibjVar) {
        return c(aibjVar, 1);
    }

    @Override // defpackage.aibx
    public final acir b(aibl aiblVar) {
        return d(aiblVar, 1);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, aegu] */
    @Override // defpackage.aibx
    public final acir c(aibj aibjVar, final int i) {
        acit acitVar;
        acir a;
        try {
            new ahqq();
            aogy aogyVar = this.d;
            Integer num = aibjVar.a;
            Integer num2 = aibjVar.b;
            if (num == null) {
                if (num2 == null) {
                    a = actx.r(new abra(new Status(9012, "Must include max width or max height in request.")));
                    return a.a(new acig() { // from class: ahxj
                        @Override // defpackage.acig
                        public final Object a(acir acirVar) {
                            aozy createBuilder = anal.a.createBuilder();
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            ahxl ahxlVar = ahxl.this;
                            int i2 = i;
                            anal analVar = (anal) createBuilder.b;
                            analVar.c = 1;
                            analVar.b = 1 | analVar.b;
                            anal analVar2 = (anal) createBuilder.s();
                            ahiy ahiyVar = ahxlVar.c;
                            aozy c = ahop.c((aicm) ahiyVar.a, i2);
                            if (!c.b.isMutable()) {
                                c.u();
                            }
                            anah anahVar = (anah) c.b;
                            anah anahVar2 = anah.a;
                            anahVar.d = 5;
                            anahVar.b |= 2;
                            if (!c.b.isMutable()) {
                                c.u();
                            }
                            anah anahVar3 = (anah) c.b;
                            analVar2.getClass();
                            anahVar3.g = analVar2;
                            anahVar3.b |= 512;
                            String a2 = ((ahyr) ahiyVar.c).a();
                            if (!c.b.isMutable()) {
                                c.u();
                            }
                            anah anahVar4 = (anah) c.b;
                            a2.getClass();
                            anahVar4.b |= 1073741824;
                            anahVar4.m = a2;
                            ahiyVar.e((anah) c.s());
                            ahxl.j(new ahka("FetchPhoto"));
                            return (aibk) acirVar.h();
                        }
                    }).c(new acca(4));
                }
                num = null;
            }
            if (num != null && num.intValue() <= 0) {
                a = actx.r(new abra(new Status(9012, String.format("Max Width must not be < 1, but was: %d.", num))));
            } else if (num2 != null && num2.intValue() <= 0) {
                a = actx.r(new abra(new Status(9012, String.format("Max Height must not be < 1, but was: %d.", num2))));
            } else {
                ahyb ahybVar = new ahyb(aibjVar, ((ahyr) aogyVar.c).a(), (agxw) aogyVar.d);
                ?? r0 = aogyVar.a;
                Object obj = aogyVar.b;
                long a2 = r0.a();
                aodz aodzVar = new aodz((char[]) null);
                String b = ahybVar.b();
                Map c = ahybVar.c();
                adae f = ahybVar.f();
                if (f != null) {
                    acitVar = new acit(f);
                } else {
                    acitVar = new acit();
                }
                ahxc ahxcVar = new ahxc(b, new ahxb(aodzVar, acitVar, 0), Bitmap.Config.ARGB_8888, new ahwz(acitVar, 2), c);
                if (f != null) {
                    f.g(new acdp(ahxcVar, 4));
                }
                ((hkg) ((adxs) obj).a).a(ahxcVar);
                a = ((acir) acitVar.a).a(new acca(5)).a(new ahyj(aogyVar, a2, i, 1));
            }
            return a.a(new acig() { // from class: ahxj
                @Override // defpackage.acig
                public final Object a(acir acirVar) {
                    aozy createBuilder = anal.a.createBuilder();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ahxl ahxlVar = ahxl.this;
                    int i2 = i;
                    anal analVar = (anal) createBuilder.b;
                    analVar.c = 1;
                    analVar.b = 1 | analVar.b;
                    anal analVar2 = (anal) createBuilder.s();
                    ahiy ahiyVar = ahxlVar.c;
                    aozy c2 = ahop.c((aicm) ahiyVar.a, i2);
                    if (!c2.b.isMutable()) {
                        c2.u();
                    }
                    anah anahVar = (anah) c2.b;
                    anah anahVar2 = anah.a;
                    anahVar.d = 5;
                    anahVar.b |= 2;
                    if (!c2.b.isMutable()) {
                        c2.u();
                    }
                    anah anahVar3 = (anah) c2.b;
                    analVar2.getClass();
                    anahVar3.g = analVar2;
                    anahVar3.b |= 512;
                    String a22 = ((ahyr) ahiyVar.c).a();
                    if (!c2.b.isMutable()) {
                        c2.u();
                    }
                    anah anahVar4 = (anah) c2.b;
                    a22.getClass();
                    anahVar4.b |= 1073741824;
                    anahVar4.m = a22;
                    ahiyVar.e((anah) c2.s());
                    ahxl.j(new ahka("FetchPhoto"));
                    return (aibk) acirVar.h();
                }
            }).c(new acca(4));
        } catch (Error | RuntimeException e) {
            aico.b(e);
            throw e;
        }
    }

    @Override // defpackage.aibx
    public final acir d(final aibl aiblVar, final int i) {
        try {
            new ahqq();
            if (this.f.a && i != 2) {
                final int i2 = 1;
                return this.g.p(aiblVar, i).a(new acig(this) { // from class: ahxi
                    public final /* synthetic */ ahxl a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.acig
                    public final Object a(acir acirVar) {
                        if (i2 != 0) {
                            ahxl ahxlVar = this.a;
                            ahxlVar.c.g(aiblVar, 3, i);
                            ahxl.j(new ahka("GetPlace"));
                            return (aibm) acirVar.h();
                        }
                        ahxl ahxlVar2 = this.a;
                        ahxlVar2.c.g(aiblVar, 2, i);
                        ahxl.j(new ahka("FetchPlace"));
                        return (aibm) acirVar.h();
                    }
                }).c(new acca(4));
            }
            final int i3 = 0;
            return this.d.D(aiblVar, i).a(new acig(this) { // from class: ahxi
                public final /* synthetic */ ahxl a;

                {
                    this.a = this;
                }

                @Override // defpackage.acig
                public final Object a(acir acirVar) {
                    if (i3 != 0) {
                        ahxl ahxlVar = this.a;
                        ahxlVar.c.g(aiblVar, 3, i);
                        ahxl.j(new ahka("GetPlace"));
                        return (aibm) acirVar.h();
                    }
                    ahxl ahxlVar2 = this.a;
                    ahxlVar2.c.g(aiblVar, 2, i);
                    ahxl.j(new ahka("FetchPlace"));
                    return (aibm) acirVar.h();
                }
            }).c(new acca(4));
        } catch (Error | RuntimeException e) {
            aico.b(e);
            throw e;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, aegu] */
    @Override // defpackage.aibx
    public final acir e(aibo aiboVar) {
        try {
            new ahqq();
            atsg atsgVar = this.g;
            long a = atsgVar.f.a();
            ListenableFuture o = atsgVar.o();
            ListenableFuture g = ancj.g(o, new ahsi(atsgVar, aiboVar, 3), andi.a);
            adae adaeVar = aiboVar.d;
            if (adaeVar != null) {
                adaeVar.g(new acdp(g, 6));
            }
            return agkx.g(g).e(new ahxt(0)).c(new ahxr(atsgVar, a, o, 3)).a(new acdl(this, 2)).c(new acca(4));
        } catch (Error | RuntimeException e) {
            aico.b(e);
            throw e;
        }
    }

    @Override // defpackage.aibx
    public final acir f(aibq aibqVar) {
        try {
            new ahqq();
            if (this.f.a) {
                return actx.r(new abra(new Status(9012, "Query must not be null."))).a(new abpk(this, aibqVar, 5, null)).c(new acca(4));
            }
            int i = alog.d;
            return actx.s(new aibr(alog.n(alsx.a))).a(new abpk(this, aibqVar, 6, null)).c(new acca(4));
        } catch (Error | RuntimeException e) {
            aico.b(e);
            throw e;
        }
    }

    @Override // defpackage.aibx
    public final acir g(aibs aibsVar) {
        return h(aibsVar);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.Map, java.lang.Object] */
    public final acir h(aibs aibsVar) {
        acit acitVar;
        try {
            long a = this.b.a();
            new ahqq();
            ahwu ahwuVar = this.e;
            adae adaeVar = aibsVar.b;
            acdb acdbVar = new acdb();
            acdbVar.b(ahwu.a);
            if (egl.e(ahwuVar.c, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                acdbVar.c(100);
            } else {
                acdbVar.c(102);
            }
            adze adzeVar = ahwuVar.d;
            acir c = ahwuVar.b.c(acdbVar.a(), adaeVar);
            long j = ahwu.a;
            if (adaeVar == null) {
                acitVar = new acit();
            } else {
                acitVar = new acit(adaeVar);
            }
            if (!adzeVar.a.containsKey(acitVar)) {
                HandlerThread handlerThread = new HandlerThread("timeoutHandlerThread");
                handlerThread.start();
                adzeVar.a.put(acitVar, handlerThread);
                new Handler(handlerThread.getLooper()).postDelayed(new ahnu(acitVar, 11), j);
            }
            c.c(new acdl(acitVar, 3));
            ((acir) acitVar.a).q(new aoie(adzeVar, acitVar, 1));
            return ((acir) acitVar.a).c(new ahwt()).e(new abxe(this, aibsVar, 3)).a(new ahxr(this, aibsVar, a, 1)).c(new acca(4));
        } catch (Error | RuntimeException e) {
            aico.b(e);
            throw e;
        }
    }

    @Override // defpackage.aibx
    public final acir i(aibv aibvVar) {
        List arrayList;
        try {
            final aiba aibaVar = aibvVar.a;
            String str = aibvVar.b;
            final long j = aibvVar.c;
            final acit acitVar = new acit();
            if (aibaVar == null) {
                int i = aiap.a;
                arrayList = Arrays.asList(aiay.BUSINESS_STATUS, aiay.CURRENT_OPENING_HOURS, aiay.OPENING_HOURS, aiay.UTC_OFFSET);
            } else {
                arrayList = new ArrayList();
                aiax aiaxVar = aibaVar.g;
                if (aiaxVar == null || aiaxVar == aiax.OPERATIONAL) {
                    if (aiaxVar == null) {
                        arrayList.add(aiay.BUSINESS_STATUS);
                    }
                    if (aibaVar.i == null) {
                        arrayList.add(aiay.CURRENT_OPENING_HOURS);
                    }
                    if (aibaVar.y == null) {
                        arrayList.add(aiay.OPENING_HOURS);
                    }
                    if (aibaVar.Z == null) {
                        arrayList.add(aiay.UTC_OFFSET);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                aibaVar.getClass();
                acitVar.b(new aibw(aiap.b(aibaVar, j)));
                return (acir) acitVar.a;
            }
            if (aibaVar != null) {
                str = aibaVar.q;
            }
            str.getClass();
            arbj b = aibl.b(str, arrayList);
            b.b = aibvVar.d;
            aibl W = b.W();
            new ahqq();
            if (this.f.a) {
                final int i2 = 0;
                return this.g.p(W, 3).a(new abpk(this, W, 7, null)).e(new aciq() { // from class: ahxk
                    @Override // defpackage.aciq
                    public final acir a(Object obj) {
                        if (i2 != 0) {
                            acit acitVar2 = acitVar;
                            long j2 = j;
                            return ahmc.z(aibaVar, j2, acitVar2, (aibm) obj);
                        }
                        acit acitVar3 = acitVar;
                        long j3 = j;
                        return ahmc.z(aibaVar, j3, acitVar3, (aibm) obj);
                    }
                }).c(new acca(4));
            }
            final int i3 = 1;
            return this.d.D(W, 3).a(new abpk(this, W, 8, null)).e(new aciq() { // from class: ahxk
                @Override // defpackage.aciq
                public final acir a(Object obj) {
                    if (i3 != 0) {
                        acit acitVar2 = acitVar;
                        long j2 = j;
                        return ahmc.z(aibaVar, j2, acitVar2, (aibm) obj);
                    }
                    acit acitVar3 = acitVar;
                    long j3 = j;
                    return ahmc.z(aibaVar, j3, acitVar3, (aibm) obj);
                }
            }).c(new acca(4));
        } catch (Error | RuntimeException e) {
            aico.b(e);
            throw e;
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, aegu] */
    @Override // defpackage.aibx
    public final acir k(final aiby aibyVar) {
        acir c;
        try {
            new ahqq();
            final atsg atsgVar = this.g;
            List list = aibyVar.a;
            if (list.isEmpty()) {
                c = actx.r(new abra(new Status(9012, "Place fields must not be empty.")));
            } else if (aibyVar.c.isEmpty()) {
                c = actx.r(new abra(new Status(9012, "Text query must not be an empty string.")));
            } else {
                long a = atsgVar.f.a();
                final String b = ahxe.b(ahxx.a(list), new ArrayList());
                ListenableFuture o = atsgVar.o();
                ListenableFuture g = ancj.g(o, new ancs() { // from class: ahxs
                    @Override // defpackage.ancs
                    public final ListenableFuture a(Object obj) {
                        atsg atsgVar2 = atsg.this;
                        aows aowsVar = (aows) ((arlb) atsgVar2.e).i(new arll(((adxs) atsgVar2.a).d(b, ((ahyr) atsgVar2.g).a()), 0), ahji.ay());
                        Locale b2 = ((ahyr) atsgVar2.g).b();
                        aozy createBuilder = aoxc.a.createBuilder();
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        aiby aibyVar2 = aibyVar;
                        ((aoxc) createBuilder.b).e = false;
                        ArrayList arrayList = new ArrayList();
                        Iterator it = aibyVar2.b.iterator();
                        while (it.hasNext()) {
                            int intValue = ((Integer) it.next()).intValue();
                            if (intValue != 0) {
                                if (intValue != 1) {
                                    if (intValue != 2) {
                                        if (intValue != 3) {
                                            if (intValue == 4) {
                                                arrayList.add(aowu.PRICE_LEVEL_VERY_EXPENSIVE);
                                            }
                                        } else {
                                            arrayList.add(aowu.PRICE_LEVEL_EXPENSIVE);
                                        }
                                    } else {
                                        arrayList.add(aowu.PRICE_LEVEL_MODERATE);
                                    }
                                } else {
                                    arrayList.add(aowu.PRICE_LEVEL_INEXPENSIVE);
                                }
                            } else {
                                arrayList.add(aowu.PRICE_LEVEL_FREE);
                            }
                        }
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        aoxc aoxcVar = (aoxc) createBuilder.b;
                        apao apaoVar = aoxcVar.f;
                        if (!apaoVar.c()) {
                            aoxcVar.f = apag.mutableCopy(apaoVar);
                        }
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            aoxcVar.f.g(((aowu) it2.next()).a());
                        }
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        ((aoxc) createBuilder.b).d = a.an(2);
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        apag apagVar = createBuilder.b;
                        ((aoxc) apagVar).g = false;
                        String str = aibyVar2.c;
                        if (!apagVar.isMutable()) {
                            createBuilder.u();
                        }
                        aoxc aoxcVar2 = (aoxc) createBuilder.b;
                        str.getClass();
                        aoxcVar2.b = str;
                        String languageTag = b2.toLanguageTag();
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        aoxc aoxcVar3 = (aoxc) createBuilder.b;
                        languageTag.getClass();
                        aoxcVar3.c = languageTag;
                        aoxc aoxcVar4 = (aoxc) createBuilder.s();
                        aqrs aqrsVar = aowsVar.a;
                        aqux aquxVar = aowt.b;
                        if (aquxVar == null) {
                            synchronized (aowt.class) {
                                aquxVar = aowt.b;
                                if (aquxVar == null) {
                                    aquu a2 = aqux.a();
                                    a2.e = aquw.UNARY;
                                    a2.a = aqux.c("google.maps.places.v1.Places", "SearchText");
                                    a2.b();
                                    aoxc aoxcVar5 = aoxc.a;
                                    aozs aozsVar = arkx.a;
                                    a2.c = new arkw(aoxcVar5);
                                    a2.d = new arkw(aoxd.a);
                                    aquxVar = a2.a();
                                    aowt.b = aquxVar;
                                }
                            }
                        }
                        return arlj.a(aqrsVar.a(aquxVar, aowsVar.b), aoxcVar4);
                    }
                }, andi.a);
                adae adaeVar = aibyVar.d;
                if (adaeVar != null) {
                    adaeVar.g(new acdp(g, 5));
                }
                c = agkx.g(g).e(new ahxq(atsgVar, 2)).c(new ahxr(atsgVar, a, o, 2));
            }
            return c.a(new acig() { // from class: ahxg
                @Override // defpackage.acig
                public final Object a(acir acirVar) {
                    aozy createBuilder = anao.a.createBuilder();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    aiby aibyVar2 = aibyVar;
                    anao anaoVar = (anao) createBuilder.b;
                    anaoVar.b |= 4;
                    anaoVar.d = false;
                    aozy createBuilder2 = anam.a.createBuilder();
                    createBuilder2.aO(ahxx.a(aibyVar2.a));
                    anam anamVar = (anam) createBuilder2.s();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    apag apagVar = createBuilder.b;
                    anao anaoVar2 = (anao) apagVar;
                    anamVar.getClass();
                    anaoVar2.g = anamVar;
                    anaoVar2.b |= 64;
                    if (!apagVar.isMutable()) {
                        createBuilder.u();
                    }
                    apag apagVar2 = createBuilder.b;
                    anao anaoVar3 = (anao) apagVar2;
                    anaoVar3.c = 0;
                    anaoVar3.b |= 1;
                    if (!apagVar2.isMutable()) {
                        createBuilder.u();
                    }
                    apag apagVar3 = createBuilder.b;
                    anao anaoVar4 = (anao) apagVar3;
                    anaoVar4.b |= 32;
                    anaoVar4.f = false;
                    if (!apagVar3.isMutable()) {
                        createBuilder.u();
                    }
                    anao anaoVar5 = (anao) createBuilder.b;
                    anaoVar5.b |= 512;
                    anaoVar5.h = false;
                    ArrayList arrayList = new ArrayList();
                    for (Integer num : aibyVar2.b) {
                        if (num != null) {
                            arrayList.add(num);
                        }
                    }
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    anao anaoVar6 = (anao) createBuilder.b;
                    apao apaoVar = anaoVar6.e;
                    if (!apaoVar.c()) {
                        anaoVar6.e = apag.mutableCopy(apaoVar);
                    }
                    ahxl ahxlVar = ahxl.this;
                    aoyj.addAll(arrayList, anaoVar6.e);
                    ahiy ahiyVar = ahxlVar.c;
                    aozy j = ahiyVar.j();
                    if (!j.b.isMutable()) {
                        j.u();
                    }
                    anan ananVar = (anan) j.b;
                    anan ananVar2 = anan.a;
                    ananVar.c = 1;
                    ananVar.b |= 1;
                    anao anaoVar7 = (anao) createBuilder.s();
                    if (!j.b.isMutable()) {
                        j.u();
                    }
                    anan ananVar3 = (anan) j.b;
                    anaoVar7.getClass();
                    ananVar3.h = anaoVar7;
                    ananVar3.b |= 524288;
                    anan ananVar4 = (anan) j.s();
                    aozy d = ahop.d((aicm) ahiyVar.a, 3, 3);
                    if (!d.b.isMutable()) {
                        d.u();
                    }
                    anah anahVar = (anah) d.b;
                    anah anahVar2 = anah.a;
                    anahVar.d = 1;
                    anahVar.b |= 2;
                    if (!d.b.isMutable()) {
                        d.u();
                    }
                    anah anahVar3 = (anah) d.b;
                    ananVar4.getClass();
                    anahVar3.f = ananVar4;
                    anahVar3.b |= 64;
                    String a2 = ((ahyr) ahiyVar.c).a();
                    if (!d.b.isMutable()) {
                        d.u();
                    }
                    anah anahVar4 = (anah) d.b;
                    a2.getClass();
                    anahVar4.b |= 1073741824;
                    anahVar4.m = a2;
                    ahiyVar.e((anah) d.s());
                    ahxl.j(new ahka("SearchByText"));
                    return (aibz) acirVar.h();
                }
            }).c(new acca(4));
        } catch (Error | RuntimeException e) {
            aico.b(e);
            throw e;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, aegu] */
    @Override // defpackage.aibx
    public final acir l(final aicb aicbVar) {
        acir c;
        try {
            new ahqq();
            final atsg atsgVar = this.g;
            List list = aicbVar.f;
            if (list.isEmpty()) {
                c = actx.r(new abra(new Status(9012, "Place fields must not be empty.")));
            } else {
                long a = atsgVar.f.a();
                final String b = ahxe.b(ahxx.a(list), new ArrayList());
                ListenableFuture o = atsgVar.o();
                ListenableFuture g = ancj.g(o, new ancs() { // from class: ahxv
                    @Override // defpackage.ancs
                    public final ListenableFuture a(Object obj) {
                        atsg atsgVar2 = atsg.this;
                        aows aowsVar = (aows) ((arlb) atsgVar2.e).i(new arll(((adxs) atsgVar2.a).d(b, ((ahyr) atsgVar2.g).a()), 0), ahji.ay());
                        Locale b2 = ((ahyr) atsgVar2.g).b();
                        aozy createBuilder = aoxa.a.createBuilder();
                        String languageTag = b2.toLanguageTag();
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        aicb aicbVar2 = aicbVar;
                        apag apagVar = createBuilder.b;
                        languageTag.getClass();
                        ((aoxa) apagVar).c = languageTag;
                        List list2 = aicbVar2.a;
                        if (list2 != null) {
                            if (!apagVar.isMutable()) {
                                createBuilder.u();
                            }
                            aoxa aoxaVar = (aoxa) createBuilder.b;
                            apax apaxVar = aoxaVar.d;
                            if (!apaxVar.c()) {
                                aoxaVar.d = apag.mutableCopy(apaxVar);
                            }
                            aoyj.addAll(list2, aoxaVar.d);
                        }
                        List list3 = aicbVar2.b;
                        if (list3 != null) {
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            aoxa aoxaVar2 = (aoxa) createBuilder.b;
                            apax apaxVar2 = aoxaVar2.e;
                            if (!apaxVar2.c()) {
                                aoxaVar2.e = apag.mutableCopy(apaxVar2);
                            }
                            aoyj.addAll(list3, aoxaVar2.e);
                        }
                        List list4 = aicbVar2.c;
                        if (list4 != null) {
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            aoxa aoxaVar3 = (aoxa) createBuilder.b;
                            apax apaxVar3 = aoxaVar3.f;
                            if (!apaxVar3.c()) {
                                aoxaVar3.f = apag.mutableCopy(apaxVar3);
                            }
                            aoyj.addAll(list4, aoxaVar3.f);
                        }
                        List list5 = aicbVar2.d;
                        if (list5 != null) {
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            aoxa aoxaVar4 = (aoxa) createBuilder.b;
                            apax apaxVar4 = aoxaVar4.g;
                            if (!apaxVar4.c()) {
                                aoxaVar4.g = apag.mutableCopy(apaxVar4);
                            }
                            aoyj.addAll(list5, aoxaVar4.g);
                        }
                        Object obj2 = atsgVar2.d;
                        aozy createBuilder2 = aowz.a.createBuilder();
                        Object obj3 = ((adze) obj2).a;
                        aiaa aiaaVar = (aiaa) aicbVar2.e;
                        LatLng b3 = aiaaVar.b();
                        aozy createBuilder3 = aovs.a.createBuilder();
                        aozy createBuilder4 = apuo.a.createBuilder();
                        double d = b3.a;
                        if (!createBuilder4.b.isMutable()) {
                            createBuilder4.u();
                        }
                        apag apagVar2 = createBuilder4.b;
                        ((apuo) apagVar2).b = d;
                        double d2 = b3.b;
                        if (!apagVar2.isMutable()) {
                            createBuilder4.u();
                        }
                        ((apuo) createBuilder4.b).c = d2;
                        if (!createBuilder3.b.isMutable()) {
                            createBuilder3.u();
                        }
                        aovs aovsVar = (aovs) createBuilder3.b;
                        apuo apuoVar = (apuo) createBuilder4.s();
                        apuoVar.getClass();
                        aovsVar.c = apuoVar;
                        aovsVar.b |= 1;
                        double a2 = aiaaVar.a();
                        if (!createBuilder3.b.isMutable()) {
                            createBuilder3.u();
                        }
                        ((aovs) createBuilder3.b).d = a2;
                        aovs aovsVar2 = (aovs) createBuilder3.s();
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        aowz aowzVar = (aowz) createBuilder2.b;
                        aovsVar2.getClass();
                        aowzVar.c = aovsVar2;
                        aowzVar.b = 2;
                        aowz aowzVar2 = (aowz) createBuilder2.s();
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        apag apagVar3 = createBuilder.b;
                        aoxa aoxaVar5 = (aoxa) apagVar3;
                        aowzVar2.getClass();
                        aoxaVar5.h = aowzVar2;
                        aoxaVar5.b |= 1;
                        if (!apagVar3.isMutable()) {
                            createBuilder.u();
                        }
                        ((aoxa) createBuilder.b).i = a.an(2);
                        aoxa aoxaVar6 = (aoxa) createBuilder.s();
                        aqrs aqrsVar = aowsVar.a;
                        aqux aquxVar = aowt.a;
                        if (aquxVar == null) {
                            synchronized (aowt.class) {
                                aquxVar = aowt.a;
                                if (aquxVar == null) {
                                    aquu a3 = aqux.a();
                                    a3.e = aquw.UNARY;
                                    a3.a = aqux.c("google.maps.places.v1.Places", "SearchNearby");
                                    a3.b();
                                    aoxa aoxaVar7 = aoxa.a;
                                    aozs aozsVar = arkx.a;
                                    a3.c = new arkw(aoxaVar7);
                                    a3.d = new arkw(aoxb.a);
                                    aquxVar = a3.a();
                                    aowt.a = aquxVar;
                                }
                            }
                        }
                        return arlj.a(aqrsVar.a(aquxVar, aowsVar.b), aoxaVar6);
                    }
                }, andi.a);
                adae adaeVar = aicbVar.g;
                if (adaeVar != null) {
                    adaeVar.g(new acdp(g, 8));
                }
                c = agkx.g(g).e(new ahxq(atsgVar, 0)).c(new ahxr(atsgVar, a, o, 0));
            }
            return c.a(new acig() { // from class: ahxh
                @Override // defpackage.acig
                public final Object a(acir acirVar) {
                    aozy createBuilder = anap.a.createBuilder();
                    aozy createBuilder2 = anam.a.createBuilder();
                    aicb aicbVar2 = aicbVar;
                    createBuilder2.aO(ahxx.a(aicbVar2.f));
                    anam anamVar = (anam) createBuilder2.s();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    apag apagVar = createBuilder.b;
                    anap anapVar = (anap) apagVar;
                    anamVar.getClass();
                    anapVar.h = anamVar;
                    anapVar.b |= 4;
                    if (!apagVar.isMutable()) {
                        createBuilder.u();
                    }
                    apag apagVar2 = createBuilder.b;
                    anap anapVar2 = (anap) apagVar2;
                    anapVar2.c = 0;
                    anapVar2.b |= 1;
                    if (!apagVar2.isMutable()) {
                        createBuilder.u();
                    }
                    apag apagVar3 = createBuilder.b;
                    anap anapVar3 = (anap) apagVar3;
                    anapVar3.b |= 16;
                    anapVar3.i = false;
                    List list2 = aicbVar2.a;
                    if (list2 != null) {
                        if (!apagVar3.isMutable()) {
                            createBuilder.u();
                        }
                        anap anapVar4 = (anap) createBuilder.b;
                        apax apaxVar = anapVar4.d;
                        if (!apaxVar.c()) {
                            anapVar4.d = apag.mutableCopy(apaxVar);
                        }
                        aoyj.addAll(list2, anapVar4.d);
                    }
                    List list3 = aicbVar2.b;
                    if (list3 != null) {
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        anap anapVar5 = (anap) createBuilder.b;
                        apax apaxVar2 = anapVar5.e;
                        if (!apaxVar2.c()) {
                            anapVar5.e = apag.mutableCopy(apaxVar2);
                        }
                        aoyj.addAll(list3, anapVar5.e);
                    }
                    List list4 = aicbVar2.c;
                    if (list4 != null) {
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        anap anapVar6 = (anap) createBuilder.b;
                        apax apaxVar3 = anapVar6.f;
                        if (!apaxVar3.c()) {
                            anapVar6.f = apag.mutableCopy(apaxVar3);
                        }
                        aoyj.addAll(list4, anapVar6.f);
                    }
                    List list5 = aicbVar2.d;
                    if (list5 != null) {
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        anap anapVar7 = (anap) createBuilder.b;
                        apax apaxVar4 = anapVar7.g;
                        if (!apaxVar4.c()) {
                            anapVar7.g = apag.mutableCopy(apaxVar4);
                        }
                        aoyj.addAll(list5, anapVar7.g);
                    }
                    ahiy ahiyVar = ahxl.this.c;
                    aozy j = ahiyVar.j();
                    if (!j.b.isMutable()) {
                        j.u();
                    }
                    anan ananVar = (anan) j.b;
                    anan ananVar2 = anan.a;
                    ananVar.c = 1;
                    ananVar.b |= 1;
                    anap anapVar8 = (anap) createBuilder.s();
                    if (!j.b.isMutable()) {
                        j.u();
                    }
                    anan ananVar3 = (anan) j.b;
                    anapVar8.getClass();
                    ananVar3.i = anapVar8;
                    ananVar3.b |= 1048576;
                    anan ananVar4 = (anan) j.s();
                    aozy d = ahop.d((aicm) ahiyVar.a, 3, 3);
                    if (!d.b.isMutable()) {
                        d.u();
                    }
                    anah anahVar = (anah) d.b;
                    anah anahVar2 = anah.a;
                    anahVar.d = 1;
                    anahVar.b |= 2;
                    if (!d.b.isMutable()) {
                        d.u();
                    }
                    anah anahVar3 = (anah) d.b;
                    ananVar4.getClass();
                    anahVar3.f = ananVar4;
                    anahVar3.b |= 64;
                    String a2 = ((ahyr) ahiyVar.c).a();
                    if (!d.b.isMutable()) {
                        d.u();
                    }
                    anah anahVar4 = (anah) d.b;
                    a2.getClass();
                    anahVar4.b |= 1073741824;
                    anahVar4.m = a2;
                    ahiyVar.e((anah) d.s());
                    ahxl.j(new ahka("SearchNearby"));
                    return (aicc) acirVar.h();
                }
            }).c(new acca(4));
        } catch (Error | RuntimeException e) {
            aico.b(e);
            throw e;
        }
    }
}
