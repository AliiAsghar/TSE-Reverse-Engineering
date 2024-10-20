package defpackage;

import android.content.Context;
import android.media.MediaPlayer;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jjw extends arrp implements arqg {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jjw(Object obj, int i) {
        super(0);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, arml] */
    /* JADX WARN: Type inference failed for: r0v24, types: [ascv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, lrc] */
    /* JADX WARN: Type inference failed for: r0v58, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v82, types: [java.lang.Object, arpe] */
    /* JADX WARN: Type inference failed for: r0v84, types: [java.lang.Object, arpe] */
    /* JADX WARN: Type inference failed for: r0v86, types: [java.lang.Object, arpe] */
    /* JADX WARN: Type inference failed for: r0v88, types: [java.lang.Object, arpe] */
    /* JADX WARN: Type inference failed for: r0v90, types: [java.lang.Object, arpe] */
    /* JADX WARN: Type inference failed for: r0v92, types: [java.lang.Object, arpe] */
    /* JADX WARN: Type inference failed for: r2v4, types: [afkr, java.lang.Object] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        afzh afzhVar;
        boolean z = false;
        switch (this.b) {
            case 0:
                return ((mgu) this.a).o().a.f;
            case 1:
                return Integer.valueOf(((avc) this.a).j());
            case 2:
                jtm jtmVar = (jtm) ((mgu) this.a).c.a();
                if (((ansy) ((owa) ((mgu) this.a).a).a.b()).e("bugle.direct_send_v2_enable_rich_content_insertion")) {
                    afzhVar = ((joe) ((mgu) this.a).g).a();
                } else {
                    afzhVar = null;
                }
                afzk afzkVar = new afzk(jtmVar, afzhVar, ((mgu) this.a).f);
                aenn aennVar = new aenn(z, z, z, 7);
                String string = ((Context) ((mgu) this.a).h).getString(R.string.direct_send_compose_row_hint);
                string.getClass();
                String str = ((jhc) ((jxv) ((mgu) this.a).b).a.c()).a;
                if (str == null) {
                    str = "";
                }
                return new aeno(afzkVar, (CharSequence) str, string, (Integer) null, true, aennVar, 32);
            case 3:
                return new jtm(this.a, 1);
            case 4:
                return (mdc) this.a.b();
            case 5:
                znj znjVar = (znj) ((lig) this.a).a.b();
                aiwl a = wus.a();
                a.i(wuk.IMAGE_COMPRESSION);
                a.k(yfq.a);
                return znjVar.ab(a.f());
            case 6:
                this.a.a();
                return arnb.a;
            case 7:
                Object obj = this.a;
                ((jky) obj).h.e(true, new ipk(obj, 14));
                return arnb.a;
            case 8:
                ((lkd) ((jky) this.a).d.b()).b(lnv.a);
                return arnb.a;
            case 9:
                ((lkd) ((jky) this.a).d.b()).b(lnu.a);
                return arnb.a;
            case 10:
                return (jsm) this.a.b();
            case 11:
                ((alvg) lnb.a.d().h("com/google/android/apps/messaging/navigation/targets/MediaViewerResultProcessorImpl", "onMediaViewerOpen", 22, "MediaViewerResultProcessorImpl.kt")).q("Saving flag for future possible result recovery");
                ((jmc) this.a).j.b.c("saved_state_pending_result", true);
                return arnb.a;
            case 12:
                return new aejt[((asai[]) this.a).length];
            case 13:
                return new Object[((asai[]) this.a).length];
            case 14:
                kbn kbnVar = (kbn) this.a;
                kbnVar.f();
                MediaPlayer mediaPlayer = kbnVar.e;
                if (mediaPlayer != null) {
                    mediaPlayer.reset();
                }
                kbnVar.l = false;
                kbnVar.f.f(false);
                kbnVar.h.f(false);
                return arnb.a;
            case 15:
                this.a.w(true);
                return arnb.a;
            case 16:
                this.a.w(false);
                return arnb.a;
            case 17:
                this.a.w(false);
                return arnb.a;
            case 18:
                this.a.w(false);
                return arnb.a;
            case 19:
                this.a.w(true);
                return arnb.a;
            default:
                this.a.w(false);
                return arnb.a;
        }
    }
}
