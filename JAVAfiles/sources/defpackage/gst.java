package defpackage;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageView;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class gst implements dts {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ gst(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [arpi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r15v16, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v41, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, arqv] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.dts
    public final Object a(final dtq dtqVar) {
        int i = 20;
        int i2 = 0;
        int i3 = 1;
        switch (this.d) {
            case 0:
                ?? r0 = this.a;
                dtqVar.a(new gtq((arxm) r0.get(arxm.c), 1), gsn.a);
                return arrn.J(arwi.e(r0), null, (arwf) this.b, new gbz((arqv) this.c, dtqVar, (arpe) null, 3), 1);
            case 1:
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                dtqVar.a(new fyk(atomicBoolean, 20), gsn.a);
                this.c.execute(new faq(atomicBoolean, dtqVar, this.b, 10, (char[]) null));
                return this.a;
            case 2:
                prq prqVar = (prq) this.a;
                prp prpVar = new prp(prqVar, dtqVar);
                Object obj = this.c;
                String a = prb.a((String) obj);
                pra praVar = prb.b;
                Uri.Builder authority = new Uri.Builder().scheme("https").authority(praVar.a);
                Optional optional = praVar.b;
                authority.getClass();
                optional.ifPresent(new mpv(authority, 16));
                Uri.Builder appendQueryParameter = authority.appendPath("bot").appendQueryParameter("id", "tel:".concat(String.valueOf(a)));
                prb prbVar = prqVar.g;
                appendQueryParameter.appendQueryParameter("hl", yhx.b(prbVar.f).getLanguage());
                if (prbVar.g.b.contains(a)) {
                    authority.appendQueryParameter("v", "2");
                } else {
                    authority.appendQueryParameter("v", (String) prq.b.e());
                }
                CronetEngine cronetEngine = prbVar.c;
                ?? r4 = this.b;
                prbVar.e.e().ifPresent(new mpv(authority, 17));
                String uri = authority.build().toString();
                alvw g = prb.a.g();
                g.X(alwp.a, "Bugle");
                ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoAndShortCodeUrlCreator", "createUrl", 159, "RbmBusinessInfoAndShortCodeUrlCreator.java")).t("Business Info URL successfully built: %s", uri);
                UrlRequest.Builder trafficStatsTag = cronetEngine.newUrlRequestBuilder(uri, prpVar, prbVar.d).setTrafficStatsTag(8193);
                if (!TextUtils.isEmpty(r4)) {
                    trafficStatsTag = trafficStatsTag.addHeader("If-None-Match", (String) r4);
                }
                UrlRequest build = trafficStatsTag.build();
                alvw g2 = prq.a.g();
                g2.X(alwp.a, "Bugle");
                ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoJsonRetriever", "processRbmShortCodeQueryResult", 250, "RbmBusinessInfoJsonRetriever.java")).t("Starting HTTP request for %s...", obj);
                build.start();
                return "HTTP request for ".concat(String.valueOf(obj));
            case 3:
                Object obj2 = this.b;
                rhz rhzVar = new rhz(obj2, dtqVar, i2);
                Action action = (Action) this.a;
                ((AtomicReference) obj2).set(((rhg) ((ria) this.c).c.b()).a(new rho(action.t, rho.a(action), rhzVar, null, true), action));
                return "Start" + action.c() + "FromPWQ";
            case 4:
                ((uqg) this.a).b.add(new aiim(akto.j(this.b), dtqVar, (agnt) this.c));
                return "DatabaseWrapperImpl.runAfterCommit (completer)";
            case 5:
                Object obj3 = this.b;
                if (obj3 != null) {
                    ((wub) this.c).e(this.a, (String) obj3, dtqVar, true);
                    return "BugleRcsContactsServiceImpl.getOnlineStatus";
                }
                dtqVar.d(new psx("Getting Capabilities failed due to remote user id being null"));
                return "BugleRcsContactsServiceImpl.getOnlineStatus";
            case 6:
                Object obj4 = this.b;
                if (obj4 != null) {
                    ((wub) this.c).e(this.a, (String) obj4, dtqVar, false);
                    return "BugleRcsContactsServiceImpl.getCapabilities";
                }
                dtqVar.d(new psx("Getting Capabilities failed due to remote user id being null"));
                return "BugleRcsContactsServiceImpl.getCapabilities";
            case 7:
                dtqVar.a(new eyg(19), andi.a);
                ahjj ahjjVar = new ahjj(dtqVar);
                ygs ygsVar = (ygs) this.c;
                ygsVar.h = ahjjVar;
                ahjj ahjjVar2 = (ahjj) this.b;
                aksj aksjVar = new aksj(ygsVar, ahjjVar2, dtqVar, i3);
                MediaPlayer mediaPlayer = (MediaPlayer) this.a;
                mediaPlayer.setOnCompletionListener(aksjVar);
                mediaPlayer.setOnErrorListener(new aksk(ygsVar, ahjjVar2, dtqVar, i3));
                return "MediaPlayer.On(Completion|Error)Listener";
            case 8:
                dtqVar.a(new eyg(i), andi.a);
                ahjj ahjjVar3 = new ahjj(dtqVar);
                Object obj5 = this.c;
                final ygs ygsVar2 = (ygs) obj5;
                ygsVar2.h = ahjjVar3;
                MediaPlayer.OnPreparedListener onPreparedListener = new MediaPlayer.OnPreparedListener() { // from class: ygr
                    @Override // android.media.MediaPlayer.OnPreparedListener
                    public final void onPrepared(MediaPlayer mediaPlayer2) {
                        ((alwl) ygs.a.n().h("com/google/android/apps/messaging/shared/util/media/audio/PlaybackSession", "getPreparedListener", 212, "PlaybackSession.java")).q("Media player is prepared");
                        qiu.h(aktp.ah(new ybh(dtqVar, 5), ygs.this.c));
                    }
                };
                Object obj6 = this.a;
                MediaPlayer mediaPlayer2 = (MediaPlayer) obj6;
                mediaPlayer2.setOnPreparedListener(onPreparedListener);
                mediaPlayer2.setOnErrorListener(new aksk(ygsVar2, (ahjj) this.b, dtqVar, i3));
                try {
                    ((ygs) obj5).c();
                    MediaPlayer mediaPlayer3 = ((ygs) obj5).e;
                    mediaPlayer3.getClass();
                    ((ygs) obj5).b.e.ifPresent(new ybf(mediaPlayer3, 10));
                    ((ygs) obj5).b.d.ifPresent(new ybf(mediaPlayer3, 5));
                    ((ygs) obj5).b.c.ifPresent(new ybf(mediaPlayer3, 6));
                    ((MediaPlayer) obj6).prepare();
                    return "MediaPlayer.OnPreparedListener";
                } catch (Exception e) {
                    ygsVar2.b();
                    throw new ygm(e);
                }
            case 9:
                utz utzVar = ylg.a;
                Object obj7 = this.b;
                Object obj8 = this.a;
                Object obj9 = this.c;
                try {
                    ((alwl) ylg.b.m().h("com/google/android/apps/messaging/shared/util/rcs/ConnectedRcsServiceFactory", "connectToInstance", 134, "ConnectedRcsServiceFactory.java")).t("connectToInstance() try serviceListener.init for rcsService %s and completer", obj9);
                    ((ylf) obj8).b = (ajnv) obj9;
                    ((ylf) obj8).a = dtqVar;
                    if (!((ajnv) obj9).connect()) {
                        ((ylf) obj8).a.d(new ylp(((Class) obj7).getName(), ajnz.UNKNOWN));
                        return "Connected RCS Service";
                    }
                    return "Connected RCS Service";
                } catch (SecurityException e2) {
                    xzb.p("Bugle", e2, "ConnectedRcsService: Can't connect to rcsService");
                    ((ylf) obj8).a.d(e2);
                    return "Connected RCS Service";
                }
            case 10:
                ahjj ahjjVar4 = new ahjj(dtqVar);
                Object obj10 = new zfm(((yso) this.a).b, (byte[]) null).a;
                addy addyVar = (addy) obj10;
                abvy abvyVar = new abvy(addyVar, (String) this.c, this.b, ahjjVar4);
                long a2 = abvyVar.e.a();
                ((Handler) addyVar.b).postAtTime(new maa(obj10, abvyVar, a2, 8), abvyVar, a2 + SystemClock.uptimeMillis());
                ((abwd) addyVar.c).b(abvyVar);
                return "TachyonSpamGrpc.getDroidGuardResults";
            case 11:
                aiut.e(new uju(this.c, this.b, this.a, dtqVar, 7, null));
                return "linkifyCallback";
            default:
                aiut.e(new uju((ConversationMessageView) this.a, (Function) this.b, (alog) this.c, dtqVar, 8));
                return "loadShortcutsCallback";
        }
    }

    public /* synthetic */ gst(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public /* synthetic */ gst(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.d = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public /* synthetic */ gst(Object obj, String str, Object obj2, int i) {
        this.d = i;
        this.a = obj;
        this.c = str;
        this.b = obj2;
    }
}
