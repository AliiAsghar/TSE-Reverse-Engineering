package defpackage;

import android.net.Uri;
import android.util.Log;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class airk {
    public final Object a = new Object();
    public final String b;
    public final Locale c;
    public final String d;
    public final aouz e;
    public ListenableFuture f;
    public final aiqj g;

    public airk(aiqj aiqjVar, String str, Locale locale, aouz aouzVar) {
        this.g = aiqjVar;
        this.b = str;
        this.c = locale;
        this.e = aouzVar;
        this.d = ahmc.I(str, locale, aouzVar);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, anen] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final ListenableFuture a() {
        Log.d("MetadataFetcher", "load() started for cache key ".concat(String.valueOf(this.d)));
        synchronized (this.a) {
            if (this.f != null) {
                Log.d("MetadataFetcher", "load() returned cached future for cache key " + this.d);
                return this.f;
            }
            ListenableFuture f = ancj.f(ancd.g(this.g.b.submit(new aidu(this, 5)), Throwable.class, new ancs() { // from class: airj
                /* JADX WARN: Type inference failed for: r0v10, types: [java.util.concurrent.Executor, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r1v4, types: [java.util.concurrent.Executor, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r2v3, types: [java.util.concurrent.Executor, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r2v6, types: [java.util.concurrent.Executor, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r4v12, types: [java.util.concurrent.Executor, java.lang.Object] */
                @Override // defpackage.ancs
                public final ListenableFuture a(Object obj) {
                    airk airkVar;
                    ListenableFuture bN;
                    ListenableFuture bH;
                    airk airkVar2 = airk.this;
                    aiqj aiqjVar = airkVar2.g;
                    String str = airkVar2.b;
                    aovf aovfVar = (aovf) aiqjVar.l(str, airkVar2.c, airkVar2.e).s();
                    aozy createBuilder = aout.a.createBuilder();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    aout aoutVar = (aout) createBuilder.b;
                    aovfVar.getClass();
                    aoutVar.c = aovfVar;
                    aoutVar.b |= 1;
                    aout aoutVar2 = (aout) createBuilder.s();
                    if (((algw) aiqjVar.e).f() && ((algw) aiqjVar.f).f()) {
                        try {
                            Uri.Builder buildUpon = ((Uri) ((algw) aiqjVar.f).b()).buildUpon();
                            JSONObject jSONObject = new JSONObject();
                            aovf aovfVar2 = aoutVar2.c;
                            if (aovfVar2 == null) {
                                aovfVar2 = aovf.a;
                            }
                            JSONObject jSONObject2 = new JSONObject();
                            aous aousVar = aovfVar2.c;
                            if (aousVar == null) {
                                aousVar = aous.a;
                            }
                            JSONObject jSONObject3 = new JSONObject();
                            aoda aodaVar = aousVar.c;
                            if (aodaVar == null) {
                                aodaVar = aoda.a;
                            }
                            JSONObject jSONObject4 = new JSONObject();
                            airkVar = airkVar2;
                            try {
                                ahmc.E(jSONObject4, "client_id", Integer.valueOf(aodaVar.b));
                                ahmc.D(jSONObject4, BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION, aodaVar.c);
                                ahmc.G(jSONObject3, "client", jSONObject4);
                                ahmc.D(jSONObject3, "locale", aousVar.d);
                                ahmc.D(jSONObject3, "country", aousVar.e);
                                ahmc.F(jSONObject3, "experiment_ids", aousVar.f);
                                ahmc.G(jSONObject2, "common_context", jSONObject3);
                                ahmc.D(jSONObject2, "metadata_version", aovfVar2.d);
                                ahmc.F(jSONObject2, "device_favorite_packs", aovfVar2.e);
                                ahmc.E(jSONObject2, "resolution", Integer.valueOf(aovfVar2.f));
                                aouz aouzVar = aovfVar2.g;
                                if (aouzVar == null) {
                                    aouzVar = aouz.a;
                                }
                                JSONObject jSONObject5 = new JSONObject();
                                ahmc.F(jSONObject5, "default_packs", aouzVar.b);
                                ahmc.F(jSONObject5, "hidden_packs", aouzVar.c);
                                ahmc.F(jSONObject5, "pack_order", aouzVar.d);
                                ahmc.F(jSONObject5, "default_stickers", aouzVar.e);
                                ahmc.G(jSONObject2, "market_config", jSONObject5);
                                ahmc.G(jSONObject, "user_context", jSONObject2);
                                aouv aouvVar = aoutVar2.d;
                                if (aouvVar == null) {
                                    aouvVar = aouv.a;
                                }
                                JSONObject jSONObject6 = new JSONObject();
                                ahmc.D(jSONObject6, "raw_query", aouvVar.b);
                                if (aouvVar.c) {
                                    jSONObject6.putOpt("favorite_only", true);
                                }
                                ahmc.G(jSONObject, "search_criteria", jSONObject6);
                                bH = ancd.f(((airm) ((algw) aiqjVar.e).b()).a(buildUpon.appendQueryParameter("$req", jSONObject.toString()).build().toString()), Throwable.class, new ahnx(17), aiqjVar.b);
                                Object obj2 = aiqjVar.g;
                                str = str;
                                try {
                                    ((airh) obj2).c = str;
                                    ((airh) obj2).c(3);
                                } catch (JSONException e) {
                                    e = e;
                                    bH = albo.bH(e);
                                    bN = ancj.f(bH, new ahnx(18), aiqjVar.b);
                                    albo.bR(bN, new vbr(aiqjVar, str, 13), aiqjVar.b);
                                    airk airkVar3 = airkVar;
                                    return ancj.f(bN, new agui(airkVar3, 19), airkVar3.g.b);
                                }
                            } catch (JSONException e2) {
                                e = e2;
                                str = str;
                            }
                        } catch (JSONException e3) {
                            e = e3;
                            airkVar = airkVar2;
                        }
                        bN = ancj.f(bH, new ahnx(18), aiqjVar.b);
                    } else {
                        airkVar = airkVar2;
                        bN = albo.bN(new xpx(aiqjVar, aoutVar2, 15), aiqjVar.b);
                    }
                    albo.bR(bN, new vbr(aiqjVar, str, 13), aiqjVar.b);
                    airk airkVar32 = airkVar;
                    return ancj.f(bN, new agui(airkVar32, 19), airkVar32.g.b);
                }
            }, this.g.b), new ahnx(19), this.g.b);
            this.f = f;
            albo.bR(f, new adnx(this, 16), this.g.b);
            return f;
        }
    }

    public final File b() {
        aiqj aiqjVar = this.g;
        return new File(aiqjVar.f(), ahmc.H(this.d));
    }

    public final void c() {
        synchronized (this.a) {
            ListenableFuture listenableFuture = this.f;
            if (listenableFuture != null) {
                listenableFuture.cancel(false);
                this.f = null;
                Log.d("MetadataFetcher", "Cancel metadata fetch future of " + this.d);
            }
        }
    }
}
