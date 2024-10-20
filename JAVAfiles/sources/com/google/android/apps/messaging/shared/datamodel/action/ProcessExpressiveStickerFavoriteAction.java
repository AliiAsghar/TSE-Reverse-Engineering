package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.akul;
import defpackage.albo;
import defpackage.amdy;
import defpackage.anfz;
import defpackage.angd;
import defpackage.aozy;
import defpackage.apag;
import defpackage.apba;
import defpackage.aqdu;
import defpackage.aqfn;
import defpackage.armf;
import defpackage.ray;
import defpackage.rcu;
import defpackage.rhl;
import defpackage.trh;
import defpackage.trm;
import defpackage.trn;
import defpackage.uwg;
import defpackage.vcc;
import defpackage.vcf;
import defpackage.veq;
import defpackage.ver;
import defpackage.wpp;
import defpackage.xyo;
import defpackage.xze;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ProcessExpressiveStickerFavoriteAction extends Action<ListenableFuture<aqdu>> {
    private final armf b;
    private final vcc c;
    private final vcf d;
    private final armf e;
    private final wpp f;
    private static final xze a = xze.g("BugleNetwork", "ProcessExpressiveStickerFavoriteAction");
    public static final Parcelable.Creator<Action<ListenableFuture<aqdu>>> CREATOR = new ray(11);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rcu Nz();
    }

    public ProcessExpressiveStickerFavoriteAction(armf armfVar, vcc vccVar, vcf vcfVar, wpp wppVar, armf armfVar2, Parcel parcel) {
        super(parcel, amdy.PROCESS_EXPRESSIVE_STICKER_FAVORITE_ACTION);
        this.b = armfVar;
        this.c = vccVar;
        this.f = wppVar;
        this.e = armfVar2;
        this.d = vcfVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("ProcessExpressiveStickerFavoriteAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* synthetic */ Object b() {
        ver a2;
        akul a3;
        rhl rhlVar = this.u;
        byte[] A = this.u.A("desktop_id_key");
        String l = rhlVar.l("request_id_key");
        if (A != null && l != null) {
            try {
                aqfn aqfnVar = (aqfn) apag.parseFrom(aqfn.a, A);
                aozy createBuilder = anfz.a.createBuilder();
                boolean y = this.u.y("is_favorite_key");
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ((anfz) createBuilder.b).c = y;
                String l2 = this.u.l("pack_id_key");
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                anfz anfzVar = (anfz) createBuilder.b;
                l2.getClass();
                anfzVar.b = l2;
                anfz anfzVar2 = (anfz) createBuilder.s();
                if (((Boolean) uwg.a.e()).booleanValue()) {
                    trm a4 = ((trn) this.e.b()).a(aqfnVar.c);
                    if (a4 == null) {
                        xyo e = a.e();
                        e.z("desktopId", aqfnVar.c);
                        e.H("Desktop not found. Skipping favorite sticker sync.");
                        e.q();
                        return albo.bI(null);
                    }
                    veq P = this.f.P(a4.e);
                    P.b = l;
                    aozy createBuilder2 = angd.a.createBuilder();
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    angd angdVar = (angd) createBuilder2.b;
                    anfzVar2.getClass();
                    angdVar.c = anfzVar2;
                    angdVar.b = 10;
                    P.b(createBuilder2.s());
                    a2 = P.a();
                } else {
                    veq O = this.f.O(aqfnVar, Optional.empty());
                    O.b = l;
                    aozy createBuilder3 = angd.a.createBuilder();
                    if (!createBuilder3.b.isMutable()) {
                        createBuilder3.u();
                    }
                    angd angdVar2 = (angd) createBuilder3.b;
                    anfzVar2.getClass();
                    angdVar2.c = anfzVar2;
                    angdVar2.b = 10;
                    O.b(createBuilder3.s());
                    a2 = O.a();
                }
                ((trh) this.b.b()).d(l, aqfnVar.c, albo.aE(18), 10, a2.b);
                if (((Boolean) uwg.a.e()).booleanValue()) {
                    a3 = this.d.a(a2);
                } else {
                    a3 = this.c.a(a2);
                }
                a2.l(a3);
                return a3;
            } catch (apba e2) {
                a.n("Desktop ID invalid.", e2);
                return albo.bI(null);
            }
        }
        a.m("Desktop ID or request ID null, skipping StickerFavorite.");
        return albo.bI(null);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.FavoriteStickersUpdate.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }
}
