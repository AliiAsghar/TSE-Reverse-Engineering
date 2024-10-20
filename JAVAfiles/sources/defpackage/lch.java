package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.InsertNewMessageAction;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lch implements Function {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ lch(Object obj, boolean z, int i) {
        this.c = i;
        this.b = obj;
        this.a = z;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return Function$CC.$default$andThen(this, function);
                            }
                            return Function$CC.$default$andThen(this, function);
                        }
                        return Function$CC.$default$andThen(this, function);
                    }
                    return Function$CC.$default$andThen(this, function);
                }
                return Function$CC.$default$andThen(this, function);
            }
            return Function$CC.$default$andThen(this, function);
        }
        return Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, agpj] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, agpj] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.c;
        if (i != 0) {
            final boolean z = true;
            boolean z2 = true;
            if (i != 1) {
                int i2 = 2;
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                String str = (String) obj;
                                boolean z3 = this.a;
                                Object obj2 = this.b;
                                if (!z3 || !((adjc) ((vhm) obj2).h.b()).v(str)) {
                                    z = false;
                                }
                                xyo c = vhm.a.c();
                                c.H("Updating registration");
                                c.w("number", str, 2);
                                c.A("allowReregister", z);
                                c.q();
                                vhm vhmVar = (vhm) obj2;
                                return ((vbs) vhmVar.e.b()).c(str).i(new ancs() { // from class: vhl
                                    @Override // defpackage.ancs
                                    public final ListenableFuture a(Object obj3) {
                                        vbq vbqVar = (vbq) obj3;
                                        if (z) {
                                            return vbqVar.l(vaz.FORCE_REFRESH);
                                        }
                                        return vbqVar.l(vaz.REFRESH_WITHOUT_REREGISTER);
                                    }
                                }, vhmVar.d).h(new vej(18), andi.a).e(Throwable.class, new uvz(obj2, str, 15), andi.a);
                            }
                            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
                            boolean z4 = this.a;
                            Object obj3 = this.b;
                            if (qta.r()) {
                                return wfh.x(((rrz) obj3).d(bindData, z4));
                            }
                            return ((rrz) obj3).d(bindData, z4);
                        }
                        ParticipantsTable.BindData bindData2 = (ParticipantsTable.BindData) obj;
                        boolean z5 = this.a;
                        Object obj4 = this.b;
                        if (z5) {
                            return ((InsertNewMessageAction) obj4).e.q(bindData2);
                        }
                        return ((InsertNewMessageAction) obj4).e.s(bindData2);
                    }
                    boolean z6 = this.a;
                    Object obj5 = this.b;
                    mti mtiVar = new mti(obj5, obj, z6, (int) (z2 ? 1 : 0));
                    mkt mktVar = (mkt) obj5;
                    return aktp.ai(mtiVar, mktVar.d).i(new led(obj5, z6, i2), mktVar.e);
                }
                lcy lcyVar = (lcy) obj;
                lcyVar.W(lga.t(this.a));
                lcyVar.W(this.b);
                return lcyVar;
            }
            return ((qnu) ((ijw) this.b).g.b()).d(albo.ag(((msh) obj).o(this.a)));
        }
        lcy lcyVar2 = (lcy) obj;
        lcyVar2.W(lga.t(this.a));
        lcyVar2.W(this.b);
        return lcyVar2;
    }

    public final /* synthetic */ Function compose(Function function) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return Function$CC.$default$compose(this, function);
                            }
                            return Function$CC.$default$compose(this, function);
                        }
                        return Function$CC.$default$compose(this, function);
                    }
                    return Function$CC.$default$compose(this, function);
                }
                return Function$CC.$default$compose(this, function);
            }
            return Function$CC.$default$compose(this, function);
        }
        return Function$CC.$default$compose(this, function);
    }

    public /* synthetic */ lch(boolean z, agpj agpjVar, int i) {
        this.c = i;
        this.a = z;
        this.b = agpjVar;
    }
}
