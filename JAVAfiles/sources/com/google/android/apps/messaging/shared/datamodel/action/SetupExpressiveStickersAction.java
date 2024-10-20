package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.abvh;
import defpackage.agkg;
import defpackage.agnq;
import defpackage.aiqj;
import defpackage.airh;
import defpackage.akms;
import defpackage.akmt;
import defpackage.akrh;
import defpackage.akto;
import defpackage.aktp;
import defpackage.albo;
import defpackage.amdy;
import defpackage.ancd;
import defpackage.ancj;
import defpackage.andi;
import defpackage.anee;
import defpackage.anen;
import defpackage.aneo;
import defpackage.aodd;
import defpackage.aode;
import defpackage.aouz;
import defpackage.aozy;
import defpackage.apag;
import defpackage.apwt;
import defpackage.armf;
import defpackage.hss;
import defpackage.qdl;
import defpackage.qyv;
import defpackage.rau;
import defpackage.raw;
import defpackage.rfw;
import defpackage.rgi;
import defpackage.rgj;
import defpackage.uli;
import defpackage.utw;
import defpackage.xnv;
import defpackage.xyo;
import defpackage.xze;
import defpackage.ydh;
import defpackage.ykw;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SetupExpressiveStickersAction extends ThrottledAction implements Parcelable {
    public final armf b;
    public final ykw c;
    public final xnv d;
    public final apwt e;
    public final agnq f;
    public final airh g;
    private final Context k;
    private final akmt l;
    private final anen m;
    private final anen n;
    private final ScheduledExecutorService o;
    public static final xze a = xze.g("BugleDataModel", "SetupExpressiveStickersAction");
    private static final long h = TimeUnit.MINUTES.toMillis(10);
    private static final long i = TimeUnit.MINUTES.toMillis(3);
    private static final long j = TimeUnit.SECONDS.toMillis(30);
    public static final Parcelable.Creator<Action<Void>> CREATOR = new rfw(5);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rgj NX();
    }

    public SetupExpressiveStickersAction(Context context, armf armfVar, ykw ykwVar, xnv xnvVar, apwt apwtVar, anen anenVar, anen anenVar2, aneo aneoVar, airh airhVar, agnq agnqVar) {
        super(amdy.SETUP_EXPRESSIVE_STICKERS_ACTION);
        this.k = context;
        this.b = armfVar;
        this.c = ykwVar;
        this.l = aktp.x(context);
        this.d = xnvVar;
        this.e = apwtVar;
        this.m = anenVar;
        this.n = anenVar2;
        this.o = aneoVar;
        this.g = airhVar;
        this.f = agnqVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction, com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("SetupExpressiveStickersAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.SetupExpressiveStickers.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final int f() {
        return 128;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final long g() {
        return h;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final String h() {
        return "SetupExpressiveStickersAction";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final void i() {
        aouz aouzVar;
        if (!((Boolean) utw.f.e()).booleanValue()) {
            a.q("isExpressiveStickersEnabled is false.");
            return;
        }
        if (this.c.q("is_expressive_stickers_setup_done", false)) {
            return;
        }
        akrh e = aktp.e("RecentExpressiveStickerDatabaseOperations#getRecentExpressiveStickers");
        try {
            List d = uli.d(String.valueOf(utw.I.e()));
            e.close();
            if (d.isEmpty()) {
                airh airhVar = this.g;
                aozy createBuilder = aodd.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ((aodd) createBuilder.b).b = aode.a(41);
                airhVar.a((aodd) createBuilder.s());
                try {
                    aouzVar = (aouz) apag.parseFrom(aouz.a, (byte[]) utw.H.e());
                } catch (Exception e2) {
                    a.n("Failed to parse StickerMarketConfig.", e2);
                    aouzVar = aouz.a;
                }
                if (aouzVar.b.size() == 0) {
                    a.m("StickerMarketConfig has no default sticker packs!");
                    this.g.d(5);
                    albo.bI(null);
                    return;
                }
                ListenableFuture bP = albo.bP(ancj.f(((aiqj) this.e.b()).c(), new qyv(20), andi.a), j, TimeUnit.MILLISECONDS, this.o);
                albo.bR(bP, new rgi(this, 0), andi.a);
                ancd.f(((anee) ancj.f(ancj.f(ancj.g(ancj.f(anee.o(bP), new raw(this, aouzVar, 7), andi.a), new qdl(this, aouzVar, 17), andi.a), akto.a(new rau(this, 15)), this.n), new rau(this, 16), this.m)).p(i, TimeUnit.MILLISECONDS, this.o), Exception.class, new qyv(19), andi.a);
                return;
            }
            this.c.h("is_expressive_stickers_setup_done", true);
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final Uri l(String str, String str2) {
        try {
            File file = (File) agkg.b(((akms) this.l.v().O(hss.a, 7500)).k(str2).r(), 7500L, TimeUnit.MILLISECONDS);
            File file2 = new File(this.k.getFilesDir(), "recent_expressive_stickers/".concat(String.valueOf(str)));
            if (!ydh.h(file2)) {
                xyo b = a.b();
                b.H("Failed to create directories for");
                b.H(file2);
                b.q();
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        abvh.a(fileInputStream, fileOutputStream);
                        fileOutputStream.close();
                        fileInputStream.close();
                        return Uri.fromFile(file2);
                    } finally {
                    }
                } finally {
                }
            } catch (IOException e) {
                a.n("Error copying expressive sticker file.", e);
                return null;
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            xyo b2 = a.b();
            b2.H("Failed to download sticker");
            b2.H(str);
            b2.r(e2);
            return null;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        C(parcel, i2);
    }

    public SetupExpressiveStickersAction(Context context, armf armfVar, ykw ykwVar, xnv xnvVar, apwt apwtVar, anen anenVar, anen anenVar2, aneo aneoVar, airh airhVar, agnq agnqVar, Parcel parcel) {
        super(parcel, amdy.SETUP_EXPRESSIVE_STICKERS_ACTION);
        this.k = context;
        this.b = armfVar;
        this.c = ykwVar;
        this.l = aktp.x(context);
        this.d = xnvVar;
        this.e = apwtVar;
        this.m = anenVar;
        this.n = anenVar2;
        this.o = aneoVar;
        this.g = airhVar;
        this.f = agnqVar;
    }
}
