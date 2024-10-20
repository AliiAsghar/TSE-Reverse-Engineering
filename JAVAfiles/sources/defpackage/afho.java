package defpackage;

import android.app.Activity;
import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.android.apps.messaging.R;
import defpackage.cvc;
import java.io.File;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afho extends arrp implements arqr {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afho(Object obj, Object obj2, int i) {
        super(1);
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v46, types: [enl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v2, types: [dqv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r11v44, types: [enm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, arqw] */
    /* JADX WARN: Type inference failed for: r1v35, types: [enm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v43, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        LayoutInflater from;
        long a;
        aknr aknrVar;
        int i = 6;
        Object obj2 = null;
        boolean z = true;
        int i2 = 0;
        switch (this.c) {
            case 0:
                cti ctiVar = (cti) obj;
                ctiVar.getClass();
                this.b.a(new dqy(this.a.eh((int) (ctiVar.g() & 4294967295L))));
                return arnb.a;
            case 1:
                Activity activity = (Activity) obj;
                activity.getClass();
                Object obj3 = this.b;
                Object obj4 = this.a;
                afhb afhbVar = new afhb(obj4, obj3, i2);
                afhd afhdVar = (afhd) obj4;
                aodz.I(afhdVar.g, activity, afhdVar.f, afhbVar);
                return arnb.a;
            case 2:
                afgq afgqVar = (afgq) obj;
                afgqVar.getClass();
                return new agcp((arwe) this.b, (cg) this.a, afgqVar);
            case 3:
                aozy aozyVar = (aozy) obj;
                aozyVar.getClass();
                aozy createBuilder = afnj.a.createBuilder();
                createBuilder.getClass();
                afmf afmfVar = (afmf) this.a;
                aflq aflqVar = afmfVar.a;
                if (aflqVar != null) {
                    String name = aflqVar.name();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    afnj afnjVar = (afnj) createBuilder.b;
                    name.getClass();
                    afnjVar.b = 1 | afnjVar.b;
                    afnjVar.c = name;
                } else {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    afnj afnjVar2 = (afnj) createBuilder.b;
                    afnjVar2.b &= -2;
                    afnjVar2.c = afnj.a.c;
                }
                aflr aflrVar = afmfVar.b;
                if (aflrVar != null) {
                    String name2 = aflrVar.name();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    afnj afnjVar3 = (afnj) createBuilder.b;
                    name2.getClass();
                    afnjVar3.b = 2 | afnjVar3.b;
                    afnjVar3.d = name2;
                } else {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    afnj afnjVar4 = (afnj) createBuilder.b;
                    afnjVar4.b &= -3;
                    afnjVar4.d = afnj.a.d;
                }
                apag s = createBuilder.s();
                s.getClass();
                afnj afnjVar5 = (afnj) s;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                afnm afnmVar = (afnm) aozyVar.b;
                afnm afnmVar2 = afnm.a;
                apbo apboVar = afnmVar.c;
                if (!apboVar.b) {
                    afnmVar.c = apboVar.a();
                }
                afnmVar.c.put(this.b, afnjVar5);
                return arnb.a;
            case 4:
                afmf afmfVar2 = (afmf) obj;
                afmfVar2.getClass();
                if (afmfVar2.a == this.a && afmfVar2.b == this.b) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                afmf afmfVar3 = (afmf) obj;
                afmfVar3.getClass();
                Object obj5 = this.a;
                if (obj5 == aflq.b) {
                    obj5 = null;
                }
                afmfVar3.a = (aflq) obj5;
                Object obj6 = this.b;
                if (obj6 != aflr.b) {
                    obj2 = obj6;
                }
                afmfVar3.b = (aflr) obj2;
                return arnb.a;
            case 6:
                aozy aozyVar2 = (aozy) obj;
                aozyVar2.getClass();
                Object obj7 = this.a;
                Object obj8 = this.b;
                String obj9 = obj7.toString();
                String obj10 = obj8.toString();
                obj9.getClass();
                obj10.getClass();
                if (!aozyVar2.b.isMutable()) {
                    aozyVar2.u();
                }
                afnm afnmVar3 = (afnm) aozyVar2.b;
                afnm afnmVar4 = afnm.a;
                apbo apboVar2 = afnmVar3.b;
                if (!apboVar2.b) {
                    afnmVar3.b = apboVar2.a();
                }
                afnmVar3.b.put(obj9, obj10);
                return arnb.a;
            case 7:
                MediaMetadataRetriever mediaMetadataRetriever = (MediaMetadataRetriever) obj;
                mediaMetadataRetriever.getClass();
                mediaMetadataRetriever.setDataSource((Context) ((atsg) this.b).d, (Uri) this.a);
                return arnb.a;
            case 8:
                MediaMetadataRetriever mediaMetadataRetriever2 = (MediaMetadataRetriever) obj;
                mediaMetadataRetriever2.getClass();
                mediaMetadataRetriever2.setDataSource((Context) ((atsg) this.b).d, (Uri) this.a);
                return arnb.a;
            case 9:
                afqa afqaVar = (afqa) obj;
                afqaVar.getClass();
                arrn.J(ene.b(((cg) this.a).O()), null, null, new afop(afqaVar, (afvx) this.a, (List) this.b, (arpe) null, 2), 3);
                return arnb.a;
            case 10:
                Context context = (Context) obj;
                context.getClass();
                Object obj11 = this.a;
                if (obj11 == null || (from = ((cg) obj11).I()) == null) {
                    from = LayoutInflater.from(context);
                }
                ?? r1 = this.b;
                from.getClass();
                return (View) r1.a(from, new FrameLayout(context), false);
            case 11:
                dho dhoVar = (dho) obj;
                dhoVar.getClass();
                dhl.p(dhoVar, new dhv((String) this.b));
                dhl.D(dhoVar, new afmo(this.a, 17));
                dhl.A(dhoVar, new afww(this.a, 19));
                dhl.y(dhoVar, new afmo(this.a, 18));
                EditText editText = (EditText) ((czj) this.a).a;
                if (editText != null) {
                    a = djd.a(editText.getSelectionStart(), editText.getSelectionEnd());
                    long j = djc.a;
                } else {
                    a = djd.a(0, 0);
                    long j2 = djc.a;
                }
                dhl.q(dhoVar, a);
                dhl.C(dhoVar, new aeyj(this.a, 6));
                return arnb.a;
            case 12:
                ((enh) this.a).d(this.b);
                return arnb.a;
            case 13:
                ((bxi) obj).getClass();
                rb rbVar = new rb(this.b, i);
                this.a.N().c(rbVar);
                return new agdf((agde) this.b, this.a, rbVar);
            case 14:
                agde agdeVar = (agde) ((HashMap) ((aday) this.a).b).get(((agdh) this.b).a.b);
                if (agdeVar != null) {
                    ((alvg) agde.a.g().h("com/google/android/libraries/compose/ui/projector/renderers/video/HugoVideoPlayer", "release", 126, "HugoVideoPlayer.kt")).q("HugoVideoPlayer::release releasing");
                    agdeVar.b();
                    ExoPlayer exoPlayer = agdeVar.i;
                    if (exoPlayer != null) {
                        exoPlayer.a();
                    }
                    agdeVar.g = false;
                    agdeVar.d.f(false);
                    agdeVar.i = null;
                    ((alvg) agde.a.g().h("com/google/android/libraries/compose/ui/projector/renderers/video/HugoVideoPlayer", "release", 134, "HugoVideoPlayer.kt")).q("HugoVideoPlayer::release released");
                }
                ((HashMap) ((aday) this.a).b).remove(((agdh) this.b).a.b);
                return arnb.a;
            case 15:
                dk dkVar = (dk) obj;
                dkVar.getClass();
                cg e = ((da) this.a).e(((agem) this.b).aM().name());
                if (e == null) {
                    Object obj12 = this.b;
                    dkVar.r(R.id.renderer_root, (cg) obj12, ((agem) obj12).aM().name());
                } else if (d.F(e, this.b)) {
                    dkVar.l((cg) this.b);
                } else {
                    Object obj13 = this.b;
                    dkVar.v(R.id.renderer_root, (cg) obj13, ((agem) obj13).aM().name());
                }
                return arnb.a;
            case 16:
                dk dkVar2 = (dk) obj;
                dkVar2.getClass();
                dkVar2.r(R.id.proxy_screen_screens_container, (cg) this.b, ((agae) this.a).a.name());
                return arnb.a;
            case 17:
                ((duj) this.a).c((cvc.a) obj, this.b);
                return arnb.a;
            case 18:
                dty dtyVar = (dty) obj;
                dtyVar.getClass();
                ef.w(dtyVar.f, ((dtz) this.a).d, 8.0f, 4);
                ef.w(dtyVar.g, ((dtz) this.b).b, 8.0f, 4);
                ef.x(dtyVar.h, dtyVar.c.c);
                ef.x(dtyVar.i, dtyVar.c.e);
                dtyVar.d.d(dty.a[0], new kkc("spread"));
                dtyVar.e.d(dty.a[1], new kkc(new dqy(44.0f), (String) null));
                return arnb.a;
            case 19:
                String str = (String) obj;
                str.getClass();
                if (((ahlp) this.a).h(str)) {
                    aknrVar = new aknr(1, 1);
                } else {
                    aknrVar = new aknr(1, 2);
                }
                Uri B = ((aohs) this.b).B(aknrVar, File.separator + "phenotype" + File.separator + str);
                B.getClass();
                return B;
            default:
                return ((akyr) ((akjh) this.a).c.b()).i((String) this.b, true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afho(Object obj, Object obj2, int i, byte[] bArr) {
        super(1);
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
