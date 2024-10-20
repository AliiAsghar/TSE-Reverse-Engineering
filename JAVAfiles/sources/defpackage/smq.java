package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class smq implements Consumer {
    public final /* synthetic */ aglz a;
    private final /* synthetic */ int b;

    public /* synthetic */ smq(aglz aglzVar, int i) {
        this.b = i;
        this.a = aglzVar;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        switch (this.b) {
            case 0:
                Long l = (Long) obj;
                if (l.longValue() >= 0) {
                    aglz aglzVar = this.a;
                    ((smr) aglzVar).a = new ConversationIdType(l.longValue());
                    aglzVar.fE(0);
                    return;
                }
                return;
            case 1:
                Long l2 = (Long) obj;
                if (l2.longValue() >= 0) {
                    aglz aglzVar2 = this.a;
                    ((smr) aglzVar2).a = new ConversationIdType(l2.longValue());
                    aglzVar2.fE(0);
                    return;
                }
                return;
            case 2:
                Long l3 = (Long) obj;
                if (l3.longValue() >= 0) {
                    aglz aglzVar3 = this.a;
                    ((spw) aglzVar3).a = l3.longValue();
                    aglzVar3.fE(0);
                    return;
                }
                return;
            case 3:
                Long l4 = (Long) obj;
                if (l4.longValue() >= 0) {
                    aglz aglzVar4 = this.a;
                    ((sqf) aglzVar4).a = l4.longValue();
                    aglzVar4.fE(0);
                    return;
                }
                return;
            case 4:
                Long l5 = (Long) obj;
                if (l5.longValue() >= 0) {
                    aglz aglzVar5 = this.a;
                    ((srp) aglzVar5).a = l5.longValue();
                    aglzVar5.fE(0);
                    return;
                }
                return;
            case 5:
                Long l6 = (Long) obj;
                if (l6.longValue() >= 0) {
                    aglz aglzVar6 = this.a;
                    ((ssa) aglzVar6).a = String.valueOf(l6);
                    aglzVar6.fE(0);
                    return;
                }
                return;
            case 6:
                Long l7 = (Long) obj;
                if (l7.longValue() >= 0) {
                    aglz aglzVar7 = this.a;
                    ((ssi) aglzVar7).a = l7.longValue();
                    aglzVar7.fE(0);
                    return;
                }
                return;
            case 7:
                Long l8 = (Long) obj;
                if (l8.longValue() >= 0) {
                    aglz aglzVar8 = this.a;
                    ((ssi) aglzVar8).a = l8.longValue();
                    aglzVar8.fE(0);
                    return;
                }
                return;
            case 8:
                Long l9 = (Long) obj;
                if (l9.longValue() >= 0) {
                    aglz aglzVar9 = this.a;
                    ((stc) aglzVar9).a = String.valueOf(l9);
                    aglzVar9.fE(0);
                    return;
                }
                return;
            case 9:
                Long l10 = (Long) obj;
                if (l10.longValue() >= 0) {
                    aglz aglzVar10 = this.a;
                    ((suc) aglzVar10).a = l10.longValue();
                    aglzVar10.fE(0);
                    return;
                }
                return;
            case 10:
                Long l11 = (Long) obj;
                if (l11.longValue() >= 0) {
                    aglz aglzVar11 = this.a;
                    ((svj) aglzVar11).a = l11.longValue();
                    aglzVar11.fE(0);
                    return;
                }
                return;
            case 11:
                Long l12 = (Long) obj;
                if (l12.longValue() >= 0) {
                    aglz aglzVar12 = this.a;
                    ((swl) aglzVar12).a = l12.longValue();
                    aglzVar12.fE(0);
                    return;
                }
                return;
            case 12:
                Long l13 = (Long) obj;
                if (l13.longValue() >= 0) {
                    aglz aglzVar13 = this.a;
                    ((sxd) aglzVar13).a = l13.longValue();
                    aglzVar13.fE(0);
                    return;
                }
                return;
            case 13:
                Long l14 = (Long) obj;
                if (l14.longValue() >= 0) {
                    aglz aglzVar14 = this.a;
                    ((MessagesTable.BindData) aglzVar14).a = new MessageIdType(l14.longValue());
                    aglzVar14.fE(0);
                    return;
                }
                return;
            case 14:
                Long l15 = (Long) obj;
                if (l15.longValue() >= 0) {
                    aglz aglzVar15 = this.a;
                    ((szn) aglzVar15).a = String.valueOf(l15);
                    aglzVar15.fE(0);
                    return;
                }
                return;
            case 15:
                Long l16 = (Long) obj;
                if (l16.longValue() >= 0) {
                    aglz aglzVar16 = this.a;
                    ((ParticipantsTable.BindData) aglzVar16).a = String.valueOf(l16);
                    aglzVar16.fE(0);
                    return;
                }
                return;
            case 16:
                Long l17 = (Long) obj;
                if (l17.longValue() >= 0) {
                    aglz aglzVar17 = this.a;
                    ((ParticipantsTable.BindData) aglzVar17).a = String.valueOf(l17);
                    aglzVar17.fE(0);
                    return;
                }
                return;
            case 17:
                Long l18 = (Long) obj;
                if (l18.longValue() >= 0) {
                    aglz aglzVar18 = this.a;
                    ((PartsTable.BindData) aglzVar18).a = String.valueOf(l18);
                    aglzVar18.fE(0);
                    return;
                }
                return;
            case 18:
                Long l19 = (Long) obj;
                if (l19.longValue() >= 0) {
                    aglz aglzVar19 = this.a;
                    ((PartsTable.BindData) aglzVar19).a = String.valueOf(l19);
                    aglzVar19.fE(0);
                    return;
                }
                return;
            case 19:
                Long l20 = (Long) obj;
                if (l20.longValue() >= 0) {
                    aglz aglzVar20 = this.a;
                    ((tcg) aglzVar20).a = l20.longValue();
                    aglzVar20.fE(0);
                    return;
                }
                return;
            default:
                Long l21 = (Long) obj;
                if (l21.longValue() >= 0) {
                    aglz aglzVar21 = this.a;
                    ((tcr) aglzVar21).a = l21.longValue();
                    aglzVar21.fE(0);
                    return;
                }
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.b) {
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
