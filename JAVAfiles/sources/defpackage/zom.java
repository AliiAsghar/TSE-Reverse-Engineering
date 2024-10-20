package defpackage;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.ui.attachment.AttachmentsContainer;
import com.google.android.material.snackbar.Snackbar;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class zom implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ zom(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, java.lang.Iterable] */
    @Override // java.lang.Runnable
    public final void run() {
        BufferedReader bufferedReader;
        int i = 0;
        int i2 = 8;
        int i3 = 1;
        switch (this.b) {
            case 0:
                zop zopVar = (zop) this.a;
                int childCount = zopVar.b.getChildCount();
                if (childCount <= 1) {
                    return;
                }
                View childAt = zopVar.b.getChildAt(childCount - 1);
                childAt.getClass();
                AttachmentsContainer attachmentsContainer = zopVar.q;
                attachmentsContainer.smoothScrollTo(childAt.getRight(), attachmentsContainer.getScrollY());
                return;
            case 1:
                zop zopVar2 = (zop) this.a;
                zopVar2.g.setVisibility(8);
                zopVar2.z = 1;
                return;
            case 2:
                ((abac) this.a).d();
                return;
            case 3:
                uuf uufVar = zqu.a;
                ((ImageView) this.a).animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(new emq()).setDuration(167L);
                return;
            case 4:
                zrb zrbVar = (zrb) this.a;
                ((mgv) zrbVar.b.b()).e(mgv.D);
                zri zriVar = zrbVar.c;
                zxa zxaVar = zriVar.j;
                if (zxaVar != null) {
                    zxaVar.R(new zrf(i3), new zrf(i));
                }
                ((ykw) zriVar.R.b()).k("last_opened_media_picker_time_millis", ((xnv) zriVar.U.b()).f().toEpochMilli());
                return;
            case 5:
                ((zrb) this.a).c.F();
                return;
            case 6:
                zrb zrbVar2 = (zrb) this.a;
                ((mgv) zrbVar2.b.b()).e(mgv.A);
                ((mgv) zrbVar2.b.b()).e(mgv.B);
                ixd ixdVar = (ixd) zrbVar2.c.j;
                ixdVar.ay.c(new ahlp(akul.g(((aiwu) ixdVar.cT.a).a()).h(new woc(7), andi.a)), ixdVar.g);
                return;
            case 7:
                zrb zrbVar3 = (zrb) this.a;
                ((mgv) zrbVar3.b.b()).e(mgv.E);
                zxa zxaVar2 = zrbVar3.c.j;
                if (zxaVar2 != null) {
                    zxaVar2.R(new zrf(i2), new zrf(9));
                    return;
                }
                return;
            case 8:
                zxa zxaVar3 = ((zrb) this.a).c.j;
                if (zxaVar3 != null) {
                    zxaVar3.R(new zrf(6), null);
                    return;
                }
                return;
            case 9:
                ((ComposeView) ((zri) this.a).x.b()).setVisibility(8);
                return;
            case 10:
                Object obj = this.a;
                zri zriVar2 = (zri) obj;
                String string = zriVar2.ar.getResources().getString(R.string.show_sms_link_warning_text);
                String string2 = zriVar2.ar.getResources().getString(R.string.show_sms_link_warning_change_label);
                int i4 = 11;
                zom zomVar = new zom(obj, i4);
                Activity e = abbu.e(zriVar2.k);
                e.getClass();
                if (xwr.h(e)) {
                    ((abbu) zriVar2.ad.b()).l(string);
                } else {
                    zqq zqqVar = new zqq(zomVar, 5);
                    Snackbar q = Snackbar.q(e.getWindow().getDecorView().getRootView(), string, 0);
                    q.s(string2, zqqVar);
                    q.i();
                }
                zxa zxaVar4 = zriVar2.j;
                if (zxaVar4 != null) {
                    zxaVar4.R(new zrf(i4), new zrf(12));
                }
                ((ykw) zriVar2.R.b()).h("has_shown_sms_link_warning", true);
                return;
            case 11:
                zri zriVar3 = (zri) this.a;
                ((lzv) zriVar3.W.b()).P(zriVar3.k);
                return;
            case 12:
                try {
                    ((zri) this.a).o.sendAccessibilityEvent(8);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 13:
                akrc b = ((aksr) ((zri) this.a).ac.b()).b("ComposeMessageViewPeer stoppedTypingTimeoutTask");
                try {
                    zxa zxaVar5 = ((zri) this.a).j;
                    if (zxaVar5 != null) {
                        zxaVar5.ap();
                    }
                    b.close();
                    return;
                } catch (Throwable th) {
                    try {
                        b.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 14:
                ztx ztxVar = (ztx) this.a;
                znp znpVar = (znp) ztxVar.p.c.b();
                ConversationIdType conversationIdType = ztxVar.i;
                akrh e2 = aktp.e("AddContactBanner2DatabaseOperationsImpl#dismissAddContactBanner");
                try {
                    qiu.h(aktp.ai(new yxs(znpVar, conversationIdType, 13), znpVar.a));
                    e2.close();
                    return;
                } catch (Throwable th3) {
                    try {
                        e2.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            case 15:
                Object obj2 = this.a;
                akrc b2 = ((zwi) obj2).e.b("UnblockUnspamBanner:undoUnarchiveClick");
                try {
                    akbo akboVar = ((zwi) obj2).d;
                    zwt zwtVar = ((zwi) obj2).o;
                    akboVar.j(new ahlp(aktp.ai(new yxs(zwtVar, ((zwi) obj2).g, 18), zwtVar.d)), new ahlp((Object) null), ((zwi) obj2).m);
                    b2.close();
                    return;
                } catch (Throwable th5) {
                    try {
                        b2.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            case 16:
                algs algsVar = new algs(",");
                zxy zxyVar = (zxy) this.a;
                ((ykw) zxyVar.b).l((String) zxyVar.e, algsVar.d(zxyVar.d));
                return;
            case 17:
                alvw d = aabd.a.d();
                d.X(alwp.a, "Bugle");
                ((alvg) ((alvg) d).h("com/google/android/apps/messaging/ui/conversation/emoji/ResourceBasedEmojiVariantService", "clearVariantMapCache", 206, "ResourceBasedEmojiVariantService.java")).q("Clearing emoji variant map cache.");
                aabd aabdVar = (aabd) this.a;
                aabdVar.g = 2;
                aabdVar.d.clear();
                aabdVar.e.clear();
                alvw d2 = aabd.a.d();
                d2.X(alwp.a, "Bugle");
                ((alvg) ((alvg) d2).h("com/google/android/apps/messaging/ui/conversation/emoji/ResourceBasedEmojiVariantService", "clearVariantMapCache", 213, "ResourceBasedEmojiVariantService.java")).q("Finished clearing emoji variant map cache.");
                aabdVar.g = 1;
                alvw d3 = aabd.a.d();
                d3.X(alwp.a, "Bugle");
                ((alvg) ((alvg) d3).h("com/google/android/apps/messaging/ui/conversation/emoji/ResourceBasedEmojiVariantService", "clearVariantPreferencesCache", 254, "ResourceBasedEmojiVariantService.java")).q("Clearing emoji variant preferences cache.");
                aabdVar.h = 2;
                aabdVar.f.clear();
                alvw d4 = aabd.a.d();
                d4.X(alwp.a, "Bugle");
                ((alvg) ((alvg) d4).h("com/google/android/apps/messaging/ui/conversation/emoji/ResourceBasedEmojiVariantService", "clearVariantPreferencesCache", 260, "ResourceBasedEmojiVariantService.java")).q("Finished clearing emoji variant preferences cache.");
                aabdVar.h = 1;
                return;
            case 18:
                Object obj3 = this.a;
                aabd aabdVar2 = (aabd) obj3;
                if (aabdVar2.g == 3 && aabdVar2.h == 3) {
                    return;
                }
                alvw d5 = aabd.a.d();
                d5.X(alwp.a, "Bugle");
                ((alvg) ((alvg) d5).h("com/google/android/apps/messaging/ui/conversation/emoji/ResourceBasedEmojiVariantService", "cacheVariantMap", 163, "ResourceBasedEmojiVariantService.java")).q("Caching emoji variant map.");
                aabdVar2.g = 2;
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(aabdVar2.b.getResources().openRawResource(R.raw.emoji_variant_map), StandardCharsets.UTF_8));
                } catch (IOException e3) {
                    alvw h = aabd.a.h();
                    h.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) ((alvg) h).g(e3)).h("com/google/android/apps/messaging/ui/conversation/emoji/ResourceBasedEmojiVariantService", "cacheVariantMap", 197, "ResourceBasedEmojiVariantService.java")).r("Failed to cache emoji variant map. Successfully cached %1$s variant sets.", aabdVar2.d.size());
                    aabdVar2.g = 4;
                }
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            Iterator it = anna.e(',').a(readLine).iterator();
                            if (it.hasNext()) {
                                ArrayList ao = alzz.ao(it);
                                String str = (String) ao.get(0);
                                ((aabd) obj3).d.put(str, ao);
                                Iterator it2 = ao.iterator();
                                while (it2.hasNext()) {
                                    ((aabd) obj3).e.put((String) it2.next(), str);
                                }
                            }
                        } else {
                            alvw d6 = aabd.a.d();
                            d6.X(alwp.a, "Bugle");
                            ((alvg) ((alvg) d6).h("com/google/android/apps/messaging/ui/conversation/emoji/ResourceBasedEmojiVariantService", "cacheVariantMap", 192, "ResourceBasedEmojiVariantService.java")).q("Finished caching emoji variant map.");
                            ((aabd) obj3).g = 3;
                            bufferedReader.close();
                            alvw d7 = aabd.a.d();
                            d7.X(alwp.a, "Bugle");
                            ((alvg) ((alvg) d7).h("com/google/android/apps/messaging/ui/conversation/emoji/ResourceBasedEmojiVariantService", "cacheVariantPreferences", 219, "ResourceBasedEmojiVariantService.java")).q("Caching emoji variant preferences.");
                            aabdVar2.h = 2;
                            albo.bR(aabdVar2.i.a(), qjc.a(new isn(obj3, 16)), aabdVar2.c);
                            return;
                        }
                    } finally {
                    }
                }
                break;
            case 19:
                aabp aabpVar = ((aabe) this.a).f;
                if (aabpVar.n) {
                    aabpVar.g();
                }
                aabp aabpVar2 = ((aabe) this.a).f;
                if (aabpVar2.m) {
                    aacb aacbVar = aabpVar2.b;
                    if (aacbVar == null) {
                        xzb.g("Bugle", "Compose2oDynamicImeStrategy: input sink is null");
                        return;
                    }
                    View p = aacbVar.p();
                    if (p == null) {
                        xzb.g("Bugle", "Compose2oDynamicImeStrategy: c2o root is null");
                        return;
                    } else {
                        p.setVisibility(8);
                        ((aabe) this.a).f.m(false);
                    }
                }
                ((aabe) this.a).l.x(16);
                return;
            default:
                ((aabp) this.a).k();
                return;
        }
    }

    public zom(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
