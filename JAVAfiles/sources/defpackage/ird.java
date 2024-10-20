package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ird implements emx {
    public final Optional a;
    public final irh b;
    public final irr c;
    public final irb d;
    public final irc e;
    public final zpp f;
    private final itr g;

    /* JADX WARN: Type inference failed for: r1v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v17, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [armf, java.lang.Object] */
    public ird(ifq ifqVar, xnv xnvVar, ifb ifbVar, ifb ifbVar2, armf armfVar, Optional optional, Context context, LinearLayoutManager linearLayoutManager, aack aackVar, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        int i;
        zpp zppVar = (zpp) armfVar.b();
        this.f = zppVar;
        Context context2 = (Context) ifbVar.b.b();
        context2.getClass();
        xnv xnvVar2 = (xnv) ifbVar.a.b();
        xnvVar2.getClass();
        irc ircVar = new irc(context2, xnvVar2, aackVar);
        this.e = ircVar;
        zppVar.F(ircVar, new int[]{R.layout.conversation_compose_message_placeholder});
        xnv xnvVar3 = (xnv) ifbVar2.a.b();
        xnvVar3.getClass();
        irh irhVar = new irh(xnvVar3, (ahmn) ifbVar2.b.b(), aackVar);
        this.b = irhVar;
        zppVar.F(irhVar, new int[]{R.layout.conversation_suggestions_view});
        itr itrVar = new itr(linearLayoutManager, aackVar, xnvVar);
        this.g = itrVar;
        zppVar.F(itrVar, new int[]{R.layout.conversation_typing_indicator});
        if (((Boolean) wsm.a.e()).booleanValue()) {
            Optional map = optional.map(new idc(19));
            this.a = map;
            map.ifPresent(new ibo(this, 20));
        } else {
            this.a = Optional.empty();
        }
        irr irrVar = new irr((xnv) ifqVar.b.b(), (iyh) ifqVar.e.b(), (ahmn) ifqVar.c.b(), (rae) ifqVar.d.b(), context, aackVar, onClickListener, onLongClickListener, (ifb) ifqVar.a);
        iyh iyhVar = (iyh) ifqVar.e.b();
        aiut.c();
        iyhVar.c.add(irrVar);
        irrVar.d = new hk(rry.class, new qy(irrVar));
        this.c = irrVar;
        if (true != ((Boolean) ((utz) aaem.a.get()).e()).booleanValue()) {
            i = R.layout.conversation_rich_card_view;
        } else {
            i = R.layout.conversation_rich_card_view2;
        }
        zppVar.F(irrVar, new int[]{R.layout.conversation_message_view, R.layout.conversation_toolstone, R.layout.conversation_tombstone, i, R.layout.conversation_rich_card_carousel_view});
        irb irbVar = new irb(aackVar, xnvVar);
        this.d = irbVar;
        zppVar.F(irbVar, new int[]{R.layout.conversation_start_row_view});
        zppVar.A(true);
    }

    public final int a(MessageIdType messageIdType) {
        zpp zppVar = this.f;
        irr irrVar = this.c;
        return irrVar.F(messageIdType) + zppVar.m(irrVar);
    }

    public final akul b(MessageIdType messageIdType) {
        return this.c.H(messageIdType);
    }

    public final akul c(int i) {
        boolean z;
        akrh e;
        akul akulVar;
        akul akulVar2;
        itm itmVar = this.c.f;
        itmVar.getClass();
        akrh e2 = aktp.e("MessageListWindowManager#loadMoreIfNeeded");
        try {
            xyl.g();
            int i2 = 2;
            if (i < itmVar.f.g / 2) {
                z = true;
            } else {
                z = false;
            }
            int i3 = 3;
            xzb.d("BugleDataModel", "isPositionCloserToBottom: %s, currentPositionInMessageSortedList: %d, messages size: %d", Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(itmVar.f.g));
            if (z) {
                xzb.c("BugleDataModel", a.bV(i, "loadAfterIfNeeded starts at "));
                e = aktp.e("MessageListWindowManager#loadAfterIfNeeded");
                try {
                    xyl.g();
                    akulVar2 = aktp.ag(false);
                    if (itmVar.i.get()) {
                        xzb.c("BugleDataModel", "Bailing for loadAfterIfNeeded because the object is destroyed.");
                    } else if (!itmVar.w) {
                        xzb.c("BugleDataModel", "Bailing for loadAfterIfNeeded because there is no more data to be loaded.");
                    } else {
                        akul akulVar3 = itmVar.x;
                        if (akulVar3 != null && !akulVar3.isDone()) {
                            xzb.c("BugleDataModel", "We are already loading more after, returning the existing future.");
                            akulVar2 = itmVar.x;
                        } else if (i > itmVar.q) {
                            xzb.c("BugleDataModel", "We have enough messages loaded after, no need to load more.");
                        } else {
                            rry h = itmVar.h();
                            if (h == null) {
                                xzb.c("BugleDataModel", "We don't have a reference message to load more, bailing early.");
                            } else {
                                rwe rweVar = (rwe) itmVar.n.b();
                                int i4 = itmVar.r;
                                aiut.c();
                                itmVar.x = aktp.ai(akto.k(rweVar.d(new mjw(rweVar, h, i4, i2))), rweVar.e()).h(new ijq(itmVar, h, i3), new sp(11));
                                akulVar2 = itmVar.x;
                            }
                        }
                    }
                    e.close();
                    e2.b(akulVar2);
                } finally {
                }
            } else {
                xzb.c("BugleDataModel", a.bV(i, "loadBeforeIfNeeded starts at "));
                e = aktp.e("MessageListWindowManager#loadBeforeIfNeeded");
                try {
                    xyl.g();
                    akul ag = aktp.ag(false);
                    if (itmVar.i.get()) {
                        xzb.c("BugleDataModel", "Bailing for loadBeforeIfNeeded because the object is destroyed.");
                    } else if (!itmVar.u) {
                        xzb.c("BugleDataModel", "Bailing for loadBeforeIfNeeded because there is no more data to be loaded.");
                    } else {
                        akul akulVar4 = itmVar.v;
                        if (akulVar4 != null && !akulVar4.isDone()) {
                            xzb.c("BugleDataModel", "loadBeforeFuture is Done. We are already loading more before.");
                            akulVar = itmVar.v;
                        } else if (i < itmVar.f.g - itmVar.q) {
                            xzb.c("BugleDataModel", "We are have enough messages loaded before, no need to load more.");
                        } else {
                            rry i5 = itmVar.i();
                            if (i5 == null) {
                                xzb.c("BugleDataModel", "We don't have a reference message to load more, bailing early.");
                            } else {
                                rwe rweVar2 = (rwe) itmVar.n.b();
                                int i6 = itmVar.r;
                                aiut.c();
                                itmVar.v = aktp.ai(akto.k(rweVar2.d(new mjw(rweVar2, i5, i6, i3))), rweVar2.e()).h(new ijq(itmVar, i5, 4), new sp(11));
                                akulVar = itmVar.v;
                                e.b(akulVar);
                            }
                        }
                        e.close();
                        akulVar2 = akulVar;
                        e2.b(akulVar2);
                    }
                    e.close();
                    akulVar2 = ag;
                    e2.b(akulVar2);
                } finally {
                }
            }
            e2.close();
            return akul.g(akulVar2);
        } catch (Throwable th) {
            try {
                e2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.emx
    public final void gF(enm enmVar) {
        irr irrVar = this.c;
        itm itmVar = irrVar.f;
        if (itmVar != null) {
            itmVar.m();
            gpx gpxVar = itmVar.y;
            if (!((Optional) ((AtomicReference) gpxVar.d).getAndSet(Optional.empty())).isEmpty()) {
                ((Context) gpxVar.b).getContentResolver().unregisterContentObserver((ContentObserver) gpxVar.c);
            }
            if (!itmVar.i.getAndSet(true)) {
                Context context = itmVar.b;
                context.getContentResolver().unregisterContentObserver(itmVar.d);
                itmVar.k.i(itmVar.j);
            }
            irrVar.f = null;
        }
        iyh iyhVar = irrVar.i;
        aiut.c();
        iyhVar.c.remove(irrVar);
    }

    public final void j(boolean z, boolean z2) {
        irr irrVar = this.c;
        if (irrVar.g != z) {
            irrVar.g = z;
            if (z2) {
                irrVar.p();
            }
        }
    }

    public final void k(int i) {
        irc ircVar = this.e;
        if (ircVar.d != i && ircVar.c) {
            ircVar.d = i;
            ircVar.q(0);
            ircVar.e.s();
        }
    }

    public final void l(List list) {
        xyl.g();
        xyl.l(list);
        itr itrVar = this.g;
        if (itrVar.f.size() != list.size() || !itrVar.f.containsAll(list)) {
            itrVar.f = list;
            if (itrVar.f.isEmpty() && itrVar.c) {
                itrVar.c = false;
                itrVar.y(0);
            } else {
                if (!itrVar.f.isEmpty() && !itrVar.c) {
                    itrVar.c = true;
                    itrVar.s(0);
                    if (itrVar.d.K() == 0) {
                        itrVar.d.ac(0);
                        return;
                    }
                    return;
                }
                itrVar.q(0);
            }
        }
    }

    @Override // defpackage.emx
    public final /* synthetic */ void d(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void f(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void gG(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void h(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void i(enm enmVar) {
    }
}
