package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import androidx.window.extensions.WindowExtensions;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import androidx.window.reflection.Consumer2;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.settings.InfoAndOptionsActivity;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.ui.conversation.details.ConversationDetailsActivity;
import j$.util.DesugarArrays;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpx {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public gpx(Context context, Optional optional, qoq qoqVar, vjs vjsVar) {
        this.b = context;
        this.d = optional;
        this.c = qoqVar;
        this.a = vjsVar;
    }

    @Deprecated
    public static final void w(Context context, ConversationIdType conversationIdType, String str) {
        Intent intent = new Intent(context, (Class<?>) InfoAndOptionsActivity.class);
        intent.putExtra("conversation_id", conversationIdType.a());
        intent.putExtra("mapi_conversation_id", new BugleConversationId(conversationIdType));
        intent.putExtra("is_rcs_conversation", true);
        intent.putExtra("is_group_conversation", false);
        intent.putExtra("rbm_bot_id", str);
        context.startActivity(intent);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [xyt, java.lang.Object] */
    public final boolean A(boolean z) {
        if (z && ((yaq) this.a.a()).c() == yay.UNAVAILABLE) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [arpi, java.lang.Object] */
    public final ikr B(String str, iko ikoVar, arqr arqrVar) {
        return new ikr(this.d, this.a, (ansy) this.b, (ahiy) this.c, str, ikoVar, arqrVar);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, androidx.window.extensions.embedding.ActivityEmbeddingComponent] */
    public final void a(final gpz gpzVar) {
        this.a.setSplitInfoCallback(new Consumer2() { // from class: gpv
            @Override // androidx.window.reflection.Consumer2, androidx.window.extensions.core.util.function.Consumer
            public final void accept(Object obj) {
                gpz gpzVar2 = gpz.this;
                List list = (List) obj;
                gpzVar2.getClass();
                gpx gpxVar = this;
                gpxVar.getClass();
                list.getClass();
                ((gph) gpxVar.b).a(list);
                gpzVar2.a();
            }
        });
    }

    public final /* synthetic */ void b(Runnable runnable) {
        ((gzx) this.b).execute(runnable);
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, androidx.window.extensions.WindowExtensions] */
    public final ActivityEmbeddingComponent c() {
        ActivityEmbeddingComponent activityEmbeddingComponent;
        if (!((hgi) this.a).t() || !gvf.ax("WindowExtensions#getActivityEmbeddingComponent is not valid", new gov(this, 3))) {
            return null;
        }
        int i = new xzg((byte[]) null).a;
        boolean z = true;
        if (i == 1) {
            z = e();
        } else if (i == 2) {
            z = f();
        } else if (i >= 3 && i < 5) {
            z = g();
        } else if (i == 5) {
            z = h();
        } else if (i == 6) {
            z = i();
        } else if (i < 7 || !i() || !gvf.ax("SplitAttributes#getAnimationParams is not valid", gqi.n) || !gvf.ax("SplitAttributes#setAnimationParams is not valid", gqj.a) || !gvf.ax("DividerAttributes#isDraggingToFullscreenAllowed is not valid", gqj.b) || !gvf.ax("DividerAttributes.Builder#setDraggingToFullscreenAllowed is not valid", gqj.d) || !gvf.ax("Class AnimationParams is not valid", ry.p) || !gvf.ax("Class AnimationParams.Builder is not valid", ry.o)) {
            z = false;
        }
        if (!z) {
            return null;
        }
        try {
            activityEmbeddingComponent = this.c.getActivityEmbeddingComponent();
            return activityEmbeddingComponent;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    public final Class d() {
        Class<?> loadClass = ((ClassLoader) this.d).loadClass("androidx.window.extensions.embedding.ActivityEmbeddingComponent");
        loadClass.getClass();
        return loadClass;
    }

    public final boolean e() {
        if (gvf.ax("ActivityEmbeddingComponent#setEmbeddingRules is not valid", new gov(this, 12)) && gvf.ax("ActivityEmbeddingComponent#isActivityEmbedded is not valid", new gov(this, 8)) && gvf.ax("ActivityEmbeddingComponent#setSplitInfoCallback is not valid", new gov(this, 13)) && gvf.ax("SplitRule#getSplitRatio is not valid", gqi.u) && gvf.ax("SplitRule#getLayoutDirection is not valid", gqi.r) && gvf.ax("Class ActivityRule is not valid", ry.l) && gvf.ax("Class ActivityRule.Builder is not valid", ry.j) && gvf.ax("Class SplitInfo is not valid", gqi.e) && gvf.ax("Class SplitPairRule is not valid", gqi.h) && gvf.ax("Class SplitPairRule.Builder is not valid", gqi.f) && gvf.ax("Class SplitPlaceholderRule is not valid", gqi.k) && gvf.ax("Class SplitPlaceholderRule.Builder is not valid", gqi.i)) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (e() && gvf.ax("ActivityEmbeddingComponent#setSplitInfoCallback is not valid", new gov(this, 14)) && gvf.ax("ActivityEmbeddingComponent#clearSplitInfoCallback is not valid", new gov(this, 5)) && gvf.ax("ActivityEmbeddingComponent#setSplitAttributesCalculator is not valid", new gov(this, 15)) && gvf.ax("SplitInfo#getSplitAttributes is not valid", gqi.s) && gvf.ax("SplitPlaceholderRule#getFinishPrimaryWithPlaceholder is not valid", gqi.q) && gvf.ax("SplitRule#getDefaultSplitAttributes is not valid", gqi.o) && gvf.ax("Class ActivityRule.Builder is not valid", ry.k) && gvf.ax("Class EmbeddingRule is not valid", gqi.b) && gvf.ax("Class SplitAttributes is not valid", gqi.c) && gvf.ax("Class SplitAttributesCalculatorParams is not valid", gqi.a) && gvf.ax("Class SplitAttributes.SplitType is not valid", gqi.l) && gvf.ax("Class SplitPairRule.Builder is not valid", gqi.g) && gvf.ax("Class SplitPlaceholderRule.Builder is not valid", gqi.j)) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if (f() && gvf.ax("#invalidateTopVisibleSplitAttributes is not valid", new gov(this, 7)) && gvf.ax("#updateSplitAttributes is not valid", new gov(this, 17)) && gvf.ax("SplitInfo#getToken is not valid", gqj.e)) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if (g() && gvf.ax("ActivityStack#getActivityToken is not valid", ry.i) && gvf.ax("registerActivityStackCallback is not valid", new gov(this, 10)) && gvf.ax("unregisterActivityStackCallback is not valid", new gov(this, 16)) && gvf.ax("#pin(unPin)TopActivityStack is not valid", new gov(this, 9)) && gvf.ax("updateSplitAttributes is not valid", new gov(this, 18)) && gvf.ax("SplitInfo#getSplitInfoToken is not valid", gqi.t) && gvf.ax("Class AnimationBackground is not valid", ry.n) && gvf.ax("Class ActivityStack.Token is not valid", ry.m) && gvf.ax("Class WindowAttributes is not valid", gqi.m) && gvf.ax("SplitInfo.Token is not valid", gqi.d)) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if (h() && gvf.ax("ActivityEmbeddingComponent#getEmbeddedActivityWindowInfo is not valid", new gov(this, 6)) && gvf.ax("ActivityEmbeddingComponent#setEmbeddedActivityWindowInfoCallback is not valid", new gov(this, 11)) && gvf.ax("ActivityEmbeddingComponent#clearEmbeddedActivityWindowInfoCallback is not valid", new gov(this, 4)) && gvf.ax("SplitAttributes#getDividerAttributes is not valid", gqi.p) && gvf.ax("SplitAttributes#setDividerAttributes is not valid", gqj.c) && gvf.ax("Class EmbeddedActivityWindowInfo is not valid", ry.s) && gvf.ax("Class DividerAttributes is not valid", ry.r) && gvf.ax("Class DividerAttributes.Builder is not valid", ry.q)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, arqg] */
    public final gbg j() {
        return (gbg) this.a.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public final eqn k(int i, int i2) {
        SparseArray sparseArray = (SparseArray) ((asnn) this.b.get(i)).b;
        dzg.d(eul.S(sparseArray, i2));
        return (eqn) sparseArray.get(i2);
    }

    public final fxb l(int i) {
        return (fxb) ((SparseArray) this.a).get(i);
    }

    public final void m(int i, fxb fxbVar) {
        dzg.e(!eul.S((SparseArray) this.a, i), "Exactly one SampleExporter can be added for each track type.");
        ((SparseArray) this.a).put(i, fxbVar);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List, java.lang.Object] */
    public final boolean n() {
        for (int i = 0; i < this.b.size(); i++) {
            if (((asnn) this.b.get(i)).a == -1) {
                return false;
            }
        }
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            asnn asnnVar = (asnn) this.b.get(i2);
            if (asnnVar.a != ((SparseArray) asnnVar.b).size()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [armf, java.lang.Object] */
    public final ibr o(String str) {
        Context context = (Context) this.b.b();
        context.getClass();
        abbu abbuVar = (abbu) this.d.b();
        abbuVar.getClass();
        ydh ydhVar = (ydh) this.c.b();
        ydhVar.getClass();
        ibs ibsVar = (ibs) this.a.b();
        ibsVar.getClass();
        return new ibr(context, abbuVar, ydhVar, ibsVar, str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, java.util.concurrent.BlockingQueue] */
    public final synchronized void p(hkd hkdVar) {
        ?? r0 = this.d;
        String str = hkdVar.b;
        List list = (List) r0.remove(str);
        if (list != null && !list.isEmpty()) {
            if (hkn.b) {
                hkn.d("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), str);
            }
            hkd hkdVar2 = (hkd) list.remove(0);
            this.d.put(str, list);
            hkdVar2.m(this);
            try {
                this.c.put(hkdVar2);
            } catch (InterruptedException e) {
                hkn.b("Couldn't add request to queue. %s", e.toString());
                Thread.currentThread().interrupt();
                ((hjt) this.b).a();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.Map, java.lang.Object] */
    public final synchronized boolean q(hkd hkdVar) {
        ?? r0 = this.d;
        String str = hkdVar.b;
        if (r0.containsKey(str)) {
            List list = (List) this.d.get(str);
            if (list == null) {
                list = new ArrayList();
            }
            hkdVar.c("waiting-for-response");
            list.add(hkdVar);
            this.d.put(str, list);
            if (hkn.b) {
                hkn.a("Request for cacheKey=%s is in flight, putting on hold.", str);
            }
            return true;
        }
        this.d.put(str, null);
        hkdVar.m(this);
        if (hkn.b) {
            hkn.a("new request, sending to network %s", str);
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [armf, java.lang.Object] */
    public final jdg r(int i) {
        Context context = (Context) this.c.b();
        context.getClass();
        asai asaiVar = (asai) this.a.b();
        asaiVar.getClass();
        asai asaiVar2 = (asai) this.d.b();
        asaiVar2.getClass();
        ico icoVar = (ico) this.b.b();
        icoVar.getClass();
        return new jdg(context, asaiVar, asaiVar2, icoVar, i);
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [armf, java.lang.Object] */
    public final Intent s(Context context, boolean z, int i, boolean z2, String str, int i2, qpd qpdVar) {
        Intent intent = new Intent(context, (Class<?>) ConversationDetailsActivity.class);
        intent.putExtra("is_rcs_conversation", z);
        intent.putExtra("is_group_conversation", true);
        intent.putExtra("conversation_state", i);
        intent.putExtra("global_rcs_group_name", str);
        intent.putExtra("conversation_error_state", qpdVar.a());
        intent.putExtra("is_e2ee_rcs_conversation", z2);
        intent.putExtra("conversation_settings_launch_source", i2);
        if (((ocj) this.b.b()).a()) {
            intent.addCategory("android.intent.category.LAUNCHER");
        }
        return intent;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [armf, java.lang.Object] */
    public final Intent t(Context context, boolean z, int i, boolean z2, boolean z3, int i2, int i3) {
        Intent intent = new Intent(context, (Class<?>) ConversationDetailsActivity.class);
        intent.putExtra("is_rcs_conversation", z);
        intent.putExtra("is_group_conversation", false);
        intent.putExtra("conversation_state", i);
        if (((ocj) this.b.b()).a()) {
            intent.addCategory("android.intent.category.LAUNCHER");
        }
        if (((trz) this.d.b()).r()) {
            intent.putExtra("is_e2ee_rcs_conversation", z2);
            intent.putExtra("has_been_e2ee", z3);
            intent.putExtra("conversation_send_mode", i3);
            intent.putExtra("conversation_settings_launch_source", i2);
        }
        return intent;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [armf, java.lang.Object] */
    @Deprecated
    public final void u(Context context, ConversationIdType conversationIdType, boolean z, int i, boolean z2, String str, int i2, qpd qpdVar) {
        Intent s = s(context, z, i, z2, str, i2, qpdVar);
        s.putExtra("conversation_id", conversationIdType.a());
        s.putExtra("mapi_conversation_id", new BugleConversationId(conversationIdType));
        akto.n(context, s);
        ((mbl) this.a.b()).e("Bugle.UI.PeopleAndOptions", i2);
    }

    @Deprecated
    public final void v(Context context, ConversationIdType conversationIdType, boolean z, int i, boolean z2, boolean z3, int i2, int i3) {
        Intent t = t(context, z, i, z2, z3, i2, i3);
        t.putExtra("conversation_id", conversationIdType.a());
        t.putExtra("mapi_conversation_id", new BugleConversationId(conversationIdType));
        akto.n(context, t);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [armf, java.lang.Object] */
    public final void x() {
        if (!((mif) this.c.b()).b()) {
            ((mif) this.c.b()).a();
            return;
        }
        long e = ((ykw) this.a.b()).e("last_opened_media_picker_time_millis", -1L);
        long epochMilli = ((xnv) this.b).f().toEpochMilli();
        if (e > 0 && e < epochMilli) {
            amfq amfqVar = (amfq) amfr.a.createBuilder();
            aozy createBuilder = amga.a.createBuilder();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amga amgaVar = (amga) createBuilder.b;
            amgaVar.b |= 4;
            amgaVar.e = epochMilli - e;
            if (!amfqVar.b.isMutable()) {
                amfqVar.u();
            }
            amfr amfrVar = (amfr) amfqVar.b;
            amga amgaVar2 = (amga) createBuilder.s();
            amgaVar2.getClass();
            amfrVar.t = amgaVar2;
            amfrVar.b |= 8192;
            ((maq) this.d.b()).j(amfqVar);
        }
    }

    public final void y(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Intent intent = new Intent((String) it.next());
            intent.setFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
            try {
                ((cg) this.b).au(intent);
                return;
            } catch (ActivityNotFoundException unused) {
            }
        }
        ((alwl) ((aluw) this.d).i()).q("Failed to find settings activity to start for connectivity.");
    }

    public final void z(int i) {
        aktp.K(new yyc(((cg) this.b).z().getString(i), ((cg) this.b).z().getString(R.string.data_required_snackbar_action), new gtq(this, 13)), (cg) this.b);
    }

    public gpx(Context context, Optional optional, qoq qoqVar, vjs vjsVar, byte[] bArr) {
        this.b = context;
        this.d = optional;
        this.a = qoqVar;
        this.c = vjsVar;
    }

    public gpx(aneo aneoVar, eoy eoyVar, armf armfVar, yzk yzkVar) {
        this.a = aneoVar;
        this.b = eoyVar;
        this.c = armfVar;
        this.d = yzkVar;
    }

    public gpx(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, char[] cArr, byte[] bArr) {
        this.a = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.b = armfVar4;
    }

    public gpx(armf armfVar, armf armfVar2, armf armfVar3, xnv xnvVar) {
        this.a = armfVar;
        this.d = armfVar2;
        this.c = armfVar3;
        this.b = xnvVar;
    }

    public gpx(asai asaiVar, qdq qdqVar, ghw ghwVar, arqg arqgVar) {
        this.d = asaiVar;
        this.c = qdqVar;
        this.b = ghwVar;
        this.a = arqgVar;
    }

    public gpx(fid fidVar, boolean[] zArr) {
        this.c = fidVar;
        this.d = zArr;
        int i = fidVar.b;
        this.a = new boolean[i];
        this.b = new boolean[i];
    }

    public gpx(het hetVar, het hetVar2, heu heuVar, heu heuVar2) {
        this.b = hetVar;
        this.a = hetVar2;
        this.d = heuVar;
        this.c = heuVar2;
    }

    public gpx(ClassLoader classLoader, goq goqVar, WindowExtensions windowExtensions) {
        this.d = classLoader;
        this.b = goqVar;
        this.c = windowExtensions;
        this.a = new hgi(classLoader, (byte[]) null);
    }

    public gpx(List list, hok hokVar, hqh hqhVar, ContentResolver contentResolver) {
        this.d = hokVar;
        this.b = hqhVar;
        this.a = contentResolver;
        this.c = list;
    }

    public gpx(aksr aksrVar, Context context, ConversationIdType conversationIdType, Executor executor, qdq qdqVar) {
        this.b = context;
        this.a = conversationIdType;
        this.d = new AtomicReference(Optional.of(qdqVar));
        ito itoVar = new ito(this, aksrVar, executor);
        this.c = itoVar;
        context.getContentResolver().registerContentObserver(upb.p(context), true, itoVar);
    }

    public gpx(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, byte[] bArr, byte[] bArr2) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.c = armfVar2;
        armfVar3.getClass();
        this.d = armfVar3;
        armfVar4.getClass();
        this.b = armfVar4;
    }

    public gpx(arwe arweVar, arpi arpiVar, ansy ansyVar, ahiy ahiyVar) {
        arweVar.getClass();
        arpiVar.getClass();
        ansyVar.getClass();
        ahiyVar.getClass();
        this.d = arweVar;
        this.a = arpiVar;
        this.b = ansyVar;
        this.c = ahiyVar;
    }

    public /* synthetic */ gpx(asai asaiVar, qdq qdqVar, ghw ghwVar) {
        this(asaiVar, qdqVar, ghwVar, ry.e);
    }

    public gpx(hjt hjtVar, BlockingQueue blockingQueue, hgj hgjVar) {
        this.d = new HashMap();
        this.a = hgjVar;
        this.b = hjtVar;
        this.c = blockingQueue;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List, java.lang.Object] */
    public gpx(hka hkaVar) {
        this.b = new ArrayList();
        for (int i = 0; i < ((alog) hkaVar.d).size(); i++) {
            this.b.add(new asnn((byte[]) null));
        }
        this.a = new SparseArray();
        this.d = new SparseArray();
        this.c = new SparseArray();
    }

    public gpx(Executor executor) {
        this.a = new Handler(Looper.getMainLooper());
        this.c = new hah(this);
        gzx gzxVar = new gzx(executor, 0);
        this.b = gzxVar;
        this.d = arsd.an(gzxVar);
    }

    public gpx(tqx tqxVar, Activity activity, ila ilaVar) {
        int i = aegl.b;
        alob alobVar = new alob();
        akww akwwVar = new akww();
        akwwVar.a = "send";
        akzm akzmVar = new akzm(akxk.class);
        akzmVar.b(akxk.SEND);
        akzmVar.b = true;
        akwwVar.c(akzmVar.a());
        akwwVar.b(aego.a(new ibo(this, 0)));
        alobVar.h(akwwVar.a());
        akyy akyyVar = new akyy();
        akyyVar.a = "reply";
        akyyVar.d = true;
        akyyVar.e.c = Optional.of(akzq.a);
        ArrayList arrayList = new ArrayList();
        DesugarArrays.stream(new akza[]{akza.REPLY}).forEach(new akzl(arrayList, 1));
        akyyVar.e.d = Optional.of(new akzi(DesugarCollections.unmodifiableList(arrayList), akza.class));
        akyyVar.c = aego.a(new ibo(this, 2));
        alobVar.h(akyyVar.a());
        akww akwwVar2 = new akww();
        akwwVar2.a = "back";
        akzm akzmVar2 = new akzm(akxk.class);
        akzmVar2.b(akxk.GO_BACK);
        akzmVar2.b = true;
        akwwVar2.c(akzmVar2.a());
        akwwVar2.b(aego.a(new ibo(this, 3)));
        alobVar.h(akwwVar2.a());
        aegl aeglVar = new aegl(alobVar.g());
        this.b = aeglVar;
        this.d = tqxVar;
        this.a = ilaVar;
        this.c = new akwp(activity, aeglVar);
    }

    public gpx(ght ghtVar, int[] iArr, String[] strArr) {
        iArr.getClass();
        strArr.getClass();
        this.b = ghtVar;
        this.a = iArr;
        this.d = strArr;
        int length = iArr.length;
        String[] strArr2 = strArr;
        int length2 = strArr2.length;
        if (length == length2) {
            this.c = length2 == 0 ? arnx.a : aqjn.e(strArr2[0]);
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public gpx(xyt xytVar, armf armfVar, cg cgVar) {
        xytVar.getClass();
        armfVar.getClass();
        this.a = xytVar;
        this.c = armfVar;
        this.b = cgVar;
        this.d = alwo.o("BugleConversation");
    }

    public gpx(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, short[] sArr) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
        armfVar4.getClass();
        this.d = armfVar4;
    }

    public gpx() {
        this.b = new tm();
        this.d = new SparseArray();
        this.a = new uj();
        this.c = new tm();
    }

    public gpx(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, char[] cArr) {
        armfVar.getClass();
        this.c = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
        armfVar3.getClass();
        this.d = armfVar3;
        armfVar4.getClass();
        this.b = armfVar4;
    }

    public gpx(ActivityEmbeddingComponent activityEmbeddingComponent, gph gphVar, goq goqVar) {
        activityEmbeddingComponent.getClass();
        this.a = activityEmbeddingComponent;
        this.b = gphVar;
        this.c = goqVar;
        this.d = new xzg((byte[]) null);
    }

    public gpx(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, byte[] bArr) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.d = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
        armfVar4.getClass();
        this.a = armfVar4;
    }

    public gpx(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.c = armfVar2;
        armfVar3.getClass();
        this.a = armfVar3;
        armfVar4.getClass();
        this.d = armfVar4;
    }

    public gpx(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
        armfVar4.getClass();
        this.d = armfVar4;
    }
}
