package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.stream.Stream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zrw extends zrx {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/ui/conversation/LaunchConversationFragmentPeer");
    public final armf b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final apwt g;
    public final armf h;
    public final armf i;
    public final armf j;
    public final armf k;
    public final akgh l;
    public final armf m;
    private final Activity o;
    private final armf p;
    private final armf q;
    private final armf r;
    private final armf s;
    private final armf t;
    private final armf u;
    private final armf v;
    private final akgh w;
    private MessageCoreData x;

    public zrw(zrt zrtVar, Activity activity, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, apwt apwtVar, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13, armf armfVar14, armf armfVar15, armf armfVar16, armf armfVar17) {
        this.o = activity;
        this.p = armfVar;
        this.q = armfVar2;
        this.b = armfVar3;
        this.c = armfVar4;
        this.d = armfVar5;
        this.e = armfVar6;
        this.f = armfVar7;
        this.g = apwtVar;
        this.h = armfVar8;
        this.i = armfVar9;
        this.r = armfVar10;
        this.s = armfVar11;
        this.j = armfVar12;
        this.k = armfVar13;
        this.t = armfVar14;
        this.u = armfVar15;
        this.v = armfVar16;
        this.l = new zru(apwtVar, zrtVar);
        this.w = new zrv(zrtVar);
        this.m = armfVar17;
    }

    public static Uri a(Uri uri) {
        if (uri.isHierarchical()) {
            return uri;
        }
        return Uri.parse(uri.toString().replaceFirst(":", "://"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Optional b(Intent intent) {
        Uri data = intent.getData();
        if (data == null) {
            return Optional.empty();
        }
        String queryParameter = a(data).getQueryParameter("service_id");
        if (queryParameter != null) {
            return Optional.of(queryParameter);
        }
        Optional a2 = ((yft) this.r.b()).a(intent);
        if (!a2.isEmpty() && ((String[]) a2.get()).length == 1) {
            String str = ((String[]) a2.get())[0];
            xze xzeVar = xca.a;
            if (msx.g(str)) {
                return Optional.of(((String[]) a2.get())[0]);
            }
            return Optional.empty();
        }
        return Optional.empty();
    }

    public final void c(ConversationId conversationId, boolean z, Integer num) {
        MessageCoreData messageCoreData;
        boolean z2;
        qoq qoqVar = (qoq) this.p.b();
        MessageCoreData messageCoreData2 = this.x;
        if (messageCoreData2 != null && messageCoreData2.cb()) {
            messageCoreData = this.x;
        } else {
            messageCoreData = null;
        }
        if (!((obm) this.m.b()).a() && z) {
            z2 = true;
        } else {
            z2 = false;
        }
        qoqVar.q(this.o, conversationId, num, messageCoreData, z2);
        this.o.finish();
    }

    public final void d() {
        Optional ofNullable;
        alog alogVar;
        Intent intent = this.o.getIntent();
        String action = intent.getAction();
        if (!"android.intent.action.SENDTO".equals(intent.getAction()) && !"android.intent.action.VIEW".equals(intent.getAction())) {
            alvw i = a.i();
            i.X(alwp.a, "Bugle");
            ((alvg) ((alvg) i).h("com/google/android/apps/messaging/ui/conversation/LaunchConversationFragmentPeer", "processPhoneMode", 224, "LaunchConversationFragmentPeer.java")).t("Unsupported conversation intent action: %s.", action);
            return;
        }
        if (!((yjv) this.s.b()).d()) {
            ((qoq) this.p.b()).h(this.o);
            this.o.finish();
            return;
        }
        this.x = ((rvq) this.q.b()).a(intent);
        Optional a2 = ((yft) this.r.b()).a(intent);
        if (!a2.isPresent()) {
            c(InvalidConversationId.a, false, 2);
            return;
        }
        Optional b = b(intent);
        Uri data = intent.getData();
        if (data == null) {
            ofNullable = Optional.empty();
        } else {
            ofNullable = Optional.ofNullable(a(data).getQueryParameter("bot-name"));
        }
        if (b.isEmpty() && ofNullable.isPresent()) {
            ((psi) this.c.b()).d.c("Bugle.Rbm.ChatbotDirectory.StartConversationFromDeeplinkFailure");
            return;
        }
        if (b.isPresent() && (((obm) this.m.b()).a() || ofNullable.isPresent())) {
            alogVar = alog.r(((ndi) this.k.b()).e(((msk) this.j.b()).a((String) b.get())));
        } else {
            Stream map = DesugarArrays.stream((String[]) a2.get()).filter(new ytt(13)).map(new yur(this, 19)).map(new yur(this, 20));
            int i2 = alog.d;
            alogVar = (alog) map.collect(alls.a);
        }
        if (((pdm) this.v.b()).a()) {
            e(alogVar, Collection.EL.stream(((yjy) this.u.b()).l()).filter(new myg(intent.getIntExtra("simSlot", -1), 4)).map(new zkf(10)).findFirst());
        } else {
            e(alogVar, Optional.empty());
        }
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [armf, java.lang.Object] */
    public final void e(alog alogVar, Optional optional) {
        aohs aohsVar = (aohs) this.f.b();
        jat jatVar = (jat) this.t.b();
        xnv xnvVar = (xnv) jatVar.g.b();
        xnvVar.getClass();
        anen anenVar = (anen) jatVar.c.b();
        anenVar.getClass();
        anen anenVar2 = (anen) jatVar.d.b();
        anenVar2.getClass();
        miw miwVar = (miw) jatVar.e.b();
        miwVar.getClass();
        ?? r9 = jatVar.f;
        ?? r10 = jatVar.a;
        ?? r11 = jatVar.b;
        alogVar.getClass();
        optional.getClass();
        aohsVar.C(new ixr(xnvVar, anenVar, anenVar2, miwVar, r9, r10, r11, alogVar, optional), this.w);
    }
}
