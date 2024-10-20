package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.SetupExpressiveStickersAction;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adsc implements andy {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public adsc(adsd adsdVar, adrc adrcVar, int i) {
        this.c = i;
        this.a = adrcVar;
        this.b = adsdVar;
    }

    @Override // defpackage.andy
    public final void a(Throwable th) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                advr.i(th, "Client error retrieving business info, rejecting session.", new Object[0]);
                ((adon) this.a).j();
                ((adrc) this.a).aO(adra.BUSINESS_INFO_CLIENT_ERROR);
                return;
            }
            SetupExpressiveStickersAction.a.n("Failed to get favorite sticker pack.", th);
            return;
        }
        advr.i(th, "Client error retrieving business info, rejecting session.", new Object[0]);
        ((adon) this.a).j();
        ((adrc) this.a).aO(adra.BUSINESS_INFO_CLIENT_ERROR);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Object, anen] */
    @Override // defpackage.andy
    public final /* synthetic */ void b(Object obj) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    ?? r0 = this.b;
                    ((andc) this.a).b.a.x((AutoCloseable) obj, r0);
                    return;
                }
                acmz acmzVar = (acmz) obj;
                if (acmzVar == acmz.INFO_LOCALLY_AVAILABLE) {
                    Object obj2 = this.b;
                    ((adsd) obj2).b.t((adrt) this.a);
                    return;
                } else {
                    if (acmzVar == acmz.SERVER_ERROR) {
                        advr.q("Server error retrieving business info, rejecting session.", new Object[0]);
                        ((adon) this.a).j();
                        ((adrc) this.a).aO(adra.BUSINESS_INFO_SERVER_ERROR);
                        return;
                    }
                    advr.q("Client error retrieving business info, rejecting session.", new Object[0]);
                    ((adon) this.a).j();
                    ((adrc) this.a).aO(adra.BUSINESS_INFO_CLIENT_ERROR);
                    return;
                }
            }
            List list = (List) obj;
            if (list != null && !list.isEmpty()) {
                return;
            }
            Object obj3 = this.b;
            apwt apwtVar = ((SetupExpressiveStickersAction) this.a).e;
            apax apaxVar = ((aouz) obj3).b;
            aiqj aiqjVar = (aiqj) apwtVar.b();
            aiqjVar.b.submit(new ahes(aiqjVar, apaxVar, 7));
            return;
        }
        acmz acmzVar2 = (acmz) obj;
        if (acmzVar2 == acmz.INFO_LOCALLY_AVAILABLE) {
            ((adsd) this.b).b.v((adrv) this.a);
        } else {
            if (acmzVar2 == acmz.SERVER_ERROR) {
                advr.q("Server error retrieving business info, rejecting session.", new Object[0]);
                ((adon) this.a).j();
                ((adrc) this.a).aO(adra.BUSINESS_INFO_SERVER_ERROR);
                return;
            }
            advr.q("Client error retrieving business info, rejecting session.", new Object[0]);
            ((adon) this.a).j();
            ((adrc) this.a).aO(adra.BUSINESS_INFO_CLIENT_ERROR);
        }
    }

    public adsc(andc andcVar, Executor executor, int i) {
        this.c = i;
        this.a = andcVar;
        this.b = executor;
    }

    public adsc(SetupExpressiveStickersAction setupExpressiveStickersAction, aouz aouzVar, int i) {
        this.c = i;
        this.b = aouzVar;
        this.a = setupExpressiveStickersAction;
    }
}
