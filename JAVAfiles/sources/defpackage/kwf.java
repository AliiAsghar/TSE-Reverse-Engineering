package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.home.select.SelectedConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.startchat.StartChatActivity;
import com.google.android.material.snackbar.Snackbar;
import defpackage.zij;
import defpackage.zly;
import j$.util.Optional;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kwf implements akvz {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public kwf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.akvz
    public final /* synthetic */ akwa a(akvv akvvVar) {
        klx klxVar;
        int intValue;
        int i;
        int i2 = 16;
        int i3 = 4;
        String str = null;
        switch (this.b) {
            case 0:
                aahy aahyVar = (aahy) akvvVar;
                ((kvw) this.a).r(aahyVar.a(), true, aahyVar.b());
                return akwa.a;
            case 1:
                kxj kxjVar = (kxj) akvvVar;
                boolean d = kxjVar.d();
                SelectedConversation b = kxjVar.b();
                View a = kxjVar.a();
                MessageIdType c = kxjVar.c();
                lrf e = kxjVar.e();
                xyo a2 = kuy.a.a();
                a2.H("onConversationClick");
                a2.z("key", b.a);
                a2.A("isLongClick", d);
                a2.q();
                kvw kvwVar = (kvw) this.a;
                if (xwr.h(kvwVar.b.y())) {
                    a.setFocusableInTouchMode(true);
                    a.requestFocus();
                }
                if (kvwVar.aH != null) {
                    if (!d && !kvwVar.A()) {
                        kvwVar.b(kvwVar.b).m.getClass();
                        kvwVar.F(nw.bt(a), b, c, e);
                    }
                } else {
                    if (d && !kvwVar.A()) {
                        kvwVar.n();
                    }
                    if (kvwVar.A()) {
                        aaig l = kvw.l(kvwVar.b.F());
                        HashSet hashSet = kvwVar.aP;
                        if (!b.a.b()) {
                            l.b = hashSet;
                            ConversationIdType conversationIdType = b.a;
                            if (l.a.containsKey(conversationIdType)) {
                                l.a.remove(conversationIdType);
                                l.c(false, a);
                            } else {
                                l.a.put(conversationIdType, b);
                                l.c(true, a);
                            }
                            l.d();
                        }
                        if (kvwVar.aG.e().isPresent()) {
                            ((ActionMode) kvwVar.aG.e().get()).setTitle(kvwVar.b.z().getQuantityString(R.plurals.selected_count, l.a(), Integer.valueOf(l.a())));
                        }
                        kvwVar.aG.g();
                        ((kxm) kvwVar.p.b()).q(LinearLayoutManager.bt(a) - kvwVar.q.b());
                    } else {
                        kvwVar.b(kvwVar.b).m.getClass();
                        kvwVar.F(nw.bt(a), b, c, e);
                    }
                }
                return akwa.a;
            case 2:
                aaia aaiaVar = (aaia) akvvVar;
                boolean b2 = aaiaVar.b();
                Object obj = this.a;
                if (b2) {
                    miw miwVar = (miw) ((kvw) obj).aa.b();
                    alog r = alog.r(new BugleConversationId(aaiaVar.a()));
                    aaiaVar.c();
                    qiu.h(miwVar.x(r));
                } else {
                    miw miwVar2 = (miw) ((kvw) obj).aa.b();
                    alog r2 = alog.r(new BugleConversationId(aaiaVar.a()));
                    aaiaVar.c();
                    qiu.h(miwVar2.y(r2));
                }
                kvw kvwVar2 = (kvw) obj;
                ((kxm) kvwVar2.p.b()).q(((kxm) kvwVar2.p.b()).G(aaiaVar.a().a()));
                return akwa.a;
            case 3:
                yyd yydVar = (yyd) akvvVar;
                yydVar.a();
                if (!TextUtils.isEmpty(yydVar.b())) {
                    str = yydVar.b();
                    klxVar = new klx(yydVar, i2);
                } else {
                    klxVar = null;
                }
                kvw kvwVar3 = (kvw) this.a;
                Snackbar q = Snackbar.q(kvwVar3.g(kvwVar3.b), yydVar.c(), 0);
                q.s(str, klxVar);
                q.m(kvwVar3.T.a());
                q.i();
                return akwa.a;
            case 4:
                kvw kvwVar4 = (kvw) this.a;
                if (!((Optional) ((apxx) kvwVar4.o).a).isEmpty()) {
                    ((lap) ((Optional) ((apxx) kvwVar4.o).a).get()).a();
                }
                return akwa.a;
            case 5:
                ((Optional) ((apxx) ((kvw) this.a).am).a).ifPresent(new ixe(i3));
                return akwa.a;
            case 6:
                ((llh) akvvVar).getClass();
                lex lexVar = (lex) this.a;
                lexVar.v.isPresent();
                lexVar.D();
                return akwa.a;
            case 7:
                ((kpr) akvvVar).getClass();
                lex lexVar2 = (lex) this.a;
                lexVar2.v.isPresent();
                if (lexVar2.B == null) {
                    return akwa.a;
                }
                throw null;
            case 8:
                ((llh) akvvVar).getClass();
                ((lfj) this.a).b.finishAfterTransition();
                return akwa.a;
            case 9:
                ((llh) akvvVar).getClass();
                ((lft) this.a).a.finishAfterTransition();
                return akwa.a;
            case 10:
                ((llh) akvvVar).getClass();
                ((StartChatActivity) ((yyt) this.a).b).finishAfterTransition();
                return akwa.a;
            case 11:
                zjx zjxVar = (zjx) this.a;
                zke b3 = zjxVar.b();
                akul j = b3.d.j(new uam(((zij.a) akvvVar).a, 7));
                b3.l(j);
                zjxVar.P.j(ahlp.l(j), new ahlp(zjxVar.k), zjxVar.w);
                return akwa.a;
            case 12:
                zly.b bVar = (zly.b) akvvVar;
                Integer num = (Integer) bVar.a.getTag(R.id.sim_message_index_tag);
                if (num == null) {
                    intValue = -1;
                } else {
                    intValue = num.intValue();
                }
                zly zlyVar = (zly) this.a;
                zlyVar.b(intValue);
                View view = bVar.a;
                if (num != null) {
                    xwr.i(view, zlyVar.c.z().getString(R.string.action_selected));
                }
                zlu zluVar = zlyVar.c;
                zgu zguVar = (zgu) zluVar.fe();
                ActionMode.Callback callback = zlyVar.k;
                View view2 = zluVar.Q;
                view2.getClass();
                zguVar.W(callback, view2, null);
                return akwa.a;
            case 13:
                zrb zrbVar = (zrb) this.a;
                ((mgv) zrbVar.b.b()).e(mgv.c);
                boolean booleanValue = ((Boolean) xcs.k.e()).booleanValue();
                zri zriVar = zrbVar.c;
                if (booleanValue) {
                    ((xcs) zriVar.ap.b()).h(xcr.SEND_BUTTON_ACCURATE);
                }
                zriVar.G = false;
                if (zriVar.ae()) {
                    return akwa.b;
                }
                zriVar.J = true;
                if (zriVar.E) {
                    zriVar.ao();
                } else {
                    if (true != zriVar.ab()) {
                        i = 1;
                    } else {
                        i = 2;
                    }
                    zriVar.am(true, true, i);
                    if (((zxy) zriVar.O.b()).t()) {
                        zriVar.C.ifPresent(new zrf(i2));
                    }
                }
                return akwa.a;
            case 14:
                boolean booleanValue2 = ((Boolean) wsm.a.e()).booleanValue();
                zri zriVar2 = ((zrb) this.a).c;
                if (booleanValue2) {
                    if (zriVar2.E) {
                        return akwa.a;
                    }
                    ((ksi) zriVar2.aj.b()).a();
                    zriVar2.x();
                    if (zriVar2.ag()) {
                        zriVar2.ao();
                        return akwa.a;
                    }
                    return new akwa(new lzd());
                }
                if (zriVar2.Y()) {
                    zriVar2.G = true;
                }
                zriVar2.P(true);
                zriVar2.S();
                if (!zriVar2.E) {
                    zriVar2.ao();
                }
                return akwa.b;
            case 15:
                ((lln) akvvVar).getClass();
                ((zxv) this.a).a();
                return akwa.a;
            case 16:
                ((llh) akvvVar).getClass();
                ((zxv) this.a).a();
                return akwa.a;
            case 17:
                ((zxv) this.a).b();
                return akwa.a;
            case 18:
                ((zxv) this.a).b();
                return akwa.a;
            case 19:
                Object obj2 = this.a;
                aabr.W(((aarm) obj2).k.fe(), new aanh(obj2, (abdf) akvvVar, i3));
                return akwa.a;
            default:
                ((aasb) this.a).e();
                return akwa.a;
        }
    }
}
