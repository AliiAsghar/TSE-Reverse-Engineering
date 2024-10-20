package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ptm implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ptm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        switch (this.b) {
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
            case 19:
                return Function$CC.$default$andThen(this, function);
            default:
                return Function$CC.$default$andThen(this, function);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [puu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v23, types: [agnw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [msk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [msk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [agnw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [agnw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.b) {
            case 0:
                ptx ptxVar = (ptx) obj;
                ptxVar.b((String) this.a);
                return ptxVar;
            case 1:
                ptx ptxVar2 = (ptx) obj;
                ptxVar2.U(new agmf("rcs_remote_capabilities_cache.msisdn", 3, ptx.X(((alor) this.a).keySet()), false));
                return ptxVar2;
            case 2:
                return Long.valueOf(this.a.O("rcs_remote_capabilities_cache", (ContentValues) obj));
            case 3:
                return Long.valueOf(this.a.Q("rcs_remote_capabilities_cache", (ContentValues) obj, 4));
            case 4:
                nej nejVar = (nej) obj;
                alwo alwoVar = pus.a;
                ArrayList arrayList = new ArrayList(nejVar.c.size());
                Iterator it = nejVar.c.iterator();
                while (true) {
                    ?? r2 = this.a;
                    if (it.hasNext()) {
                        arrayList.add(((ptg) it.next()).c(r2));
                    } else {
                        return aktp.am(arrayList).h(new mzn(nejVar, r2, 13, null), nejVar.b);
                    }
                }
            case 5:
                return this.a.b((qei) obj);
            case 6:
                return ((pvg) this.a).c((qei) obj);
            case 7:
                return this.a.a(obj);
            case 8:
                qak qakVar = (qak) obj;
                qakVar.c((pyz) this.a);
                return qakVar;
            case 9:
                return Long.valueOf(this.a.O("file_processing", (ContentValues) obj));
            case 10:
                msh mshVar = (msh) obj;
                psq psqVar = (psq) ((qbc) this.a).a.b();
                String m = mshVar.m();
                m.getClass();
                return psqVar.e(mshVar, m);
            case 11:
                return this.a.q((ParticipantsTable.BindData) obj);
            case 12:
                return this.a.q((ParticipantsTable.BindData) obj);
            case 13:
                msh mshVar2 = (msh) obj;
                psq psqVar2 = (psq) ((qbk) this.a).a.b();
                String m2 = mshVar2.m();
                m2.getClass();
                return psqVar2.e(mshVar2, m2);
            case 14:
                String str = (String) obj;
                Object obj2 = this.a;
                if (str == null) {
                    return Optional.empty();
                }
                try {
                    return Optional.of(((psq) ((qbl) obj2).b.b()).a(str, false));
                } catch (psr unused) {
                    alvw i = qbl.a.i();
                    i.X(alwp.a, "BugleGroupManagement");
                    ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventSelfMembershipConverter", "toChatEndpoint", 204, "GroupEventSelfMembershipConverter.java")).q("Ignoring invalid participant in group");
                    return Optional.empty();
                }
            case 15:
                return Boolean.valueOf(((alnu) this.a).contains((qei) obj));
            case 16:
                return ((psq) ((qbx) this.a).a.b()).c(((adit) obj).a);
            case 17:
                return ((adji) this.a).e(((Integer) obj).intValue());
            case 18:
                return ((psq) this.a).c((String) obj);
            case 19:
                return ((ryg) this.a).f(((Integer) obj).intValue());
            default:
                return ((vvp) obj).a((ConversationIdType) this.a);
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.b) {
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
            case 19:
                return Function$CC.$default$compose(this, function);
            default:
                return Function$CC.$default$compose(this, function);
        }
    }
}
