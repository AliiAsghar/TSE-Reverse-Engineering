package defpackage;

import android.view.ActionMode;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import com.google.android.apps.messaging.ui.conversation.compose.Compose2oRootView;
import com.google.android.ims.rcsservice.contacts.ContactsServiceResult;
import com.google.android.rcs.client.contacts.ContactsService;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ilf implements Consumer {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ilf(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, apbt] */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.view.Menu, java.lang.Object] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        ContactsServiceResult refreshCapabilities;
        int i = 5;
        int i2 = 3;
        int i3 = 0;
        int i4 = 1;
        switch (this.c) {
            case 0:
                ilw ilwVar = (ilw) this.a;
                ilwVar.k.x().getClass();
                ilwVar.l.j(new ahlp(((abdi) obj).a()), new ahlp(this.b), ilwVar.J);
                return;
            case 1:
                msh mshVar = (msh) obj;
                Object obj2 = this.b;
                Object obj3 = this.a;
                try {
                    ContactsService contactsService = ((ikc) obj3).e;
                    int p = ((smr) obj2).p();
                    String g = mshVar.g();
                    if (g == null) {
                        refreshCapabilities = new ContactsServiceResult(11, "Remote User ID is null");
                    } else if (p == 2) {
                        refreshCapabilities = contactsService.forceRefreshCapabilities(g);
                    } else {
                        refreshCapabilities = contactsService.refreshCapabilities(mshVar.g());
                    }
                    xyo a = ((ikc) obj3).b.a();
                    a.H("doRefresh");
                    a.z("contactsServiceResult", refreshCapabilities);
                    a.q();
                    if (refreshCapabilities != null && refreshCapabilities.succeeded()) {
                        return;
                    }
                    xyo e = ((ikc) obj3).b.e();
                    e.H("post of Rcs capabilities refresh request failed");
                    e.z("contactsServiceResult", refreshCapabilities);
                    e.q();
                    return;
                } catch (ajny e2) {
                    ((ikc) obj3).b.r("Post of RCS capabilities refresh request failed", e2);
                    return;
                }
            case 2:
                utz utzVar = itb.a;
                Collection.EL.stream(((iqw) obj).a()).forEach(new ilf(this.a, this.b, i2));
                return;
            case 3:
                utz utzVar2 = itb.a;
                MenuItem findItem = this.a.findItem(((iqv) obj).a());
                if (findItem != null) {
                    ((ArrayList) this.b).add(findItem);
                    return;
                }
                return;
            case 4:
                ActionMode actionMode = (ActionMode) obj;
                actionMode.setTitle((CharSequence) this.b);
                itb itbVar = (itb) this.a;
                itbVar.aL.clear();
                itbVar.ae.onCreateActionMode(actionMode, itbVar.aL);
                return;
            case 5:
                MessagePartCoreData messagePartCoreData = (MessagePartCoreData) obj;
                ((mci) ((ixd) this.a).aY.b()).b(aauk.a(messagePartCoreData), ((rsr) this.b).r(messagePartCoreData));
                return;
            case 6:
                ComposeMessageView composeMessageView = (ComposeMessageView) obj;
                Object obj4 = this.b;
                alvi alviVar = ixd.a;
                ((rsr) composeMessageView.E().c.y.a()).w = lua.a((MessageIdType) obj4);
                composeMessageView.E().ab();
                composeMessageView.E().I(true);
                return;
            case 7:
                ComposeMessageView composeMessageView2 = (ComposeMessageView) obj;
                if (composeMessageView2 != null) {
                    Object obj5 = this.b;
                    Object obj6 = this.a;
                    rrl rrlVar = (rrl) obj5;
                    ixd ixdVar = (ixd) obj6;
                    composeMessageView2.E().A(ixdVar.U.a(rrlVar.c, rrlVar.s()), ixdVar.A());
                    return;
                }
                return;
            case 8:
                lyq lyqVar = (lyq) this.b;
                lyqVar.a();
                ahlp ahlpVar = new ahlp(((wtg) obj).e());
                ahlp ahlpVar2 = new ahlp(lyqVar.a());
                ixd ixdVar2 = (ixd) this.a;
                ixdVar2.ay.j(ahlpVar, ahlpVar2, ixdVar2.n);
                return;
            case 9:
                ixd ixdVar3 = (ixd) this.a;
                if (ixdVar3.cl != null) {
                    ixdVar3.bX.y(this.b);
                    return;
                }
                return;
            case 10:
                ((ixd) this.a).bX.y(this.b);
                return;
            case 11:
                ((ixd) this.b).bV = (ComposeMessageView) ((ViewStub) this.a).inflate();
                return;
            case 12:
                ((ixd) this.b).bV = (ComposeMessageView) this.a;
                return;
            case 13:
                ?? r0 = this.b;
                String str = ((lym) r0).b;
                ahlp ahlpVar3 = new ahlp(((wtg) obj).c());
                ixd ixdVar4 = (ixd) this.a;
                ixdVar4.ay.j(ahlpVar3, ahlp.m(r0), ixdVar4.m);
                return;
            case 14:
                zrb E = ((ComposeMessageView) obj).E();
                ixd ixdVar5 = (ixd) this.a;
                ikl iklVar = ((rrl) ixdVar5.ca.a()).b;
                zri zriVar = E.c;
                ((rsr) zriVar.y.a()).K(iklVar, (ammc) this.b);
                zriVar.ak((rsr) zriVar.y.a());
                zriVar.R("onDraftRcsConditionsUpdated");
                if (ixdVar5.x && ixdVar5.y) {
                    ixdVar5.aj();
                    return;
                }
                return;
            case 15:
                ComposeMessageView composeMessageView3 = (ComposeMessageView) obj;
                Object obj7 = this.a;
                Object obj8 = this.b;
                iqp iqpVar = new iqp(obj8, (Object) composeMessageView3, obj7, 2, (byte[]) null);
                ixd ixdVar6 = (ixd) obj8;
                ixdVar6.R(null, iqpVar);
                composeMessageView3.E().M(new rre(ixdVar6.ca));
                ixdVar6.cl = composeMessageView3.E().s();
                return;
            case 16:
                ivf ivfVar = new ivf(i3);
                Compose2oRootView compose2oRootView = (Compose2oRootView) this.b;
                compose2oRootView.setOnApplyWindowInsetsListener(ivfVar);
                ViewTreeObserver viewTreeObserver = compose2oRootView.getViewTreeObserver();
                Object obj9 = this.a;
                ixd ixdVar7 = (ixd) obj9;
                if (ixdVar7.cw == null) {
                    ixdVar7.cw = new ja(obj9, 5, null);
                }
                viewTreeObserver.addOnGlobalLayoutListener(ixdVar7.cw);
                return;
            case 17:
                rsr rsrVar = (rsr) ((ComposeMessageView) obj).E().s().a();
                List A = rsrVar.A(((zoi) this.b).a());
                Collection.EL.stream(A).forEach(new ilf(this.a, rsrVar, i));
                rsrVar.aj(A);
                return;
            case 18:
                aabp aabpVar = (aabp) obj;
                alvi alviVar2 = ixd.a;
                if (aabpVar != null && aabpVar.m) {
                    WindowInsets windowInsets = (WindowInsets) this.b;
                    ((View) this.a).setPadding(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), 0);
                    return;
                }
                return;
            case 19:
                agxw agxwVar = (agxw) obj;
                int i5 = agxwVar.n().a;
                agxw agxwVar2 = (agxw) this.b;
                int i6 = agxwVar2.n().a;
                String o = agxwVar.o();
                String o2 = agxwVar2.o();
                if (i5 != i6) {
                    Object obj10 = this.a;
                    if (o.equals("google") && o2.equals("google")) {
                        izc izcVar = (izc) ((kpv) obj10).b.b();
                        aozy createBuilder = amko.a.createBuilder();
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        amko amkoVar = (amko) createBuilder.b;
                        amkoVar.c = 1;
                        amkoVar.b |= 1;
                        izcVar.e((amko) createBuilder.s());
                        return;
                    }
                    if (o.equals("pseudonymous") && o2.equals("google")) {
                        izc izcVar2 = (izc) ((kpv) obj10).b.b();
                        aozy createBuilder2 = amko.a.createBuilder();
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        amko amkoVar2 = (amko) createBuilder2.b;
                        amkoVar2.c = 2;
                        amkoVar2.b |= 1;
                        izcVar2.e((amko) createBuilder2.s());
                        return;
                    }
                    if (o.equals("google") && o2.equals("pseudonymous")) {
                        izc izcVar3 = (izc) ((kpv) obj10).b.b();
                        aozy createBuilder3 = amko.a.createBuilder();
                        if (!createBuilder3.b.isMutable()) {
                            createBuilder3.u();
                        }
                        amko amkoVar3 = (amko) createBuilder3.b;
                        amkoVar3.c = 3;
                        amkoVar3.b |= 1;
                        izcVar3.e((amko) createBuilder3.s());
                        return;
                    }
                    return;
                }
                return;
            default:
                String o3 = ((agxw) obj).o();
                String o4 = ((agxw) this.b).o();
                if ("pseudonymous".equals(o3) && "google".equals(o4)) {
                    Object obj11 = this.a;
                    qiu.h(aktp.ah(new kut(obj11, i4), (Executor) ((kpx) obj11).c.b()));
                    return;
                }
                return;
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

    public /* synthetic */ ilf(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
