package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeoz extends arrp implements arqw {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeoz(aahr aahrVar, arqg arqgVar, aahp aahpVar, ConversationIdType conversationIdType, ParticipantsTable.BindData bindData, int i) {
        super(3);
        this.f = i;
        this.a = aahrVar;
        this.c = arqgVar;
        this.b = aahpVar;
        this.d = conversationIdType;
        this.e = bindData;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r10v2, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v7, types: [byn, java.lang.Object] */
    @Override // defpackage.arqw
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean booleanValue;
        if (this.f != 0) {
            ((Number) obj3).intValue();
            ((wh) obj).getClass();
            Object obj4 = this.b;
            Object obj5 = this.d;
            Object obj6 = this.e;
            ?? r10 = this.c;
            jda jdaVar = new jda(obj4, obj5, obj6, (arqg) r10, 17);
            aabr.x((aahr) this.a, r10, jdaVar, (bwj) obj2, 8);
            return arnb.a;
        }
        bwj bwjVar = (bwj) obj2;
        ((Number) obj3).intValue();
        ((wh) obj).getClass();
        Object obj7 = this.c;
        ?? r102 = this.e;
        ?? r0 = this.d;
        Object obj8 = this.b;
        Object obj9 = this.a;
        Boolean P = adom.P(r0);
        booleanValue = ((Boolean) r102.a()).booleanValue();
        adom.Y((aenr) obj9, (cit) obj8, P, booleanValue, (aeop) obj7, bwjVar, 24624);
        arnb arnbVar = arnb.a;
        bwjVar.y(-2051933603);
        boolean G = bwjVar.G(this.d);
        Object h = bwjVar.h();
        if (G || h == bwj.a.a) {
            aafa aafaVar = new aafa((cit) this.b, (byn) this.d, (arpe) null, 16);
            bwjVar.B(aafaVar);
            h = aafaVar;
        }
        bwjVar.q();
        bxl.g(arnbVar, (arqv) h, bwjVar);
        return arnb.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeoz(aenr aenrVar, cit citVar, aeop aeopVar, byn bynVar, byn bynVar2, int i) {
        super(3);
        this.f = i;
        this.a = aenrVar;
        this.b = citVar;
        this.c = aeopVar;
        this.d = bynVar;
        this.e = bynVar2;
    }
}
