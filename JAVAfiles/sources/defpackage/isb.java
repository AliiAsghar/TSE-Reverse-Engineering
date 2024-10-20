package defpackage;

import android.util.ArrayMap;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import com.google.android.apps.messaging.ui.conversation.compose.PlainTextEditText;
import j$.util.function.Consumer$CC;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class isb implements Consumer {
    private final /* synthetic */ int a;

    public /* synthetic */ isb(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        PlainTextEditText v;
        byte[] bArr = null;
        switch (this.a) {
            case 0:
                utz utzVar = itb.a;
                throw null;
            case 1:
                ((luh) obj).b();
                return;
            case 2:
                ((iqv) obj).b();
                return;
            case 3:
                ((aaft) obj).a();
                return;
            case 4:
                utz utzVar2 = itb.a;
                ((jbm) obj).b();
                return;
            case 5:
                utz utzVar3 = itb.a;
                ((jbm) obj).c();
                return;
            case 6:
                ((iqw) obj).b();
                return;
            case 7:
                ((jbm) obj).a();
                return;
            case 8:
                throw null;
            case 9:
                ((nt) obj).h();
                return;
            case 10:
                Object obj2 = ((qdq) obj).a;
                xyl.h();
                itm itmVar = (itm) obj2;
                List K = ((rtz) itmVar.o.b()).K(itmVar.c);
                ArrayMap arrayMap = new ArrayMap();
                alur it = ((alog) K).iterator();
                while (it.hasNext()) {
                    ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
                    arrayMap.put(bindData.M(), bindData);
                }
                aiut.a().post(new irs(obj2, arrayMap, 5, bArr));
                return;
            case 11:
                ((lyn) obj).b();
                return;
            case 12:
                ((aaes) obj).a();
                return;
            case 13:
                ((lys) obj).a();
                return;
            case 14:
                aabp aabpVar = (aabp) obj;
                alvi alviVar = ixd.a;
                if (aabpVar != null) {
                    aabpVar.h.r(true);
                    aabpVar.g();
                    aabpVar.c.b();
                    rre rreVar = aabpVar.e;
                    amqh amqhVar = amqh.CAMERA_GALLERY;
                    amqi amqiVar = amqi.COLLAPSED;
                    ((rsr) rreVar.a()).u.size();
                    aabpVar.i.d(amqhVar, amqiVar, amqf.UNKNOWN_OPENING_STATE, amqe.CAMERA_GALLERY_BUTTON);
                    return;
                }
                return;
            case 15:
                aabp aabpVar2 = (aabp) obj;
                alvi alviVar2 = ixd.a;
                if (aabpVar2 != null && (v = ((zrb) aabpVar2.b).v()) != null) {
                    v.clearFocus();
                    return;
                }
                return;
            case 16:
                alvi alviVar3 = ixd.a;
                ((lyy) obj).a();
                return;
            case 17:
                alvi alviVar4 = ixd.a;
                ((ComposeMessageView) obj).E().H();
                return;
            case 18:
                alvi alviVar5 = ixd.a;
                ((ila) obj).e().E().I(true);
                return;
            case 19:
                alvi alviVar6 = ixd.a;
                ((ComposeMessageView) obj).E().I(true);
                return;
            default:
                alvi alviVar7 = ixd.a;
                ((ComposeMessageView) obj).E().c.aj();
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
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
}
