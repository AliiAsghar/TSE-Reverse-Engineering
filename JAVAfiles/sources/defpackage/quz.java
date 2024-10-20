package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.apps.messaging.startchat.chip.ChipData;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class quz extends arrp implements arqg {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public quz(Object obj, Object obj2, int i) {
        super(0);
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v104, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v115, types: [cas, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v62, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v88, types: [java.lang.Object, arml] */
    /* JADX WARN: Type inference failed for: r1v54, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v57, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v18, types: [arwe, java.lang.Object] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        mzx mzxVar;
        akrc b;
        eov P;
        enb enbVar = null;
        switch (this.c) {
            case 0:
                return Boolean.valueOf(((qva) this.a).a.b((qwe) this.b).isEmpty());
            case 1:
                mty mtyVar = (mty) this.a;
                PartsTable.BindData[] bindDataArr = mtyVar.a.b;
                bindDataArr.getClass();
                alog bb = alzz.bb(bindDataArr);
                String k = mtyVar.k();
                if (k != null) {
                    mzw a = mzx.a();
                    a.b = k;
                    mzxVar = a.a();
                } else {
                    mzxVar = mzx.a;
                }
                return ((myj) this.b).c(mtyVar.b, bb, mzxVar);
            case 2:
                for (rkf rkfVar : (List) ((rjx) this.a).c.b()) {
                    rjx.c(rkfVar.a, (rkc) this.b, false, rkfVar.b);
                }
                return arnb.a;
            case 3:
                for (rkf rkfVar2 : (List) ((rjx) this.a).e.b()) {
                    rjx.c(rkfVar2.a, (rkc) this.b, true, rkfVar2.b);
                }
                return arnb.a;
            case 4:
                ((rph) ((ahjj) this.b).a).b();
                alvi alviVar = rqg.a;
                ((rph) ((ahjj) this.b).a).c((int) ((Number) ((rqg) this.a).d.b()).longValue());
                return arnb.a;
            case 5:
                ((rpq) this.a).c.b();
                alvi alviVar2 = rqg.a;
                ((rpq) this.a).c.c((int) ((Number) ((rqg) this.b).c.b()).longValue());
                rpq rpqVar = (rpq) this.a;
                ((alvg) rpqVar.d.g().h("com/google/android/apps/messaging/shared/datamodel/backup/restore/conversations/BatchedConversationsRestoreTableWriter", "postRestore", 51, "BatchedConversationsRestoreTableWriter.kt")).q("Starting participant full refresh");
                qjh.l(rpqVar.b, null, new pze(rpqVar, (arpe) null, 12), 3);
                return arnb.a;
            case 6:
                aluq listIterator = ((altg) ((rvu) this.b).b).listIterator();
                while (listIterator.hasNext()) {
                    ((rwf) listIterator.next()).a((rry) this.a);
                }
                return arnb.a;
            case 7:
                if (((rwv) this.a).a().booleanValue()) {
                    Object b2 = this.b.b();
                    b2.getClass();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : (Iterable) b2) {
                        if (((rwt) obj).fJ()) {
                            arrayList.add(obj);
                        }
                    }
                    return arrayList;
                }
                return arnx.a;
            case 8:
                ((agoz) this.b).G((agmc) this.a);
                return arnb.a;
            case 9:
                return (String) ((Method) this.b).invoke(this.a, null);
            case 10:
                wtv.a(((arzk) this.b).c(((wtp) ((wtv) this.a).a.b()).b(((wtv) this.a).g)));
                return arnb.a;
            case 11:
                b = ((aksr) ((wtv) this.a).d.b()).b("ScreenDetectionUiAdapter.displayListener");
                Object obj2 = this.a;
                try {
                    wtv.a(((arzk) this.b).c(((wtp) ((wtv) obj2).a.b()).b(((wtv) obj2).g)));
                    armd.i(b, null);
                    return arnb.a;
                } finally {
                }
            case 12:
                eoz d = dyt.d(this.b);
                if (d instanceof enb) {
                    enbVar = (enb) d;
                }
                if (enbVar != null && (P = enbVar.P()) != null) {
                    return P;
                }
                return ((cg) this.a).P();
            case 13:
                ((yyz) this.a).i((zbe) this.b);
                return arnb.a;
            case 14:
                Object obj3 = this.a;
                b = ((aksr) ((yyz) obj3).c).b("StartChat#doneClicked");
                try {
                    Object obj4 = ((yyz) obj3).m;
                    Object obj5 = this.b;
                    if (obj4 != null && ((zen) ((yyz) obj3).e).d().d.c() && (!((zbe) obj5).b() || ((zbe) obj5).c())) {
                        qjh.l(((yyz) obj3).g, null, new yqs((yyz) obj3, (zbe) obj5, (arpe) null, 12), 3);
                    } else {
                        ((yyz) obj3).i((zbe) obj5);
                    }
                    armd.i(b, null);
                    return arnb.a;
                } finally {
                }
            case 15:
                ((lkd) ((zai) this.b).e.b()).g(new lng(((zag) this.a).b));
                return arnb.a;
            case 16:
                lkd lkdVar = (lkd) ((zbe) this.a).g.b();
                ?? r1 = this.b;
                r1.getClass();
                Object X = aqjn.X(r1);
                X.getClass();
                lkdVar.g(new lls(new llt((ConversationId) X, true, false, 2, null, null, false, false, 4066)));
                return arnb.a;
            case 17:
                zbh.b(this.a, new doj("", 0L, 6));
                aabr.aP(this.b).m.a("");
                return arnb.a;
            case 18:
                ((zcc) this.b).l.b((ChipData) this.a);
                return arnb.a;
            case 19:
                ((zcc) this.b).l.b((ChipData) this.a);
                return arnb.a;
            default:
                ((zcc) this.b).f.e("Bugle.Contact.Picker.Non.E2EE.Group.Alert.Click.Count", 1);
                ((zcc) this.b).l.b((ChipData) this.a);
                return arnb.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public quz(Object obj, Object obj2, int i, byte[] bArr) {
        super(0);
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
