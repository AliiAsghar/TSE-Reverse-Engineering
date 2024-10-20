package defpackage;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afzu extends arrp implements arqg {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afzu(Object obj, Object obj2, int i) {
        super(0);
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [cas, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [agih, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [agih, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v54, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v64, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.view.View$OnLayoutChangeListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, apbt] */
    /* JADX WARN: Type inference failed for: r3v9, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [armf, java.lang.Object] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        aozb aozbVar;
        agar agarVar;
        boolean booleanValue;
        int i = 3;
        switch (this.c) {
            case 0:
                ((cj) this.a).startActivity((Intent) this.b);
                return arnb.a;
            case 1:
                Object obj = this.b;
                ncd ncdVar = new ncd(obj, 20, (char[]) null, (byte[]) null);
                afya afyaVar = new afya(obj, 1, (byte[]) null);
                aday adayVar = (aday) this.a;
                aday adayVar2 = (aday) adayVar.a.b();
                afke afkeVar = (afke) adayVar.b.b();
                afkeVar.getClass();
                return new afwz(adayVar2, afkeVar, ncdVar, afyaVar);
            case 2:
                ((View) this.a).removeOnLayoutChangeListener(this.b);
                return arnb.a;
            case 3:
                View contentView = ((agaw) this.b).d().getContentView();
                aday adayVar3 = (aday) this.a;
                Activity activity = (Activity) adayVar3.a.b();
                activity.getClass();
                afke afkeVar2 = (afke) adayVar3.b.b();
                afkeVar2.getClass();
                contentView.getClass();
                return new agbp(activity, afkeVar2, contentView);
            case 4:
                ((alvg) agbp.a.g().h("com/google/android/libraries/compose/ui/keyboard/detector/KeyboardLayoutListener$onApplyWindowInsets$1", "invoke", 127, "KeyboardLayoutListener.kt")).r("onApplyWindowInsets: System window bottom inset is now %d", ((WindowInsets) this.b).getSystemWindowInsetBottom());
                agbp agbpVar = (agbp) this.a;
                int i2 = agbpVar.d;
                if (((WindowInsets) this.b).getSystemWindowInsetBottom() > i2) {
                    agar agarVar2 = agbpVar.h;
                    if (agarVar2 != null) {
                        agarVar2.m(agaq.a);
                    }
                } else if (agbpVar.f < i2 && (agarVar = agbpVar.h) != null) {
                    agarVar.m(agaq.d);
                }
                return this.b;
            case 5:
                booleanValue = ((Boolean) this.b.a()).booleanValue();
                if (booleanValue) {
                    ((agde) this.a).a();
                } else {
                    agde agdeVar = (agde) this.a;
                    if (agdeVar.i == null) {
                        Object obj2 = agdeVar.j.a;
                        ExoPlayer a = new ezs((Context) obj2, new ezp(obj2, 2), new ezp(obj2, i)).a();
                        a.K(new agdc(agdeVar, a));
                        agdeVar.i = a;
                    }
                    if (!agdeVar.g) {
                        ((alvg) agde.a.g().h("com/google/android/libraries/compose/ui/projector/renderers/video/HugoVideoPlayer", "play", 63, "HugoVideoPlayer.kt")).q("HugoVideoPlayer::play preparing media player");
                        Uri parse = Uri.parse(agdeVar.c.b);
                        ExoPlayer exoPlayer = agdeVar.i;
                        if (exoPlayer != null) {
                            alog r = alog.r(ere.a(parse));
                            fad fadVar = (fad) exoPlayer;
                            fadVar.ag();
                            List W = fadVar.W(r);
                            fadVar.ag();
                            fadVar.ab(W, 0, 0L, false);
                        }
                        ExoPlayer exoPlayer2 = agdeVar.i;
                        if (exoPlayer2 != null) {
                            exoPlayer2.L();
                        }
                        ExoPlayer exoPlayer3 = agdeVar.i;
                        if (exoPlayer3 != null) {
                            exoPlayer3.N(true);
                        }
                    } else {
                        ExoPlayer exoPlayer4 = agdeVar.i;
                        exoPlayer4.getClass();
                        if (exoPlayer4.w() == 4) {
                            ((alvg) agde.a.g().h("com/google/android/libraries/compose/ui/projector/renderers/video/HugoVideoPlayer", "play", 67, "HugoVideoPlayer.kt")).q("HugoVideoPlayer::play seeking to the beginning");
                            ert ertVar = agdeVar.i;
                            ertVar.getClass();
                            ((eqb) ertVar).q(0L);
                        }
                        ((alvg) agde.a.g().h("com/google/android/libraries/compose/ui/projector/renderers/video/HugoVideoPlayer", "play", 70, "HugoVideoPlayer.kt")).q("HugoVideoPlayer::play playing media player");
                        ExoPlayer exoPlayer5 = agdeVar.i;
                        exoPlayer5.getClass();
                        exoPlayer5.e();
                    }
                }
                return arnb.a;
            case 6:
                Object obj3 = this.a;
                if (obj3 instanceof agji) {
                    this.b.d(null);
                } else if (obj3 instanceof agjg) {
                    agjg agjgVar = (agjg) obj3;
                    aggp aggpVar = agjgVar.g;
                    agjgVar.f.a();
                    this.b.d(aggpVar);
                } else {
                    throw new IllegalStateException("Should not attach a file to draft when in pre-recording state.");
                }
                return arnb.a;
            case 7:
                this.b.h(Boolean.valueOf(!((Boolean) this.b.a()).booleanValue()));
                ((duh) this.a).a();
                return arnb.a;
            case 8:
                ((agoz) this.a).G((agmc) this.b);
                return arnb.a;
            case 9:
                ((ContentResolver) ((ahiy) this.a).c).unregisterContentObserver((ContentObserver) this.b);
                return arnb.a;
            case 10:
                apbt s = ((apuv) this.b).c().newBuilderForType().g(Base64.decode((String) this.a, 3)).s();
                s.getClass();
                return s;
            case 11:
                try {
                    ?? r2 = ((apuv) this.a).c;
                    r2.getClass();
                    apbs newBuilderForType = r2.newBuilderForType();
                    Object obj4 = this.b;
                    if (((akif) obj4).c == 6) {
                        aozbVar = (aozb) ((akif) obj4).d;
                    } else {
                        aozbVar = aozb.b;
                    }
                    return newBuilderForType.e(aozbVar).s();
                } catch (apba e) {
                    Log.e("MendelPackageState", "Failed to parse flag", e);
                    return ((apuv) this.a).c();
                } catch (RuntimeException e2) {
                    Log.e("MendelPackageState", "Failed to parse flag", e2);
                    return ((apuv) this.a).c();
                }
            default:
                return ((arus) this.a).c(this.b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afzu(Object obj, Object obj2, int i, byte[] bArr) {
        super(0);
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
