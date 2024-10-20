package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lhz extends arrp implements arqg {
    final /* synthetic */ int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lhz(int i, agjg agjgVar, byk bykVar, aggy aggyVar, int i2) {
        super(0);
        this.e = i2;
        this.a = i;
        this.d = agjgVar;
        this.c = bykVar;
        this.b = aggyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [miu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [byk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        aewe z;
        int i = this.e;
        boolean z2 = false;
        if (i != 0) {
            ResolvedRecipient resolvedRecipient = null;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                this.c.d(this.a);
                                aozy createBuilder = aggp.a.createBuilder();
                                createBuilder.getClass();
                                Object obj = this.b;
                                obj.getClass();
                                if (!createBuilder.b.isMutable()) {
                                    createBuilder.u();
                                }
                                Object obj2 = this.d;
                                aggp aggpVar = (aggp) createBuilder.b;
                                aggpVar.c = (aggy) obj;
                                aggpVar.b |= 1;
                                ((agjg) obj2).h.a(agiz.H(createBuilder));
                                return arnb.a;
                            }
                            qjh.l(this.d, null, new mdi((avc) this.c, this.a, (List) this.b, (arpe) null, 13), 3);
                            return arnb.a;
                        }
                        int i2 = this.a;
                        Object obj3 = this.d;
                        Object obj4 = this.c;
                        zwm zwmVar = (zwm) this.b;
                        qjh.l(zwmVar.c, zwmVar.b, new mgq(zwmVar, (xxn) obj4, (amfe) obj3, i2, (arpe) null, 4), 2);
                        return arnb.a;
                    }
                    if (((osd) ((zas) this.b).d.b()).a()) {
                        ico icoVar = (ico) ((zas) this.b).e.b();
                        Object obj5 = this.c;
                        obj5.getClass();
                        zem zemVar = (zem) this.d;
                        if (zemVar.d.e()) {
                            obj5.getClass();
                            if (zemVar.b((mkh) obj5)) {
                                z2 = true;
                            }
                        }
                        z = icoVar.f((mkh) obj5, z2);
                    } else {
                        Object obj6 = this.c;
                        obj6.getClass();
                        zem zemVar2 = (zem) this.d;
                        if (zemVar2.d.e()) {
                            obj6.getClass();
                            if (zemVar2.b((mkh) obj6)) {
                                z2 = true;
                            }
                        }
                        z = hwr.z((mkh) obj6, z2, 2);
                    }
                    aewe aeweVar = z;
                    Object obj7 = this.c;
                    Object obj8 = this.b;
                    obj7.getClass();
                    mkh mkhVar = (mkh) obj7;
                    return new aeqn(aeweVar, mkhVar.d, ((yyz) ((zas) obj8).b).j(mkhVar, this.a, ((zem) this.d).d, true), null, 8);
                }
                ((AtomicBoolean) this.b).set(true);
                return ((xhz) ((reb) this.c).D.b()).b((msh) ((arsb) this.d).a, this.a, !((nwo) ((reb) this.c).O.b()).a());
            }
            ConversationId c = this.b.c();
            c.getClass();
            int i3 = this.a;
            Object obj9 = this.d;
            if (i3 == 3) {
                if (obj9 != 0) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            } else if (obj9 != 0) {
                resolvedRecipient = obj9;
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
            jdg jdgVar = (jdg) this.c;
            jdgVar.e.g(new iha(resolvedRecipient, c, i3, jdgVar.d));
            return arnb.a;
        }
        ljn.d((ljn) ((mlt) this.b).d.b(), 4, this.a, 0, 4);
        ((lgd) this.c).a(lga.a((mmj) this.d));
        return arnb.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lhz(arwe arweVar, avc avcVar, int i, List list, int i2) {
        super(0);
        this.e = i2;
        this.d = arweVar;
        this.c = avcVar;
        this.a = i;
        this.b = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lhz(Object obj, Object obj2, Object obj3, int i, int i2) {
        super(0);
        this.e = i2;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lhz(jdg jdgVar, miu miuVar, int i, ResolvedRecipient resolvedRecipient, int i2) {
        super(0);
        this.e = i2;
        this.c = jdgVar;
        this.b = miuVar;
        this.a = i;
        this.d = resolvedRecipient;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lhz(mlt mltVar, int i, lgd lgdVar, mmj mmjVar, int i2) {
        super(0);
        this.e = i2;
        this.b = mltVar;
        this.a = i;
        this.c = lgdVar;
        this.d = mmjVar;
    }
}
