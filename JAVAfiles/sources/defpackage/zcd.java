package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.net.Uri;
import android.view.MenuItem;
import android.view.ScaleGestureDetector;
import android.view.SubMenu;
import android.view.ViewGroup;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.ui.RoundedImageView;
import com.google.android.apps.messaging.ui.debug.DebugGServiceKeysFragment;
import com.google.android.apps.messaging.ui.reminder.ReminderReceiver;
import com.google.android.apps.messaging.ui.video.VideoOverlayView;
import com.google.android.apps.messaging.wearable.WearableBindService;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class zcd implements Consumer {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ zcd(Activity activity, int i) {
        this.c = i;
        this.a = activity;
        this.b = "wm_db_copy.db";
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [android.view.Menu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v36, types: [android.view.Menu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [armf, java.lang.Object] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        Optional of;
        int i = 10;
        switch (this.c) {
            case 0:
                if (!((upm) obj).a) {
                    ((zcf) this.a).b((String) this.b);
                    return;
                }
                return;
            case 1:
                amgl amglVar = (amgl) obj;
                amglVar.getClass();
                ((Optional) this.b).ifPresent(new xpw(amglVar, i));
                amgw amgwVar = ((amgu) amglVar.b).j;
                if (amgwVar == null) {
                    amgwVar = amgw.a;
                }
                aozy builder = amgwVar.toBuilder();
                if (((amgw) builder.b).b.size() > 0) {
                    Object obj2 = this.a;
                    aozy builder2 = builder.aI().toBuilder();
                    long j = ((qep) obj2).d;
                    if (!builder2.b.isMutable()) {
                        builder2.u();
                    }
                    int aR = yyb.aR(j);
                    amec amecVar = (amec) builder2.b;
                    amecVar.f = a.aq(aR);
                    amecVar.b |= 16;
                    builder.bt(builder2);
                }
                if (!amglVar.b.isMutable()) {
                    amglVar.u();
                }
                amgu amguVar = (amgu) amglVar.b;
                amgw amgwVar2 = (amgw) builder.s();
                amgwVar2.getClass();
                amguVar.j = amgwVar2;
                amguVar.b |= 8;
                return;
            case 2:
                xyo e = zcf.a.e();
                e.H("Failed to add member to Rcs group chat");
                e.r((Throwable) obj);
                ((zcf) this.a).b((String) this.b);
                return;
            case 3:
                Uri uri = (Uri) obj;
                Object obj3 = this.b;
                zpj zpjVar = (zpj) obj3;
                zpjVar.a = uri;
                ?? r2 = this.a;
                long k = r2.k();
                xyl.g();
                VideoOverlayView videoOverlayView = zpjVar.g;
                Uri uri2 = videoOverlayView.c;
                if (uri2 == null || !uri2.equals(uri) || (k != videoOverlayView.d && k >= 0)) {
                    videoOverlayView.c = uri;
                    if (uri == null) {
                        videoOverlayView.e(0L);
                    } else if (k > 0) {
                        videoOverlayView.e(k);
                    } else {
                        Context context = (Context) videoOverlayView.f.a.b();
                        context.getClass();
                        videoOverlayView.a = new VideoOverlayView.GetMediaDurationAction(context, uri).p(videoOverlayView);
                    }
                }
                RoundedImageView roundedImageView = zpjVar.f;
                int minimumHeight = roundedImageView.getMinimumHeight();
                int maxHeight = roundedImageView.getMaxHeight();
                int maxWidth = roundedImageView.getMaxWidth();
                Point point = new Point(r2.c(), r2.b());
                yfo.j(point, maxWidth, maxHeight, minimumHeight);
                ViewGroup.LayoutParams layoutParams = zpjVar.d.getLayoutParams();
                if (layoutParams.width == -2 && layoutParams.height == -2 && point.y >= point.x) {
                    layoutParams.width = point.x;
                    layoutParams.height = point.y;
                    zpjVar.d.setLayoutParams(layoutParams);
                }
                if (uri == null) {
                    uri = r2.x();
                }
                if (uri != null) {
                    akms L = zpjVar.b.h(uri).L(point.x, point.y);
                    if (ydk.y(uri) && r2.Z() != null) {
                        L = L.P(new hyf(r2.Z()));
                    }
                    L.a(new zpi(obj3, 0)).t(zpjVar.f);
                }
                zpjVar.d.setClickable(false);
                zpjVar.d.setImportantForAccessibility(2);
                if (zpjVar.a == null) {
                    zpjVar.f.setClickable(false);
                    zpjVar.f.setImportantForAccessibility(2);
                    return;
                } else {
                    zpjVar.f.setClickable(true);
                    zpjVar.f.setImportantForAccessibility(1);
                    return;
                }
            case 4:
                ((zxq) obj).j(((ScaleGestureDetector) this.a).getScaleFactor() - ((zxo) this.b).a);
                return;
            case 5:
                wyp wypVar = (wyp) this.a;
                rry rryVar = (rry) wypVar.f;
                List list = rryVar.l;
                rryVar.au();
                ((rry) wypVar.f).aF();
                ((aacp) wypVar.e).h.isSelected();
                ((aafc) obj).a();
                throw null;
            case 6:
                int i2 = aaig.d;
                MenuItem findItem = this.a.findItem(((lan) obj).a());
                if (findItem != null) {
                    ((alob) this.b).h(findItem);
                    return;
                }
                return;
            case 7:
                int i3 = aaig.d;
                Collection.EL.stream(((lao) obj).a()).forEach(new zcd(this.a, this.b, 6));
                return;
            case 8:
                String str = (String) obj;
                DebugGServiceKeysFragment debugGServiceKeysFragment = (DebugGServiceKeysFragment) this.a;
                this.b.put(str, String.valueOf(((atsg) debugGServiceKeysFragment.aj.b()).c(str).orElse(Boolean.valueOf(((atsg) debugGServiceKeysFragment.aj.b()).e(str)))));
                return;
            case 9:
                aajm aajmVar = (aajm) this.a;
                atsg atsgVar = aajmVar.e;
                String str2 = (String) obj;
                boolean parseBoolean = Boolean.parseBoolean((String) this.b);
                if (parseBoolean == atsgVar.e(str2)) {
                    of = Optional.empty();
                } else {
                    of = Optional.of(Boolean.valueOf(parseBoolean));
                }
                aajmVar.e.d(str2, of);
                aajmVar.d.q(aajmVar.e.b());
                return;
            case 10:
                Activity activity = (Activity) obj;
                aaoq aaoqVar = (aaoq) ((aalt) this.b).aQ.b();
                ?? r1 = this.a;
                r1.getClass();
                activity.getClass();
                SubMenu addSubMenu = r1.addSubMenu("Wear");
                MenuItem add = addSubMenu.add("Report wear sync status");
                add.getClass();
                aaoqVar.a(add, activity, new aaop(aaoqVar, activity, 0));
                MenuItem add2 = addSubMenu.add("Force disable wear sync");
                add2.getClass();
                aaoqVar.a(add2, activity, new aaop(aaoqVar, activity, 2));
                MenuItem add3 = addSubMenu.add("Force enable wear sync");
                add3.getClass();
                aaoqVar.a(add3, activity, new aaop(aaoqVar, activity, 3));
                MenuItem add4 = addSubMenu.add("Queue wear sync");
                add4.getClass();
                aaoqVar.a(add4, activity, new aaji(aaoqVar, 2));
                MenuItem add5 = addSubMenu.add("Clear DataClient broadcasts");
                add5.getClass();
                aaoqVar.a(add5, activity, new aaji(aaoqVar, 3));
                return;
            case 11:
                Long l = (Long) obj;
                ((ClipboardManager) ((Activity) ((zof) this.b).b).getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("AndroidId", Long.toString(l.longValue())));
                ((abbu) ((aalt) this.a).Z.b()).l(a.cc(l, "Android Id: ", "\n(Copied to Clipboard)"));
                return;
            case 12:
                String str3 = (String) obj;
                xze xzeVar = aalt.c;
                ((ClipboardManager) ((Activity) ((zof) this.b).b).getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Multi SIM RCS Connection State", str3));
                new AlertDialog.Builder((Context) this.a).setTitle("Multi SIM RCS Connection State").setMessage(str3).setCancelable(true).show();
                return;
            case 13:
                try {
                    ((FileWriter) this.b).write(hht.h((String) obj, "\n"));
                    return;
                } catch (IOException e2) {
                    ((abbu) ((aalt) this.a).Z.b()).l("Error writing to dump file: ".concat(String.valueOf(e2.getMessage())));
                    return;
                }
            case 14:
                Context context2 = (Context) this.a;
                fcp fcpVar = new fcp(context2, (byte[]) null);
                fcpVar.g("Share Messages workmanager db");
                fcpVar.h("application/sql");
                fcpVar.f(uti.d(context2, (String) this.b));
                Intent e3 = fcpVar.e();
                e3.setFlags(1);
                akto.n(context2, e3);
                return;
            case 15:
                String str4 = (String) obj;
                xze xzeVar2 = aalt.c;
                ((ClipboardManager) ((Activity) ((zof) this.b).b).getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("RCS Connection State", str4));
                new AlertDialog.Builder((Context) this.a).setTitle("RCS Connection State").setMessage(str4).setCancelable(true).show();
                return;
            case 16:
                String str5 = (String) obj;
                ((ClipboardManager) ((Activity) ((zof) this.b).b).getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("FCM Registration Token", str5));
                ((abbu) ((aalt) this.a).Z.b()).l("FCM Registration Token: ".concat(String.valueOf(str5)));
                return;
            case 17:
                ((aanj) this.a).d.b(((ykb) obj).A((Context) ((zof) this.b).b)).h(new zms(i), andi.a);
                return;
            case 18:
                Uri uri3 = (Uri) obj;
                if (uri3 == null) {
                    return;
                }
                String str6 = (String) this.b;
                Intent putExtra = new Intent(str6).putExtra("output", uri3);
                if (str6.equals("android.media.action.VIDEO_CAPTURE")) {
                    putExtra.putExtra("android.intent.extra.durationLimit", ((Integer) ipe.r.e()).intValue());
                }
                ((aasm) this.a).l.p(putExtra);
                return;
            case 19:
                new BugleConversationId((ConversationIdType) this.a);
                ((ReminderReceiver) this.b).q("ReminderReceiver", ((woj) obj).p());
                return;
            default:
                OutputStream outputStream = (OutputStream) obj;
                Object obj4 = this.a;
                Object obj5 = this.b;
                try {
                    try {
                        amcp.a(aipx.b((Context) ((WearableBindService) obj5).c.b(), (Uri) obj4, aipw.a("com.android.providers.telephony")), outputStream);
                        ((mbl) ((WearableBindService) obj5).t.b()).c("Bugle.Wear.VoiceMessage.Process.Success");
                        if (outputStream != null) {
                            outputStream.close();
                            return;
                        }
                        return;
                    } finally {
                    }
                } catch (IOException e4) {
                    alwl alwlVar = (alwl) WearableBindService.a.i();
                    alwlVar.X(ydl.M, "WearableBindService");
                    ((alwl) ((alwl) alwlVar.g(e4)).h("com/google/android/apps/messaging/wearable/WearableBindService", "processAudioRequest", 727, "WearableBindService.java")).t("Failed to copy audio stream for file: %s", obj4);
                    ((mbl) ((WearableBindService) obj5).t.b()).c("Bugle.Wear.VoiceMessage.Process.Failure");
                    return;
                }
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.c) {
            case 0:
                return Consumer$CC.$default$andThen(this, consumer);
            case 1:
                return Consumer$CC.$default$andThen(this, consumer);
            case 2:
                return Consumer$CC.$default$andThen(this, consumer);
            case 3:
                return Consumer$CC.$default$andThen(this, consumer);
            case 4:
                return Consumer$CC.$default$andThen(this, consumer);
            case 5:
                return Consumer$CC.$default$andThen(this, consumer);
            case 6:
                return Consumer$CC.$default$andThen(this, consumer);
            case 7:
                return Consumer$CC.$default$andThen(this, consumer);
            case 8:
                return Consumer$CC.$default$andThen(this, consumer);
            case 9:
                return Consumer$CC.$default$andThen(this, consumer);
            case 10:
                return Consumer$CC.$default$andThen(this, consumer);
            case 11:
                return Consumer$CC.$default$andThen(this, consumer);
            case 12:
                return Consumer$CC.$default$andThen(this, consumer);
            case 13:
                return Consumer$CC.$default$andThen(this, consumer);
            case 14:
                return Consumer$CC.$default$andThen(this, consumer);
            case 15:
                return Consumer$CC.$default$andThen(this, consumer);
            case 16:
                return Consumer$CC.$default$andThen(this, consumer);
            case 17:
                return Consumer$CC.$default$andThen(this, consumer);
            case 18:
                return Consumer$CC.$default$andThen(this, consumer);
            case 19:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }

    public /* synthetic */ zcd(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ zcd(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
