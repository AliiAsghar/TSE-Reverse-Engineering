package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.action.DeleteMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.MessagePartData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Instant;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mut implements Function {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ mut(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        switch (this.c) {
            case 0:
                return Function$CC.$default$andThen(this, function);
            case 1:
                return Function$CC.$default$andThen(this, function);
            case 2:
                return Function$CC.$default$andThen(this, function);
            case 3:
                return Function$CC.$default$andThen(this, function);
            case 4:
                return Function$CC.$default$andThen(this, function);
            case 5:
                return Function$CC.$default$andThen(this, function);
            case 6:
                return Function$CC.$default$andThen(this, function);
            case 7:
                return Function$CC.$default$andThen(this, function);
            case 8:
                return Function$CC.$default$andThen(this, function);
            case 9:
                return Function$CC.$default$andThen(this, function);
            case 10:
                return Function$CC.$default$andThen(this, function);
            case 11:
                return Function$CC.$default$andThen(this, function);
            case 12:
                return Function$CC.$default$andThen(this, function);
            case 13:
                return Function$CC.$default$andThen(this, function);
            case 14:
                return Function$CC.$default$andThen(this, function);
            case 15:
                return Function$CC.$default$andThen(this, function);
            case 16:
                return Function$CC.$default$andThen(this, function);
            case 17:
                return Function$CC.$default$andThen(this, function);
            case 18:
                return Function$CC.$default$andThen(this, function);
            default:
                return Function$CC.$default$andThen(this, function);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.Object, agpj] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object, java.lang.Iterable] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Object apply;
        byte[] bArr = null;
        int i = 2;
        boolean z = false;
        z = false;
        z = false;
        switch (this.c) {
            case 0:
                int k = ((MessagesTable.BindData) this.a).k();
                Object obj2 = this.b;
                obj2.getClass();
                if (k == 0 || k == 1 ? obj2 == mix.SENDING : !(k != 3 || ((mix) obj2).b())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                syc sycVar = (syc) obj;
                akip.c(sycVar, (BugleConversationId) ((adlx) this.a).f);
                akip.d(sycVar, (mts) this.b);
                return sycVar;
            case 2:
                return ((myj) this.b).a((MessagesTable.BindData) this.a, (MessagePartData) obj, null);
            case 3:
                tbu tbuVar = (tbu) obj;
                tbuVar.n((Uri) this.b);
                tbuVar.f(String.valueOf(((mxr) this.a).d));
                return tbuVar;
            case 4:
                nbr nbrVar = (nbr) obj;
                akrh a = nbrVar.a();
                Object obj3 = this.b;
                Object obj4 = this.a;
                try {
                    akul g = akul.g(((nbq) obj4).b.k(akto.c(new imi(nbrVar, obj3, 7, bArr)), ((nbq) obj4).a));
                    a.b(g);
                    a.close();
                    return g;
                } catch (Throwable th) {
                    try {
                        a.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 5:
                Object obj5 = this.a;
                Object obj6 = this.b;
                ncx ncxVar = new ncx(obj6, (MessageCoreData) obj, obj5, i);
                ncz nczVar = (ncz) obj6;
                return akul.g(nczVar.j.k(ncxVar, nczVar.e));
            case 6:
                tdx tdxVar = (tdx) obj;
                if (tdxVar.h() < ((prk) this.b).n.f().toEpochMilli()) {
                    Object obj7 = this.a;
                    xyo c = prk.a.c();
                    c.H("Business info in database has expired");
                    c.z("RBM bot id", obj7);
                    c.G(tdxVar.h());
                    c.q();
                    return true;
                }
                return false;
            case 7:
                ptx ptxVar = (ptx) obj;
                ptxVar.b((String) this.a);
                ptxVar.U(new agmd("rcs_remote_capabilities_cache.last_refresh_timestamp", 10, Long.valueOf(uzz.k((Instant) this.b))));
                return ptxVar;
            case 8:
                xze xzeVar = pur.a;
                return ((nej) obj).e((qei) this.a, (pto) this.b);
            case 9:
                alwo alwoVar = pus.a;
                return ((nej) obj).e((qei) this.a, (pto) this.b);
            case 10:
                return ((nej) obj).e((qei) this.a, (pto) this.b);
            case 11:
                qak qakVar = (qak) obj;
                qakVar.c((pyz) this.b);
                qakVar.b((qam) this.a);
                return qakVar;
            case 12:
                smr smrVar = (smr) obj;
                if (smrVar == null) {
                    return null;
                }
                return ((qcb) this.b).a((qei) this.a, smrVar);
            case 13:
                return ((qcb) this.b).a((qei) this.a, (smr) obj);
            case 14:
                return ((qcb) this.b).a((qei) this.a, (smr) obj);
            case 15:
                return ((qcu) this.a).j((qei) obj, (qbs) this.b);
            case 16:
                return ((qcu) this.a).j((qei) obj, (qbs) this.b);
            case 17:
                qsy qsyVar = (qsy) obj;
                Object obj8 = this.a;
                obj8.getClass();
                Object obj9 = this.b;
                obj9.getClass();
                qsyVar.U(new agmd("destinations.address", 1, obj8));
                qsyVar.U(new agoi("destinations.address_type", 1, Integer.valueOf(((qsn) obj9).ordinal())));
                return qsyVar;
            case 18:
                qvj qvjVar = (qvj) obj;
                int i2 = qwd.a;
                Object obj10 = this.b;
                obj10.getClass();
                Function[] functionArr = {new qsb(obj10, 12), new qsb(this.a, 13)};
                qvj[] qvjVarArr = new qvj[2];
                for (int i3 = 0; i3 < 2; i3++) {
                    apply = functionArr[i3].apply(new qvj());
                    qvjVarArr[i3] = (qvj) apply;
                }
                qvjVar.V(qvjVarArr);
                return qvjVar;
            default:
                syc sycVar2 = (syc) obj;
                Parcelable.Creator<Action<Bundle>> creator = DeleteMessageAction.CREATOR;
                sycVar2.t(this.b);
                sycVar2.o(this.a);
                return sycVar2;
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.c) {
            case 0:
                return Function$CC.$default$compose(this, function);
            case 1:
                return Function$CC.$default$compose(this, function);
            case 2:
                return Function$CC.$default$compose(this, function);
            case 3:
                return Function$CC.$default$compose(this, function);
            case 4:
                return Function$CC.$default$compose(this, function);
            case 5:
                return Function$CC.$default$compose(this, function);
            case 6:
                return Function$CC.$default$compose(this, function);
            case 7:
                return Function$CC.$default$compose(this, function);
            case 8:
                return Function$CC.$default$compose(this, function);
            case 9:
                return Function$CC.$default$compose(this, function);
            case 10:
                return Function$CC.$default$compose(this, function);
            case 11:
                return Function$CC.$default$compose(this, function);
            case 12:
                return Function$CC.$default$compose(this, function);
            case 13:
                return Function$CC.$default$compose(this, function);
            case 14:
                return Function$CC.$default$compose(this, function);
            case 15:
                return Function$CC.$default$compose(this, function);
            case 16:
                return Function$CC.$default$compose(this, function);
            case 17:
                return Function$CC.$default$compose(this, function);
            case 18:
                return Function$CC.$default$compose(this, function);
            default:
                return Function$CC.$default$compose(this, function);
        }
    }

    public /* synthetic */ mut(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
