package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.home.list.ConversationListItemView;
import com.google.android.apps.messaging.home.select.SelectedConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kxm extends gcl implements kxn {
    public static final /* synthetic */ int d = 0;
    private static final alwo e = alwo.o("ConversationListAdapter");
    private final Activity f;
    private aaig g;
    private ghj h;
    private boolean i;
    private ConversationId j;
    private int k;
    private final armf l;
    private final armf m;
    private final Optional n;
    private final pgk o;
    private final aqws p;
    private final aohs q;

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r3 = r3;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.concurrent.Executor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public kxm(android.app.Activity r2, defpackage.anen r3, defpackage.aohs r4, defpackage.kyg r5, defpackage.aqws r6, defpackage.armf r7, defpackage.armf r8, j$.util.Optional r9, defpackage.pgk r10) {
        /*
            r1 = this;
            if (r3 != 0) goto L17
            java.lang.Object r0 = defpackage.gx.a
            monitor-enter(r0)
            java.util.concurrent.Executor r3 = defpackage.gx.b     // Catch: java.lang.Throwable -> L14
            if (r3 != 0) goto L10
            r3 = 2
            java.util.concurrent.ExecutorService r3 = java.util.concurrent.Executors.newFixedThreadPool(r3)     // Catch: java.lang.Throwable -> L14
            defpackage.gx.b = r3     // Catch: java.lang.Throwable -> L14
        L10:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            java.util.concurrent.Executor r3 = defpackage.gx.b
            goto L17
        L14:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r2
        L17:
            fdx r0 = new fdx
            r0.<init>(r3, r5)
            r1.<init>(r0)
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r3 = defpackage.kyb.a
            r1.j = r3
            r3 = -1
            r1.k = r3
            r1.f = r2
            r1.q = r4
            r1.p = r6
            r1.l = r7
            r1.m = r8
            r1.n = r9
            r1.o = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kxm.<init>(android.app.Activity, anen, aohs, kyg, aqws, armf, armf, j$.util.Optional, pgk):void");
    }

    private static void R(int i) {
        ((alwl) ((alwl) e.i()).h("com/google/android/apps/messaging/home/list/ConversationListAdapter", "logGetItemAdapterDetails", 261, "ConversationListAdapter.java")).B("HomescreenBannerEnabled: %s /n position: %s", lbp.b.e(), i);
    }

    @Override // defpackage.gcl
    public final void F() {
        this.k = G(this.j.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kxn
    public final int G(String str) {
        gcj m = m();
        if (m != null) {
            for (int i = 0; i < m.size(); i++) {
                kzx kzxVar = (kzx) m.get(i);
                if (kzxVar != null && str.equals(kzxVar.a.l.a())) {
                    return i;
                }
            }
            return -1;
        }
        return -1;
    }

    public final oo H(ViewGroup viewGroup, int i, LayoutInflater layoutInflater) {
        int i2;
        if (i == 0) {
            return kyl.D(layoutInflater, viewGroup);
        }
        int i3 = 1;
        if (true != ((ansy) ((pgc) this.o).a.b()).e("bugle.enable_animated_typing_indicator")) {
            i2 = R.layout.conversation_list_item_view_v2;
        } else {
            i2 = R.layout.conversation_list_item_view_v3;
        }
        View inflate = layoutInflater.inflate(i2, viewGroup, false);
        kxl kxlVar = new kxl(inflate);
        aohs.v(inflate, "Conversation List Item");
        this.q.r(inflate, new iix(this, kxlVar, 9, null));
        inflate.setOnLongClickListener(new afoi(this.q, new afoi(this, kxlVar, i3), 2));
        this.n.isPresent();
        return kxlVar;
    }

    public final kzx I(int i) {
        Object obj;
        if (i == -1) {
            ((alwl) ((alwl) e.i()).h("com/google/android/apps/messaging/home/list/ConversationListAdapter", "getItem", 239, "ConversationListAdapter.java")).q("getItem returning null because NO_POSITION was requested.");
            if (((ohh) this.m.b()).a()) {
                ((mbl) this.l.b()).e("Bugle.ConvList.adapterGetItemIsNull.Count", 0);
            }
            R(-1);
            return null;
        }
        fzd fzdVar = this.c;
        gcj gcjVar = fzdVar.e;
        gcj gcjVar2 = fzdVar.d;
        if (gcjVar != null) {
            obj = gcjVar.get(i);
        } else if (gcjVar2 != null) {
            gcjVar2.l(i);
            obj = gcjVar2.get(i);
        } else {
            throw new IndexOutOfBoundsException("Item count is zero, getItem() call is invalid");
        }
        kzx kzxVar = (kzx) obj;
        if (kzxVar == null) {
            ((alwl) ((alwl) e.i()).h("com/google/android/apps/messaging/home/list/ConversationListAdapter", "getItem", 251, "ConversationListAdapter.java")).q("getItem returning null because super returned null");
            ((mbl) this.l.b()).e("Bugle.ConvList.adapterGetItemIsNull.Count", 1);
            R(i);
        }
        return kzxVar;
    }

    @Override // defpackage.kxn
    public final SelectedConversation J(oo ooVar) {
        kzx I = I(ooVar.b());
        if (I == null) {
            return null;
        }
        return lga.L(I);
    }

    @Override // defpackage.kxn
    public final String K(int i) {
        kzx I;
        if (i >= 0 && i < b() && (I = I(i)) != null) {
            return I.a.l.a();
        }
        return null;
    }

    public final void L(boolean z, kxl kxlVar) {
        int b = kxlVar.b();
        if (b == -1) {
            return;
        }
        View view = kxlVar.a;
        kzx I = I(b);
        I.getClass();
        SelectedConversation L = lga.L(I);
        ((alwl) ((alwl) e.g()).h("com/google/android/apps/messaging/home/list/ConversationListAdapter", "onClick", 362, "ConversationListAdapter.java")).E("ConversationId:%s clicked with isRead:%s", I.a.l, I.o);
        kzd kzdVar = I.a;
        aktp.L(new kxf(z, L, view, kzdVar.o, new lrf((Integer) null, kzdVar.q, (String) null)), view);
    }

    @Override // defpackage.kxn
    public final void M(int i, Bundle bundle) {
        kzx I;
        if (!this.i && i >= 0 && i < b() && (I = I(i)) != null) {
            bundle.putString("adapterState_conversationId", I.a.l.a());
            bundle.putLong("adapterState_sortTimestamp", I.a.L);
            bundle.putBoolean("adapterState_pinStatus", I.a.Q);
            if (yig.e() || ier.a() || abal.c()) {
                kzd kzdVar = I.a;
                kzdVar.U.ifPresent(new ksn(kzdVar, bundle, 3, null));
            }
        }
    }

    @Override // defpackage.kxn
    public final void N(boolean z) {
        this.i = z;
    }

    @Override // defpackage.kxn
    public final void O(aaig aaigVar) {
        this.g = aaigVar;
    }

    @Override // defpackage.kxn
    public final void P(ghj ghjVar) {
        this.h = ghjVar;
    }

    @Override // defpackage.kxn
    public final void Q(ConversationId conversationId) {
        int i = this.k;
        this.k = G(conversationId.b());
        this.j = conversationId;
        q(i);
        q(this.k);
    }

    @Override // defpackage.no
    public final int c(int i) {
        if (I(i) == null) {
            return 0;
        }
        return 1;
    }

    @Override // defpackage.no
    public final oo e(ViewGroup viewGroup, int i) {
        return H(viewGroup, i, LayoutInflater.from(viewGroup.getContext()));
    }

    @Override // defpackage.no
    public final void g(oo ooVar, int i) {
        int i2 = alog.d;
        z(ooVar, i, alsx.a);
    }

    @Override // defpackage.no
    public final long gI(int i) {
        kzx I = I(i);
        if (I != null) {
            return I.a.l.a;
        }
        return -i;
    }

    @Override // defpackage.no
    public final void z(oo ooVar, int i, List list) {
        boolean z;
        boolean z2;
        if (ooVar instanceof kyl) {
            ((alwl) e.m().h("com/google/android/apps/messaging/home/list/ConversationListAdapter", "onBindViewHolder", 405, "ConversationListAdapter.java")).q("Showing lottie animation, no need to rebind");
            return;
        }
        kzx I = I(i);
        if (I == null) {
            ((alwl) ((alwl) e.i()).h("com/google/android/apps/messaging/home/list/ConversationListAdapter", "onBindViewHolder", 411, "ConversationListAdapter.java")).r("Skipping onBindViewHolder for position= %s since getItem is null ", i);
            return;
        }
        ConversationListItemView conversationListItemView = (ConversationListItemView) ooVar.a;
        ghj ghjVar = this.h;
        if (ghjVar != null) {
            z = ghjVar.k(String.valueOf(gI(i)));
        } else {
            aaig aaigVar = this.g;
            if (aaigVar != null && aaigVar.e(new ConversationIdType(gI(i)))) {
                z = true;
            } else {
                z = false;
            }
        }
        conversationListItemView.setSelected(z);
        if (i == this.k && lga.q(this.f, this.p.a)) {
            z2 = true;
        } else {
            z2 = false;
        }
        conversationListItemView.setActivated(z2);
        kxy E = conversationListItemView.E();
        if (list.isEmpty()) {
            E.a(I, z);
            return;
        }
        for (Object obj : list) {
            if (obj instanceof kzv) {
                kzv kzvVar = (kzv) obj;
                aluq listIterator = kzvVar.a.listIterator();
                while (listIterator.hasNext()) {
                    kzz kzzVar = (kzz) listIterator.next();
                    kzy kzyVar = (kzy) E.b.get(kzzVar);
                    if (kzyVar == null) {
                        kxy.a.q(String.format("Received a change payload for a nonexistent view part: %s", kzzVar));
                    } else if (kzvVar.b) {
                        kzyVar.b(kzyVar.a(I), z);
                    } else {
                        kzyVar.b(I, z);
                    }
                }
            } else if ((obj instanceof String) && "Selection-Changed".equals(obj)) {
                E.a(I, z);
            }
        }
    }
}
