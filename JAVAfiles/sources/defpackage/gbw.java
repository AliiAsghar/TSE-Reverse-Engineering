package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.multishare.chip.ChipData;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gbw implements asaj {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public gbw(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, arzj] */
    /* JADX WARN: Type inference failed for: r11v5, types: [byn, java.lang.Object] */
    @Override // defpackage.asaj
    public final /* synthetic */ Object fv(Object obj, arpe arpeVar) {
        Object b;
        Drawable drawable;
        Object obj2;
        bzt bztVar;
        ChipData chipData;
        String string;
        bzt bztVar2 = null;
        switch (this.b) {
            case 0:
                this.a.c((arnb) obj);
                return arnb.a;
            case 1:
                if ((((eij) this.a).h.A() instanceof eis) || (b = ((eij) this.a).b(true, arpeVar)) != arpl.a) {
                    return arnb.a;
                }
                return b;
            case 2:
                ((gqg) this.a).e.h((fzu) obj);
                return arnb.a;
            case 3:
                hmq hmqVar = (hmq) obj;
                if (hmqVar instanceof hmt) {
                    drawable = (Drawable) ((hmt) hmqVar).a;
                } else if (hmqVar instanceof hms) {
                    drawable = ((hms) hmqVar).a;
                } else {
                    throw new armm();
                }
                if (drawable != null) {
                    if (drawable instanceof BitmapDrawable) {
                        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                        bitmap.getClass();
                        obj2 = new cop(new cjz(bitmap));
                    } else if (drawable instanceof ColorDrawable) {
                        obj2 = new coq(ckw.c(((ColorDrawable) drawable).getColor()));
                    } else {
                        Drawable mutate = drawable.mutate();
                        mutate.getClass();
                        obj2 = new iau(mutate);
                    }
                } else {
                    obj2 = null;
                }
                hmi hmiVar = (hmi) this.a;
                Object j = hmiVar.j();
                if (obj2 != j) {
                    if (j instanceof bzt) {
                        bztVar = (bzt) j;
                    } else {
                        bztVar = null;
                    }
                    if (bztVar != null) {
                        bztVar.h();
                    }
                    if (obj2 instanceof bzt) {
                        bztVar2 = (bzt) obj2;
                    }
                    if (bztVar2 != null) {
                        bztVar2.i();
                    }
                    hmiVar.c.h(drawable);
                    hmiVar.d.h(obj2);
                }
                ((hmi) this.a).b.h(hmqVar.a());
                return arnb.a;
            case 4:
                ((Boolean) obj).booleanValue();
                ((ifw) this.a).c.a();
                return arnb.a;
            case 5:
                ((Boolean) obj).booleanValue();
                izz izzVar = (izz) this.a;
                String string2 = ((Context) izzVar.a).getString(R.string.blocked_recipients_in_conversation_message);
                string2.getClass();
                Object k = ((jxv) izzVar.h).k(new kjl(string2, null, true, null, null, 117), arpeVar);
                if (k == arpl.a) {
                    return k;
                }
                return arnb.a;
            case 6:
                Object a = ((jly) this.a).a((List) obj, arpeVar);
                if (a == arpl.a) {
                    return a;
                }
                return arnb.a;
            case 7:
                aflb aflbVar = ((jto) this.a).l;
                String str = (String) obj;
                if (d.F(str, aflbVar.a())) {
                    alvw d = jto.a.d();
                    d.X(alwp.a, "BugleComposeRow2");
                    ((alvg) d.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/text/DraftTextUiAdapterImpl$1$3", "emit", 287, "DraftTextUiAdapterImpl.kt")).t("Skipping draft text field response to draft state %s", yyb.bd(str));
                } else if (str == null) {
                    alvw g = jto.a.g();
                    g.X(alwp.a, "BugleComposeRow2");
                    ((alvg) g.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/text/DraftTextUiAdapterImpl$1$3", "emit", 293, "DraftTextUiAdapterImpl.kt")).q("Clearing draft text field in response to draft state");
                    aflbVar.e();
                } else {
                    alvw d2 = jto.a.d();
                    d2.X(alwp.a, "BugleComposeRow2");
                    ((alvg) d2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/text/DraftTextUiAdapterImpl$1$3", "emit", 299, "DraftTextUiAdapterImpl.kt")).t("Setting draft text field in response to draft state %s", yyb.bd(str));
                    aflbVar.h(str);
                }
                return arnb.a;
            case 8:
                if (((Number) obj).intValue() == ((jto) this.a).h.get()) {
                    alvw d3 = jto.a.d();
                    d3.X(alwp.a, "BugleComposeRow2");
                    alvg alvgVar = (alvg) d3;
                    alvgVar.V(5, TimeUnit.SECONDS);
                    ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/text/DraftTextUiAdapterImpl$2$1", "emit", 312, "DraftTextUiAdapterImpl.kt")).q("Sending start typing notification");
                    Object F = arro.F(((jto) this.a).b().b(), arpeVar);
                    if (F == arpl.a) {
                        return F;
                    }
                }
                return arnb.a;
            case 9:
                ((Number) obj).intValue();
                ((jto) this.a).n.g(197897, null);
                return arnb.a;
            case 10:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                jub jubVar = (jub) this.a;
                jubVar.r = arrn.I(jubVar.c, null, null, new jtu(booleanValue, jubVar, null), 3);
                return arnb.a;
            case 11:
                if (((nfw) obj) == null) {
                    alvw d4 = jwi.a.d();
                    d4.X(alwp.a, "BugleComposeRow2");
                    ((alvg) d4.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/sim/SimSelectorUiAdapterImpl$1$1", "emit", 75, "SimSelectorUiAdapterImpl.kt")).q("No active self identity selected, starting sim checker");
                    Object obj3 = this.a;
                    ghu ghuVar = new ghu(obj3, 17, (boolean[][][]) null);
                    jwd jwdVar = ((jwi) obj3).f;
                    qjh.l(jwdVar.b, null, new jvr(jwdVar, ghuVar, (arpe) null, 5), 3);
                }
                return arnb.a;
            case 12:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((jym) this.a).m.a(bool);
                return arnb.a;
            case 13:
                zxk zxkVar = (zxk) obj;
                boolean z = zxkVar.d;
                kjc kjcVar = (kjc) this.a;
                kjcVar.e = z;
                float f = zxkVar.c;
                if (z) {
                    kjcVar.g.f(new Float(f));
                }
                return arnb.a;
            case 14:
                ((lkd) this.a).g(llm.a);
                return arnb.a;
            case 15:
                float floatValue = ((Number) obj).floatValue();
                dxl dxlVar = new dxl();
                ConstraintLayout constraintLayout = (ConstraintLayout) this.a;
                dxlVar.d(constraintLayout);
                dxlVar.f(R.id.conversation_list_root_container, floatValue);
                dxlVar.f(R.id.conversation_container_background, 1.0f - floatValue);
                dxlVar.c(constraintLayout);
                return arnb.a;
            case 16:
                lge lgeVar = (lge) obj;
                if (!xwr.h(((lfz) this.a).a) || ((chipData = lgeVar.b) == null && lgeVar.c == null)) {
                    return arnb.a;
                }
                ChipData chipData2 = lgeVar.c;
                if (chipData2 != null) {
                    string = ((lfz) this.a).a.getString(R.string.multi_share_talkback_remove_recipient, chipData2.b);
                } else {
                    Object obj4 = this.a;
                    chipData.getClass();
                    string = ((lfz) obj4).a.getString(R.string.multi_share_talkback_add_recipient, chipData.b);
                }
                string.getClass();
                ((lfz) this.a).b.a(string);
                return arnb.a;
            case 17:
                aflb aflbVar2 = ((afzk) ((mgu) this.a).a).f;
                String str2 = (String) obj;
                if (!d.F(str2, aflbVar2.a())) {
                    if (str2 == null) {
                        aflbVar2.e();
                    } else {
                        aflbVar2.h(str2);
                    }
                }
                return arnb.a;
            case 18:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                ((lhn) this.a).d.a(bool2);
                return arnb.a;
            case 19:
                wth wthVar = (wth) obj;
                wtv wtvVar = (wtv) this.a;
                wth wthVar2 = wtvVar.g;
                wtvVar.g = wthVar;
                if (wthVar2 == null || wthVar2.a != wthVar.a) {
                    if (wthVar.a) {
                        if (wtvVar.f == null) {
                            ((lre) wtvVar.c.b()).e(false, new wup(this.a, wthVar, 1, null));
                        }
                    } else {
                        lrc lrcVar = wtvVar.f;
                        if (lrcVar != null) {
                            lrcVar.a();
                        }
                        ((wtv) this.a).f = null;
                    }
                }
                return arnb.a;
            default:
                yvj yvjVar = (yvj) this.a;
                qjh.l(yvjVar.b, null, new yvi(yvjVar, null), 3);
                return arnb.a;
        }
    }
}
