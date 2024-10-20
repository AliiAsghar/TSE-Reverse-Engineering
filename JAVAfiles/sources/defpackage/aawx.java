package defpackage;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerAddMoreButtonEvent;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerButton;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerPrimaryButtonEvent;
import com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem;
import defpackage.abfl;
import defpackage.abfp;
import defpackage.abft;
import defpackage.abfw;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aawx implements akvz {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public aawx(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.akvz
    public final /* synthetic */ akwa a(akvv akvvVar) {
        boolean z;
        boolean z2;
        MediaViewerButton mediaViewerButton;
        int i = 1;
        String str = null;
        ArrayList arrayList = null;
        String str2 = null;
        switch (this.b) {
            case 0:
                MediaViewerAddMoreButtonEvent mediaViewerAddMoreButtonEvent = (MediaViewerAddMoreButtonEvent) akvvVar;
                aaww aawwVar = (aaww) this.a;
                if (aawwVar.e) {
                    str = albo.af((String) mediaViewerAddMoreButtonEvent.b.orElse(null));
                }
                String str3 = str;
                if (mediaViewerAddMoreButtonEvent.a.isPresent()) {
                    aawwVar.a.setResult(-1, aawwVar.a(((aaxk) mediaViewerAddMoreButtonEvent.a.get()).a, ((aaxk) mediaViewerAddMoreButtonEvent.a.get()).c, true, false, str3));
                } else {
                    MediaViewerItem mediaViewerItem = aawwVar.c.E().E;
                    aawwVar.a.setResult(-1, aawwVar.a(mediaViewerItem.b(), mediaViewerItem.g(), false, false, str3));
                }
                aawwVar.a.finish();
                return akwa.a;
            case 1:
                MediaViewerPrimaryButtonEvent mediaViewerPrimaryButtonEvent = (MediaViewerPrimaryButtonEvent) akvvVar;
                aaww aawwVar2 = (aaww) this.a;
                if (aawwVar2.e) {
                    str2 = albo.af((String) mediaViewerPrimaryButtonEvent.b.orElse(null));
                }
                String str4 = str2;
                if (mediaViewerPrimaryButtonEvent.a.isPresent()) {
                    String str5 = ((aaxk) mediaViewerPrimaryButtonEvent.a.get()).c;
                    Uri uri = ((aaxk) mediaViewerPrimaryButtonEvent.a.get()).a;
                    if (aawwVar2.e && aawwVar2.f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    aawwVar2.a.setResult(-1, aawwVar2.a(uri, str5, true, z2, str4));
                } else {
                    MediaViewerItem mediaViewerItem2 = aawwVar2.c.E().E;
                    Uri b = mediaViewerItem2.b();
                    String g = mediaViewerItem2.g();
                    if (aawwVar2.e && aawwVar2.f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    aawwVar2.a.setResult(-1, aawwVar2.a(b, g, false, z, str4));
                }
                aawwVar2.a.finish();
                return akwa.a;
            case 2:
                return akwa.a;
            case 3:
                aaxd aaxdVar = (aaxd) this.a;
                boolean r = aaxdVar.r();
                if (r) {
                    mediaViewerButton = null;
                } else {
                    mediaViewerButton = aaxdVar.l;
                }
                aaxdVar.m(mediaViewerButton);
                if (!r) {
                    arrayList = aaxdVar.m;
                }
                aaxdVar.o(arrayList);
                return akwa.a;
            case 4:
                aaxd aaxdVar2 = (aaxd) this.a;
                cg cgVar = aaxdVar2.F;
                if ((cgVar instanceof aawo) && cgVar.aw()) {
                    aawt E = ((aawo) aaxdVar2.F).E();
                    if (E.f()) {
                        E.d.c();
                    }
                }
                return akwa.a;
            case 5:
                Object obj = this.a;
                if (yhx.c) {
                    ((aaxd) obj).j();
                } else {
                    ((yjl) ((aaxd) obj).f.b()).e(new aaxg(obj, 0));
                }
                return akwa.a;
            case 6:
                aaxd aaxdVar3 = (aaxd) this.a;
                if (aaxdVar3.r()) {
                    aaxdVar3.c(aaxdVar3.W);
                } else if (aaxdVar3.E != null) {
                    if (((Boolean) ((utz) yig.X.get()).e()).booleanValue() && ydk.B(aaxdVar3.E.b())) {
                        akbp akbpVar = aaxdVar3.W;
                        akbo akboVar = aaxdVar3.d;
                        zoh zohVar = aaxdVar3.aa;
                        Uri b2 = aaxdVar3.E.b();
                        akboVar.j(new ahlp(akul.g(hld.a(((akmt) ((aquq) zohVar.a).h()).v().h(b2))).h(new abdo(zohVar, MimeTypeMap.getFileExtensionFromUrl(b2.toString()), i), zohVar.b)), new ahlp(aaxdVar3.E.b()), akbpVar);
                    } else {
                        aaxdVar3.p(aaxdVar3.E.b(), aaxdVar3.E.g());
                    }
                }
                return akwa.a;
            case 7:
                aaxd aaxdVar4 = (aaxd) this.a;
                aaxi aaxiVar = aaxdVar4.L;
                if (aaxiVar != null) {
                    aaxiVar.e = 4;
                }
                MediaViewerItem mediaViewerItem3 = aaxdVar4.E;
                if (aaxdVar4.ac.a) {
                    qoq qoqVar = aaxdVar4.e;
                    cj fe = aaxdVar4.A.fe();
                    fe.getClass();
                    qoqVar.n(fe, mediaViewerItem3.d(), mediaViewerItem3.c(), mediaViewerItem3.b());
                } else {
                    aaxdVar4.e.o(aaxdVar4.A.x(), mediaViewerItem3.d(), mediaViewerItem3.c(), mediaViewerItem3.b());
                }
                return akwa.a;
            case 8:
                aaxd aaxdVar5 = (aaxd) this.a;
                if (aaxdVar5.A.fe() != null) {
                    aaxi aaxiVar2 = aaxdVar5.L;
                    if (aaxiVar2 != null) {
                        aaxiVar2.e = 3;
                    }
                    aaxdVar5.A.fe().onBackPressed();
                }
                return akwa.a;
            case 9:
                int a = ((aayn) akvvVar).a() - 1;
                Object obj2 = this.a;
                if (a != 0) {
                    ((aaza) obj2).a();
                    return akwa.a;
                }
                ((aaza) obj2).a.finish();
                return akwa.a;
            case 10:
                abfm abfmVar = (abfm) akvvVar;
                abfmVar.getClass();
                alvw m = abfe.a.m();
                m.X(ydl.M, "WelcomeFlowActivityWithoutConfigChangesPeer");
                abfe abfeVar = (abfe) this.a;
                m.B("onEvent: %s: pager.currentItem: %s", abfmVar, abfeVar.a().b);
                int i2 = abfeVar.a().b;
                abfeVar.a().c().getClass();
                if (i2 < r0.b() - 1) {
                    abfeVar.a().e(abfeVar.a().b + 1);
                } else {
                    abfeVar.c(3);
                }
                return akwa.a;
            case 11:
                abfi abfiVar = (abfi) akvvVar;
                abfiVar.getClass();
                alvw m2 = abfe.a.m();
                m2.X(ydl.M, "WelcomeFlowActivityWithoutConfigChangesPeer");
                m2.B("onEvent: %s: result: %s", abfiVar, abfiVar.a);
                ((abfe) this.a).c(abfiVar.a);
                return akwa.a;
            case 12:
                abfl.a aVar = (abfl.a) akvvVar;
                aVar.getClass();
                alvw m3 = abfl.a.m();
                m3.X(ydl.M, "WelcomeFlowGaiaAutoSignInFragmentPeer");
                m3.p(aVar);
                ((zfj) ((abfl) this.a).c.b()).b(6, 2);
                return new akwa(new abfm());
            case 13:
                abfp.a aVar2 = (abfp.a) akvvVar;
                aVar2.getClass();
                alvw m4 = abfp.a.m();
                m4.X(ydl.M, "WelcomeFragmentFederatedLearningPeer");
                m4.p(aVar2);
                abfp abfpVar = (abfp) this.a;
                if (abfpVar.b.isEmpty()) {
                    alwl alwlVar = (alwl) abfp.a.i();
                    alwlVar.X(ydl.M, "WelcomeFragmentFederatedLearningPeer");
                    alwlVar.q("P2pConversationTrainingUtils not available, will not mark popup as dismissed.");
                } else {
                    ((yid) abfpVar.b.get()).b();
                    ((mho) abfpVar.e.b()).aA(3, 2);
                }
                ((zfj) abfpVar.f.b()).b(2, 2);
                return new akwa(new abfm());
            case 14:
                abft.a aVar3 = (abft.a) akvvVar;
                aVar3.getClass();
                alvw m5 = abft.a.m();
                m5.X(ydl.M, "WelcomeFragmentRcsConsentPeer");
                m5.p(aVar3);
                ((znj) ((abft) this.a).b.b()).b(amlx.PROVISIONING_UI_TYPE_WELCOME_CHAT_FEATURES, "Bugle.Welcome.TermsOfService.Accepted");
                return new akwa(new abfi(1));
            case 15:
                abft.b bVar = (abft.b) akvvVar;
                bVar.getClass();
                alvw m6 = abft.a.m();
                m6.X(ydl.M, "WelcomeFragmentRcsConsentPeer");
                m6.p(bVar);
                ((znj) ((abft) this.a).b.b()).c(amlx.PROVISIONING_UI_TYPE_WELCOME_CHAT_FEATURES, "Bugle.Welcome.TermsOfService.Declined");
                return new akwa(new abfi(2));
            default:
                abfw.a aVar4 = (abfw.a) akvvVar;
                aVar4.getClass();
                alvw m7 = abfw.a.m();
                m7.X(ydl.M, "WelcomeFragmentSpamPeer");
                m7.p(aVar4);
                abfw abfwVar = (abfw) this.a;
                if (((yyt) abfwVar.d.b()).c()) {
                    ((mho) abfwVar.e.b()).aA(2, 2);
                }
                ((zfj) abfwVar.f.b()).b(3, 2);
                return new akwa(new abfm());
        }
    }
}
