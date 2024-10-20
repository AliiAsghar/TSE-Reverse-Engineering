package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.ArrayMap;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import java.net.Proxy;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ton implements apxw {
    public static agns a() {
        return new agnf(tom.d, true, "user_references", new thz(20));
    }

    public static agns c() {
        return new agnf(tom.c, "user_references", new thz(19));
    }

    public static agmh[] d() {
        return (agmh[]) tow.c.b;
    }

    public static agns e() {
        return new agnf(tow.b, "verified_sms_blacklisted_senders", new tpd(1));
    }

    public static agmh[] f() {
        return tpi.b.h;
    }

    public static agns g() {
        return new agnf(tpi.c, "verified_sms_brands", new tpd(0));
    }

    public static agmh[] h() {
        return (agmh[]) tps.c.b;
    }

    public static agns i() {
        return new agnf(tps.b, "verified_sms_senders", new tpd(2));
    }

    public static agmh[] j() {
        return (agmh[]) VmtTable.d.a;
    }

    public static agns k() {
        return new agnf(VmtTable.c, "vmt", new tpd(3));
    }

    public static aiqj l(Context context, armf armfVar) {
        aouz aouzVar;
        xze xzeVar = ubf.a;
        String str = (String) utw.G.e();
        Locale f = dzf.c(context.getResources().getConfiguration()).f(0);
        aiqj aiqjVar = (aiqj) armfVar.b();
        try {
            aouzVar = (aouz) apag.parseFrom(aouz.a, (byte[]) utw.H.e());
            if (aouzVar.b.size() == 0) {
                ubf.a.q("StickerMarketConfig is empty!");
            }
        } catch (apba e) {
            ubf.a.n("getStickerMarketConfig:", e);
            aouzVar = aouz.a;
        }
        Object obj = aiqjVar.j;
        String I = ahmc.I(str, f, aouzVar);
        synchronized (((airl) obj).a) {
            airk airkVar = ((airl) obj).c;
            if (airkVar != null && I.equals(airkVar.d)) {
                ancj.f(((airl) obj).c.a(), new ahnx(20), andi.a);
            } else {
                airk airkVar2 = ((airl) obj).c;
                if (airkVar2 != null) {
                    airkVar2.c();
                }
                ((airl) obj).c = new airk(((airl) obj).e, str, f, aouzVar);
                ((airh) ((airl) obj).e.g).c = str;
                ancj.f(((airl) obj).c.a(), new ajwz(1), andi.a);
            }
        }
        xyo c = ubf.a.c();
        c.H("Providing ExpressiveStickerClient with metadata.");
        c.z(BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION, str);
        c.z("locale", f);
        c.q();
        aiqjVar.getClass();
        return aiqjVar;
    }

    public static aiqj m(Context context, anen anenVar, apwt apwtVar) {
        xze xzeVar = ubf.a;
        abnr a = new abnm(context, "EXPRESSION").a();
        aboj abojVar = new aboj(a, "EXPRESSION_COUNTERS", 100);
        alhw alhwVar = new alhw(false);
        Context applicationContext = context.getApplicationContext();
        aozy createBuilder = aoda.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((aoda) createBuilder.b).b = a.av(4);
        String d = xws.d(context);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aoda aodaVar = (aoda) createBuilder.b;
        d.getClass();
        aodaVar.c = d;
        aoda aodaVar2 = (aoda) createBuilder.s();
        alhr D = albo.D(new tor(apwtVar, 15));
        String str = (String) ubf.b.e();
        airn airnVar = new airn(Proxy.NO_PROXY, airn.a, new ArrayMap(), anenVar);
        Uri parse = Uri.parse((String) ubg.a.e());
        if (anenVar != null) {
            if (aodaVar2 != null) {
                if (D != null) {
                    if (str != null) {
                        return new aiqj(applicationContext, anenVar, aodaVar2, D, str, new agcp(applicationContext, (byte[]) null), new airh(applicationContext, aodaVar2, a, abojVar), airnVar, parse, alhwVar);
                    }
                    throw new IllegalStateException("apiKey == null");
                }
                throw new IllegalStateException("rpcChannelSupplier and rpcChannel both null");
            }
            throw new IllegalStateException("clientInfo == null");
        }
        throw new IllegalStateException("bgExecutor == null");
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [apwt, java.lang.Object] */
    public static ubl n(ubm ubmVar) {
        Context context = (Context) ubmVar.a.b();
        context.getClass();
        ((anen) ubmVar.b.b()).getClass();
        anen anenVar = (anen) ubmVar.c.b();
        anenVar.getClass();
        xyt xytVar = (xyt) ubmVar.d.b();
        xytVar.getClass();
        akbm akbmVar = (akbm) ubmVar.s.b();
        akbmVar.getClass();
        aksr aksrVar = (aksr) ubmVar.t.b();
        aksrVar.getClass();
        ?? b = ubmVar.x.b();
        b.getClass();
        armf armfVar = ubmVar.y;
        return new ubl(context, anenVar, xytVar, ubmVar.e, ubmVar.f, ubmVar.g, ubmVar.h, ubmVar.i, ubmVar.j, ubmVar.k, ubmVar.l, ubmVar.m, ubmVar.n, ubmVar.o, ubmVar.p, ubmVar.q, ubmVar.r, akbmVar, aksrVar, ubmVar.u, ubmVar.v, ubmVar.w, b, armfVar);
    }

    public static agmh[] o() {
        return uqb.c.l;
    }

    public static agns p() {
        return new agnf(uqb.d, "work_queue", new tpd(4));
    }

    public static agmh[] q() {
        return (agmh[]) urd.c.j;
    }

    public static agns r() {
        return new agnf(urd.d, "work_queue_work_manager_ids", new tpd(6));
    }

    public static agns s() {
        return new agnf(urd.e, true, "work_queue_work_manager_ids", new tpd(5));
    }

    public static uie t(rrj rrjVar, Context context) {
        uie uieVar = new uie(context);
        synchronized (rrjVar.b) {
            rrjVar.a.add(uieVar);
        }
        return uieVar;
    }

    public static akcy u(armf armfVar, ahiy ahiyVar) {
        return new akdf(new lpn(armfVar, 17), ahiyVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [armf, java.lang.Object] */
    public static uvi v(zai zaiVar, anen anenVar) {
        ((Context) zaiVar.d.b()).getClass();
        anenVar.getClass();
        uvk uvkVar = new uvk(zaiVar.c, zaiVar.e, zaiVar.b, zaiVar.a, anenVar);
        xyl.c = uvkVar;
        return uvkVar;
    }

    @Override // defpackage.armf, defpackage.arme
    public final /* synthetic */ Object b() {
        throw null;
    }
}
